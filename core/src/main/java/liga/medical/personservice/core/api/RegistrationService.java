package liga.medical.personservice.core.api;

import liga.medical.personservice.core.dto.RegistrationDto;
import liga.medical.personservice.core.model.User;

public interface RegistrationService {
    User registrateUser(RegistrationDto registrationDto);
}
