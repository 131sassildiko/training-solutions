package stringbuilder;

import org.junit.jupiter.api.Test;

public class StringBuilderTest {

    @Test
    public void testAppend () {
        StringBuilder sb = new StringBuilder("John");
        sb.append(" Doe");
        String s = sb.toString();

        sb.reverse();
        System.out.println(sb);

    }

}
