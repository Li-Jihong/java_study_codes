package _6_.shiyan4_extra;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-11
 * \* Time: 4:13
 * \
 */
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private String name;
    private ShoppingCart shoppingCart;
    private ArrayList<ShoppingHistory> shoppingHistoryList;

    public Customer(String name) {
        this.name = name;
        this.shoppingCart = new ShoppingCart();
        this.shoppingHistoryList = new ArrayList<ShoppingHistory>();
    }

    public void addToCart(Product product) {
        shoppingCart.addProduct(product);
    }

    public void checkout() {
        ShoppingHistory shoppingHistory = new ShoppingHistory(new Date(), shoppingCart.getProductList());
        shoppingHistoryList.add(shoppingHistory);
        shoppingCart.clear();
    }

    public ArrayList<ShoppingHistory> getShoppingHistoryList() {
        return shoppingHistoryList;
    }

    public class ShoppingHistory {
        private Date date;
        private ArrayList<Product> productList;

        public ShoppingHistory(Date date, ArrayList<Product> productList) {
            this.date = date;
            this.productList = productList;
        }

        public Date getDate() {
            return date;
        }

        public ArrayList<Product> getProductList() {
            return productList;
        }
    }
}
 