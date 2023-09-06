package lesson11.task2;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String result1 = stack.push("Hello"); // push return E - generic - type that we use when create Stack, in our example - it's String type
        stack.push("World");
        stack.push("I");
        stack.push("study");
        boolean result = stack.add("Java");

        System.out.println(stack); // [Hello, World, I, study, Java]
        System.out.println(result); // true, add return boolean
        System.out.println(result1); // Hello, push return E = String

        String element = stack.pop(); // principe of Stack - LIFO = last - in, first - out:
        System.out.println("Pop: " + element); // Pop: Java - show last added element and delete it from stack
        System.out.println("Stack after pop: " + stack); // [Hello, World, I, study] - last element was deleted after pop, but saved in variable element

        element = stack.pop();
        System.out.println("Pop2: " + element); // study
        System.out.println("Stack after pop2: " + stack); // [Hello, World, I]

        for (String value : stack) {
            System.out.println(value);
        }

//        // EmptyStackException
//        Stack<Integer> integers = new Stack<>();
//        integers.pop();

        element = stack.peek(); // Peak: I - show last added element, but not delete it from stack
        System.out.println("Peak: " + element); // Peak: I
        System.out.println(stack); // [Hello, World, I]

        System.out.println("Reversed output of stack: ");
        while (!stack.empty()) { // while our stack is not empty - get and print its elements from end
            System.out.println(stack.pop());
        }

    }
}
