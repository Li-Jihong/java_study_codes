package qizhong.test4_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-24
 * \* Time: 17:18
 * \
 */
public class Cylinder extends Circle { //圆柱？
    private double h;

    public Cylinder(double h) {
        super();
        this.h = h;
    }

    @Override
    public double findAera() {
        return Math.PI * this.getR() * this.getR() * 2 + Math.PI * this.getR() * 2 * h;
    }

    @Override
    public double findPerimeter() {
        return Math.PI * this.getR() * 2 * 2;
    }
}
