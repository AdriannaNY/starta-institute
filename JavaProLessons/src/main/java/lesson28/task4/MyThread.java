package lesson28.task4;

public class MyThread extends Thread {

    private boolean isStopped;

    public void stopThread() {
        isStopped = true;
    }

    @Override
    public void run() {
        int seconds = 0;
        while (!isStopped) {
            System.out.println("Прошло секунд - " + seconds++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {

            }
        }
    }
}