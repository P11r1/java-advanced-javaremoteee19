package org.sda.exceptions;

/**
 * Exception to handle Person is not found
 *
 * @author Marko
 */
public class PersonNotFoundException extends Exception {
    public PersonNotFoundException (String name) {
        super(String.format("Person (First name: %s) is not found!", name));
    }

    public PersonNotFoundException (int age) {
        super(String.format("Person (%s) is not found!", age));
    }
}
