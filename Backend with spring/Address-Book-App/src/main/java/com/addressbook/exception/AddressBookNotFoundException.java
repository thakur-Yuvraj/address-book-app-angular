package com.addressbook.exception;

public class AddressBookNotFoundException extends RuntimeException {
    public AddressBookNotFoundException(int id) {
        super("Address Book entry not found for ID: " + id);
    }
}
