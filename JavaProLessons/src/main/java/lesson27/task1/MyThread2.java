package lesson27.task1;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 10000; i < 10010; i++) {
            System.out.println("Thread2: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Break of the thread2");
            }
        }
    }
}
