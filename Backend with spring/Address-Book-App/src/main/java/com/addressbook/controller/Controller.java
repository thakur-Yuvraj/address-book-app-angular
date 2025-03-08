package com.addressbook.controller;


import com.addressbook.dto.ContactDTO;
import com.addressbook.service.AddressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
public class Controller {

    // Dependency Injection
    @Autowired
    AddressService addressService;

    // testing if REST controller is working or not
    @GetMapping("/test")
    public ResponseEntity<String> testerGet() {
        return ResponseEntity.ok("This is Test get mapping");
    }

    // get by id
    @GetMapping("/test/{id}")
    public ResponseEntity<String> testerGetById(@PathVariable int id) {
        return ResponseEntity.ok("This is Test get mapping by id : "+ id);
    }

    // testing the post mapping
    @PostMapping("/test")
    public ResponseEntity<String> testerPost() {
        return ResponseEntity.ok("This is Test Post mapping");
    }

    // put to update by id
    @PutMapping("/test/{id}")
    public ResponseEntity<String> testerPut(@PathVariable int id, @RequestParam String details) {
        return ResponseEntity.ok("This is Test Put mapping inputted id is : " + id + " Details given by user is : "+ details);
    }

    // testing the delete mapping
    @DeleteMapping("/test")
    public ResponseEntity<String> testerDelete() {
        return ResponseEntity.ok("This is Test Delete mapping");
    }

    // testing if the service layer is working or not
    @GetMapping("/test/service")
    public ResponseEntity<String> testerService() {
        return ResponseEntity.ok(addressService.serviceTest());
    }

    // saving the information of contacts
    @PostMapping("/save")
    public ResponseEntity<String> addContact(@Valid @RequestBody ContactDTO contactDTO) {
        return ResponseEntity.ok(addressService.addToContact(contactDTO));
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<ContactDTO> findContact(@PathVariable int id) {
        return ResponseEntity.ok(addressService.findById(id));
    }

}
