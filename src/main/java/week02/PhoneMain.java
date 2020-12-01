package week02;

import java.util.Scanner;

public class PhoneMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What type is your phone?");
        String type1= scanner.nextLine();
        System.out.println("What is the memory size?");
        int mem1 = scanner.nextInt();

        Phone phone = new Phone("type1", mem1);

        System.out.println(phone.getType() + phone.getMem());

        System.out.println("What type is your phone?");
        String type2= scanner.nextLine();

        System.out.println("What is the memory size?");
        int mem2 = scanner.nextInt();

        Phone anotherPhone = new Phone ("type2", mem2);


        System.out.println(anotherPhone.getType()+ anotherPhone.getMem());



    }
}
