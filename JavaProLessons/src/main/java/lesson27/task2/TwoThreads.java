package lesson27.task2;

import java.util.concurrent.atomic.AtomicInteger;

public class TwoThreads {

    public static int number = 5;
    // public static volatile int count = 0;
    // keyword volatile prevent creating of local copy of common source - variable count for threads,
    // but it not work every time

    // public static AtomicInteger count = new AtomicInteger(); // prevent access different threads in 1 time
    private static int count = 0;

    public  static synchronized void increment() { // threads will execute (858993459 times) this method - access for only 1 thread after each other
        count++;
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = Integer.MIN_VALUE; i < 0 ; i++) {
            if (i % number == 0) {
                // count.incrementAndGet(); // when use AtomicInteger
                increment();
            }
        }

        try {
            myThread.join(); // main thread will wait when this thread will finish
        } catch (InterruptedException e) {
            System.out.println("Error");
        }

        long end = System.currentTimeMillis();

        System.out.println("Number of found values: " + count); // Number of found values: 858993459 - correct
        System.out.println("Spent time: " + (end - start) + "ms."); // Spent time: 1172712ms. (117 seconds) - more time than 1 thread

    }
}
