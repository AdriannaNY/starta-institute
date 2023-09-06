package lesson17.task6;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        // Write a method(array, function)
        // Using function, processing every element of array
        // Return set of this result elements

        String[] words = {"AAAA", "BBB", "CCCCC", "BBB"};
        Function<String, String> function = x -> x + " " + x.length();

        Set<String> set = getSetFromArray(words, function);
        System.out.println(set); // [BBB 3, AAAA 4, CCCCC 5]

        // Get from ready method (identity()) Set of not changed elements
        Set<String> set2 = getSetFromArray(words, Function.identity());
       // Set<String> set2 = getSetFromArray(words, x -> x); // [BBB, CCCCC, AAAA] same result
        System.out.println(set2); // [BBB, CCCCC, AAAA]

    }

    public static Set<String> getSetFromArray(String[] array, Function<String, String> function) {
        Set<String> result = new HashSet<>();
        for (String currentWord : array) {
            String processedWord = function.apply(currentWord);
            result.add(processedWord);
        }
        return result;
    }
}
