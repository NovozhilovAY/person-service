package liga.medical.personservice.core.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import liga.medical.personservice.api.service.IService;
import liga.medical.personservice.core.model.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contacts")
@Api(value = "API для работы с контактами")
public class ContactController {
    private IService<Contact> contactService;

    public ContactController(IService<Contact> contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    @ApiOperation(value = "Получение всех контактов")
    public List<Contact> getAllContacts() {
        return contactService.getAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Получение контакта по id")
    public Contact getAllContacts(@PathVariable long id) {
        return contactService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "Добавление контакта")
    public Integer insertContact(@RequestBody Contact contact) {
        return contactService.insert(contact);
    }

}
