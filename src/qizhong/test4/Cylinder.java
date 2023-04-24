package qizhong.test4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-24
 * \* Time: 17:18
 * \
 */
public class Cylinder extends GeometricObject { //圆柱？
    private double h;
    private double r;

    public Cylinder(double h, double r) {
        this.h = h;
        this.r = r;
    }

    @Override
    public double findAera() {
        return Math.PI * r * r * 2 + Math.PI * r * 2 * h;
    }

    @Override
    public double findPerimeter() {
        return Math.PI * r * 2 * 2;
    }
}
