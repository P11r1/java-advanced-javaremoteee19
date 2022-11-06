package org.sda;

import org.sda.generics.*;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
    @SuppressWarnings("Unchecked")//Annotation
    public static void main(String[] args) throws FileNotFoundException {
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

        while (stringIterator.hasNext()) {
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

        //SET
        Set<String> countrySet = new HashSet<>(); //Non-sorted randomly stored
        countrySet.add("Eesti");
        countrySet.add("Saksamaa");
        countrySet.add("Poola");
        countrySet.add("Rootsi");
        countrySet.add("EESTI"); //case sensitive
        //countrySet.add("Eesti"); - error because SET cant have duplicates

        for (String country : countrySet) {
            System.out.println(country); // output is shuffled because hash memory, it prints smallest to largest
        }

        System.out.println("Before sorting: " + countrySet);
        TreeSet<String> countryTreeSet = new TreeSet<>(countrySet); //Stored as sorted list, alphabetical
        System.out.println("After sorting:" + countryTreeSet);

        //MAP
        Map<String, String> fullName = new HashMap<>(); // Not stored as sorted
        fullName.put("Marko", "Piir");
        fullName.put("Katrin", "Turin");
        fullName.put("Martin", "Piir");
        System.out.println(fullName);

        System.out.println(fullName.get("Marko")); // i give KEY "Marko" and get value "Piir"
        System.out.println(fullName.remove("Marko"));
        System.out.println(fullName);

        /**
         * Map seletus
         * key -> value
         * 0 -> "Skoda"
         * 1 -> "VW"
         * 210 -> "BMW"
         **/


        //Map exercise

        //Names and ages
        Map<String, Integer> namesAndAgesMap = new HashMap<>();
        namesAndAgesMap.put("Marko", 30);
        namesAndAgesMap.put("Katrin", 25);


        //Names and list of friends
        //Map of list
        Map<String, List<String>> friendsMap = new HashMap<>(); //For friends
        List<String> markoFriends = List.of("Marko", "Joonas");
        friendsMap.put("Marko", markoFriends);
        friendsMap.put("Marko", Arrays.asList("Joonas", "Veljo"));
        friendsMap.put("Katrin", Arrays.asList("Gerda", "Karmen"));

        //Names and details
        //Map of Map
        Map<String, Map<String, String>> detailsMap = new HashMap<>();
        Map<String, String> markoInfoMap = new HashMap<>();
        markoInfoMap.put("age", "15");
        markoInfoMap.put("birthplace", "Eesti");
        markoInfoMap.put("phone", "564651645");
        detailsMap.put("Marko", markoInfoMap);

        //INPUT AND OUTPUT
        File absoluteFile = new File("C:\\Users\\Marko\\IdeaProjects\\java-advanced\\src\\main\\resources\\myText.txt");
        File relativeFile = new File("myText.txt");

        //FILE READING
        FileReader fileReader = new FileReader(absoluteFile);
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(absoluteFile));
            String fileLine; // Store the line of text from the file

            while((fileLine = bufferedReader.readLine()) != null) {
                System.out.println(fileLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //FILE WRITING
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(absoluteFile, true));
            String fileLine = "\n I can write an errorless Java code :D";
            bufferedWriter.write(fileLine);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}