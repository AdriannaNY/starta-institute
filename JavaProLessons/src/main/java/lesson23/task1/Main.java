package lesson23.task1;

import lesson17.task2.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(); // return String
        List<Integer> integers = new ArrayList<>(); // return Integer

        Box box = new Box();
        box.putItem("Hello"); // String
        box.putItem(15); // Integer
        box.putItem(new Cat(3, "Black")); // Cat

        // Object item = box.getItem(); // Object type, we don't know type of item that we get from box

        String item = (String) box.getItem(); // cast to String
        System.out.println(item.length()); // 5
        // But what if we don't have String in our box? - we get then ClassCastException
        // That's why better to work with Generics instead of Object
        // And we don't see mistake on step of compilation, only when run the program - very BAD







    }
}
