package adds.algorithms.lesson1;

import java.util.Arrays;

public class Stone {
    public static void main(String[] args) {
        int[] list = {3,1,2,0,5};
        System.out.println(Arrays.toString(bubbleSort(list)));
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean changed = false;
            for (int j = arr.length - 2; j >= i; j--) {
                if (arr[j] > arr [j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    changed = true;
                }
            }
            if (!changed) break;
        }
        return arr;
    }

}


