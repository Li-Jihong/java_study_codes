package qizhong.test3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-24
 * \* Time: 17:07
 * \
 */
public class ZPoint_test {
    public static void main(String[] args) {
        ZPoint a = new ZPoint(11, 9);
        ZPoint b = new ZPoint(100, 21.5);
        System.out.println("创建的两个对象之间的距离是：" + ZPoint.distance(a,b));
        System.out.println("创建的对象a与(71,19)之间的距离是：" + a.distance(71,49));
    }
}
