package lesson7.practice7.iteratorsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
//        List<Integer> q = Arrays.asList(1,2,3,4,5); // не реализован remove()

        List<Integer> w = new ArrayList<>();
        for (int i = 1; i <= 5 ; i++)
            w.add(i);

//        List<Integer> e = List.of(1,2,3,4,5); // не реализован remove()

        System.out.println(w);

        Iterator<Integer> iterator = w.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0)
                iterator.remove();
//            System.out.print(iterator.next() + " ");
//            iterator.remove();
        }

        System.out.println(w);


    }
}
