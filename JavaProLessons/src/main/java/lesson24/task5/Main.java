package lesson24.task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InCorrectIndex {

        // Запросить значение n у пользователя.
        // Перенести код в метод, который принимает n как аргумент.
        // Посмотреть, какие ошибки возможны в данном коде и для каждой
        // ошибки создать пользовательское исключение.
        // Выбросить эти исключения в нужное время и обработать их в main.

        System.out.println("Enter n:");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        try {
             testExceptions(n);
        } catch (DivisionByZeroException e) { // user exception
            System.out.println("Division by zero is not allowed");
        } catch (InCorrectIndex e) { // user exception
            System.out.println("Incorrect index value (out of bounds)");
        } catch (NegativeIndexException e) { // user exception
            System.out.println("Index can't have negative value for the size");
        }
    }

    public static void testExceptions(int n) throws InCorrectIndex {
        if (n == 0) throw new DivisionByZeroException(); // user exception
        int x = 10 / n;
        System.out.printf("Result of division: %d\n", x);
        if (n < 0) throw new NegativeIndexException(); // user exception
        int[] array = new int[n];
        System.out.printf("Length of array: %d\n", array.length);
        try {
            System.out.println(array[n]); // index = length = exception
        } catch (IndexOutOfBoundsException e) { // real exception
            throw new InCorrectIndex(); // user exception
        }
    }
}
