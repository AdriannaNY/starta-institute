package lesson20.task6;

import java.io.File;
import java.io.IOException;

public class FileTest3 {

    public static void main(String[] args) throws IOException {

        System.out.println("Creating a file in a directory");
        System.out.println("1. Create an object that refer to a directory");
        File dir = new File("testDirectory");
        System.out.println("2. Create a directory using the object");
        dir.mkdir();
        System.out.println("3. Create an object that refer to a file");
        File file = new File("testDirectory/test3.txt");
        System.out.println("4. Create a file using the object");
        file.createNewFile();

    }
}
