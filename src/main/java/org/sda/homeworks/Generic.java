package org.sda.homeworks;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.ArrayList;

@Data

public class Generic<E> {
    private ArrayList<E> value;

    /**Enqueues an element into the queue.**/
    public void enqueue(E val) {

    }

    public static void main(String[] args) {
        Object[] arr = new Object[3];

        Generic<Integer> intGen = new Generic<>();

        Generic<String> strGen = new Generic<>();

        Generic<Double> dblGen = new Generic<>();





    }

}
