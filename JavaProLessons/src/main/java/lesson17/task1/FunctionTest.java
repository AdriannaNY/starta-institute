package lesson17.task1;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        // Function - supplier interface (functional) with 1 abstract method apply(), use to convert one type to another type
        // Function will round value that we had put in it as parameter (x = Double), will return Long
        Function<Double, Long> function = x -> Math.round(x); // lambda expression = short representation of anonim class (body of method apply())
        // Math.round(x) - anonim class that implement interface Function and realisate method apply

        System.out.println(function.apply(3.65)); // 4
        System.out.println(function.apply(15.245)); // 15
        // apply - not static so we call it from variable function that refer to an object of anonim class

        // Function.identity(); // we cann call method using Interface, not object, because it's static method



    }
}
