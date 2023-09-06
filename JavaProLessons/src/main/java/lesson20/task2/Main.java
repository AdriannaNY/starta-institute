package lesson20.task2;

public class Main {

    public static void main(String[] args) {

        System.out.println("Start of the program");
        System.out.println("Call method div");
        System.out.println(div(8, 0));
        System.out.println("End of the program");
    }

    public static int div(int x, int y) {
        System.out.println("Start of the method");
        System.out.println("Checking y");
        if (y == 0) {
            System.err.println("Error! / by zero. Let's make y = 1"); // red color in console in the end
            y = 1;
        }
        int result = x / y;
        System.out.println("End of the method");
        return result;
    }
// System.out.println(div(8, 4));
//    Start of the program
//    Call method div
//    Start of the method
//    End of the method
//    2
//    End of the program


// System.out.println(div(8, 0));
//    Start of the program
//    Call method div
//    Start of the method
//    Exception in thread "main" java.lang.ArithmeticException: / by zero

//    Start of the program
//    Call method div
//    Start of the method
//    Checking y
//    End of the method
//    8
//    End of the program
//    Error! / by zero. Let's make y = 1  // red color


}
