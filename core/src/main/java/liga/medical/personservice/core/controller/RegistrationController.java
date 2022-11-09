package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.api.RegistrationService;
import liga.medical.personservice.core.dto.RegistrationDto;
import liga.medical.personservice.core.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping
    User registrateUser(@RequestBody RegistrationDto registrationDto) {
        return registrationService.registrateUser(registrationDto);
    }
}
