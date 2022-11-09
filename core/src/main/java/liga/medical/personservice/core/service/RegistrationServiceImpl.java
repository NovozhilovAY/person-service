package liga.medical.personservice.core.service;

import liga.medical.personservice.core.api.RegistrationService;
import liga.medical.personservice.core.dto.RegistrationDto;
import liga.medical.personservice.core.model.Role;
import liga.medical.personservice.core.model.User;
import liga.medical.personservice.core.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public RegistrationServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User registrateUser(RegistrationDto registrationDto) {
        User user = new User();
        user.setLogin(registrationDto.getLogin());
        user.setPassword(passwordEncoder.encode(registrationDto.getPassword()));
        setDefaultRole(user);
        return userRepository.save(user);
    }

    private void setDefaultRole(User user) {
        List<Role> roleList = new ArrayList<>();
        roleList.add(new Role(1L, "ROLE_USER"));
        user.setRoles(roleList);
    }
}
