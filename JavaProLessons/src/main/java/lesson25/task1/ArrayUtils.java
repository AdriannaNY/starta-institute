package lesson25.task1;

public class ArrayUtils {

    /**
     * method returns array with size - size
     * filled with numbers from 1 to array's size
     *
     * @param size   array's size
     * @return       result array
     */
    public static int[] getArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = i + 1;
        }
        return result;
    }
}
