package org.sda;

import org.sda.model.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //LAMBDA EXPRESSION
        //Predicate
        Person person = new Person("Marko", "Piir", "kukk", 20);
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


        //OPTIONAL
        Person person3 = new Person("Joss", "Juss", "tony", 54);
        Optional<Person> optionalPerson = Optional.of(person3); // Optional example

        if (optionalPerson.isEmpty()) { //If isPresent then swap if and else block sout
            System.out.println("Person cannot be printed!");
        } else {
            System.out.println(optionalPerson.get().toString());
        }

        optionalPerson.ifPresent(System.out::println);

        System.out.println(getRandomPerson().toString());

        //STREAMS - mainly used when you have a LIST
        List<String> carList = List.of("Bmw", "Audi", "Skoda", "Subaru", "Ford");
        carList.stream()
                .findFirst().
                ifPresent(System.out::println); // findFirst() -> to get first element -> Optional<T>
        carList.stream()
                .findAny().
                ifPresent(System.out::println); //findAny() -> Optional<T> - Finds random element in the list

        //Filter is used to apply a condition to the list and filter the list
        List<String> filteredCars = carList.stream()
                .filter(s -> s.length() >= 5) // Filters returns Stream<T>
                .collect(Collectors.toList()); // Convert Stream<T> toList<T>
        //Because String lentgh >= 5, so prints words length more or equals 5

        filteredCars.forEach(s -> {
            String prefixed = "Car: " + s;
            System.out.println(prefixed);
        }); //Because String lentgh >= 5, so prints words length more or equals 5


        //Map is used to apply an operation to all the elements in the list
        List<Integer> carLengths = carList.stream()
                .map(String::length)
                .collect(Collectors.toList());

        carLengths.forEach(System.out::println);
        System.out.println(carLengths.size());

        //allMatch() is used to check all the elements in the list matching a given condition
        boolean isAllCarsGreaterThanFive = carList.stream() // stream means like a for loop
                .allMatch(s -> s.length() >= 5); // s- represent element in array
        System.out.println(isAllCarsGreaterThanFive);

        //anyMatch() used to check if at least one element in the list is matching the given condition
        boolean isAnyCarStartingWithB = carList.stream()
                .anyMatch(s -> s.startsWith("B")); //startsWith is case-sensitive
        System.out.println(isAnyCarStartingWithB);

        //Reduce() used to condense/reduce the list to one single String/ other type
        String cars = carList.stream()
                .reduce("", ((s, s2) -> (s.equals("") ? "" : s + ", ") + s2));
        System.out.println(cars);

        //Sorting() is used to sort the List in alphabetical/ascending order
        carList.stream()
                .sorted() //Alphabetical/ascending order
                .forEach(System.out::println);

        //Reverse sorting
        //descending order
        carList.stream()
                .sorted((car1, car2) -> car2.compareTo(car1))
                .forEach(System.out::println);

        //alternative descending sort using Comparator
        carList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);



        //NESTED CLASS
        //Non-static
        Person person4 = new Person("Kukk", "Kires", "kukk", 85);
        System.out.println(person4.getUserName()); //outer class method call

        Person.Employee employee = person4.new Employee();
        employee.userName(); // inner class method call
        System.out.println(person4.getUserName());

        //Static
        Person person5 = new Person("Ivo", "Kukk", "ivo", 37);
        System.out.println(person5.getUserName()); //Outer class method call

        Person.Customer customer = new Person.Customer();// Difference in the object instantiation
        customer.userName(person5);
        System.out.println(person5.getUserName());
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

    //OPTIONAL GETRANDOM PERSON METHOD
    //orElse example
    private static Person getRandomPerson() {
       // Optional<Person> optionalPerson = Optional.empty(); // OptionalPerson is empty
        Optional<Person> optionalPerson = Optional.of(new Person("Capten", "Estonia","captain",  57));
        Person person2 = new Person("Marko", "Piir", "juss",  33); // Backup substitute

        return optionalPerson.orElse(person2); // orElse if optionalPerson is empty then you return person 2
    }
}