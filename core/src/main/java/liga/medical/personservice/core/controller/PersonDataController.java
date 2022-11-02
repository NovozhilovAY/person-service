package liga.medical.personservice.core.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import liga.medical.personservice.api.service.IService;
import liga.medical.personservice.core.model.PersonData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person-data")
@Api(value = "API для работы с данными пользователей")
public class PersonDataController {

    private IService<PersonData> personDataService;

    public PersonDataController(IService<PersonData> personDataService) {
        this.personDataService = personDataService;
    }

    @GetMapping
    @ApiOperation(value = "Получение всех данных пользователей")
    public List<PersonData> getAllPersonData() {
        return personDataService.getAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Получение данных о пользователе по id")
    public PersonData getPersonDataById(@PathVariable long id) {
        return personDataService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "Добавление данных о пользователе")
    public Integer insertPersonData(@RequestBody PersonData personData) {
        return personDataService.insert(personData);
    }
}
