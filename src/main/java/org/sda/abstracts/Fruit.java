package org.sda.abstracts;

/**
 * Fruit class matching the abstract Food class
 *
 * @author Marko
 */
public class Fruit extends Food{
    //Constructor
    public Fruit(String color) {
        super(color);
    }

    //Override method
    @Override
   public void eat() {
        System.out.println("I'm eating a " + super.getColor() + "fruit!");

    }
}
