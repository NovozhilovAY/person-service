package liga.medical.personservice.core.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import liga.medical.personservice.api.service.IService;
import liga.medical.personservice.core.model.Illness;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/illness")
@Api(value = "API для работы с болезнями")
public class IllnessController {

    private IService<Illness> illnessService;

    public IllnessController(IService<Illness> illnessService) {
        this.illnessService = illnessService;
    }

    @GetMapping
    @ApiOperation(value = "Получение всех болезней")
    public List<Illness> getAllIllnesses() {
        return illnessService.getAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Получение болезни по id")
    public Illness getIllnessById(@PathVariable long id) {
        return illnessService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "Добавление болезни")
    public Integer insertIllness(@RequestBody Illness illness) {
        return illnessService.insert(illness);
    }
}
