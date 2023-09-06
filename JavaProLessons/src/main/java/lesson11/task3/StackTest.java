package lesson11.task3;

public class StackTest {

    public static int value = 0;

    public static void main(String[] args) { // put method main in stack and call method first
        first();
    }

    public static void first() { // put method first in stack and call method second
        second();
    }
    public static void second() { // put method second in stack and call method third
        third();
    }
    public static void third() { // put method third in stack and call method fourth
        if (value == 0) {  // we prevent exception of compilation
            throw new RuntimeException("Mistake in the third method"); // throw exception
            // we will not see in stack fourth method - because it worked successfully and was deleted from stack
        }
        fourth(); // now this method is reachable, so we don't have CompilationException, but this method is not called, because it after we throw exception
    }

    public static void fourth() { // put method fourth in stack and print stack with all called methods in it
        // so, we can analyze the chain of methods, where and why we have exception.
        // If method was without exceptions it will delete from stack after method finish it's work
        System.out.println("Called fourth method");
        // throw new RuntimeException("Mistake in the fourth method"); // throw exception
    }

}
