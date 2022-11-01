package org.sda;

import org.sda.exceptions.PersonNotFoundException;
import org.sda.models.Person;
import org.sda.services.PersonService;
import org.sda.services.implementations.PersonServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws PersonNotFoundException {


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

        //Homework Exception handling
/**
 Scanner scanner = new Scanner(System.in);

 boolean number = true;
 while (number) {
 System.out.print("Give a number: ");

 try {
 Integer.parseInt(scanner.nextLine());
 } catch (Exception e) {
 System.out.println("Hey! That's not a value! Try once more");
 }
 }
 **/
        // Homework with Vinod
        try {
            displayNumber();

        } catch (InputMismatchException e) {
            System.out.println(e.getLocalizedMessage());
            displayNumber();
        }
    }

    //Enhanced way
    private static void displayNumber() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println("int -> " + i);
        } else if (scanner.hasNextDouble()) {
            double d = scanner.nextDouble();
            System.out.println("double -> " + d);
        } else {
            throw new InputMismatchException("Hey! That's not a value! Try once more");
        }
    }
}