package lesson29.task6;

public class Main {
    private static int counter;
    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
        System.out.println("Значение счетчика - "+counter);

    }

    public static void increment(){
//        System.out.printf("Поток %s начал выполнение метода increment\n", Thread.currentThread().getName());
        synchronized(Monitors.MONITOR) {
            counter++;
            // успех =)
        }
//        System.out.printf("Поток %s закончил выполнение метода increment\n", Thread.currentThread().getName());
    }
}
