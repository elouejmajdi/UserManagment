package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Contact;

@Service
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
