package qizhong.test3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: li-jihong
 * \* Date: 2023-04-24
 * \* Time: 16:20
 * \
 */
public class ZPoint {
    private double x;
    private double y;

    public ZPoint(double x, double y) {
        this.x = x;
        this.y = y;
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

    public static double distance(ZPoint p, ZPoint q){
        return Math.sqrt(Math.pow(p.x - q.x, 2) + Math.pow(p.y - q.y, 2));
    }
    public double distance(double x, double y){
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
<<<<<<< HEAD
=======


>>>>>>> origin/master
}
