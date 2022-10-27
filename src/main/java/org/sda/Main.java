package org.sda;

import org.sda.models.Person;
import org.sda.services.PersonService;
import org.sda.services.implementations.PersonServiceImpl;

public class Main {
    public static void main(String[] args) {
        //INTERFACE
        Person person = new Person();
        person.setFirstName("Marko");
        person.setLastName("Piir");
        person.setAge(30);

        // Left side should be interface name and RIGHT side should be interface's implementation class name
        PersonService personService = new PersonServiceImpl();

        //Implementation method calls
        System.out.println("Person's birth year: " + personService.getPersonBirthYear(person.getAge()));
        System.out.println("Person's full name: " + personService.getPersonFullName(person));

        System.out.println("Person's last name: " + person.getLastName());


    }
}