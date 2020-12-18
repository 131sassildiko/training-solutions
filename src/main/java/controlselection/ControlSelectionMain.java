package controlselection;

public class ControlSelectionMain {

    public boolean isEven (int x) {
        boolean even;
        if ((x%2)==0) {
            even = true;
        } else {
            even = false;
        }
        return even;
        }

        public String getTypeOfDay (String day){
        String typeOfDay;
        switch (day){
            case "Monday":
                typeOfDay = "Start of week";
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                typeOfDay = "Midweek";
                break;
            case "Sunday":
                typeOfDay = "Weekend";
                break;
            default:
                throw new IllegalArgumentException("Unknown Day");
        }
        return typeOfDay;
    }

    public static void main(String[] args) {
        System.out.println(new ControlSelectionMain().isEven(2));
        System.out.println(new ControlSelectionMain().getTypeOfDay("Monday"));
    }
    }
