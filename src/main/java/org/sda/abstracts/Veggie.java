package org.sda.abstracts;

/**
 * Veggie class extends abstract Food class
 *
 * @author Marko
 */
public class Veggie extends Food {
    //Constructor
    public Veggie(String color) {
        super(color);
    }

    //Implemented eat method
    @Override
   public void eat() {
        System.out.println("I'm eating " + super.getColor() + "veggie!");

    }
}
