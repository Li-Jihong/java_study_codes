package _3_; /**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-03-06
 * \* Time: 7:31
 * \
 */

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class _3_CalculatePi {
    public static void main(String[] args) {
        int n = 1000;
        double s; //  单个的等腰三角形的面积
        double toltalS = 0.0; // 总共的等腰三角形的面积和---最终是趋向于圆的面积
        double r = 1.0; // r取几都无所谓
        double a = getSquareSide(r);
        toltalS += a * a;

        for (int i = 2; i <= n; i++) {
            double h = getHeight(a, r);
            s = a * h / 2;
            toltalS += s * pow(2, i);
            a = getWidth(h, a);
        }
        double pi = toltalS / pow(r,2);
        System.out.println("Pi is " + pi);
    }
    public static double getSquareSide(double r) {
        return sqrt(2) * r;
    }

    public static double getHeight(double a, double r) {
        double h = r - sqrt(pow(r,2) - pow(a/2,2));
        return h;
    }

    public static double getWidth(double h, double a) {
        double y = sqrt(pow(h,2)+pow(a/2,2));
        return y;
    }
}








