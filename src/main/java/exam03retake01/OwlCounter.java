//package exam03retake01;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.List;
//
//public class OwlCounter {
//
//private int numberOfOwls;
//
//
//    public int getNumberOfOwls() {
//        return numberOfOwls;
//    }
//
//    public static void main(String[] args) {
//        OwlCounter owlCounter = new OwlCounter();
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(OwlCounter.class.getResourceAsStream("owl.txt")))) {
//            new OwlCounter().readFromFile(reader);
//        } catch (IOException ioe) {
//            throw new IllegalStateException("Can not read file", ioe);
//        }
//    }
//}
