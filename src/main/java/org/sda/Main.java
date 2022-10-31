package org.sda;

import org.sda.exceptions.PersonNotFoundException;
import org.sda.models.Person;
import org.sda.services.PersonService;
import org.sda.services.implementations.PersonServiceImpl;

import java.util.Scanner;

public class Main {
    public static <userInput> void main(String[] args) throws PersonNotFoundException {


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

        //EXCEPTION
        //Try/catch exception, program can run forward and prints "sout" instead of exception

        //Exception handling
        try {
            int[] intArray = {1, 2, 5, 6};

            for (int i = 0; i <= intArray.length; i++) {
                System.out.println(intArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The number cannot be printed because it's unavailable in the array");
        } catch (Exception exception) {
            System.out.println("Exception being caught");
        } finally { // This block will be executed irrespective of catch blocks
            int a = 15;
            System.out.println("Finally executed, a: " + a);
        }

        //Combining multiple exceptions
        try {
            int y = 10 / 0; // This line should throw and exception
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) { // one variable e
            System.out.println("The value of y is not determined, Error:" + e.getLocalizedMessage());
        }

        //Custom / user-defined exceptions
        System.out.println(personService.findPersonByFirstName("Marko"));

        //Try catch exception exercise
        Person testPerson = null;

        try {
            testPerson = personService.findPersonByFirstName("Joonas");
        } catch (PersonNotFoundException e) {
            System.out.println(e.getLocalizedMessage());

            //In real life
            //alternative code
            testPerson = new Person();
            testPerson.setFirstName("Unknown");
            testPerson.setLastName("Unknown last");
            testPerson.setAge(10);

        }
        System.out.println(testPerson.toString());


        try {
            int a = 0;
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            
            if (userInput >= a) {
                System.out.println("int ->" + userInput);
            } else {
                System.out.println("Hey! That's not a value! Try once more.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Hey! That's not a value! Try once more.");
        }


    }
}