package com.addressbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class AddressBookApp {
	public static void main(String[] args) {
		SpringApplication.run(AddressBookApp.class, args);
		log.info("Spring app is running");
	}
}
