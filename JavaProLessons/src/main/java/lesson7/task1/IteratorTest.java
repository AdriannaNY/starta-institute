package lesson7.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();  //Create collection (String type) ArrayList with name list
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Iterator<String> iterator = list.iterator();  //Create Iterator for collection of Integer type
        while (iterator.hasNext()) {
            System.out.println(iterator.next());  //Show in console all elements of our collection list
        }
    }
}
