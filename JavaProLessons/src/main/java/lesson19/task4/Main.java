package lesson19.task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String[][] array = new String[][]{{"Hello", "world"},
                {"Hello", "Java"},
                {"Hello", "student"},
                {"Welcome", "to", "Tel-ran"}};

        /*
        1. Count number of words
        2. Count number of distinct words
         */

        // Arrays.stream(array) = Stream.of(array)
        //  .flatMap(x -> Arrays.stream(x)) = .flatMap(Arrays::stream)
        // count() return long -> long count

        long count = Stream.of(array)
                .flatMap(x -> Arrays.stream(x))
                .count();
        System.out.println(count); // 9


        count = Stream.of(array)
                .flatMap(Arrays::stream)
                .distinct()
                .count();
        System.out.println(count); // 7


    }
}
