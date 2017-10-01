package com.dkunert.exampleproducent.service;

import com.dkunert.exampleproducent.model.Person;
import com.dkunert.exampleproducent.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {
    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findTall() {
        return personRepository.findAll().stream().filter(person -> person.getHeight() > 180).collect(Collectors.toList());
    }
}
