package org.sda.homeworks;

public class Dog extends Animal {
    private boolean hasLegs;
    private boolean hasTail;
    private int eyes;
    private String barks;


    public Dog(boolean hasLegs, boolean hasTail, int eyes, String barks) {
        this.hasLegs = hasLegs;
        this.hasTail = hasTail;
        this.eyes = eyes;
        this.barks = barks;
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

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public String getBarks() {
        return barks;
    }

    public void setBarks(String barks) {
        this.barks = barks;
    }
}
