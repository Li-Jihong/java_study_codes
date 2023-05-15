package _11_.shiyan3;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: MultiplicationTable
 * \* @author: li-jihong
 * \* Date: 2023-05-15 17:38
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        // 控制乘数
        for (int i = 1; i <= 9; i++) {
            // 控制被乘数
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " x " + i + " = " + (i * j) + "\t");
            }
            // 换行
            System.out.println();
        }
    }
}
