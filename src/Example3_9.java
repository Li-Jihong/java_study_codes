/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-10
 * \* Time: 11:49
 * \
 */
//interface Com {
//    int add(int a, int b);
//    public static int get(int n){
//        return n;
//    }
//    public default int see(int n){
//        return n;
//    }
//    public default int look(int n){
//        return n;
//    }
//}
//class A implements Com{
//    public int add(int a, int b){
//        return a + b;
//    }
//    public int see(int n){
//        return n + 1;
//    }
//}

//public class E{
//    public static void main(String[] args) {
//        A a = new A();
//        int m = a.add(12,6);
//        int n = Com.get(12);
//        int t = a.see(6);
//        int q = a.look(6);
//        System.out.printf(" %d : %d : %d : %d", m, n, t, q);
//    }
//}

import java.util.Scanner;

public class Example3_9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (reader.hasNextDouble()) {
            double x = reader.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.printf("%d个数的和为%f\n", m, sum);
        System.out.printf("%d个数的平均值是%f\n", m, sum / m);
    }
}