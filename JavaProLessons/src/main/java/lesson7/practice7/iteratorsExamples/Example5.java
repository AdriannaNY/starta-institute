package lesson7.practice7.iteratorsExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Example5 {
    public static void main(String[] args) {
        List<String> message = new ArrayList<>();

        String mess = "Hello java. It's 240123mbe";
        String[] messArray = mess.split(" ");

        for (int i = 0; i <messArray.length ; i++) {
            message.add(messArray[i]);
        }

        ListIterator<String> stringListIterator = message.listIterator();

        while (stringListIterator.hasNext())
            System.out.println(stringListIterator.next());

        while (stringListIterator.hasPrevious())
            System.out.println(stringListIterator.previous());

        stringListIterator.remove();

        System.out.println(message);


    }
}
