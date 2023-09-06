package lesson7.task2;

import java.util.*;

public class EnumerationTest {
    public static void main(String[] args) {
        Vector<String> words = new Vector<>();  //create old collection (Legacy Collection) Vector
        words.add("Hello1");
        words.add("Hello2");
        words.add("Hello3");
        words.add("Hello4");
        words.add("Hello5");
        System.out.println(words);

        Enumeration<String> enumeration = words.elements();  //Enumeration like iterator bit for old collections
        while (enumeration.hasMoreElements()) {
        System.out.println(enumeration.nextElement());
        }

}
}
