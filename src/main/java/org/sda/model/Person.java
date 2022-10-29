package org.sda.model;

import java.util.Random;

/**
 * Person model
 * Example of encapsulation
 *
 * @author Marko
 */

public class Person {
    //These are fields
    private Long id; // person has id
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber; // String because + 372 before
    private String address; //Source address

    protected boolean isAlive;


    //Parameterized constructor because parameters inside brackets ()
    //Constructor, All arguments constructor(all the fields)
    //Always starts with public
    public Person(Long id, String firstName, String lastName, String email, String phoneNumber, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    //Parameterized constructor( parameters inside ())
    public Person(Long id, String address) {
        this.id = id;
        this.address = address;
    }

    // Java will create a constructor automatically by default - default constructor

    //No- argument constructor
    public Person() {
        this.id = new Random().nextLong();

    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (!firstName.isEmpty()) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() { //Factory method -  in java library
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    protected boolean isAlive() {
        return isAlive;
    }

    protected void setAlive(boolean alive) {
        isAlive = alive;
    }
}
