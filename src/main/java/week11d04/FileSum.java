package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSum {

    public int readFile (String name){
        try {
            String fileContent = Files.readString(Path.of(name));
            int number = Integer.parseInt(fileContent);
            return number;
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file",e);
        }
    }

    public int sumNumbers (){
        int sum = 0;
        for (int i=0; i<100; i++){
            String filename = String.format ("number%02d.txt", i);
            System.out.println(filename);


            if(Files.isRegularFile(Path.of(filename))){
                int number = readFile(filename);
                sum += number;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
       // System.out.println(new FileSum().readFile("number20.txt"));
        System.out.println(new FileSum().sumNumbers());
    }
}
