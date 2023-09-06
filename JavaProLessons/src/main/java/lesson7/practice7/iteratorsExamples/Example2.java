package lesson7.practice7.iteratorsExamples;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        // Iterable()
        //    |
        // Collection()
        //    |
        //  List()
        //    |
        // ArrayList()


        // вывести все четные элементы, умножив при этом их на 10
        List<Integer> q = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        test1(q);
        System.out.println();
        test2(q.iterator());
    }

    public static void test1(Collection<Integer> c) {
        Iterator<Integer> iterator = c.iterator();
//        test2(iterator);  // можно так, но не очень демонстративно в рамках урока
        while (iterator.hasNext()) {
            Integer tmp = iterator.next();
            if (tmp % 2 == 0)
                System.out.print((tmp * 10) + " ");
        }
    }

    public static void test2(Iterator<Integer> it) {
        while (it.hasNext()) {
            Integer tmp = it.next();
            if (tmp % 2 == 0)
                System.out.print(((tmp * 10) + " "));
        }
    }
}
