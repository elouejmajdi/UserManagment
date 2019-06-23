package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ContactRepository;
import com.example.demo.entites.Contact;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ContactRestController {

	@Autowired
	private ContactRepository repository;

	@RequestMapping(value = "/contacts", method = RequestMethod.GET)
	public List<Contact> getAll() {
		return repository.findAll();
	}

	@RequestMapping(value = "/contacts/{id}", method = RequestMethod.GET)
	public Contact getOneById(@PathVariable("id") Long id) {
		return repository.getOne(id);
	}

	@RequestMapping(value = "/contacts", method = RequestMethod.POST)
	public void saveContac(@RequestBody Contact contact) {
		repository.save(contact);
	}

	@RequestMapping(value = "/contacts/{id}", method = RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}

}
