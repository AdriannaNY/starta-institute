package task3;

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
        System.out.println(secondBiggestElem(Array));

    }

    public static int secondBiggestElem(int[] arr) {
      int[] resultArr = Arrays.stream(arr).sorted().toArray(); // [-3, -1, 0, 2, 4, 7]
      int result = resultArr[resultArr.length - 2];
        return result;
    }

}
