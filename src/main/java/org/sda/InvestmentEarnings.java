package org.sda;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Investment earnings
 * Enter the buying price per share
 * Enter the closing price
 * Calculate aggregate earnings losses after each day
 * Leave program when closing price is negative
 *
 * @author Marko
 */

public class InvestmentEarnings {
    public static void main(String[] args) {
        //Scanner object to get input from user
        Scanner scanner = new Scanner(System.in);

        //Buying price from the user
        System.out.println("Enter your price per share: ");
        //Variable to store the scanner input
        double buyingPrice = scanner.nextDouble();

        //To keep track days after buying
        int day = 1;

        //To get rid of so many decimal points
        DecimalFormat df = new DecimalFormat("0.00");

        //To store the closing price from user
        //To trigger the entrance of while loop the value must be set higher than zero
        double closingPrice = 0.1;

        //Endless loop before the condition is met (Leave program when price is negative)
        while(true) {
            System.out.println("Enter the closing price for day " + day + " (any negative value to leave): ");
            closingPrice = scanner.nextDouble();
            if (closingPrice < 0.0)
                break;

            //If positive I calculate the earnings
            double earnings = closingPrice - buyingPrice;
            if(earnings > 0) {
                System.out.println("After day " + day + ", you earned " + df.format(earnings) + " per share.");

                //If earnings less than zero I calculate the loss
            } else if (earnings < 0) {                                    //(-earnings) because to make sense of the sentence in sout
                System.out.println("After day " + day + ", you lost " + df.format(-earnings) + " per share.");
            } else {
                System.out.println("After day " + day + ", you have " + "no earnings per share");
            }
            //To increment the day
            day++;
        }
        scanner.close();
    }
}
