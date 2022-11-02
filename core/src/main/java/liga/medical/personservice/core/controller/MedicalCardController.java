package liga.medical.personservice.core.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import liga.medical.personservice.api.service.IService;
import liga.medical.personservice.core.model.MedicalCard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/medical-card")
@Api(value = "API для работы с медицинскими картами")
public class MedicalCardController {

    private IService<MedicalCard> medicalCardService;

    public MedicalCardController(IService<MedicalCard> medicalCardService) {
        this.medicalCardService = medicalCardService;
    }

    @GetMapping
    @ApiOperation(value = "Получение всех медицинских карт")
    public List<MedicalCard> getAll() {
        return medicalCardService.getAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Получение медицинской карты по id")
    public MedicalCard getMedicalCardById(@PathVariable long id) {
        return medicalCardService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "Добавление новой медицинской карты")
    public int insertMedicalCard(@RequestBody MedicalCard medicalCard) {
        return medicalCardService.insert(medicalCard);
    }

}
