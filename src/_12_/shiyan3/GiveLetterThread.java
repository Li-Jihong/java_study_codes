package _12_.shiyan3;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: GiveLetterThread
 * \* @author: li-jihong
 * \* Date: 2023-05-22 18:10
 */
public class GiveLetterThread extends Thread {
    Letter letter;
    char startChar = 'a', endChar = 'z';
    int sleepLength = 5000;

    public void setLetter(Letter letter) {
        this.letter = letter;
    }

    public void setSleepLength(int n) {
        sleepLength = n;
    }

    public void run() {
        char c = startChar;
        while (true) {
            letter.setChar(c);
            System.out.printf("显示的字符:%c \n ", letter.getChar());
            try {
                Thread.sleep(sleepLength);
            } catch (InterruptedException e) {
            }
            c = (char) (c + 1);
            if (c > endChar)
                c = startChar;
        }
    }
}