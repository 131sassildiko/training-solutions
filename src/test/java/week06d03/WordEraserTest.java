package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordEraserTest {

    @Test
    void eraseWordTest() {
        WordEraser we = new WordEraser();
        String original = "alma körte barack alma szilva körte birsalma";
        String result = "körte barack szilva körte birsalma";
        assertEquals (result, we.eraseWord(original, "alma"));
    }
}