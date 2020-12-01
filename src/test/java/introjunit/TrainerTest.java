package introjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {

    @Test
    void testCreateEmployee (){
        Trainer trainer = new Trainer("John");
        String name = trainer.getName();
        assertEquals("John", name);
    }



    @Test
    void testgetNameUpperCase() {
        Trainer trainer = new Trainer("John");
        assertEquals("JOHN", trainer.getNameUpperCase());
    }
}
