package xiti;/*
 * @Author: your name
 * @Date: 2023-03-04 16:49:53
 * @LastEditTime: 2023-03-04 16:54:43
 * @LastEditors: BH04250909
 * @Description: In User Settings Edit
 * @FilePath: \java_study_codes\src\xiti.SuShu.java
 */

public class SuShu {
    public static void main(String[] args) {
        int i = 2;
        int k;
        int j = 2;
        for (i = 2; i <= 100; i++) {
            k = (int) Math.sqrt(i);
            for (j = 2; j <= k; j++)
                if (i % j == 0)
                    break;
            if (j > k) {
                System.out.print(i + " ");
            }
            // 答案是: 2 3 5 7 11 13 17 19 23 29
            // 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
        }
    }
}
