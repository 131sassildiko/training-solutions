package classstructureintegrate;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("what's your name?");
        String owner = scanner.nextLine();

        System.out.println("what is your account nr?");
        String accountNumber = scanner.nextLine();

        System.out.println("what is your balance");
        int balance = scanner.nextInt();

        BankAccount account1 = new BankAccount(accountNumber, owner, balance);

        System.out.println("what's your name?");
        String owner2 = scanner.nextLine();

        System.out.println("what is your account nr?");
        String accountNumber2 = scanner.nextLine();

        System.out.println("what is your balance");
        int balance2 = scanner.nextInt();

        BankAccount account2 = new BankAccount(accountNumber2, owner2, balance2);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());

        System.out.println("what is deposit amout");
        int depositAmount = scanner.nextInt();
        account1.deposit(depositAmount);

        System.out.println(account1.getInfo());

        System.out.println("what amount would you like to withdraw");
        int withdrawAmount = scanner.nextInt();
        account2.withdraw(withdrawAmount);

        System.out.println(account2.getInfo());


    }
}
