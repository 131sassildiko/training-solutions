package week05d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListCounterTest {

    @Test
    public void counterTest (){
        ListCounter listCounter = new ListCounter();
        List<String> testList = Arrays.asList ("Alma", "Körte", "ananász", "kenyér");
        assertEquals (2, listCounter.counter(testList));
    }

}