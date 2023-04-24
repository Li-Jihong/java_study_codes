package qizhong.test2;

import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
        double x = 0.0;
        double y = 0.0;
        double z = 0.0;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();
        if(x + y > z && x + z > y && y + z > x){
            System.out.printf("%8.2f", x + y + z);
        }
        else{
            System.out.println("无法构成三角形！！！");
        }
    }
}