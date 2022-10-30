package org.sda.homeworks;

public class Dog {
    private boolean hasLegs;
    private boolean hasTail;

    Dog dog = new Dog();
    public Dog(boolean hasLegs, boolean hasTail) {
        this.hasLegs = true;
        this.hasTail = true;
    }

    public Dog() {

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
}