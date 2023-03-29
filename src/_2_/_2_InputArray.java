package _2_;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-02-27
 * \* Time: 12:49
 * \
 */
public class _2_InputArray {
    public static void main(String[] args) {
        int[] a = {100, 200, 300};
        //输出数组a的长度
        System.out.println("数组a的长度="+a.length);
        //输出数组a的引用
        System.out.println("数组a的位置="+a);
        int[][] b = {{1}, {1,1}, {1,2,1}, {1,3,3,1}, {1,4,6,4,1}};
        //输出二维数组b的一维数组的个数
        System.out.println(b.length);
        System.out.println(b[4][2]);
        System.out.println("-----------------------");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i].length);
            System.out.println(b[i]);
        }
        //将数组a的引用赋给b[4];
        b[4]=a;
        System.out.println("-----------------------");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i].length);
            System.out.println(b[i]);
        }
        System.out.println(b[4][2]);
    }
}
