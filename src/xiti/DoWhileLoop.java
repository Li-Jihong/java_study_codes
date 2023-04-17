package xiti;/*
 * @Author: your name
 * @Date: 2023-03-04 16:58:30
 * @LastEditTime: 2023-03-04 17:01:54
 * @LastEditors: BH04250909
 * @Description: In User Settings Edit
 * @FilePath: \java_study_codes\src\xiti.DoWhileLoop.java
 */

public class DoWhileLoop {
    public static void main(String[] args) {
        int n = 1;
        double sum = 0, factorial = 1;

        do {
            factorial *= n;
            sum += 1.0 / factorial;
            n++;
        } while (n <= 20);

        System.out.println("The sum of the first 20 terms using do-while loop is: " + sum);
        //答案是 : The sum of the first 20 terms using do-while loop is: 1.7182818284590455
    }
}
