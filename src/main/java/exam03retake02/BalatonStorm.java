package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BalatonStorm {

    int id;
    String allomas;
    String lat;
    String lng;
    String description;
    int level;
    String groupId;
    String stationType;

    public Adatok (String line){
        id=Integer.parseInt(line.split (":") [1]);
        allomas=line.split(":")
    }


    private List <String> StormList = new ArrayList<>();

    public List<String> getStationsInStorm(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) !=null){
            System.out.println(line);
        }

    }
}
