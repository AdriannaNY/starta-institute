package lesson5.Binary;

public class BinarySearch {
    public static int binSearch(int[] sortedArray, int searchNumber) {
        int start = 0;
        int end = sortedArray.length - 1;
        int counter = 0;

        while (start <= end) {
            counter ++; // use counter to understand how fast we will find number, how much steps
            System.out.println(counter);
            int half = (start + end)/2;  //better use: int half = start + (end-start)/2;
            if (searchNumber == sortedArray[half]) {
                return half;
            } else if (searchNumber < sortedArray[half]) {
                end = half -1;
            } else {
                start = half + 1;
            }
        }
        return -1;
    }

    public static int simpleSearch(int[] array, int number) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter ++; // use counter to understand how fast we will find number, how much steps
            System.out.println(counter);
            if (number == array[i]) {
                return i;
            }
        }
        return -1;
    }


}
