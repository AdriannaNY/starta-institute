package lesson7.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {  //remove evens from collection
                iterator.remove();
            }
        }
        System.out.println(numbers);

        List<String> words = new ArrayList<>();
        words.add("Mein");
        words.add("Welt");
        words.add("Java");
        words.add("Katze");
        words.add("Hund");
        words.add("Omg");
        System.out.println("Our collection - " + words);

        Iterator<String> iterator2 = words.iterator();  //Create Iterator for collection of String type
        while (iterator2.hasNext()) {
            String tmp = iterator2.next();  //create variable tmp = next element
            if (tmp.length() % 2 == 0) {  //remove words with even length from collection
                iterator2.remove();
            } else if (tmp.length() == 3) {  //print word with length 3
                System.out.println("Word with length 3 - " + tmp);
            }
        }
        System.out.println("Collection without event lengths - " + words);

    }
}
