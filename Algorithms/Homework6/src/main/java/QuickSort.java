import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        Integer[] array = {9, 5, 7, 2, 8, 3, 0, 6, 1, 4, 3};
        List<Integer> arrayT = Arrays.asList(array);
        System.out.println(quickSort(arrayT));   // [0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9]
    }


    public static List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() <= 1) return arr;
        int pivot = arr.get(arr.size() - 1);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > pivot) {
                right.add(arr.get(i));
            } else {
                left.add(arr.get(i));
            }
        }

        List<Integer> combined = new ArrayList<>();
        combined.addAll(quickSort(left));
        combined.add(pivot);
        combined.addAll(quickSort(right));

        return combined;
    }
}
