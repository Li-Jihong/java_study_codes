package _9_.shiyan2;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: Factorial
 * \* @author: li-jihong
 * \* Date: 2023-05-08 1:56
 */

import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        BigInteger result = factorial(n);
        System.out.println(n + "! = " + result);
    }
}
