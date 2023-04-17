package xiti;/*
 * @Author: your name
 * @Date: 2023-03-04 16:59:02
 * @LastEditTime: 2023-03-04 17:02:31
 * @LastEditors: BH04250909
 * @Description: In User Settings Edit
 * @FilePath: \java_study_codes\src\xiti.ForLoop.java
 */

public class ForLoop {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 20; i++) {
            double factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            sum += 1.0 / factorial;
        }

        System.out.println("The sum of the first 20 terms using for loop is: " + sum);
        //答案是： The sum of the first 20 terms using for loop is: 1.7182818284590455
    }
}
