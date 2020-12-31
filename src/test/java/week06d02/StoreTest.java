package week06d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    void getProductNyCategoryNameTest() {
        Store store = new Store (Arrays.asList(
                new Product("kifli", Category.BAKEDGOODS, 20),
                new Product("zsemle", Category.BAKEDGOODS, 25),
                new Product("tej", Category.DAIRY, 199 ),
                new Product("joghurt", Category.DAIRY, 150 ),
                new Product("kasza", Category.OTHER, 6800)
        ));

        assertEquals (2, store.getProductNyCategoryName(Category.BAKEDGOODS));
        assertEquals (1, store.getProductNyCategoryName(Category.OTHER));

    }
}