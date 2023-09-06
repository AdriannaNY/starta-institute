package lesson12.task1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>(); // Random output
        // LinkedHashMap - elements in output are same as were added
        // TreeMap - sorted by key output

        map.put("Banana", 123);
        map.put("Potato", 53);
        map.put("Strawberry", 173);
        map.put("Carrot", 42);
        map.put("Orange", 63);
        map.put("Cherry", 83);
        map.put("Potato", 47); // override the value of key "Potato"
        map.put("Onion", 22);

        System.out.println("Price on strawberry: " + map.get("Strawberry"));
        System.out.println("Price on potato: " + map.get("Potato")); // 47
        System.out.println("Price on key, that not exist - on apples: " + map.get("Apples")); // null

        System.out.println();
        System.out.println("Output of all elements, using for - each loop and formatted output: ");
        int stringNumber = 0;
        for (Map.Entry<String, Integer> pair : map.entrySet()) {  // HOTKEY: iter
            // System.out.println(pair); // Potato=47 etc...
            String key = pair.getKey();
            int value = pair.getValue();
            // 1. Product - Potato, price - 47.
            System.out.printf("%d. Product - %s, price - %d.\n", ++stringNumber, key, value); // HOTKEY: souf
        }

        // System.out.println(map); // default output of map
        // {Potato=47, Carrot=42, Cherry=83, Onion=12, Strawberry=73, Orange=63, Banana=123}

        System.out.println("All products of shop: ");
        for (String product : map.keySet()) {
            System.out.println(product); // Potato Carrot etc...
        }

        System.out.println("All prices of shop: ");
        for (Integer price : map.values()) {
            System.out.println(price); // 47 42 etc...
        }

        System.out.println(map.keySet()); // [Potato, Carrot, Cherry, Onion, Strawberry, Orange, Banana]

        // Delete from price-list orange and products with price more, then 100
        // we need iterator, but map is not a collection --> we can't call iterator,
        // but map.entrySet = collection (Set of pairs) --> has iterator: map.entrySet().iterator()

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        // HOTKEY: map.entrySet().iterator(); --> cursor on word iterator --> alt+enter --> introduce local variable --> enter
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next(); // use HOTKEY
            if ("Orange".equals(pair.getKey()) || pair.getValue() > 100) {
                iterator.remove();
            }
            // we can't write like this: pair.getKey.equals("Orange"), because key can be null -->
            // we prevent NullPointerException (can't call methods from null)
            // or we can write: if (pair.getKey() != null && pair.getKey().equals("Orange") || pair.getValue() > 100)
        }
        stringNumber = 0;
        System.out.println();
        System.out.println("After delete: ");
        for (Map.Entry<String, Integer> pair : map.entrySet()) {  // HOTKEY: iter
            // System.out.println(pair); // Potato=47 etc...
            String key = pair.getKey();
            int value = pair.getValue();
            // 1. Product - Potato, price - 47.
            System.out.printf("%d. Product - %s, price - %d.\n", ++stringNumber, key, value); // HOTKEY: souf
        }



    }
}
