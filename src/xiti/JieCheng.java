package xiti;/*
 * @Author: your name
 * @Date: 2023-03-04 16:38:19
 * @LastEditTime: 2023-03-04 16:47:50
 * @LastEditors: BH04250909
 * @Description: In User Settings Edit
 * @FilePath: \java_study_codes\src\jiecheng.java
 */

public class JieCheng {
    public static void main(String[] args) {
        int s = 0;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            int t = 1;
            for (int j = 1; j <= i; j++) {
                t *= j;
            }
            s += t;
        }
        System.out.println(s); // 结果是 : 4037913
    }
}