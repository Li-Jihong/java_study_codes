package _10_.shiyan3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: Fenxi2
 * \* @author: li-jihong
 * \* Date: 2023-05-15 17:02
 */
public class Fenxi2 {
    public static double getTotalScore(String s) {
        Scanner scanner = new Scanner(s);
        scanner.useDelimiter("[^0123456789.]+"); //p192 C8.3scanner e13
        double volume=1;
        while(scanner.hasNext()){
            try{ double data = scanner.nextDouble();
                volume = volume*data;
            }
            catch(InputMismatchException exp){
                String t = scanner.next();
            }
        }
        return volume;
    }
}
