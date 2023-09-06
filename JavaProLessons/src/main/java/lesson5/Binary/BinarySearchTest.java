package lesson5.Binary;

public class BinarySearchTest {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        numbers[7] = 20;
        System.out.println(numbers[7]);

        String[][] words = new String[5][5];
        words[2][3] = "Hello";

        boolean[][][] booleans = new boolean[3][3][3];
        booleans[0][2][1] = true;

        int[] numbers1 = {1,3,5,8,2,6,465,75,12,90,122,9,45,201,7,15};
        System.out.println("Simple search:");
        System.out.println(BinarySearch.simpleSearch(numbers1,2)); //found index of number 2 in array numbers1

        int[] sortedArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,30,40,50,60,70,80,90,100,1000};
        System.out.println("Binary search work only with sorted arrays:");
        System.out.println(BinarySearch.binSearch(sortedArray,15)); //found index of number 14 in 1 step




    }
}
