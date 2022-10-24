package org.sda;

import org.sda.model.*;

public class Main {
    public static void main(String[] args) {

        //ENCAPSULATION
        //No-argument constructor call
        Person person = new Person();
        System.out.println(person.toString());
        System.out.println(person.getId());


        //All-argument constructor call
        Person person1 = new Person(12345L, "Marko", "Piir", "Piirmarko@gmail.com", "+37256223317", "Pärnu, selja tee");
        System.out.println(person1.toString());
        System.out.println(person1.getEmail());

        Person person2 = new Person();
        person2.setFirstName("Kätrin");
        person2.setLastName("Türin");

        System.out.println(person2.getFirstName());
        System.out.println(person2.getLastName());
        System.out.println(person2.getLastName() + person2.getFirstName());


        Dog dog = new Dog(true, "GERMAN SHEPARD");
        System.out.println(dog);
        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());


        //INHERITANCE
        Passeneger passeneger = new Passeneger("CARD", "Parnu");
        passeneger.setEmail("passenger@gmail.com"); //Access Person fields using Passenger object

        PrivatePassenger privatePassenger = new PrivatePassenger("CARD", "Vigala");
        privatePassenger.setPersonalIDCode("6848632174785"); //Access PrivatePassenger's field
        privatePassenger.setDestinationAddress("Tartu"); //Access Passenger field
        privatePassenger.setPhoneNumber("+37258664578"); // Access Person field
    }
}