package lesson21.task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamTest {

    public static void main(String[] args) throws IOException {

        File file = new File("output.txt");
        file.createNewFile();

        try (FileOutputStream out = new FileOutputStream(file, false); // true = add to end, false = override
             Scanner scanner = new Scanner(System.in)) {

            out.write('X'); // X

//            while (true) { // infinity loop
//                out.write(scanner.nextLine().charAt(0)); // first symbol
//            }

            String text = " Hello World!";
            byte[] bytes = text.getBytes();
            out.write(bytes); // X Hello World!
            out.write(bytes, 6, 6); // X Hello World! World = 6 skip & 6 output



        } catch (Exception e) {
            System.out.println("Exception!");
        }

    }
}
