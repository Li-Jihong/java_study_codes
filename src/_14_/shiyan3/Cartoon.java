package _14_.shiyan3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: Cartoon
 * \* @author: li-jihong
 * \* Date: 2023-05-29 18:04
 */
class TimeWin extends JFrame implements ActionListener {
    JButton bStart, bStop, imageButton;
    Timer time;
    int n = 0, start = 1, count;
    ImageIcon imageIcon[];

    TimeWin() {
        time = new Timer(500, this);
        imageIcon = new ImageIcon[10];
        count = imageIcon.length;
        for (int i = 0; i < count; i++) {
            imageIcon[i] = new ImageIcon("image/书本 (" + i + ").png");
        }
        imageButton = new JButton(imageIcon[0]);
        bStart = new JButton("开始播放");
        bStop = new JButton("暂停播放");
        bStart.addActionListener(this);
        bStop.addActionListener(this);
        JPanel con = new JPanel();
        con.add(bStart);
        con.add(bStop);
        add(con, BorderLayout.SOUTH);
        add(imageButton, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        validate();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == time) {
            n = (n + 1) % count;
            imageButton.setIcon(imageIcon[n]);
        } else if (e.getSource() == bStart) {
            time.start();
        } else if (e.getSource() == bStop) {
            time.stop();
        }
    }
}

public class Cartoon {
    public static void main(String[] args) {
        TimeWin Win = new TimeWin();
    }
}
