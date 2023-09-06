package lesson28.task4;

public class Main {

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException ignored) {
            // Здесь мы можем ошибку залогировать (записать в файл лога)
        }

        thread.stopThread();
    }
}
