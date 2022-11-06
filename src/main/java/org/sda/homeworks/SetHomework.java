package org.sda.homeworks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set homework
 *
 * @author Marko
 */
public class SetHomework {

    //Scanner to get the user input
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        //New color Set
        Set<String> colorSet = new HashSet<>();

        //Add color method call
        addColor(colorSet);

        //Delete color method call
        deleteColor(colorSet);

        //To display Set before and after sorting
        System.out.println("Before sorting: " + colorSet);
        TreeSet<String> colorTreeSet = new TreeSet<>(colorSet); //Stored as sorted list, alphabetical
        System.out.println("After sorting: " + colorTreeSet);

    }

    //To add colors to the Set
    private static void addColor(Set<String> colorSet) {

        boolean isAdd = true;

        while (isAdd) {
            System.out.println("Enter a color: ");
            String addColor = SCANNER.next();

            if (!colorSet.contains(addColor)) {
                colorSet.add(addColor);
                System.out.println("'" + addColor + "' added. Do you want to add another color? (true/false)");
            } else {
                System.out.println("The color already exists, do you want to add another color? (true/false)");
            }

            isAdd = SCANNER.nextBoolean();
        }

        for (String colors : colorSet) {
            System.out.println(colors); // output is shuffled because hash memory, it prints smallest to largest
        }
    }

    //To delete colors from the Set
    private static void deleteColor(Set<String> colorSet) {
        boolean isDelete = true;

        while (isDelete) {
            System.out.println("Enter a color to be deleted: ");
            String deleteColor = SCANNER.next();

            if (colorSet.contains(deleteColor)) {
                colorSet.remove(deleteColor);
                System.out.println("'" + deleteColor + "' deleted. Do you want to delete another color? (true/false)");
            } else {
                System.out.println("The color does not exists, do you want to delete another color? (true/false)");
            }

            isDelete = SCANNER.nextBoolean();
        }
    }
}