package org.sda.concurrency.synchronization;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Synchronization base class
 *
 * @author Marko
 */
@AllArgsConstructor
@Getter
public class ShoppingCart {
    private int numberOfProducts;

    public void addProduct(int quantity) {
        System.out.println("Adding product: ");
        //Code block synchronization
        synchronized (this) {
            numberOfProducts += quantity;
        }
    }

    public synchronized void removeProduct(int quantity) { // sync means Thread cannot access the same time
        System.out.println("Removing product: ");
        numberOfProducts -= quantity;
    }
}
