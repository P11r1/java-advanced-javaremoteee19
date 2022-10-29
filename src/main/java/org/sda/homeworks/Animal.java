package org.sda.homeworks;

public class Animal {
    private boolean isAlive;
    private boolean jumps;
    private String voice;

    public Animal() {
    }

    public Animal(boolean isAlive, boolean jumps) {
        this.isAlive = isAlive;
        this.jumps = jumps;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isJumps() {
        return jumps;
    }

    public void setJumps(boolean jumps) {
        this.jumps = jumps;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void yieldVoice() {
        Cat cat = new Cat(true, true, 4, "bark");
        Dog dog = new Dog(true, true, 4, "bark");
        String[] animalArray = {"Cat", "Dog"};


        for (String i : animalArray) {

                System.out.println();


        }
    }
}
