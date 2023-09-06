package adds.algorithms.lesson7;

public class FindBreakElement { // big O = O(n)
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,0,1,2}; // sorted array with break element
        System.out.println(find(arr)); // found index (= 4) of next element = break element (= 0) < less than previous element (= 6)
    }

    public static int find(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]) return i+1;
        }
        return -1;
    }
}
