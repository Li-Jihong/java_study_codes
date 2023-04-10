package _6_.shiyan4_extra;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-11
 * \* Time: 4:15
 * \
 */
public class ShoppingCartTest {
    public static void main(String[] args) {
        // 创建顾客对象
        Customer customer = new Customer("Alice");

        // 添加一些产品到购物车
        customer.addToCart(new Product("Product 1", 10.0));
        customer.addToCart(new Product("Product 2", 20.0));
        customer.addToCart(new Product("Product 3", 30.0));

        // 结账，将购物历史记录添加到顾客对象中
        customer.checkout();

        // 打印顾客的购物历史记录
        ArrayList<Customer.ShoppingHistory> shoppingHistoryList = customer.getShoppingHistoryList();
        for (Customer.ShoppingHistory shoppingHistory : shoppingHistoryList) {
            System.out.println("Date: " + shoppingHistory.getDate() + ", Product list: " + shoppingHistory.getProductList());
        }
    }
}
