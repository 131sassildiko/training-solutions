package controlselection;

public class Greetings {

    public String sayGreeting (int hour, int minute){
        String greeting;
        if (hour <5){
            greeting="Good night";
        } else if (hour <9){
            greeting = "Good morning";
        } else if (hour <=17 || hour==18 && minute <=30){
            greeting = "Good afternoon";
        } else if (hour <20){
            greeting = "Good evening";
        } else {
            greeting = "Good night";
        }
        return greeting;
    }
}
