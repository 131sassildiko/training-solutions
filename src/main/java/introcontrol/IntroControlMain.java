package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();
        System.out.println(introControl.substractTenIfGreaterThanTen(0));
        System.out.println(introControl.substractTenIfGreaterThanTen(10));
        System.out.println(introControl.substractTenIfGreaterThanTen(15));

        System.out.println(introControl.greetingToJoe("James"));
        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("Jim"));

        System.out.println(introControl.CalculateBonus(10000));
        System.out.println(introControl.CalculateBonus(50000000));
        System.out.println(introControl.CalculateBonus(1200000));
    }
}
