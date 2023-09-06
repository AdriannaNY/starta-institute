package adds.algorithms.lesson4;

public class BinarySearchRecurse {  // Big O = O(log)
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90};
        int target = 50;
        int result = binarySearch(array, target, 0, array.length - 1);
        System.out.println(result); // 4 - index of element 50
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start <= end) {
            int mid = (start+end) / 2;

            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                return binarySearch(arr, target, mid + 1, end);
            return  binarySearch(arr, target, start, mid - 1);
        }
        return -1;
    }
}
