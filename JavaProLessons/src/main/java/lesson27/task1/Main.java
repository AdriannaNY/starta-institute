package lesson27.task1;

public class Main {

    public static void main(String[] args) {

        // 2 base variants of creating separate thread:
        // 1. Using class Thread
        // 2. Using interface Runnable

        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2); // in case of using interface Runnable

        myThread1.test();

        myThread1.start(); // method start() create new thread and call method run()
        thread.start();

        for (int i = 0; i <= 9; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Break of the main thread");
            }

        }
    }
}
