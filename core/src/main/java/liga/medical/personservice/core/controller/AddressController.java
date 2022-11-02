package liga.medical.personservice.core.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import liga.medical.personservice.api.service.IService;
import liga.medical.personservice.core.model.Address;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/addresses")
@Api(value = "API для работы с адресами")
public class AddressController {
    private IService<Address> addressService;

    public AddressController(IService<Address> addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    @ApiOperation(value = "Получение всех адресов")
    public List<Address> getAllAddresses() {
        return addressService.getAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Получение адреса по id")
    public Address getAddressById(@PathVariable long id) {
        return addressService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "Добавление нового адреса")
    public Integer insertAddress(@RequestBody Address address) {
        return addressService.insert(address);
    }
}
