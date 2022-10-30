package liga.medical.personservice.core.service;

import liga.medical.personservice.core.api.UserService;
import liga.medical.personservice.core.dto.UserRoleDto;
import liga.medical.personservice.core.model.Role;
import liga.medical.personservice.core.model.User;
import liga.medical.personservice.core.repository.RoleMapper;
import liga.medical.personservice.core.repository.RoleUserMapper;
import liga.medical.personservice.core.repository.UserMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    private RoleMapper roleMapper;

    private RoleUserMapper roleUserMapper;

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserServiceImpl(UserMapper userMapper, RoleMapper roleMapper, RoleUserMapper roleUserMapper, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userMapper = userMapper;
        this.roleMapper = roleMapper;
        this.roleUserMapper = roleUserMapper;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userMapper.insertUser(user);
        User userWithId = userMapper.getUserByUsername(user.getLogin());
        setDefaultRole(userWithId);
        for (UserRoleDto userRoleDto: UserRoleDto.fromUser(userWithId)) {
            roleUserMapper.insertUserRole(userRoleDto);
        }
    }

    @Override
    public User findByUsername(String login) {
        return userMapper.getUserByUsername(login);
    }

    private void setDefaultRole(User user) {
        Set<Role> roleSet = new HashSet<>();
        Role role = roleMapper.getRoleByName("ROLE_USER");
        roleSet.add(role);
        user.setRoles(roleSet);
    }
}
