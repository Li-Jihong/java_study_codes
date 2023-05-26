package _12_.shiyan3;

import java.util.Scanner;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: InputLetterThread
 * \* @author: li-jihong
 * \* Date: 2023-05-22 18:11
 */
public class InputLetterThread extends Thread {
    Scanner reader;
    Letter letter;
    int score = 0;

    InputLetterThread() {
        reader = new Scanner(System.in);
    }

    public void setLetter(Letter letter) {
        this.letter = letter;
    }
    public void run() {
        while (true) {
            String str = reader.nextLine();
            char c = str.charAt(0);
            if (c == letter.getChar()) {
                score++;
                System.out.printf("\t\t输入对了，目前分数%d\n" ,score);
            } else {
                System.out.printf("\t\t输入错了，目前分数%d\n ", score);
            }
            if (c == '#')
                System.exit(0);
        }
    }
}