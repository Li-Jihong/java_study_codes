package _9_.shiyan4;

import javax.swing.*;
import java.awt.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: CalendarPanel
 * \* @author: li-jihong
 * \* Date: 2023-05-08 2:28
 */
public class CalendarPanel extends JPanel {
    GiveCalendar calendar;
    public String[] name = {"日", "一", "二", "三", "四", "五", "六"};
    public LocalDate currentDate;
    LocalDate[] dateArrays;

    public CalendarPanel() {
        calendar = new GiveCalendar();
        currentDate = LocalDate.now();
        dateArrays = GiveCalendar.getCalendar(currentDate);
        showCalendar(dateArrays);
    }

    public void showCalendar(LocalDate[] dataArrays) {
        removeAll();
        GridLayout gridLayout = new GridLayout(7, 7);
        setLayout(gridLayout);
        JLabel[] titleWeek = new JLabel[7];
        JLabel[] showDay = new JLabel[42];
        for (int i = 0; i < 7; i++) {
            titleWeek[i] = new JLabel(name[i], JLabel.CENTER);
            add(titleWeek[i]);
        }
        for (int i = 0; i < 42; i++) {
            showDay[i] = new JLabel("", JLabel.CENTER);
        }
        for (int k = 7, i = 0; k < 49; k++, i++) {
            add(showDay[i]);
        }
        int space = printSpace(dateArrays[0].getDayOfWeek());
        for (int i = 0, j = space + i; i < dateArrays.length; i++, j++) {
            showDay[j].setText("" + dateArrays[i].getDayOfMonth());
        }
        repaint();
    }

    public void setNext() {
        currentDate = currentDate.plusMonths(1);
        dateArrays = GiveCalendar.getCalendar(currentDate);
        showCalendar(dateArrays);
    }

    public void setPrevious() {
        currentDate = currentDate.plusMonths(-1);
        dateArrays = GiveCalendar.getCalendar(currentDate);
        showCalendar(dateArrays);
    }

    public int printSpace(DayOfWeek x) {
        int n = 0;
        switch (x) {
            case SUNDAY:
                n = 0;
                break;
            case MONDAY:
                n = 1;
                break;
            case TUESDAY:
                n = 2;
                break;
            case WEDNESDAY:
                n = 3;
                break;
            case THURSDAY:
                n = 4;
                break;
            case FRIDAY:
                n = 5;
                break;
            case SATURDAY:
                n = 6;
                break;
        }
        return n;
    }
}