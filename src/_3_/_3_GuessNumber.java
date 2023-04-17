package _3_; /**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-03-05
 * \* Time: 23:16
 * \
 */

import java.util.Random;
import java.util.Scanner;

public class _3_GuessNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        System.out.println("给你一个1~100之间的整数，请猜测这个数");
        int realNumber = random.nextInt(100) + 1;  //random.nextInt(100)是[0,1000)中的随机整数
        int yourGuess = 0;
        System.out.print("输入您的猜测:");
        yourGuess = reader.nextInt();
        //当yourGuess  的数字与随机数不同时，进入while循环，直到两数字大小一样
        while (yourGuess != realNumber) { // 循环条件
            if (yourGuess > realNumber) { //猜大了的条件代码
                System.out.print("猜大了，再输入您的猜测:");
                yourGuess = reader.nextInt();
            } else if (yourGuess < realNumber) { //猜小了的条件代码
                System.out.print("猜小了，再输入您的猜测:");
                yourGuess = reader.nextInt();
            }
        }
        //输出正确数字
        System.out.println("猜对了！");
    }
}

