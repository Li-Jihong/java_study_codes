package _10_.shiyan2;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: FrameHaveDialog
 * \* @author: li-jihong
 * \* Date: 2023-05-15 16:45
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class FrameHaveDialog extends JFrame {
    JTextArea text;
    JButton buttonFont;
    FontDialog dialog = new FontDialog(this);

    FrameHaveDialog() {
        buttonFont = new JButton("设置字体");
        text = new JTextArea("Java 2实用教程（第四版）");
        buttonFont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == buttonFont) {

                    dialog.setVisible(true);
                    if (dialog.getState() == FontDialog.YES) {
                        text.setFont(dialog.getFont());
                        text.repaint();
                    }
                    if (dialog.getState() == FontDialog.NO) {
                        text.repaint();
                    }
                }
            }
        });
        add(buttonFont, BorderLayout.NORTH);
        add(text);
        setBounds(60, 60, 300, 300);
        setVisible(true);
        validate();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}