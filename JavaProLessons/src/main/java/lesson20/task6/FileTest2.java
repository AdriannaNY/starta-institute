package lesson20.task6;

import java.io.File;
import java.io.IOException;

public class FileTest2 {

    public static void main(String[] args) throws IOException {

        System.out.println("2 steps of creating a file");
        System.out.println("1. Create an object that refer to this file");
        File file = new File("testFile2");
        System.out.println("2. Create file using this object");
        file.createNewFile();
    }
}
