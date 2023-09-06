package lesson27.task1;

public class MyThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 100; i < 110; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(200);
                test2();
            } catch (InterruptedException e) {
                System.out.println("Break of the thread1");
            }
        }
    }

    public void test(){
        System.out.println("Test method");
    }

    private void test2() {
        System.out.println("Test method 2");
    }

}
