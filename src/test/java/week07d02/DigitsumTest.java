package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsumTest {

    @Test
    void sumOfDigitsTest() {
        Digitsum ds = new Digitsum();
        assertEquals(6, ds.sumOfDigits(123));
    }
}