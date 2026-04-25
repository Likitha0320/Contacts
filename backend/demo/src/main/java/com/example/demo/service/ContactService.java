package com.example.demo.service;

import com.example.demo.controller.Contact;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    private List<Contact> contacts = new ArrayList<>();

    public List<Contact> getAllContacts() {
        return new ArrayList<>(contacts);
    }

    public Contact getContactByPhone(String phone) {
        Optional<Contact> contact = contacts.stream()
            .filter(c -> c.getPhone().equals(phone))
            .findFirst();
        return contact.orElse(null);
    }

    public Contact create(Contact contact) {
        contacts.add(contact);
        return contact;
    }
}
