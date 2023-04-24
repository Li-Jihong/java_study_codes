package qizhong.test4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-24
 * \* Time: 17:18
 * \
 */
public class Circle extends GeometricObject {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double findAera() {
        return Math.PI * r * r;
    }

    @Override
    public double findPerimeter() {
        return 2 * Math.PI * r;
    }
}
