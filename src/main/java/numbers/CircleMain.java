package numbers;

public class CircleMain {

    public static void main(String[] args) {

        Circle circle1 = new Circle(20);
        Circle circle2 = new Circle(24);

        System.out.println(circle1.perimeter());
        System.out.println(circle2.area());
    }
}
