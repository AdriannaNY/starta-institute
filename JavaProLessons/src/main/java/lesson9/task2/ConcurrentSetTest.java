package lesson9.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSetTest {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        set.add("Potato");
        set.add("Watermelon");
        set.add("Apple");
        set.add("Orange");
        set.add("Banana");
        set.add("Nuts");
        set.add("Cherry");
        set.add("Mango");
        set.add("Watermelon");

        Iterator<String> iterator = set.iterator();
        int counter = 1;
        List<String> itemsForRemove = new ArrayList<>();
        itemsForRemove.add("Apple");
        itemsForRemove.add("Banana");
        while (iterator.hasNext()) {
            String item = iterator.next();
            // 1. Banana, length: 6    // Will use formatted print method - printf():
            System.out.printf("%d. %s, length: %d\n", counter++, item, item.length()); // %f - double, float, %.2f - 1.35, 7.23
            // %d - decimal = int, %s - String, \n - ln = new line
            if (itemsForRemove.contains(item)) {
                iterator.remove();
            }
        }
        System.out.println(set); // [Cherry, Mango, Nuts, Orange, Potato, Watermelon]
        System.out.println();

        int i = 5;
        System.out.println(++i); //6  prefix
        System.out.println(i++); //6 postfix
        System.out.println(i); //7



    }
}
