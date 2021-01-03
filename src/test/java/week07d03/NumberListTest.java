package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberListTest {

    @Test
    void isIncreasingTest() {
        NumberList nl = new NumberList();

        assertTrue(nl.isIncreasing(Arrays.asList(1, 2, 4, 5)));
        assertTrue(nl.isIncreasing(Arrays.asList(-1, 2, 4, 5)));
        assertTrue(nl.isIncreasing(Arrays.asList(1,1,1,1,1)));
        assertFalse(nl.isIncreasing(Arrays.asList(1, 100, 4, 5)));
    }
}