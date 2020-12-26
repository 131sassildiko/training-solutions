package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {


    public List<Product> productList = new ArrayList<>();

    public void addProduct (Product product) {
        if (isValid(product));
        productList.add(product);
    }

    public int getNumberOfExpired (){
        int count = 0;
        for (Product product: productList){
            if (product.getExpiryDate().isBefore(LocalDate.now())){
                count++;
            }
        }
        return count;
    }

    public boolean isValid (Product product){
        boolean validName = true;
        for (Product product1: productList){
            if (product1.getName().equals(product.getName())) {
                validName = false;
            }
        }
        return validName;
    }
}
