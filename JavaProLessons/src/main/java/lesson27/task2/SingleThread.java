package lesson27.task2;

public class SingleThread {

    public static void main(String[] args) {

        int number = 5;
        int counter = 0;

        long start = System.currentTimeMillis();

        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            if (i % number == 0) {
                counter++;
            }
        }

        long end = System.currentTimeMillis();

        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.MAX_VALUE); //  2147483647
        System.out.println("Number of found values: " + counter); // Number of found values: 858993459
        System.out.println("Spent time: " + (end - start) + "ms."); // Spent time: 100288ms. (100 seconds)

    }
}
