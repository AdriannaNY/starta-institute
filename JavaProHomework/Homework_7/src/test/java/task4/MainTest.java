package task4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    int[] Array = {0, -5, -101, -35, -56, -100, 100, -3, -99};
    int expected = -100;
    int result;

    @Before
    public void init() {
        result = Main.secondSmallestElem(Array);
    }

    @Test
    public void checkNotNullTest() {
        assertNotNull(result);
    }

    @Test
    public void secondSmallestElemTest() {
        int actual = result;
        assertEquals(expected, actual);
    }

}