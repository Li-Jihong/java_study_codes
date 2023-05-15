package _10_.shiyan3;

import java.io.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: AnalysisResult
 * \* @author: li-jihong
 * \* Date: 2023-05-15 16:54
 */
public class AnalysisResult {
    public static void main(String args[]) {
        File fRead = new File("src/score.txt");
        File fWrite = new File("src/scoreAnalysis.txt");
        try {
            Writer out = new FileWriter(fWrite, true);
            BufferedWriter bufferWrite = new BufferedWriter(out);
            Reader in = new FileReader(fRead);
            BufferedReader butterRead = new BufferedReader(in);
            String str = null;
            while ((str = butterRead.readLine()) != null) {
                double totalScore = Fenxi.getTotalScore(str);
                str = str + " 总分:" + totalScore;
                System.out.println(str);
                bufferWrite.write(str);
                bufferWrite.newLine();
            }
            bufferWrite.close();
            bufferWrite.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
