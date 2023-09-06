package lesson9.task4;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayToSet {  // util class will contain static methods(without objects), set of instruments
        public static Set<String> convertToSet1(String[] array) {
            Set<String> result = new HashSet<>();
            for (String item : array) {
                result.add(item);
            }
            return result;
        }

    public static Set<String> convertToSet2(String[] array) {
//            List<String> list = Arrays.asList(array); // return list
//            Set<String> result = new HashSet<>(list); // put list in set
//            return result; //return set
        return new HashSet<>(Arrays.asList(array)); // better way to write like this
    }

    public static Set<String> convertToSet3(String[] array) {
        Set<String> result = new HashSet<>();
        Collections.addAll(result, array);
        return result;
    }

    public static Set<String> convertToSet4(String[] array) {
        return Set.of(array); // return not changeable immutable collection, origin array must be without repeat elements
    }

    public static Set<String> convertToSet5(String[] array) {
        return Arrays.stream(array).collect(Collectors.toSet());
    }





}
