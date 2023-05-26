package _12_.shiyan4;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: TwoThreadGuessNumber
 * \* @author: li-jihong
 * \* Date: 2023-05-26 20:05
 */
public class TwoThreadGuessNumber {
    public static void main(String args[]) {
        Number number = new Number();
        number.giveNumberThread.start();
        number.guessNumberThread1.start();
        number.guessNumberThread2.start();
    }
}
