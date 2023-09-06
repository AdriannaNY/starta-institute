package lesson5.practice5;

public class Calculator {

    public void sum(int a, int b) {
        System.out.println("Result = " + (a + b));
        System.out.println("int");
    }

    public void sum(long a, long b) {
        System.out.println("Result = " + (a + b));
        System.out.println("long");
    }

    public void sum(double a, double b) {
        System.out.println("Result = " + (a + b));
        System.out.println("double");
    }

    public static void main(String[] args) {

        // examples of int
        int q = 10;
        int w = 20;

        // examples of long
        long e = System.nanoTime();
        long r = System.nanoTime();

        new Calculator().sum(e,r);

    }
}
