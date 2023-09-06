package lesson11.task5;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Hello");
        queue.add("World");
        queue.add("I");
        queue.add("study");
        queue.add("Java");

        System.out.println(queue); // [Hello, World, I, study, Java]
        System.out.println("Element:" + queue.element()); // Hello - output of first element, not delete it from queue
        System.out.println("Queue after element: " + queue); // [Hello, World, I, study, Java]
        System.out.println("Poll: " + queue.poll()); // Hello - - output of first element and delete it from queue:
        System.out.println("Queue after poll: " + queue); // [World, I, study, Java]


        while (!queue.isEmpty()) {
            // System.out.println(queue.element()); // method element() - infinity output of first element - Hello
            System.out.println(queue.poll()); // output of all elements
        }
    }
}
