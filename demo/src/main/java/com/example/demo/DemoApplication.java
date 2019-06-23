package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.dao.ContactRepository;
import com.example.demo.entites.Contact;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private ContactRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ContactRepository repository) {
		return args -> {
			repository.save(new Contact("John", "Said", "SaidJ98@gmail.com"));
			repository.save(new Contact("Khaled", "Ali", "AliKH@gmail.com"));
			repository.save(new Contact("Sarrah", "Ward", "WardS98@gmail.com"));

		};
	}
}
