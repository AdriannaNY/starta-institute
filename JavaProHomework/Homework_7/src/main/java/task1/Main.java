package task1;

import java.util.*;

public class Main {

    /**
     * method returns common numbers from Array1 and Array2
     *
     * @param args   Array1
     * @param args   Array2
     * @return       result Set
     */

    public static void main(String[] args) {

        int[] Array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] Array2 = {1, 0, 6, 15, 6, 4, 7, 0};
        System.out.println(findCommon(Array1,Array2));

    }

    public static Set<Integer> findCommon(int[] arr1, int[] arr2) {

        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    result.add(arr1[i]);
                }
            }
        }
        return result;
    }

    }

