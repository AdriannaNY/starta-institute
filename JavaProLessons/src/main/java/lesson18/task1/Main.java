package lesson18.task1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // TASK 1. Find sum of odd numbers in collection
        List<Integer> list = Arrays.asList(6, 3, 8, 9, 1, 0, 5, 2, 4);

        // VARIANT 1 - using forEach-loop
        int sum1 = 0;
        for (Integer current : list) {
            if (current % 2 != 0) {
                sum1 += current;
            }
        }
        System.out.println("Task 1:");
        System.out.println("1.1 Result 1 is " + sum1); // 18

        // VARIANT 2 - using streams and lambda expression
        // 3 9 1 5 - our filtered stream
        // reduce((3, 9) -> 3 + 9) = 12
        // reduce ((12, 1) -> 12 + 1) = 13
        // reduce ((13, 5) -> 13 + 5) = 18
        int sum2 = list.stream().filter(x -> x % 2 != 0).reduce((x1, x2) -> {
            int sum3 = x1 + x2; // or -> x1 * x2 + 5 or -> (int)(Math.sin(x1) * 10) + x2
            return sum3;
        }).orElse(0);
        // int sum2 = list.stream().filter(x -> x % 2 != 0).reduce((x1, x2) -> x1 + x2).orElse(0); // same
        // int sum2 = list.stream().filter(x -> x % 2 != 0).reduce((x1, x2) -> Integer.sum(x1, x2).orElse(-1); // same
        // 1. .stream<Integers>.
        // 2. .filter(Predicate).  // return Stream<odd Integers>
        // 3. .method reduce(). = sum of elements   // return Optional<T> - object if exist, if not - orElse(0)
        // 4. .method orElse(0);   // return 0 if object not exist or -1
        System.out.println("1.2 Result 2 is " + sum2); // 18

        // VARIANT 3 - using streams and reference method
        // Integer.sum(3, 4);
        int sum3 = list.stream().filter(x -> x % 2 != 0).reduce(Integer :: sum).orElse(-1);
        System.out.println("1.3 Result 3 is " + sum2); // 18

//        // Stream from array
//        int[] array = new int[5];
//        Arrays.stream(array).sum();














    }
}
