package org.sda.services;

import org.sda.exceptions.PersonNotFoundException;
import org.sda.models.Person;

import java.time.LocalDate;

/**
 * Person service interface to handle Person related operations
 *
 * @author Marko
 */

public interface PersonService {

    //Static field is allowed but not the (int age; <- Error, cant do like this)
    static final int AVERAGE_AGE = 20;


    //JavaDoc
    /**
     * To get the birth year of the Person
     *
     * @param age Age of the person
     * @return Birth year
     */
    //Normal method

     int getPersonBirthYear(int age);

    /**
     *
     * To get the full name of person
     * @param person person model
     * @return Full name as String
     */
    String getPersonFullName(Person person);

    /**
     * To find Person by first name
     * @param firstName First name of Person
     * @return Person
     */
    Person findPersonByFirstName(String firstName) throws PersonNotFoundException;

    //Static method definition is allowed
    static int getAverageAge() {
        return AVERAGE_AGE;
    }
}
