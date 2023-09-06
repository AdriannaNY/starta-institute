package lesson24.task3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) { // throws IOException {
        firstMethod();
    }

    public static void firstMethod() { // throws IOException { // processing of exception using try - catch
        try {
            secondMethod();
        } catch (IOException e) {
            System.out.println("Exception was processed in the first method");
            // throw new IOException("Exception from catch block of the first method");
            // !!! created new checked type exception -> must throw upper and process it

            // throw new RuntimeException("Exception from catch block of the first method");
            // !!! created new unchecked type exception -> must NOT throw upper and process it
        }
    }

    public static void secondMethod() throws IOException { // throw exception upper
        thirdMethod();
    }

    public static void thirdMethod() throws IOException{ // throw exception upper
//        try {
            fourthMethod();
//        } catch (IOException e) {
//            System.out.println("Exception was processed in the third method");
//            e.printStackTrace();
//        }
    }

    public static void fourthMethod() throws IOException{ // throw exception upper
//        try {
            FileReader fileReader = new FileReader("wrongFileName.txt");
//        } catch (IOException e) {
//            System.out.println("Exception occurs!");
//        }
    }
}
