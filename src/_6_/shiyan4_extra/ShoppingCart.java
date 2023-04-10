package _6_.shiyan4_extra;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-11
 * \* Time: 4:17
 * \
 */
import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> productList;

    public ShoppingCart() {
        this.productList = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void clear() {
        productList.clear();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }
}
