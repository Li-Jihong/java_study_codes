package _12_.shiyan1;

import java.util.Random;
import java.util.Vector;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: RandomGetRecord
 * \* @author: li-jihong
 * \* Date: 2023-05-22 16:30
 */
public class RandomGetRecord {
    public static int[] getRandomNUmber(int max, int amount) {
        Vector<Integer> vector = new Vector<Integer>();
        for (int i = 1; i <= max; i++) {
            vector.add(i);
        }
        int result[] = new int[amount];
        while (amount > 0) {
            int index = new Random().nextInt(vector.size());
            int m = vector.elementAt(index);
            vector.removeElementAt(index);
            result[amount - 1] = m;
            amount--;
        }
        return result;
    }
}
