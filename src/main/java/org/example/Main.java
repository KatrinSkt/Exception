package org.example;


import org.example.model.Person;
import org.example.service.PersonService;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();

        Person person1 = personService.createPerson("Kate", 33);
        System.out.println(person1);
        Person person2 = personService.createPerson("Alex", -1);
        System.out.println(person2);

    }
}