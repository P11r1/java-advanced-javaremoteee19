package org.sda.concurrency;

import lombok.AllArgsConstructor;

/**
 * A stop watch concurrent thread example
 *
 * @author Marko
 */
@AllArgsConstructor
public class StopWatchThread extends Thread { // Thread means parallel running not disturbing eachother
    private String prefix;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(prefix + ": " + i);

            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}
