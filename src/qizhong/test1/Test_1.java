package qizhong.test1;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        double x_max = 0.0;
        double y_max = 0.0;
        Scanner scanner = new Scanner(System.in);
        double a = 0.0, b = 0.0;
        double[] x = new double[6];
        double[] y = new double[6];
        for(int i = 0; i < 6; i++){
            x[i] = scanner.nextDouble();
            y[i] = scanner.nextDouble();
        }
        for(int i = 1; i < 6; i++){
            if(x[i] >= x[i - 1]){
                if(y[i] <= y[i - 1]){
                    x_max = x[i];
                    y_max = y[i];
                }
            }
        }
        System.out.println("最左边的点是：("+ x_max + "," + y_max +")");
    }
}