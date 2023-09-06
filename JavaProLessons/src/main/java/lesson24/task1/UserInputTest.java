package lesson24.task1;

import java.util.Scanner;

public class UserInputTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter age: ");
        int age;
        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Incorrect age input!");
            age = -1;
        }

        System.out.printf("Name - %s, age - %d", name, age);

    }
}
