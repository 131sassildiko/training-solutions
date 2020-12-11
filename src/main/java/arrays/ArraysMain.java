package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

        public String numberOfDaysAsString () {
            int[] numberofdays = {31, 28, 31, 30, 31, 31, 30, 31, 30, 31};
            return Arrays.toString(numberofdays);
        }

        public List<String> daysOfWeek (){
            String[] weekdays = {"hétfő", "kedd", "szerda"};
            return Arrays.asList (weekdays);
        }

    public static void main(String[] args) {

    ArraysMain arraysMain = new ArraysMain();
        System.out.println(arraysMain.numberOfDaysAsString());
        System.out.println(arraysMain.daysOfWeek());

    }

}