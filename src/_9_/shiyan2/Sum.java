package _9_.shiyan2;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: sum
 * \* @author: li-jihong
 * \* Date: 2023-05-08 2:01
 */

import java.math.BigInteger;

public class Sum {
    public static void main(String args[]) {
        BigInteger n = new BigInteger("0");
        BigInteger x = new BigInteger("99999999");
        BigInteger ONE = new BigInteger("1");
        System.out.println("累加到99999999的运算结果为：");
        for (BigInteger i = ONE; i.compareTo(x) <= 0; i = i.add(ONE)) {
            n = n.add(i);
        }
        System.out.println(n.toString());
    }
}
