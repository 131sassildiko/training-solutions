package week03;

import java.util.Scanner;

public class Operation {

    private int left;
    private int right;

    public Operation(String string) {
        left = Integer.parseInt(string.substring(0, string.indexOf("+")));
        right = Integer.parseInt(string.substring(string.indexOf("+") + 1));
    }
        public int getResult () {
            return left + right;
        }
    }

