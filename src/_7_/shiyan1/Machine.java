package _7_.shiyan1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-17
 * \* Time: 16:30
 * \
 */
public class Machine {
    public void checkBag(Goods goods) throws DangerException {
        if (goods.isDanger()) {
            DangerException danger = new DangerException();
            throw danger;//抛出 danger
        } else {
            System.out.print(goods.getName() + "不是危险品！");
        }
    }
}
