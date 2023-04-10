package _6_.shiyan4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-10
 * \* Time: 17:56
 * \
 */
public class NewYear {
    public static void main(String[] args) {
        MobileShop shop = new MobileShop();
        shop.setMobileAmount(30);
        System.out.println("手机店目前有" + shop.getMobileAmount() + "部手机");
        shop.purchaseMoney1.buyMobile();
        shop.purchaseMoney2.buyMobile();
        System.out.println("手机店目前有" + shop.getMobileAmount() + "部手机");
    }
}
