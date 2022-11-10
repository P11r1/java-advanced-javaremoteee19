package org.sda.homeworks;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Stream homework
 *
 * @author Marko
 */
public class StreamHomework {
    public static void main(String[] args) {


        //Given Lists
        List<String> nameList = List.of("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        List<Integer> numberList =  List.of(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);

        System.out.println("Given Lists: " + "\n" +  nameList + "\n" + numberList);

        System.out.println("Sorted name List:");

        //SORTING THE LIST
        //Name List sorting
        nameList.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Sorted number List:");

        //Number List sorting
        numberList.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Names starting with E:");

        //Print only those names, that start with letter "E"
        nameList.stream()
                .filter(s -> s.startsWith("E"))
                .toList()
                .forEach(System.out::println);

        System.out.println("Numbers greater than 30: ");

        //Print values greater than 30
        numberList.stream()
                .filter(s -> s > 30)
                .forEach(System.out::println);

        System.out.println("Numbers lower than 200: ");

        //Print all the values lower than 200
        numberList.stream()
                .filter(s -> s < 200)
                .forEach(System.out::println);

        //Print names uppercase
        System.out.println("Uppercase names: ");
        nameList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //Remove first and last letter, sort and print names
        nameList.stream()
                .map(name -> name.substring(1, name.length()-1))
                .sorted()
                .forEach(System.out::println);




    }
}
