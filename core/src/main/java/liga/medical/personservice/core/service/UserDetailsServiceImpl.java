package liga.medical.personservice.core.service;

import liga.medical.personservice.core.model.User;
import liga.medical.personservice.core.repository.UserRepository;
import liga.medical.personservice.core.security.SecurityUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userRepository.findUserByLogin(login)
                        .orElseThrow(() -> new UsernameNotFoundException("User '" + login + "' doesn't exists"));
        return SecurityUser.fromUser(user);
    }
}
