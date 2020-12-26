package week05d04;

import java.time.LocalDate;
import java.util.Date;

public class Product {
    String Name;
    int year;
    int month;
    int day;
    LocalDate expiryDate;

    public Product(String name, int year, int month, int day) {
        this.Name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        LocalDate expiryDate=LocalDate.of(getYear(), getMonth(), getDay());
    }

    public String getName() {
        return Name;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public LocalDate getExpiryDate (){
        return expiryDate;
    }
}
