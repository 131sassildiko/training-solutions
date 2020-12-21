import org.junit.jupiter.api.Test;
import week05d02.ChangeLetter;

import static org.junit.jupiter.api.Assertions.*;

class ChangeLetterTest {

        @Test
        void testChangeVowels (){
            ChangeLetter cl = new ChangeLetter();
            assertEquals("*k*rm*", cl.changeVowels("akarmi"));
        }
    }