package lesson28.task5;

public class Main {

    public static void main(String[] args) throws ArithmeticException {

//        try {
            first(5, 1);
//        } catch (ArithmeticException e) {
//            System.out.println("Ошибка!");
//        }
    }

    public static void first(int x, int y) throws ArithmeticException {
//        try {
            second(++x, --y);
//        } catch (ArithmeticException e) {
//            System.out.println("Ошибка!");
//        }
    }

    public static void second(int a, int b) throws ArithmeticException {
//        try {
            System.out.println("Результат деления: " + (a / b));
//        } catch (ArithmeticException e) {
//            System.out.println("Ошибка!");
//        }
    }
}
