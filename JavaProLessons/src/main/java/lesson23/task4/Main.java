package lesson23.task4;

import lesson10.task2.Cat;

public class Main {

    public static <T> void print(T item) {
        System.out.println(item);
    }

    // We don't nee all these methods, because we use generics:
//    public static void print(String item) {
//        System.out.println(item);
//    }
//    public static void print(Double item) {
//        System.out.println(item);
//    }
//    public static void print(Cat item) {
//        System.out.println(item);
//    }

    public static void main(String[] args) {

        print("Hello"); // Hello
        print(15.6); // 15.6
        print(new Cat(7, "White", 4.7)); // Cat : age - 7, color - White, weight - 4.70.
    }
}
