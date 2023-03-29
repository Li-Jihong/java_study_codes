package _4_;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-03-27
 * \* Time: 14:01
 * \
 */
public class _4_RegularPolygon {
    private int n;      //用来定义多边形的边数
    private double side;      //用来存储边的长度
    private double x;      //用来定义多边形中点的x坐标，默认值为0
    private double y;      //用来定义多边形中点的y坐标，默认值为0

    public _4_RegularPolygon() {
        //创建具有默认值的正多边形的无参构造方法。
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public _4_RegularPolygon(int n, double side) {
        //一个能创建带指定边数和边长度、中心在(0,0)的正多边形的构造方法。
        this.n = n;
        this.side = side;
        x = 0;
        y = 0;
    }

    public _4_RegularPolygon(int n, double side, double x, double y) {
        //一个能创建带指定边数和边长度、中心在(x,y)的正多边形的构造方法。
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    } //返回正多边形的周长

    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    } //返回正多边形的面积

    public static void main(String[] args) {
        _4_RegularPolygon polygon1 = new _4_RegularPolygon();
        _4_RegularPolygon polygon2 = new _4_RegularPolygon(6, 4);
        _4_RegularPolygon polygon3 = new _4_RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1 perimeter: " + polygon1.getPerimeter());
        System.out.println("Polygon 1 area: " + polygon1.getArea());

        System.out.println("Polygon 2 perimeter: " + polygon2.getPerimeter());
        System.out.println("Polygon 2 area: " + polygon2.getArea());

        System.out.println("Polygon 3 perimeter: " + polygon3.getPerimeter());
        System.out.println("Polygon 3 area: " + polygon3.getArea());
    }
}
