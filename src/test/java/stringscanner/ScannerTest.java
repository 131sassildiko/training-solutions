package stringscanner;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerTest {
    @Test
    public void testScanner (){
        Scanner s = new Scanner("aaa bbb ccc");
        List<String> l = new ArrayList<>();
        while (s.hasNext()) {
            l.add(s.next());
        }
        Scanner t = new Scanner ("12 13 14");
        while (t.hasNext()) {
            int i = t.nextInt();
            System.out.println(i);
        }
    }
}
