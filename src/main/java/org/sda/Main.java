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

        //EXCEPTION
        //Try/catch exception, program can run forward and prints "sout" instead of exception
        //Exception handling
        try{
            int[] intArray = {1, 2, 5, 6};

            for (int i = 0; i <= intArray.length; i++) {
                System.out.println(intArray[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("The number cannot be printed because it's unavailable in the array");
        } catch (Exception  exception) {
            System.out.println("Exception being caught");
        } finally { // This block will be executed irrespective of catch blocks
            int a = 15;
            System.out.println("Finally executed, a: " + a);
        }
    }
}