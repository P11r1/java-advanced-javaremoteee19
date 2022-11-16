package org.sda;

public class FirstBank {
    public static void main(String[] args) {
        Account marko = new Account("Marko Piir", "A00001");
        marko.showMenu();

        Account katrin = new Account("Katrin Turin", "A00002");
        katrin.showMenu();

    }
}
