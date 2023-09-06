package lesson7.practice7.iteratorsExamples;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        // vector
        Vector<Integer> vector = new Vector<>();
        Collections.addAll(vector, 1,2,3,4,5);

//        Enumeration<Integer> elements = vector.elements();
//
//        while (elements.hasMoreElements())
//            System.out.println(elements.nextElement());


        // stack
        Stack<String> stack = new Stack<>();
        stack.add("Hello");
        stack.add("java");

        Enumeration<String> elements = stack.elements();

        while (elements.hasMoreElements())
            System.out.println(elements.nextElement());

    }
}
