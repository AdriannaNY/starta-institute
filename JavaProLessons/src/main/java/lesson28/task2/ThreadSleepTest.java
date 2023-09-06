package lesson28.task2;

public class ThreadSleepTest {

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        Thread.sleep(5000);
        long duration = System.currentTimeMillis() - start;
        System.out.printf("Затраченное время - %d мс.", duration);
    }
}
