package lesson23.task2;

import lesson17.task2.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List list = new ArrayList<>(); // row use (without type), default type - Object
        list.add("Hello"); // String
        list.add(new Cat(3, "Black")); // Cat

        String text = list.get(0) + " World";
        System.out.println(text); // Hello World
        String text1 = list.get(1) + " World";
        System.out.println(text1); // lesson17.task2.Cat@5305068a World

        // String text2 = list.get(0); // Exception - trying to put Object in String
        // String text2 = (String) list.get(1); // cast to String
        // System.out.println(text2);
        // But what it will not a String in our list? - ClassCastException





    }
}
