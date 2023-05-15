package _11_.shiyan1;

import java.util.Arrays;
import java.util.Vector;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: DictionaryOutput
 * \* @author: li-jihong
 * \* Date: 2023-05-15 17:22
 */
public class DictionaryOutput {
    public static void main(String args[]) {
        Vector<String> allWord, noSameWord;
        WordStatistic statistic = new WordStatistic();
        statistic.setFileName("src/hello.txt");
        statistic.wordStatistic();
        allWord = statistic.getAllWord();
        noSameWord = statistic.getNoSameWord();
        System.out.println("一共有" + allWord.size() + "个英文单词");
        System.out.println("有" + noSameWord.size() + "个不相同的英文单词");
        System.out.println("按字典顺序排列:");
        String s[] = new String[noSameWord.size()];
        for (int i = 0; i < noSameWord.size(); i++) {
            s[i] = noSameWord.elementAt(i);
        }
        Arrays.sort(s);
        for (int i = 0; i < noSameWord.size(); i++) {
            System.out.println(s[i] + " ");
        }
    }
}

