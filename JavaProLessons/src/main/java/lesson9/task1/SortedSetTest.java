package lesson9.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("C");
        set.add("A");
        set.add("B");
        set.add("D");
        set.add("c");
        boolean result1 = set.add("D");
        boolean result2 = set.add("a");

        System.out.println("Method add():");
        System.out.println(set); //[A, B, C, D, a, c]
        System.out.println(result1); //false
        System.out.println(result2); //true

        System.out.println("Method contains():");
        System.out.println(set.contains("a")); //true
        System.out.println(set.contains("F")); //false

        // Set knows about it's first and last element:
        System.out.println("Method first():");
        System.out.println(set.first()); //A

        System.out.println("Method last():");
        System.out.println(set.last()); //c

        System.out.println("Method remove():");
        result1 = set.remove("a"); //true
        result2 = set.remove("d"); //false
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(set);  //[A, B, C, D, c]

        System.out.println("Method removeAll():");
        List<String> list = new ArrayList<>();
        list.add("D");
        list.add("c");
        set.removeAll(list);
        System.out.println(set); //[A, B, C]

    }
}
