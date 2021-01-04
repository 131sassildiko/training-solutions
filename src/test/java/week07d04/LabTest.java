package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LabTest {

    @Test
    void testConstructor() {
        Lab lab = new Lab("metódus túlterhelés");
        assertEquals("metódus túlterhelés", lab.getTitle());
        assertEquals(null, lab.getCompletedAt());
        assertFalse(lab.isCompleted());
    }

    void testConstructorWithParameter() {
        Lab lab = new Lab("metódus túlterhelés", LocalDate.of(2020, 12, 10));
        assertEquals(LocalDate.of(2020, 12, 10), lab.getCompletedAt());
        assertTrue(lab.isCompleted());
    }

    @Test
    void testcomplete() {
        Lab lab = new Lab("metódus túlterhelés");
        lab.complete();

        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.now(), lab.getCompletedAt());
    }
}

