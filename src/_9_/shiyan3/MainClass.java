package _9_.shiyan3;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: MainClass
 * \* @author: li-jihong
 * \* Date: 2023-05-08 2:07
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainClass {
    public static void main(String[] args) {
        ComputerFrame frame = new ComputerFrame();
        frame.setTitle("算术测试");
        frame.setBounds(100, 100, 650, 180);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

