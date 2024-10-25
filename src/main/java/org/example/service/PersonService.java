package org.example.service;

import org.example.exception.InvalidAgeException;
import org.example.model.Person;

public class PersonService {
    public Person createPerson(String name, int age) {
        if (age < 0) {
            throw new InvalidAgeException("Некорректно введен возраст: " + age);
        }
        return new Person (name, age);
    }
}
