package org.sda.homeworks;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.Arrays;

@Data
@AllArgsConstructor
public class Generic<T> {
    private T[] value;

    public static void main(String[] args) {
        Object[] arr = new Object[3];

        Generic<Integer> intGen = new Generic<>(5);

        Generic<String> strGen = new Generic<>("My name is Marko!");

        Generic<Double> dblGen = new Generic<>(2.45);





    }


}
