package qizhong.Ex8_2;

import java.util.Scanner;

public class Ex8_2 {
    public static void main(String[] args) {
        System.out.print("Enter the three sides of the triangle:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.printf("The perimeter of this triangle is: %8.2f", a + b + c);
        } else {
            System.out.println("The three sides can't construct a triangle.");
        }
    }
}
