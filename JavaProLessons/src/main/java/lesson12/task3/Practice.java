package lesson12.task3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {

//        Найти первый элемент, встречающийся k раз в массиве

        String[] words = {"Peach", "Banana", "Orange", "Apple", "Orange", "Tomato", "Orange", "Peach", "Banana", "Banana"};

        System.out.println(getRepeatWord(words, 1)); // Apple
        System.out.println(getRepeatWord(words, 2)); // Peach
        System.out.println(getRepeatWord(words, 3)); // Banana
        System.out.println(getRepeatWord(words, 4)); // null
    }

    public static String getRepeatWord(String[] words, int number) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String word : words) {
            if (map.keySet().contains(word)) {
                Integer counter = map.get(word) + 1;
                map.put(word, counter);
            } else {
                map.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() == number) {
                return pair.getKey();
            }
        }
        return null;
    }
}
