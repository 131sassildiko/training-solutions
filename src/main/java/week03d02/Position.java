package week03d02;

import java.util.ArrayList;
import java.util.List;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name:'" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    public static void main(String[] args) {

        List<Position> positions = new ArrayList<>();

        positions.add(new Position("Manager", 16000000));
        positions.add(new Position("Boss", 19000000));
        positions.add(new Position("Worker", 1600));


        for (Position i:positions) {
            if (i.getBonus()>150000){
                System.out.println(i);
            }

        }




    }
}
