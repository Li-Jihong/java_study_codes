package _3_;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-03-06
 * \* Time: 0:00
 * \
 */

public class _3_User {
    public static void main(String args[]) {
        _3_Vehicle car1, car2;
        car1 = new _3_Vehicle(); //使用 new 运算符和默认的构造方法创建对象 car1
        car2 = new _3_Vehicle(); //使用 new 运算符和默认的构造方法创建对象 car2
        car1.setPower(128);
        car2.setPower(76);
        System.out.println("car1 的功率是：" + car1.getPower());
        System.out.println("car2 的功率是：" + car2.getPower());
        car1.speedUp(80); //car1 调用speedUp 方法将自己的 speed 的值增加 80
        car2.speedUp(100); //car2 调用 speedUp 方法将自己的 speed 的值增加 100

        System.out.println("car1 目前的速度：" + car1.getSpeed());
        System.out.println("car2 目前的速度：" + car2.getSpeed());
        car1.speedUp(500); //car1 调用 speedUp 方法将自己的 speed 的值增加 500 观察效果
        System.out.println("car1 加了500之后， 目前的速度：" + car1.getSpeed());
        car1.speedDown(10);
        car2.speedDown(20);
        System.out.println("car1 目前的速度：" + car1.getSpeed());
        System.out.println("car2 目前的速度：" + car2.getSpeed());

        car2.speedDown(1000);
        System.out.println("car2 减了1000之后， 目前的速度：" + car2.getSpeed());
        car1.brake(); //将car1的速度减为0
        car2.brake(); //将car2的速度减为0
        System.out.println("car1刹车后速度应该为0 目前的速度：" + car1.getSpeed());
        System.out.println("car2刹车后速度应该为0 目前的速度：" + car2.getSpeed());
    }
}