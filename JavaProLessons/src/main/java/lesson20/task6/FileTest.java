package lesson20.task6;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) throws IOException {

        File file = new File("testFile.txt"); // in Root
        System.out.println("Is file exist? - " + file.exists()); // false
        file.createNewFile();
        System.out.println("Is file exist? - " + file.exists()); // true

        File file1 = new File("first/second/third/fourth/secondTest.txt"); // in Root
        System.out.println("Is file exist? - " + file1.exists()); // false
//        file1.createNewFile(); // No such file or directory

        File file2 = new File("first");
        file2.mkdir(); // create directory
        System.out.println("Is it a file? - " + file2.isFile()); // false
        System.out.println("Is it a directory? - " + file2.isDirectory()); // true

        File file3 = new File("first/second/third/fourth");
        file3.mkdirs();
        file1.createNewFile();
    }
}
