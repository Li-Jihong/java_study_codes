package _13_.shiyan1;

import javax.swing.*;
import java.awt.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: MainClass
 * \* @author: li-jihong
 * \* Date: 2023-05-29 16:23
 */
public class MainClass {
    public static void main(String args[]) {
        Sky sky = new Sky();             //构造了一个天空(标签对象)
        JFrame frame = new JFrame();    //构造了一个框架(窗体)
        frame.add(sky);                 //将天空(标签)置于框架(窗体)里
        frame.setTitle("月亮绕地球转");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.white);
    }
}
