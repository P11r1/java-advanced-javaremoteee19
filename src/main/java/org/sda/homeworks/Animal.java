package org.sda.homeworks;

public class Animal extends Cat {
    private String voice;
    private String name;

    Animal cat = new Animal();
    Animal dog = new Animal();


    private String[] animal = {cat, dog};

    public Animal() {

    }

    public void yieldVoice() {

    }
    public Animal(String voice, String name) {
        this.voice = voice;
        this.name = name;
    }

    public Animal(boolean hasLegs, boolean hasTail, String color, String breed, String voice, String name) {
        super(hasLegs, hasTail, color, breed);
        this.voice = voice;
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
