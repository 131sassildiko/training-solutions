package statement;

public class Time {

        private int hour;
        private int minute;
        private int second;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getInMinutes () {
        int hoursinminutes = 60;
        return hour * hoursinminutes + minute;
    }

    public int getInSeconds () {
        int minuteinseconds = 60;
        return (getInMinutes() * 60) + second;
    }

    public boolean ealierThan (Time other) {
        int thisTimeInSeconds = this.getInSeconds();
        int otherTimeInSeconds = other.getInSeconds();
        return thisTimeInSeconds < otherTimeInSeconds;
    }

     public String toString () {
         return hour + ":" + minute + ":" + second;
     }

}
