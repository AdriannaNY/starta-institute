package lesson7.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorTest {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Mein");
        words.add("Welt");
        words.add("Java");
        words.add("Katze");
        words.add("Hund");
        words.add("Omg");
        words.add("Wow");
        words.add("Super");
        words.add("Superpuper");
        System.out.println("Our collection - " + words);

        Spliterator<String> spliterator1 = words.spliterator();  //second part of collection
        Spliterator<String> spliterator2 = spliterator1.trySplit();  //split collection on 2 parts, took first biggest part
        Spliterator<String> spliterator3 = spliterator1.trySplit();
        spliterator1.forEachRemaining(x -> System.out.println("Spliterator 1: " + x));
        spliterator2.forEachRemaining(x -> System.out.println("Spliterator 2: " + x));
        spliterator3.forEachRemaining(x -> System.out.println("Spliterator 3: " + x));


    }
}
