package exam03retake02;

import java.awt.dnd.DropTarget;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BalatonStorm {

    public static void main(String[] args) {


            try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                    BalatonStorm.class.getResourceAsStream("/storm.json")))) {
                String line;
                while((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
            catch (IOException ioe) {
                throw new IllegalStateException("Can not read file", ioe);
            }




    }
}

