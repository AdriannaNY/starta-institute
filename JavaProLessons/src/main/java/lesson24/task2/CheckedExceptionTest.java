package lesson24.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionTest {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("testFile.txt"); // checked exception
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println(bufferedReader.read()); // checked exception
            bufferedReader.close(); // checked exception


// If we get exception in the code above, we will not go further to the next part of code below:
            int x = 3;
            int y = 0;
            System.out.println(x / y); // Unchecked exception
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }

    }
}
