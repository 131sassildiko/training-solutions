package week06d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListSelectorTest {

    ListSelector ls = new ListSelector();

    @Test
    void getEvenElementsTest() {
        assertEquals ("[almabarack]", ls.getEvenElements(Arrays.asList("alma", "körte", "barack")));
    }
}