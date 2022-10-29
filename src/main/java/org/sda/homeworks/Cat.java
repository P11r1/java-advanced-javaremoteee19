package org.sda.homeworks;

public class Cat extends Dog {

    private String purrs;
    private String meows;

    public Cat(boolean hasLegs, boolean hasTail, int eyes, String barks) {
        super(hasLegs, hasTail, eyes, barks);
    }

    public String getPurrs() {
        return purrs;
    }

    public void setPurrs(String purrs) {
        this.purrs = purrs;
    }

    public String getMeows() {
        return meows;
    }

    public void setMeows(String meows) {
        this.meows = meows;
    }
}
