package week02;

public class Product {

    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product newProduct) {
        return name.equals(newProduct.getName());
    }

    public boolean areTheyBothEqual(Product newProduct) {
        return name.equals(newProduct.getName()) && Math.abs(code.length() - newProduct.code.length()) <= 1;
    }

    public boolean areTheyEqualsProfi(Product newProduct) {
        boolean areNameequal = name.equals(newProduct.getName());
        boolean areCodeEqual = code.length() - newProduct.getCode().length() <= 1 && code.length() - newProduct.getCode().length() >= -1;
        return areNameequal && areCodeEqual;
    }

    public static void main(String[] args) {
        Product product1 = new Product("csizma", "42");
        Product product2 = new Product("szandál", "extra");
        Product product3 = new Product("csizma", "42");

        System.out.println(product1.areTheyEqual(product2));
        System.out.println(product2.areTheyEqual(product3));
        System.out.println(product1.areTheyBothEqual(product3));
        System.out.println(product1.areTheyEqualsProfi(product3));
    }

}
