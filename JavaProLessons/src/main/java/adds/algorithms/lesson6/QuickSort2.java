package adds.algorithms.lesson6;

import java.util.Arrays;

public class QuickSort2 {
    public static void main(String[] args) {
        int[] arr = {9,1,2,0,4,6,7,8,5};
        System.out.println(Arrays.toString(quickSort(arr,0, arr.length - 1))); // [0, 1, 2, 4, 5, 6, 7, 8, 9]
    }

    public static int[] quickSort(int[] arr, int start, int end) {
        if (end > start) { // means, that in array more than 1 element; array of 1 element = sorted by default -> we can't sort it
            int pivot = arr[end];
            int index = start;
            for (int i = start; i < end; i++) {
                if (arr[i] < pivot) {
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp; // changed places of elements
                    index++;
                }
            }
            int temp = arr[end];
            arr[end] = arr[index];
            arr[index] = temp; // changed places of elements

            quickSort(arr, start, index - 1);
            quickSort(arr,index + 1, end);
        }
        return arr;
    }
}

// i-9 = start
// i-5 = end
// index = 4 (index of pivot 5)
//{9,1,2,0,6,7,4,8,5}
//{1,2,0,4,5,9,6,8,7}
