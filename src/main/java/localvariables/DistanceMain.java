package localvariables;

public class DistanceMain {


    public static void main(String[] args) {

        Distance distance = new Distance(100.45, true);
        System.out.println(distance.getDist()+" "+distance.isPunct());

        int km = (int) distance.getDist();

        System.out.println(km);


    }
}
