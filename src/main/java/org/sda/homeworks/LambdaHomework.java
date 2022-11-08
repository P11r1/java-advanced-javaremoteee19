package org.sda.homeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@FunctionalInterface
interface Arithmetic {
    int operations(int a, int b);
}

public class LambdaHomework {
    public static void main(String[] args) {
        //ADDITION
        Arithmetic addition = (a, b) -> (a + b);
        System.out.println("Addition: " + addition.operations(10, 20));

        //SUBTRACTION
        Arithmetic subtraction = (a, b) -> (a - b);
        System.out.println("Subtraction: " + subtraction.operations(82, 65));

        //DIVIDE
        Arithmetic divide = (a, b) -> (a / b);
        System.out.println("Divide sum: " + divide.operations(10, 2));

        //MULTIPLICATION
        Arithmetic multiplication = (a, b) -> (a * b);
        System.out.println("Multiplication: " + multiplication.operations(52,7));


        //SUM OF ELEMENTS IN LIST
        List <Integer> list = new ArrayList<>();
        list.add (10);
        list.add (20);
        list.add (2);
        list.add (8);
        list.add (33);

        Integer sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of list: " + sum);

        //NUMBER OF WORDS IN THE INPUT EXPRESSION
        List<String> strList = new ArrayList<>();
        //How to add in the list
        strList.add("Lion"); //Index 0
        strList.add("Tiger"); //1
        strList.add("Dog"); // 2
        strList.add("Cat");
        strList.add("Bear");
        strList.add("Panda");

        strList.forEach(
                (n)->System.out.println(n.length())
        );







    }
}
