package com.dkunert.exampleproducent.controller;

import com.dkunert.exampleproducent.model.Person;
import com.dkunert.exampleproducent.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(value = "/people/tall", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> tallPeople() {
        return Arrays.asList("Dawid", "Marcin");
        //return personService.findTall();
    }
}
