package lesson6.practice6;

import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {
        //бинарный поиск через рекурсию

        // indexes 0 1 2 3 4 5  6
        int[] q = {1,3,5,7,8,10,15};
        System.out.println(binarySearchRecursive(q, 0, q.length-1, 110));
    }

    public static int binarySearchRecursive(int[] q, int left, int right, int element) {
        int mid = left + (right - left) / 2;

        if (right < left)
            return -1;

        if (q[mid] == element)
            return mid;
        else if (q[mid] > element)
            return binarySearchRecursive(q, left, mid - 1, element);
        else
            return binarySearchRecursive(q, mid + 1, right, element);
    }

    public static void example2() {

        int[][] q = {{1,2,3}, {4,5,6}};
        int[][] w = q.clone();

        System.out.println(q);
        System.out.println(Arrays.toString(q));
        System.out.println("q = " + Arrays.toString(q[0]) + " " + Arrays.toString(q[1]));

        System.out.println();

        System.out.println(w);
        System.out.println(Arrays.toString(w));
        System.out.println("w = " + Arrays.toString(w[0]) + " " + Arrays.toString(w[1]));

        w[0] = q[0].clone();
        w[1] = q[1].clone();

        w[1][0] = 400;

        System.out.println();

        System.out.println(q);
        System.out.println(Arrays.toString(q));
        System.out.println("q = " + Arrays.toString(q[0]) + " " + Arrays.toString(q[1]));

        System.out.println();

        System.out.println(w);
        System.out.println(Arrays.toString(w));
        System.out.println("w = " + Arrays.toString(w[0]) + " " + Arrays.toString(w[1]));

    }

    public static void example1() {
        // картинка
        int w = 1200;
        int h = 600;
        int ch = 3;
        byte[][][] img = new byte[w][h][ch];

        // видео
        int bitrade = 40;
        byte[][][][] video = new byte[bitrade][w][h][ch];


        int[][] q = {
                {1,2},     // 0 => q[0]
                {4,5,6},   // 1 => q[1]
                {7,8,9,0}  // 2 => q[2]
        };

//        int[][] q = new int[3][];
//        q[0] = new int[]{1};
//        q[1] = new int[]{4,5};
//        q[2] = new int[]{7,8,9};

        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q[i].length; j++) {
                System.out.print(q[i][j] + " ");
            }
            System.out.println();
        }
    }
}
