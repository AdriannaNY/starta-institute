package lesson7.practice7.iteratorsExamples;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {

//        int w = 10;               // pre (++w)    // post (w++)
//        System.out.println(w);    // 10           // 10
//        System.out.println(w++);  // 11           // 10
//        System.out.println(w);    // 11           // 11
//        getTestArray();
        getTestList();
    }

    public static void getTestArray() {
        int[] q = {1,2,3,4,5};

        for (int i = 0; i < q.length; i++)
            System.out.println(q[i]);

        for (int e : q)
            System.out.println(e);
    }

    public static void getTestList() {
        List<Integer> q = Arrays.asList(1,2,3,4,5);

        for (int i = 0; i < q.size(); i++)
            System.out.println(q.get(i));


        for (Integer e : q)
            System.out.println(e);


        Iterator<Integer> iterator = q.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
