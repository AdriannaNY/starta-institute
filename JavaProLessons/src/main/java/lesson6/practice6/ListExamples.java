package lesson6.practice6;

import java.util.*;

public class ListExamples {
    public static void main(String[] args) {
        List<Integer> q = new ArrayList<>(100);



        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> aa = new ArrayList<>(List.of(1,2,3,4,5,6));

        System.out.println(a);
        System.out.println(aa);

        a.remove(0);
        aa.remove(0);

        System.out.println(a);
        System.out.println(aa);
    }

    // видоизменение всех элементов ArrayList'а
    public static void edit1(List<Integer> list, double x) {
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
            output.add((int)(list.get(i) * x));

        System.out.println("edit1 (copy) = " + output);
    }

    public static void edit2(List<Integer> list, double x) {
        for (int i = 0; i < list.size(); i++)
            list.set(i, (int)(list.get(i) * x));

        System.out.println("edit2 (no copy) = " + list);
    }

    public static void remove1(List<Integer> list) {
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Integer tmp = list.get(i) / 10;
            if (tmp % 2 == 0)
                output.add(tmp);
        }

        System.out.println("remove1 (copy) = " + output);
    }

    public static void getSum(List<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++)
            sum += list.get(i);

        System.out.println(sum);
    }

}
