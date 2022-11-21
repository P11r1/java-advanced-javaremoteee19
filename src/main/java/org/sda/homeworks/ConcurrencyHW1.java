package org.sda.homeworks;

/**
 *  Create a class implementing the Runnable interface (implementing the run method):
 *  a) Inside the run method display „Hello!”
 *  b) Create a class object.
 *  c) Start the thread receiving the created object as a parameter (new Thread (<object>).start ())
 *  d) Create several objects, run a separate thread for each of them.
 *  e) Add the constructor to the created class, that accepts the int value.
 *  f) For the displayed data inside the run method, add the received value (Hello + value).
 *  g) Add a method to the class that will modify the int value.
 *  h) Add a while loop to the run method, inside which it will print the modified int value every few seconds.
 *  i) Add the ability to disable (gracefully shutdown) the thread. Why shouldn’t we just „kill” the thread?
 *
 * @author Marko
 */

public class ConcurrencyHW1 implements Runnable {
    private int value;

    //Constructor
    public ConcurrencyHW1(int value) {
        this.value = value;
    }


    public void increment(int number) {
        int i = number + value;
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello!" + value);
        }
    }


    public static void main(String[] args) {

        Thread myThread = new Thread(new ConcurrencyHW1(1));
        Thread myThread1 = new Thread(new ConcurrencyHW1(2));
        Thread myThread2 = new Thread(new ConcurrencyHW1(3));

        myThread.start();
        myThread1.start();
        myThread2.start();

        myThread1.stop();
    }
}
