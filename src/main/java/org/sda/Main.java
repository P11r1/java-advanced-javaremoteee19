package org.sda;

import org.sda.generics.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // GENERIC TYPE
        Fruit fruit = new Fruit();
        fruit.setName("Apple");
        fruit.setColor("Green");
        fruit.setPrice(BigDecimal.valueOf(1.99)); //Converting double to BigDecimal


        GenericFood<Fruit> genericFoodWithFruit = new GenericFood<>(fruit);
        System.out.println(genericFoodWithFruit.getItem());

        String str = "I'm a great developer";
        GenericFood<String> genericFoodWithString = new GenericFood<>(str);
        System.out.println(genericFoodWithString.getItem());

        genericFoodWithString.setItem("I'm a good person!");
        System.out.println(genericFoodWithString.getItem());

        //GENERIC TYPE - EXTENDS
        Vegetable vegetable = new Vegetable();
        GenericExtendFood<Vegetable> vegetableGenericExtendFood = new GenericExtendFood<>(vegetable);
        System.out.println(vegetableGenericExtendFood.getRating());

        //GENERIC TYPE - INTERFACE
        Snack snack1 = new Snack(5);
        Snack snack2 = new Snack(3);
        System.out.println("Snack 1 is better than Snack2: " + snack1.isBetter(snack2));

        //LIST

        List<String> animalList = new ArrayList<>();
        //How to add in the list
        animalList.add("Lion"); //Index 0
        animalList.add("Tiger"); //1
        animalList.add("Dog"); // 2
        animalList.add("Cat");
        animalList.add("Bear");
        animalList.add("Panda");

        System.out.println(animalList.get(1)); //Prints tiger

        //To remove from the list
        animalList.remove(1);
        animalList.remove("Dog");

        //How to see the list
        for (String animal : animalList) {
            System.out.println(animal);
        }

        //Iterator
        Iterator<String> stringIterator = animalList.listIterator();

        while(stringIterator.hasNext()) {
            System.out.println(stringIterator.next() + " ,");
        }

        //new list to remove all
        List<String> removeAnimalList = new ArrayList<>();
        removeAnimalList.add("Cat");
        removeAnimalList.add("Panda");

        animalList.removeAll(removeAnimalList);

        for (String animal : animalList) {
            System.out.println(animal);
        }

        //LIST EXERCISE


        /**
         * Map seletus
         * key -> value
         * 0 -> "Skoda"
         * 1 -> "VW"
         * 210 -> "BMW"
         */
    }
}