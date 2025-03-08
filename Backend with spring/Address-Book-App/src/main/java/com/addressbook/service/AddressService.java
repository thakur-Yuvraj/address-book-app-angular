package com.addressbook.service;


import com.addressbook.dto.ContactDTO;
import com.addressbook.exception.AddressBookNotFoundException;
import com.addressbook.model.Contact;
import com.addressbook.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class AddressService {

    public final List<Contact> data;

    public AddressService() {
        this.data = new ArrayList<>();
    }
    @Autowired
    AddressBookRepository addressBookRepository;


    // testing if service layer is working
    public String serviceTest() {
        log.info("in service test");
        return "This is from Service layer";
    }

    // adding data to the list
    public String addToContact(ContactDTO contactDTO) {

        log.info("Process to add contact started");
        Contact contact = new Contact();
        contact.setEmail(contactDTO.getEmail());
        contact.setName(contactDTO.getName());
        contact.setPhone(contactDTO.getPhone());
        data.add(contact);
        log.info("successfully added contact");
        return "New contact added";
    }

    public ContactDTO findById(int id) {
        Contact contact = data.stream()
                .filter(entry -> entry.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new AddressBookNotFoundException(id));
        ContactDTO contactDTO = new ContactDTO();
        contactDTO.setEmail(contact.getEmail());
        contactDTO.setPhone(contact.getPhone());
        contactDTO.setName(contact.getName());
        return contactDTO;
    }
}
