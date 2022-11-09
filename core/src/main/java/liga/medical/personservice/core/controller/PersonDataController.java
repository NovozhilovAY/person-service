package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.api.PersonDataService;
import liga.medical.personservice.core.model.PersonData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person-data")
public class PersonDataController {

    private final PersonDataService personDataService;

    public PersonDataController(PersonDataService personDataService) {
        this.personDataService = personDataService;
    }

    @GetMapping("/{id}")
    PersonData getPersonDataById(@PathVariable Long id) {
        return personDataService.getPersonDataById(id);
    }

    @PostMapping
    PersonData savePersonData(@RequestBody PersonData personData) {
        return personDataService.save(personData);
    }

    @PutMapping
    PersonData updatePersonData(@RequestBody PersonData personData) {
        return personDataService.update(personData);
    }

}
