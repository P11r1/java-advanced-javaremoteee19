package org.sda.services.implementations;

import org.sda.models.Person;
import org.sda.services.PersonService;

import java.time.LocalDate;

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
}
