package qizhong.test4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-24
 * \* Time: 17:19
 * \
 */
public class Rectangle extends GeometricObject{
    private double w;
    private double h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double findAera() {
        return h * w;
    }

    @Override
    public double findPerimeter() {
        return 2 * (h + w);
    }
}
