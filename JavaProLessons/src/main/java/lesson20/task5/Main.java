package lesson20.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

    public static void main(String[] args) throws IOException {

        Reader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // SAME

        String input = br.readLine();
        System.out.printf(" Input String - %s\n Length - %d\n", input, input.length());



    }
}
