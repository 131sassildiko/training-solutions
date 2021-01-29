package week03;

import org.junit.jupiter.api.Test;
import week03d05.Operation;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {
@Test
    void testCreate (){
    Operation operation = new Operation ("123+45");
    assertEquals(168, operation.getResult());
}
}