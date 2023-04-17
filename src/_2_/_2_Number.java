package _2_;

import java.util.Scanner;

public class _2_Number {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number, d5, d4, d3, d2, d1;
        System.out.println("输入一个1至99999之间的数:");
        number = scanner.nextInt();
        if (1 < number && number < 99999) //判断number在1至99999之间的条件
        {
            d5 = number / 10000;//计算number的最高位（万位）d5
            d4 = number / 1000 % 10;   //计算number的千位d4
            d3 = number / 100 % 10;   //计算number的百位d3
            d2 = number % 100 / 10;
            d1 = number % 10;
            if (d5 > 0)  //判断number是5位数的条件6
            {
                System.out.println(number + "是5位数");
                if (d5 == d1 && d2 == d4) //判断number是回文数的条件
                {
                    System.out.println(number + "是回文数");
                } else {
                    System.out.println(number + "不是回文数");
                }
            } else if (d4 > 0)  //判断number是4位数的条件
            {
                System.out.println(number + "是4位数");
                if (d1 == d4 && d2 == d3) //判断number是回文数的条件码
                {
                    System.out.println(number + "是回文数");
                } else {
                    System.out.println(number + "不是回文数");
                }
            } else if (d3 > 0)  //判断number是3位数的条件
            {
                System.out.println(number + "是3位数");
                if (d1 == d3) //判断number是回文数的条件
                {
                    System.out.println(number + "是回文数");
                } else {
                    System.out.println(number + "不是回文数");
                }
            } else if (d2 != 0) {
                System.out.println(number + "是2位数");
                if (d1 == d2) {
                    System.out.println(number + "是回文数");
                } else {
                    System.out.println(number + "不是回文数");
                }
            } else if (d1 != 0) {
                System.out.println(number + "是1位数");
                System.out.println(number + "是回文数");
            }
        } else {
            System.out.printf("\n%d不在1至99999之间", number);
        }
    }
}

