package lesson11.task6;

public class MyDequeTest {
    public static void main(String[] args) {
        MyArrayDeque deque = new MyArrayDeque();
        deque.addToHead(2); // [2]
        System.out.println(deque);
        deque.addToTail(4); // [2, 4]
        System.out.println(deque);
        deque.addToHead(1);  // [1, 2, 4]
        System.out.println(deque);
        deque.addToTail(5); // [1, 2, 4, 5]
        System.out.println(deque);

        System.out.println(deque.size()); // 4

        System.out.println(deque.peekHead()); // 1
        System.out.println(deque.peekTail()); // 5

        System.out.println(deque.getByIndex(1)); // 2

//        System.out.println(deque.removeHead()); // 1
//        System.out.println(deque); // [2, 4, 5]
//        System.out.println(deque.removeTail()); // 5
//        System.out.println(deque); // [2, 4]
//
//        System.out.println(deque.size()); // 2

//        deque.removeHead();
//        deque.removeHead();
//        System.out.println(deque); // []
//        deque.removeTail();
//        System.out.println(deque); // []
//        System.out.println(deque.size()); // 0

        System.out.println(deque.contains(3)); // false

        System.out.println(deque); // [1, 2, 4, 5]

        System.out.println(deque.contains(1)); // true

    }
}
