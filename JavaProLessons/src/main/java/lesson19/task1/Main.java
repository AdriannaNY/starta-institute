package lesson19.task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // [][] -> []

        int[][] array = {{5, 7, 9},
                         {1, 23, 69, 17},
                         {9, 3}};

        int[] result = Arrays.stream(array) // [][] -> stream of 3 arrays []
                       .flatMapToInt(x -> Arrays.stream(x)) // -> stream of numbers, x = one of 3 streams of arrays[]
                       .toArray();  // stream of numbers -> one array []

        System.out.println(Arrays.toString(result)); // [5, 7, 9, 1, 23, 69, 17, 9, 3]






    }
}
