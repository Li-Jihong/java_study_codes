package xiti;

/*
 * @Author: your name
 * @Date: 2023-03-04 17:32:10
 * @LastEditTime: 2023-03-04 17:36:56
 * @LastEditors: BH04250909
 * @Description: In User Settings Edit
 * @FilePath: \java_study_codes\src\xiti.QianShi.java
 */
public class QianShi {
    public static void main(String[] args) {
        long num1 = 8,num2 = 8,num = 8;
        for(int i = 0;i<9;i++)
        {
            num1 = 8 + num1*10;
            num = num + num1;
        }
        System.out.printf("%d",num);
        // 9876543200
    }
}
