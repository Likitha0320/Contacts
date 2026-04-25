package com.example.demo.controller;

import com.example.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    @GetMapping("/contact/{phone}")
    public Contact getContact(@PathVariable String phone) {
        return contactService.getContactByPhone(phone);
    }

    @PostMapping("/contact")
    public Contact createContact(@RequestBody Contact contact) {
        return contactService.create(contact);
    }

    @GetMapping("/contact")
    public Contact getContact() {
        Contact c = new Contact();
        c.setPhone("1234567890");
        c.setEmail("example@example.com");
        return c;
    }
}
