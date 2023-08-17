package task4;

import java.util.Arrays;

public class Main {

        /**
         * method returns the second-biggest element of array
         *
         * @param args Array
         * @return     result element
         */

        public static void main(String[] args) {

            int[] Array = {-1, 4, 0, 2, 7, -3};
            System.out.println(secondSmallestElem(Array));

        }

        public static int secondSmallestElem(int[] arr) {
            int[] resultArr = Arrays.stream(arr).sorted().toArray(); // [-3, -1, 0, 2, 4, 7]
            int result = resultArr[1];
            return result;
        }

    }

