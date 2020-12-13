package numbers;

public class Circle {

  private int diameter;
  private double pi=3.14;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public double perimeter (){
        return pi*diameter;
    }

    public double area () {
        return pi*diameter*diameter/4;
    }
}
