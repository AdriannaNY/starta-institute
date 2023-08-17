package task2;

import java.util.Arrays;

public class Main {

    /**
     * method delete repeating elements from array
     *
     * @param args   Array
     * @return       result Array
     */
    public static void main(String[] args) {

        int[] Array = {0,3,-2,4,3,2};
        System.out.println(Arrays.toString(distinct(Array)));

    }

    public static int[] distinct(int[] arr) {
        int[] result = Arrays.stream(arr).distinct().toArray();
        return result;
    }

}
