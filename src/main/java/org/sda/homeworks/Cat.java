package org.sda.homeworks;

/**
 * Create classes Dog and Cat.
 * a) Move common methods and fields to the class Animal.
 * b) Create method „yieldVoice”.
 * c) Create simple array of type Animal, that will contain one object of type Dog and one object of type Cat.
 * d) Using for-each loop show which animal gives what kind of voice. How to print a name of an object?
 *
 * @author Marko
 */
public class Cat extends Animal {

    //Fields
    private boolean hasLegs;
    private String color;
    private String breed;



    //Constructor
    public Cat(boolean hasLegs, boolean hasTail, boolean hasLegs1, String color, String breed) {
        this.hasLegs = hasLegs1;
        this.color = color;
        this.breed = breed;
    }

    //Getter and Setter
    public void setHasLegs(boolean hasLegs) {
        this.hasLegs = hasLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    //Override
    @Override
    public void yieldVoice() {
        System.out.println("Cat says: " + "Meow");
    }
}