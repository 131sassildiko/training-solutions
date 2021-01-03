package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void isPrimeTest() {
        assertTrue (MathAlgorithms.isPrime(5));
        assertTrue (MathAlgorithms.isPrime(7));
        assertTrue (MathAlgorithms.isPrime(11));
        assertFalse(MathAlgorithms.isPrime(2));
        assertFalse(MathAlgorithms.isPrime(4));

    }
}