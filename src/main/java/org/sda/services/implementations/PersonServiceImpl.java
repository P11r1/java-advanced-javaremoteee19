package org.sda.services.implementations;

import org.sda.exceptions.PersonNotFoundException;
import org.sda.models.Person;
import org.sda.services.PersonService;

import java.time.LocalDate;
import java.util.List;

//Implements for interface, extends for inheritance

/**
 * Implementation of person service
 *
 * @author Marko
 */

public class PersonServiceImpl implements PersonService {
    @Override
    public int getPersonBirthYear(int age) {
        return LocalDate.now().getYear() - age;
    }

    @Override
    public String getPersonFullName(Person person) {
        return person.getFirstName() + " " + person.getLastName();
    }

    @Override
    public Person findPersonByFirstName(String firstName) throws PersonNotFoundException {
        Person resultPerson = null;

        for (Person person : getRandomPersonList()) {
            if(person.getFirstName().equals(firstName)) {
                resultPerson = person;
                break;
            }
        }

        // If the person is not found then throw an exception
        if (resultPerson == null) {
            throw new PersonNotFoundException(firstName);
        }
        return resultPerson;
    }

    //PRIVATE METHODS//
    private List<Person> getRandomPersonList() {
        Person person1 = new Person();
        person1.setFirstName("Marko");
        person1.setLastName("Piir");
        person1.setAge(30);

        Person person2 = new Person();
        person2.setFirstName("Riho");
        person2.setLastName("Tammis");
        person2.setAge(29);

        Person person3 = new Person();
        person3.setFirstName("Katrin");
        person3.setLastName("Turin");
        person3.setAge(25);

        return List.of(person1, person2, person3);
    }
}
