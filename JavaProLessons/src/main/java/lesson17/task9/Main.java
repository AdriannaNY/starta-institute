package lesson17.task9;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        // Functional interface Predicate has 1 abstract method test(), that return boolean
        // lesson16 - task1 - we wrote our own realisation of Interface Predicate (Interface Filter - boolean test())

        Predicate<String> predicate = x -> x.length() % 2 == 0; // return true if - even, false - if odd
        System.out.println(predicate.test("Hello")); // false
        System.out.println(predicate.test("Java")); // true

    }
}
