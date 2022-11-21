package org.sda.homeworks;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *  *You are the manager. You have 5 employees. Simulate the situation in which each of them comes at a different time to work.
 *  a) Every employee, after getting to work, displays the information „<name: I came to work at <time HH:MM>.”
 *  b) Every 10 seconds, the employee displays „name: I’m still working!”
 *  c) Every 30 seconds, we release one of the employees to home (remember about stopping the thread!) and remove the employee from the „active employees list”
 *  d) When you release your employee to home, print „<name: <time HH:MM>, it's time to go home!”
 *  e) * When you release a given employee, all of the others speed up. From that moment, display the information about work 2 seconds faster.
 *  f) ** The manager decides in which order release employees (e.g. through an earlier defined list
 */
public class ConcurrencyHW2 implements Runnable {
    public static void main(String[] args) {



        LocalDateTime time = LocalDateTime.now();

        ArrayList<String> employee = new ArrayList<>();

        employee.add("Marko");
        employee.add("Joonas");
        employee.add("Martin");
        employee.add("Riho");
        employee.add("Peeter");
    }

    @Override
    public void run() {
        for (int i = 0; i < 0; i++) {
            System.out.println("Stop watch: " + i);

        }

    }
}

