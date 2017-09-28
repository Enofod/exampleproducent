package com.dkunert.exampleproducent.repository;

import com.dkunert.exampleproducent.model.Person;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class PersonRepository {

    private List<Person> people;

    public PersonRepository() {
        people = Arrays.asList(
                new Person("Dawid", 188, 110.9),
                new Person("Marcin", 191, 88.3),
                new Person("Grzechu", 173, 75.6)
        );
    }

    public List<Person> findAll() {
        return people;
    }

}
