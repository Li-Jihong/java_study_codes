package _9_.shiyan4;

import java.time.LocalDate;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: GiveCalendar
 * \* @author: li-jihong
 * \* Date: 2023-05-08 2:28
 */
public class GiveCalendar {
    /**
     * @param date 日期
     * @return dataArrays  这个月的所有天
     */
    public static LocalDate[] getCalendar(LocalDate date) {
        date = date.withDayOfMonth(1);
        //date从1开始
        int days = date.lengthOfMonth();
        LocalDate[] dataArrays = new LocalDate[days];
        for (int i = 0; i < days; i++) {
            dataArrays[i] = date.plusDays(i);
        }
        return dataArrays;
    }
}