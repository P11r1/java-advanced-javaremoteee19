package org.sda.homeworks;

public class Cat extends Dog {

    private String color;
    private String breed;

    Cat cat = new Cat();

    // Default Constructor
    public Cat() {
        super();
    }

    //Constructor
    public Cat(boolean hasLegs, boolean hasTail, String color, String breed) {
        super();

        this.color = "White";
        this.breed = "Regular";
    }

    //Getter and Setter
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
}