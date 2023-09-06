package lesson7.practice7.iteratorsExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Example6 {
    public static void main(String[] args) {
        List<String> message = new ArrayList<>();

        String mess = "Hello java. It's 240123mbe";
        String[] messArray = mess.split(" ");

        for (int i = 0; i <messArray.length ; i++) {
            message.add(messArray[i]);
        }

        Spliterator<String> spliterator = message.spliterator();

        spliterator.forEachRemaining(x -> System.out.println(x));
        spliterator.forEachRemaining(System.out::println);

    }
}
