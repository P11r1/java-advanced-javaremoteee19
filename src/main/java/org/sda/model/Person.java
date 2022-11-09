package org.sda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

/**
 * Person model
 *
 * @author Marko
 */
@AllArgsConstructor
@Getter
@ToString
public class Person { //OUTER CLASS
    //Fields
    private String firstName;
    private String lastName;

    private String userName;
    private int age;

    public boolean isAdult() {
        return age >= 18;
    }

    //NON-STATIC nested class without static: bound to outer class
    @Data
    @ToString
    public class Employee{ //INNER CLASS
        private String address;

        public void userName () {
            userName = firstName.concat(lastName).toLowerCase().replace(" ", ""); //changing the value of outer class
        }

    }

    //STATIC NESTED CLASS: not bound to outer class
    @Getter
    public static class Customer{
        public void userName(Person person) {
            person.userName = person.firstName.concat(person.lastName).toUpperCase().replace(" ", "");
        }
    }
}
