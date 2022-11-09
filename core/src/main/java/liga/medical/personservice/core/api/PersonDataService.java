package liga.medical.personservice.core.api;

import liga.medical.personservice.core.model.PersonData;

public interface PersonDataService {
    PersonData getPersonDataById(Long id);

    PersonData save(PersonData personData);

    PersonData update(PersonData personData);
}
