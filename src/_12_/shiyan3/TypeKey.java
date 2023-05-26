package _12_.shiyan3;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: TypeKey
 * \* @author: li-jihong
 * \* Date: 2023-05-22 18:07
 */
public class TypeKey {
    public static void main(String args[]){
        System.out.println("键盘练习（输入#结束程序）：");
        System.out.println("输入显示的字母（回车）\n");
        Letter letter;
        letter = new Letter();
        GiveLetterThread giveChar;
        InputLetterThread typeChar;
        giveChar = new GiveLetterThread();
        typeChar = new InputLetterThread();
        giveChar.setLetter(letter);
        giveChar.setSleepLength(3200);
        typeChar.setLetter(letter);
        giveChar.start();
        typeChar.start();
    }
}
