package org.sda;

import org.sda.model.Person;

import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //LAMBDA EXPRESSION
        //Predicate
        Person person = new Person("Marko", "Piir", 20);
        Predicate<Person> personTest = test -> test.getAge() > 15; //-> mean implies
        System.out.println(personTest.test(person));

        System.out.println(getLengthOfString("Java is not easy. Joke!"));

        //OLDSCHOOL METHOD JUST IN ONE LINE/ NEWSCHOOL FUNCTIONAL INTERFACE
        Function<String, Integer> getStringLen = s -> {
            int increment = 10;
            return s.length() + increment;
        };

        System.out.println(getStringLen.apply("Java is not easy. Joke!"));

        //METHOD REFERENCE
        Predicate<Person> personTest2 = Person::isAdult; //Method reference -> ClassName::MethodName
        System.out.println(personTest2.test(person));

        //SUPPLIER - Doesn't take any arguments but returns/supplies only the value
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(); //no argument but returns random value
        System.out.println(randomNumberSupplier.get()); //get() should be called always

        //CONSUMER - it takes an argument, do the operation and returns nothing
        Consumer<Person> printPerson = p -> System.out.println("Person first name: " + p.getFirstName() + " last name: " + p.getLastName());
        printPerson.accept(person); //accept() should be called always

        //OPERATOR
        UnaryOperator<Integer> toSquare = i -> i * i;
        System.out.println(toSquare.apply(4)); // apply() should be called always


    }

    //OLDSCHOOL WAY OF METHOD DEFINITION
    private static Integer getLengthOfString(String inputString) {
        int increment = 10;
        return inputString.length() + increment;
    }

    //CONSUMER METHOD
    private static void consumer (String str) {
        System.out.println(str);
    }
}