/*
 * @Author: your name
 * @Date: 2023-03-04 17:29:45
 * @LastEditTime: 2023-03-04 17:30:44
 * @LastEditors: BH04250909
 * @Description: In User Settings Edit
 * @FilePath: \java_study_codes\src\PerfectNum.java
 */
public class PerfectNumbers {
    public static void main(String[] args) {
        int max = 1000;

        for (int i = 1; i <= max; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                System.out.println(i + " 是完数");
            }
            //  答案 :
            //  6 是完数
            //  28 是完数 
            //  496 是完数
        }
    }
}
