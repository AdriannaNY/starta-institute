package task2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    int[] Array = {0,3,-2,4,4,-4,-4,0,0,0,3,2};
    int[] result;
    int[] expected = {0, 3, -2, 4, -4, 2};

    @Before
    public void init() {
        result = Main.distinct(Array);
    }

    @Test
    public void checkNotNullTest() {
        assertNotNull(result);
    }

    @Test
    public void distinctTest() {
        int[] actual = result;
        assertArrayEquals(expected, actual);
    }

}