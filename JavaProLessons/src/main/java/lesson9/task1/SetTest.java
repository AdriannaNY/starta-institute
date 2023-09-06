package lesson9.task1;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("World");
        set.add("Java");
        set.add("Cat");
        set.add("Dog");
        set.add("C#");
        set.add("Platon");
        System.out.println(set); //[C#, Cat, Dog, Hello, Java, Platon, World]

        for (String value : set) {
            System.out.println(value + " " + value.length());
        }
        System.out.println();

        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            String elem = iterator.next();
//            if (elem.length() % 2 ==0) {
//                System.out.println(elem + " true");
//            } else {
//                System.out.println(elem + " false");
//            }
//        }
        while (iterator.hasNext()) {
            String elem = iterator.next();
            System.out.println(elem + " " + (elem.length() % 2 == 0));
        }


    }
}
