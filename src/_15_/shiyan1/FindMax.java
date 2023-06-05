package _15_.shiyan1;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: FindMax
 * \* @author: li-jihong
 * \* Date: 2023-06-05 15:04
 */
public class FindMax {
    public static void main(String[] args) {
        int[][] a = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}};

        int max = Integer.MIN_VALUE;

        for (int[] row : a) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }

        System.out.println("数组a中的最大值为: " + max);
    }
}
