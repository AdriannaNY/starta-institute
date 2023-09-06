package lesson30.task4;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {

    private final BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Message msg;
            Thread.sleep(7000);
            // consuming messages until exit message is received
            while (!(msg = queue.take()).getMsg().equals("exit")) {
                Thread.sleep(msg.getId() * 500);
                System.out.println("Consumed " + msg.getMsg());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
