package lesson24.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // User registration
        // User must input age
        // Age can't be less than 12 and greater than 150

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = Integer.parseInt(scanner.nextLine()); // same = scanner.nextInt()
        System.out.printf("Age is %d\n", age);

        try { // necessary processing of checked exception
            registration(age);
        } catch (TooBigAgeException e) {
            System.out.println("Age is too big");
        } catch (TooSmallAgeException e) { // processing also unchecked exception, but it was unnecessary with this type
            System.out.println("Age is too small");
        }

    }

    public static void registration(int age) throws TooBigAgeException {
        if (age < 12) {
            throw new TooSmallAgeException(); // unchecked
        }
        if (age > 150) {
            throw new TooBigAgeException(); // checked
        } else {
            System.out.println("Successful complete of registration");
        }
    }
}
