package lesson21.task1;

public class ExceptionTest {

    public static void main(String[] args) {
        System.out.println("Start of program");
        System.out.println("Call method div from method main");
        int result = div(8, 0);
        System.out.println("In method main we got result - " + result);
        System.out.println("Finish of program");

    }

    public static int div(int x, int y) {
        System.out.printf("Start of method div with parameters %d and %d\n", x, y);
        int result;
        try {
            result = x / y;
        } catch (Exception e) {
            System.out.println("Exception in method div");
            result = 0;
        } finally {
            System.out.println("Work of block finally");
        }

        System.out.printf("Finish of method div with result - %d\n", result);
        return result;

//        int result = div(8, 4);
//        Start of program
//        Call method div from method main
//        Start of method div with parameters 8 and 4
//        Finish of method div with result - 2
//        In method main we got result - 2
//        Finish of program
//        Process finished with exit code 0


//        int result = div(8, 0);
//        Start of program
//        Call method div from method main
//        Start of method div with parameters 8 and 0
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        Process finished with exit code 1 = emergency finish of program


//        Start of program
//        Call method div from method main
//        Start of method div with parameters 8 and 0
//        Exception in method div
//        Work of block finally
//        Finish of method div with result - 0
//        In method main we got result - 0
//        Finish of program
//        Process finished with exit code 0

    }
}
