package qizhong.test4_2;

import org.jetbrains.annotations.NotNull;

/**
 * \* Created with IntelliJ IDEA.
<<<<<<< HEAD
 * \* User: li-jihong
=======
 * \* User: lijihong
>>>>>>> origin/master
 * \* Date: 2023-04-24
 * \* Time: 17:28
 * \
 */
public class GeoAeraSum {
    public static double sumAera(GeometricObject @NotNull [] a) {
        double sumAera = 0.0;
        for(int i = 0; i < a.length; i++){
            sumAera += a[i].findAera();
        }
        return sumAera;
    }
    public static void main(String[] args) {
        GeometricObject[] b = new GeometricObject[3];
        b[0] = new Circle(5);
        b[1] = new Cylinder(5);
        b[2] = new Rectangle(6,8);
        System.out.println("总面积是：" + GeoAeraSum.sumAera(b));
    }
}
