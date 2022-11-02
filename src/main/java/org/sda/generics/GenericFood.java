package org.sda.generics;

/**
 * Generic food class
 *
 * @author Marko
 */

public class GenericFood<T> {
    //T - can be everything (String, float .. / Person, Passenger, Car..)
    private T item; // private Food item

    //Constructor
    public GenericFood(T item) {
        this.item = item;
    }

    //Getter and Setter
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
/**
 * E, T - element type
 * • K - key type
 * • V - value type
 * • T - type
 * • N - number type
 * • S, U, V if there are more parametrized types
 */