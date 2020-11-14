package classstructureintegrate;

public class Product {
    private String name;
    private int price;

    public Product (String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void increasePrice (int indexation){
        price = price + indexation;
    }

    public void decreasePice (int discount){
        price = price - discount;
    }
}
