package org.sda.abstracts;

/**
 * An abstract Food class
 *
 * @author Marko
 */

public abstract class Food {
    private String color;

    //Constructor
    public Food(String color) {
        this.color = color;
    }

    //Getter and Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Abstract method, access modifier is optional
    public abstract void eat(); // you can only define it here, but cannot write the implementation here
                                   // the implementation will be in the extending classes
}
