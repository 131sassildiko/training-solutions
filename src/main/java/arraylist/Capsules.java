package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    List<String> colorOfCapsules = new ArrayList<>();

    public void addLast (String color){
        colorOfCapsules.add(color);
    }

    public void addFirst (String color){
        colorOfCapsules.add (0,color);
    }

    public void removeFirst () {
        colorOfCapsules.remove(0);

    }
    public void removeLast () {
        colorOfCapsules.remove(colorOfCapsules.size() - 1);
    }

    public List<String> getColorOfCapsules(){
       return colorOfCapsules;
    }


    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("white");
        capsules.addLast("yellow");
        capsules.addLast ("green");
        System.out.println(capsules.getColorOfCapsules());
        capsules.addFirst("black");
        System.out.println(capsules.getColorOfCapsules());
        capsules.removeFirst();
        System.out.println(capsules.getColorOfCapsules());
        capsules.removeLast();
        System.out.println(capsules.getColorOfCapsules());

    }

}