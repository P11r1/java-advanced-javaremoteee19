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
public abstract class Animal {
    public static void main(String[] args) {

        //Move common methods and fields to the class animal
        boolean hasLegs;

        //Create simple array of type Animal, that will contain one object of type Dog and one object of type Cat.
        Animal[] animals = new Animal[]{new Cat(true, true, true, "white", "regular"), new Dog(true, true)};

        //Using for-each loop show which animal gives what kind of voice.
        for (Animal animal : animals) {
            animal.yieldVoice();

            // How to print a name of an object?
            System.out.println(animal.getClass());

        }
    }

    //Create method "yieldVoice"
    abstract public void yieldVoice();
}




