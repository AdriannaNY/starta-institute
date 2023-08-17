package task1;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class MainTest {
    int[] Array1 = {1, 2, 5, 5, 8, 9, 7, 10};
    int[] Array2 = {1, 5, 6, 15, 6, 4, 7, 7};
    Set<Integer> expected = Set.of(1, 5, 7);
    Set<Integer> result;

    @Before
    public void init() {
        result = Main.findCommon(Array1, Array2);
    }

        @Test
        public void checkNotNullTest() {
            assertNotNull(result);
        }

        @Test
        public void findCommonTest() {
            Set<Integer> actual = result;
            assertEquals(expected, actual);
        }

    }
