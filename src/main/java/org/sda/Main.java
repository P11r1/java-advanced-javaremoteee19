package org.sda;

import org.sda.model.*;

import java.util.Arrays;

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
        Passeneger passeneger = new Passeneger(PaymentType.CARD, "Parnu");
        passeneger.setEmail("passenger@gmail.com"); //Access Person fields using Passenger object

        PrivatePassenger privatePassenger = new PrivatePassenger(PaymentType.CARD, "Vigala");
        privatePassenger.setPersonalIDCode("6848632174785"); //Access PrivatePassenger's field
        privatePassenger.setDestinationAddress("Tartu"); //Access Passenger field
        privatePassenger.setPhoneNumber("+37258664578"); // Access Person field

        //OVERRIDING
        Person personOverride = new Person();
        personOverride.setEmail("MarkoPiir@gmail.com");
        System.out.println(personOverride.getEmail());

        Passeneger passengerOverride = new Passeneger();
        passengerOverride.setEmail("MarkoPiir@gmail.com");
        System.out.println(passengerOverride.getEmail());

        //POLYMORPHISM (one PARENT class with different CHILD objects)
        Person person3 = new Person(12345L,"parnu");
        Person person4 = new Passeneger(PaymentType.CARD, "Vigala");
        System.out.println(person3.toString());
        System.out.println(person4.toString());



        //CALLING PARENT METHODS
        Passeneger passeneger1 = new Passeneger();
        passeneger1.setAddress("Tallinn"); // Person.address
        passeneger1.setDestinationAddress("Tartu"); // Passeneger.destinationAddress
        System.out.println(passeneger1.getAddresses());

        //CALLING PARENT'S HIDDEN FIELD (PROTECTED)
        passeneger1.getHiddenAlive();

        //PASSING PARAMETERS
        Passeneger passeneger2 = new Passeneger(123456L, "Tallinn", PaymentType.CASH, "Parnu");
        printPersonAddress(passeneger2);
        printPassenegerWithPrefix("Passeneger: ", passeneger2);

        //COMPOSITION EXERCISE (MUZZLE)
        Muzzle muzzle = new Muzzle();
        muzzle.setId(890L);
        muzzle.setNoiseRange(10);
        muzzle.setTooNoisy(true);

        Dog dog1 = new Dog(true, "Husky");
        dog1.setMuzzle(muzzle);

        System.out.println(dog1.getMuzzle().toString());

        //ENUMS
        System.out.println(PaymentType.CARD);
        System.out.println(Arrays.toString(PaymentType.values())); // Prints all the enums
        System.out.println(PaymentType.BANK_TRANSFER.getValue()); //Prints the alue of enum '3'

    }
    private static void printPersonAddress(Person person) {
        System.out.println(person.getAddress());
    }

    private static void printPassenegerWithPrefix(String prefix, Object object) {
        System.out.println(prefix + object);
    }
}