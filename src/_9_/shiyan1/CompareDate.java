package _9_.shiyan1;
/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: CompareDate
 * \* @author: li-jihong
 * \* Date: 2023-05-08 1:26
 */

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CompareDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入第一个年，月，日数据");
        System.out.println("输入第一个年，月，日，时，分，秒数据");
        System.out.print("输入年份");
        short yearOne = scanner.nextShort();
        System.out.print("输入月份");
        byte monthOne = scanner.nextByte();
        System.out.print("输入日期");
        byte dayOne = scanner.nextByte();
        System.out.print("输入时");
        byte hourOne = scanner.nextByte();
        System.out.print("输入分");
        byte minuteOne = scanner.nextByte();
        System.out.print("输入秒");
        byte secondOne = scanner.nextByte();
//        System.out.println("输入第二个年，月，日数据");
        System.out.println("输入第二个年，月，日，时，分，秒数据");
        System.out.print("输入年份");
        short yearTwo = scanner.nextShort();
        System.out.print("输入月份");
        byte monthTwo = scanner.nextByte();
        System.out.print("输入日期");
        byte dayTwo = scanner.nextByte();
        System.out.print("输入时");
        byte hourTwo = scanner.nextByte();
        System.out.print("输入分");
        byte minuteTwo = scanner.nextByte();
        System.out.print("输入秒");
        byte secondTwo = scanner.nextByte();
        Calendar calendar = Calendar.getInstance();  //初始化日历对象
//        calendar.set(yearOne, monthOne - 1, dayOne);  //将calendar的时间设置为yearOne年monthOne月dayOne日
        calendar.set(yearOne, monthOne - 1, dayOne, hourOne, minuteOne, secondOne);  //将calendar的时间设置为yearOne年monthOne月dayOne日
        long timeOne = calendar.getTimeInMillis();  //calendar表示的时间转换成毫秒
//        calendar.set(yearTwo, monthTwo - 1, dayTwo);
        calendar.set(yearTwo, monthTwo - 1, dayTwo, hourTwo, minuteTwo, secondTwo);
        long timeTwo = calendar.getTimeInMillis();
        Date date1 = new Date(timeOne);   // 用timeOne做参数构造date1
        Date date2 = new Date(timeTwo);
        if (date2.equals(date1))
            System.out.println("两个日期的年、月、日完全相同");
        else if (date2.after(date1))
            System.out.println("您输入的第二个日期大于第一个日期");
        else if (date2.before(date1))
            System.out.println("您输入的第二个日期小于第一个日期");
        long days = Math.abs(timeTwo - timeOne) / (1000 * 60 * 60 * 24); //使用timeTwo,timeOne计算两个日期相隔天数
//        System.out.println(yearOne + "年" + monthOne + "月" + dayOne + "日和"
//                + yearTwo + "年" + monthTwo + "月" + dayTwo + "日相隔" + days + "天");
        System.out.println(yearOne + "年" + monthOne + "月" + dayOne + "日" + hourOne + "时" + minuteOne + "分" + secondOne + "秒和"
                + yearTwo + "年" + monthTwo + "月" + dayTwo + "日" + hourTwo + "时" + minuteTwo + "分" + secondTwo + "秒"
                + "相隔" + days + "天");
    }
}
