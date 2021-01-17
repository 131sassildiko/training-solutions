package week10d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testCalculator(){
        assertEquals(17, new Calculator().findMinSum(new int []{1,2,4,16,10}));
    }


}