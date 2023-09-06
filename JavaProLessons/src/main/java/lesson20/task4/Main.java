package lesson20.task4;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // create new Directory: testDir with file: test.txt in root Directory: Project_JavaPro
        InputStream in = new FileInputStream("testDir/test.txt");
        // right click on file: test.txt -> Copy Path/Reference... -> Path from content root
        Reader reader = new InputStreamReader(in);

        int result = reader.read();
//        System.out.println(result); // 72, byte type, cause first symbol H = 72
//        System.out.println((char) result); // H, char type
//
//        result = reader.read();
//        System.out.println(result); // 101, byte type, cause second symbol e = 101
//        System.out.println((char) result); // e, char type

        System.out.println("Text from file test.txt:");
        while (result != -1) {
            System.out.print((char) result);
            result = reader.read();
            if (result == -1) {
                System.out.println();
                System.out.println("File finished");
            }
        }
        // Text from file test.txt:
        // Hello World! I study Java!
        // File finished


// ===========================SAME RESULT:=========================
//        System.out.println("Text from file test.txt:");
//        while (true) {
//            System.out.print((char) result);
//            result = reader.read();
//            if (result == -1) {
//                System.out.println();
//                System.out.println("File finished");
//                break;
//            }
//        }
//        // Text from file test.txt:
//        // Hello World! I study Java!
//        // File finished







    }
}
