package lesson17.task5;

import java.util.function.Function;

public class Identity {

    public static void main(String[] args) {

        // static method Identity()
        Function<String, String> function = Function.identity(); // method is the same as x -> x
        // Function<String, String> function = x -> x;
        System.out.println(function.apply("Test")); // put Test -> return Test
    }
}
