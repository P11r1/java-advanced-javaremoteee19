package org.sda.homeworks;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements CompareTo<Person> {

    private double height;

    @Override
    public boolean isTaller(Person height) {
        return this.height > height.height;
    }

    public static void main(String[] args) {


        Person person1 = new Person(187.7d);
        Person person2 = new Person(162.4d);
        System.out.println("Person 1 is taller than Person2: " + person1.isTaller(person2));
    }
}