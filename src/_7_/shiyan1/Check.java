package _7_.shiyan1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-17
 * \* Time: 16:31
 * \
 */
public class Check {
    public static void main(String[] args) {
        Machine machine = new Machine();
        String name[] = {"苹果", "炸药", "西服", "硫酸", "手表", "硫磺"};
        Goods[] goods = new Goods[name.length];
        for (int i = 0; i < name.length; i++) {
            goods[i] = new Goods();
            if (i % 2 == 0) {
                goods[i].setIsDanger(false);
                goods[i].setName(name[i]);
            } else {
                goods[i].setIsDanger(true);
                goods[i].setName(name[i]);
            }
        }
        for (int i = 0; i < goods.length; i++) {
            try {
                machine.checkBag(goods[i]);
                System.out.println(goods[i].getName() + "检查通过");
            } catch (DangerException e) {
                e   .toShow();//e 调用 toShow()方法
                System.out.println(goods[i].getName() + "被禁止!");
            }
        }
    }
}
