package liga.medical.personservice.core.service;

import liga.medical.personservice.core.api.PersonDataService;
import liga.medical.personservice.core.model.PersonData;
import liga.medical.personservice.core.repository.PersonDataRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonDataServiceImpl implements PersonDataService {
    private final PersonDataRepository personDataRepository;

    public PersonDataServiceImpl(PersonDataRepository personDataRepository) {
        this.personDataRepository = personDataRepository;
    }

    @Override
    public PersonData getPersonDataById(Long id) {
        return personDataRepository.findById(id).get();
    }

    @Override
    public PersonData save(PersonData personData) {
        return personDataRepository.save(personData);
    }

    @Override
    public PersonData update(PersonData personData) {
        return personDataRepository.save(personData);
    }
}
