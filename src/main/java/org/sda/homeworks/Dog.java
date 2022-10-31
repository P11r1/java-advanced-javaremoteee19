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
public class Dog extends Animal {
    private boolean hasLegs;
    private boolean hasTail;


    public Dog(boolean hasLegs, boolean hasTail) {
        this.hasLegs = hasLegs;
        this.hasTail = hasTail;
    }



    public boolean isHasLegs() {
        return hasLegs;
    }

    public void setHasLegs(boolean hasLegs) {
        this.hasLegs = hasLegs;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    @Override
    public void yieldVoice() {
        System.out.println("Dog says: " + "Woof");
    }
}