package adds.algorithms.lesson7;

public class FindRotationCount { // big O = O(log2n)
    public static int findRotationCount(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                return left;
            }

            int mid = (left + right) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid - 1 + arr.length) % arr.length;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            } else if (arr[mid] <= arr[right]) {
                right = mid - 1;
            } else if (arr[mid] >= arr[left]) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {8,9,10,1,2,3,4,5,6,7};
        System.out.println("Array is rotated " + findRotationCount(array) + " times"); // 3
    }
}

