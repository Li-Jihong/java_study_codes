package _3_;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-03-05
 * \* Time: 23:41
 * \
 */
public class _3_Vehicle {
    double speed; //声明double型变量speed,刻画速度
    int power; //声明int型变量power,刻画功率

//    void speedUp(int s) {
//        speed = speed + s; //将 参数s的值与成员变量speed的和赋值给成员变量speed
//    }

    void speedUp(int s) {
        if (speed + s <= 200) { //加速不得超过200
            speed = speed + s; //将参数s的值与成员变量speed的和赋值给成员变量speed
        }
    }

    void speedDown(int d) {
        if (speed - d >= 0) { //减速不得小于0
            speed = speed - d; //将成 员变量speed与参数d的差赋值给成员变量speed
        }
    }

    void brake() {
        speed = 0;//将速度减为0
    }

    int getPower() {
        return power; //返回成员 变量power的值
    }

    void setPower(int power) {
        this.power = power;//将参数p的值赋值给成员变量power
    }

    double getSpeed() {
        return speed;
    }
}
