package Homework_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorsTest {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10_000_000; i++) {
            numbers.add(i);
        }
        int size = numbers.size();
//        System.out.println("The size of the List is " + size);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();
        List<Integer> list6 = new ArrayList<>();


//        System.out.println("Task 1. For-each - loop:");
        long start1 = System.currentTimeMillis();
        for (Integer temp : numbers) {
            list1.add(temp);
        }
        long finish1 = System.currentTimeMillis();
        long result1 = finish1 - start1;
        System.out.println("Result 1 = " + result1 + " ms");
//        System.out.println(list1);


//        System.out.println("Task 2. For - loop:");
        long start2 = System.currentTimeMillis();
        for (int i = 1; i <= numbers.size(); i++) {
            list2.add(i);
        }
        long finish2 = System.currentTimeMillis();
        long result2 = finish2 - start2;
        System.out.println("Result 2 = " + result2 + " ms");
//        System.out.println(list2);

//        System.out.println("Task 3. For - loop, using variable for size of List:");
        long start3 = System.currentTimeMillis();
        for (int i = 1; i <= size; i++) {
            list3.add(i);
        }
        long finish3 = System.currentTimeMillis();
        long result3 = finish3 - start3;
        System.out.println("Result 3 = " + result3 + " ms");
//        System.out.println(list3);

//        System.out.println("Task 4. Elements from end to start, using for - loop:");
        long start4 = System.currentTimeMillis();
        for (int i = size; i > 0; i--) {
            list4.add(i);
        }
        long finish4 = System.currentTimeMillis();
        long result4 = finish4 - start4;
        System.out.println("Result 4 = " + result4 + " ms");
//        System.out.println(list4);

//        System.out.println("Task 5. Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        long start5 = System.currentTimeMillis();
            while (iterator.hasNext()) {
                    list5.add(iterator.next());
                }
        long finish5 = System.currentTimeMillis();
        long result5 = finish5 - start5;
        System.out.println("Result 5 = " + result5 + " ms");
//        System.out.println(list5);

//        System.out.println("Task 6. Elements from end to start. ListIterator:");
        ListIterator<Integer> listIterator = numbers.listIterator();
        long start6 = System.currentTimeMillis();
        while(listIterator.hasNext()){
            Integer tmp = listIterator.next();
            if (tmp == size) {
                break;
            }
        }
        while (listIterator.hasPrevious()) {
            list6.add(listIterator.previous());
        }
        long finish6 = System.currentTimeMillis();
        long result6 = finish6 - start6;
        System.out.println("Result 6 = " + result6 + " ms");
//        System.out.println(list6);

    }
}
