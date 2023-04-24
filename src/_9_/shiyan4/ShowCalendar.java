package _9_.shiyan4;

import javax.swing.*;
import java.awt.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: ShowCalendar
 * \* @author: li-jihong
 * \* Date: 2023-05-08 2:28
 */
public class ShowCalendar extends JFrame {
    CalendarPanel showCalendar;
    JButton nextMonth;
    JButton previousMonth;
    JLabel showYear, showMonth;

    public ShowCalendar() {
        showCalendar = new CalendarPanel();
        add(showCalendar);
        nextMonth = new JButton("下一个月");
        previousMonth = new JButton("上一个月");
        showYear = new JLabel();
        showMonth = new JLabel();
        JPanel pNorth = new JPanel();
        showYear.setText("" + showCalendar.currentDate.getYear() + "年");
        showMonth.setText("" + showCalendar.currentDate.getMonth() + "月");
        pNorth.add(showYear);
        pNorth.add(previousMonth);
        pNorth.add(nextMonth);
        pNorth.add(showMonth);
        add(pNorth, java.awt.BorderLayout.NORTH);

        // 添加显示年份和月份的JLabel到窗口的南部
        JPanel pSouth = new JPanel();
        pSouth.add(showYear);
        pSouth.add(showMonth);
        add(pSouth, BorderLayout.SOUTH);

        nextMonth.addActionListener((e) -> {
            showCalendar.setNext();
            showYear.setText("" + showCalendar.currentDate.getYear() + "年");
            showMonth.setText("" + showCalendar.currentDate.getMonthValue() + "月");
        });
        previousMonth.addActionListener((e) -> {
            showCalendar.setPrevious();
            showYear.setText("" + showCalendar.currentDate.getYear() + "年");
            showMonth.setText("" + showCalendar.currentDate.getMonth() + "月");
        });
        setSize(290, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ShowCalendar();
    }
}
