package lesson17.task4;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        // 1. Convert String into Double
        // 2. Round double into Long
        // 3. Long^2

        Function<String, Double> function1 = x -> Double.parseDouble(x);
        Function<Double, Long> function2 = x -> Math.round(x);
        Function<Long, Long> function3 = x -> x * x;

        // Variant 1. Default method andThen():
        Function<String, Long> result = function1.andThen(function2).andThen(function3);
        System.out.println(result.apply("4.76")); // 25

        // Variant 2. Alternative variant:
        Function<String, Long> total = x -> {
                double result1 = Double.parseDouble(x);
                long result2 = Math.round(result1);
                return result2 * result2;
        };
        System.out.println(result.apply("4.76")); // 25

        // Variant 3.
        Function<String, Long> total2 = x -> (long)Math.pow((double)(Math.round(Double.parseDouble(x))), 2);
        System.out.println(total2.apply("4.76")); // 25

        // Variant 4. Default method compose():
        Function<String, Long> result2 = function2.andThen(function3).compose(function1);
        System.out.println(result2.apply("4.76")); // 25

        // Variant 5.
        Function<String, Long> result3 = function3.compose(function2).compose(function1);
        System.out.println(result3.apply("4.76")); // 25


    }
}
