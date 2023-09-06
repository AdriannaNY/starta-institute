package adds.algorithms.lesson1;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int[] list = {3,1,2,0,5};
        System.out.println(Arrays.toString(insertionSort(list)));  // [0, 1, 2, 3, 5]
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 2; i < arr.length - 1; i++) {
            int key = arr[i];
            while (i >= 1 && arr[i - 1] > key) {
                arr[i] = arr [i - 1];
                    i = i - 1;
                }
            arr[i] = key;
            }
        return arr;
    }

}
