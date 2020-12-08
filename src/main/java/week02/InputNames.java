package week02;

import java.util.Scanner;

public class InputNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String [] arrayOfNames = new String[5];
        for (int i=0; i< arrayOfNames.length;i++){
            System.out.println("Adj meg egy nevet!");
            arrayOfNames[i] = scanner.nextLine();
        }
                for (int i=0; i< arrayOfNames.length; i++){
            System.out.println((i+1)+".-ik"+" név: "+arrayOfNames[i]);
        }

    }
}
