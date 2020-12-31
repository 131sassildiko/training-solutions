package week06d04;

public class Item {

    private String name;
    private int price;
    private int month;


    public Item(String name, int price, int month) {
        if (name==null || name.isBlank()) {
            throw new IllegalArgumentException("Name can't be blank");
        }
        if (price <=0){
            throw new IllegalArgumentException("Price can't be nagative");
        }
        if (month<1 || month>12){
            throw new IllegalArgumentException("Invalid month");
        }
        this.name = name;
        this.price = price;
        this.month = month;

    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", month=" + month +
                '}';
    }
}
