package lesson30.task2;

public class ThreadJoin extends Thread {

    @Override
    public void run() {
        System.out.println("Поток начал работу " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток завершил работу " + Thread.currentThread().getName());
    }
}
