package lesson25.task1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilsTest {
    private int[] result;
    @Before
    public void init() {   // will call before every test
        result = ArrayUtils.getArray(7);
    }
    @Test
    public void checkNotNull() {
        // int[] result = ArrayUtils.getArray(7); // made init() method -> don't need this line anymore
        // Assert.assertNotNull(result); // made static import -> don't need to write class Assert anymore
        assertNotNull(result);
    }
    @Test
    public void checkArraySize() {
        int expected = 7;
        int actual = result.length;
        assertEquals(expected, actual);
    }
    @Test
    public void checkData() {
        int expected = 5;
        int actual = result[4];
        assertEquals(expected, actual);
    }


}