package qizhong.Ex8_1;

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        System.out.print("Enter 6 point:");
        double[][] points = new double[6][2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            points[i][0] = sc.nextDouble();
            points[i][1] = sc.nextDouble();
        }
        double[] rightmostLowestPoint = getRightmostLowestPoint(points);
        System.out.println("The rightmost lowest point is (" + rightmostLowestPoint[0] + "," + rightmostLowestPoint[1] + ")");
    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        double[] rightmostLowestPoint = {0.0, 0.0};
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] >= rightmostLowestPoint[0] && points[i][1] <= rightmostLowestPoint[1]) {
                rightmostLowestPoint = points[i];
            }
        }
        return rightmostLowestPoint;
    }
}