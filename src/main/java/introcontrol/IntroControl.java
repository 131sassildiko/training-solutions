package introcontrol;

import java.util.Random;

public class IntroControl {

    public int substractTenIfGreaterThanTen (int number) {
        if (number > 10) {
            return number-10;
        } else {
            return number;
        }
    }

    public String greetingToJoe (String name) {
        if (name == "Joe") {
            return "Hello Joe";
        }else {
            return "";
        }
    }

    public int CalculateBonus (int sale){
        if (sale> 1000000) {
            return sale/10;
        }else {
            return 0;
        }
    }
}
