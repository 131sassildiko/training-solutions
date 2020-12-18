package controlselection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {
    @Test
    public void sayGreetingTest(){
        Greetings greetings = new Greetings();

        assertEquals("Good night", greetings.sayGreeting(3, 30));
        assertEquals("Good night", greetings.sayGreeting(4, 59));
        assertEquals("Good night", greetings.sayGreeting(21, 1));
        assertEquals("Good morning", greetings.sayGreeting(5, 1));
        assertEquals("Good afternoon", greetings.sayGreeting(17, 50));

    }

}