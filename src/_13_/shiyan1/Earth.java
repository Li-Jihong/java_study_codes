package _13_.shiyan1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: Earth
 * \* @author: li-jihong
 * \* Date: 2023-05-29 16:25
 */
public class Earth extends JLabel implements ActionListener {
    JLabel moon; //显示月亮的外观
    Timer timer;
    double pointX[] = new double[360],
            pointY[] = new double[360];
    int w = 200, h = 200, i = 0;

    Earth() {
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(w, h));
        timer = new Timer(20, this);
        //【代码1】创建 timer，振铃间隔是 20 毫秒，当前 Earth 对象为其监视器
        setIcon(new ImageIcon("image/地球.png"));
        setHorizontalAlignment(SwingConstants.CENTER);
        moon = new JLabel(new ImageIcon("image/月亮.png"), SwingConstants.CENTER);
        add(moon);
        moon.setPreferredSize(new Dimension(60, 60));
        pointX[0] = 0;
        pointY[0] = h / 2;
        double angle = 1 * Math.PI / 180;  //刻度为 1 度
        for (int i = 0; i < 359; i++) {    //计算出数组中各个元素的值
            pointX[i + 1] = pointX[i] * Math.cos(angle) - Math.sin(angle) * pointY[i];
            pointY[i + 1] = pointY[i] * Math.cos(angle) + Math.sin(angle) * pointX[i];
        }

        for (int i = 0; i < 360; i++) {
            pointX[i] = 0.8 * pointX[i] + w / 2;   //坐标缩放，平移
            pointY[i] = 0.8 * pointY[i] + h / 2;
        }
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        i = (i + 1) % 360;
        moon.setLocation((int) pointX[i] - 30, (int) pointY[i] - 30);
    }
}