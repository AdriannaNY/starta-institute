package lesson21.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class InputStreamTest {

    public static void main(String[] args) {

        // try-with-resources

        File file = new File("testDir/test.txt");

        try (FileInputStream in = new FileInputStream("testDir/test.txt");
             FileInputStream in1 = new FileInputStream(file); // same object in1 = in
             FileReader reader = new FileReader(file)) {

            System.out.println("1. Available bytes: " + in.available()); // 26

            System.out.println("2. Skip 14 bytes in the file");
            in.skip(14);
            System.out.println("Available bytes: " + in.available()); // 12

            System.out.println("3. Info from file in bytes: " + in.read()); // 32
            System.out.println("4. Info from file in char: " + (char) in.read()); // s = 15th symbol (14 was skipped)
            System.out.println("5. Available info from file using method read():"); // tudy Java
            int data = in.read();
            while (in.available() > 0) {
                System.out.print((char) data);
                data = in.read();
            }
            System.out.print((char) data); // print also last symbol
            System.out.println();

            byte[] bytes = in1.readAllBytes();
            System.out.println("6. Available info using array of bytes:"); // Hello World! I study Java!
            for (byte current : bytes) {
                System.out.print((char) current);
            }


        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }
}
