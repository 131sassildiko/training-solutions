package week04;

import org.junit.jupiter.api.Test;
import week04d01.NameChanger;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {


    @Test
    void changeFirstName() {
        NameChanger nameChanger = new NameChanger("John Doe");
        nameChanger.changeFirstName("Jack");
        assertEquals ("Jack Doe", nameChanger.getFullName());

    }
    }