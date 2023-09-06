package lesson9.task3;

import lesson9.task2.ConcurrentSetTest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class HashSetTest {
    public static void main(String[] args) {
        //Pod kapotom of HashSet -->  Hashtable = key(hashcode) + value(object)
        Set<String> set1 = new HashSet<>();  //by default - initial capacity - size of HashTable = 16
        set1.add("Banana");
        set1.add("Nuts");
        set1.add("Apple");
        set1.add("Lemon");
        set1.add("Pear");
        set1.add("Cherry");
        set1.add("Avocado");
        set1.add(null);
        Set<String> set2 = new HashSet<>(set1); // copy, independent
        System.out.println(set1); //[Apple, Nuts, Pear, Cherry, Avocado, Lemon, Banana]
        System.out.println(set2); //[Apple, Nuts, Pear, Cherry, Avocado, Lemon, Banana]
        System.out.println(set1.remove("Nuts"));
        System.out.println(set1); //[Apple, Pear, Cherry, Avocado, Lemon, Banana] - changed
        System.out.println(set2); //[Apple, Nuts, Pear, Cherry, Avocado, Lemon, Banana] - copy didn't change

        Set<String> set3 = new HashSet<>(20); // it matters, if we have more, then 1000 000 of objects
        Set<String> set4 = new HashSet<>(20, 0.5f); // f - float, from 0 to 1
        // shows when will increasing of our hashtable after adding objects to hashset, in this case after adding 10 (20 * 0.5)

        Set<String> set5 = new LinkedHashSet<>();
        set5.add("Banana");
        set5.add("Nuts");
        set5.add("Apple");
        set5.add("Lemon");
        set5.add("Pear");
        set5.add("Cherry");
        set5.add("Avocado");
        set5.add(null);

        Set<String> set6 = new TreeSet<>();
        set6.add("Banana");
        set6.add("Nuts");
        set6.add("Apple");
        set6.add("Lemon");
        set6.add("Pear");
        set6.add("Cherry");
        set6.add("Avocado");
        //set6.add(null); // can't put null - not allowed

        ConcurrentSkipListSet<String> set7 = new ConcurrentSkipListSet<>();
        set7.add("Banana");
        set7.add("Nuts");
        set7.add("Apple");
        set7.add("Lemon");
        set7.add("Pear");
        set7.add("Cherry");
        set7.add("Avocado");
        // set7.add(null);   // can't put null - not allowed

        System.out.println("HashSet:\n" + set1); //[null, Apple, Pear, Cherry, Avocado, Lemon, Banana]
        //not sorted data
        System.out.println("LinkedHashSet:\n" + set5); // [Banana, Nuts, Apple, Lemon, Pear, Cherry, Avocado, null]
        // LinkedHashSet saved position of addable elements
        System.out.println("TreeSet:\n" + set6); // sorted data [Apple, Avocado, Banana, Cherry, Lemon, Nuts, Pear]
        // can't put null - not allowed   // Потоконебезопасная коллекция
        System.out.println("ConcurrentSkipListSet:\n" + set7); //sorted data [Apple, Avocado, Banana, Cherry, Lemon, Nuts, Pear]
        // can't put null - not allowed   // Потокобезопасная коллекция



    }
}
