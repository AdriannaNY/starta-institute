package lesson7.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Mein");
        words.add("Welt");
        words.add("Java");
        words.add("Katze");
        words.add("Hund");
        words.add("Omg");
        System.out.println("Our collection - " + words);

        ListIterator<String> iterator = words.listIterator();  //create ListIterator - used only for List
        while (iterator.hasNext()) {
            String tmp = iterator.next();
            if (tmp.length() == 5) {
                break;
            }
            System.out.println(tmp);  //iterator remember where it was stopped, so we can continue work with it:
        }
        System.out.println("--------------");
        while (iterator.hasPrevious()) {
            String tmp2 = iterator.previous();
            System.out.println(tmp2);
            if (tmp2.equals("Java")) {
                iterator.add("JAVA");  //add JAVA after Java
            }
        }
        System.out.println(words);
    }
}
