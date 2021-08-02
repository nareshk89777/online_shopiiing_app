import java.util.*;

public class Product {
    private int productId;
    private String productName;
    private boolean isAvailable;

    int idx = 0;

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return productName;
    }

    public boolean getisAvailable() {
        return isAvailable;
    }

    public Product(int id, String name) {

        this.productId = id;
        this.productName = name;
    }


}
