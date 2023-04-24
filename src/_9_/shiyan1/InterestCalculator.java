package _9_.shiyan1;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: InterestCalculator
 * \* @author: li-jihong
 * \* Date: 2023-05-08 1:38
 */


public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入存款金额：");
        double amount = scanner.nextDouble();
        System.out.println("请输入起始时间：");
        System.out.print("输入年份：");
        short startYear = scanner.nextShort();
        System.out.print("输入月份：");
        byte startMonth = scanner.nextByte();
        System.out.print("输入日期：");
        byte startDay = scanner.nextByte();
        Calendar startDate = Calendar.getInstance();
        startDate.set(startYear, startMonth - 1, startDay);
        System.out.println("请输入结束时间：");
        System.out.print("输入年份：");
        short endYear = scanner.nextShort();
        System.out.print("输入月份：");
        byte endMonth = scanner.nextByte();
        System.out.print("输入日期：");
        byte endDay = scanner.nextByte();
        Calendar endDate = Calendar.getInstance();
        endDate.set(endYear, endMonth - 1, endDay);
        if (endDate.before(startDate)) {
            System.out.println("结束时间不能早于起始时间，请重新输入结束时间：");
            System.out.print("输入年份：");
            endYear = scanner.nextShort();
            System.out.print("输入月份：");
            endMonth = scanner.nextByte();
            System.out.print("输入日期：");
            endDay = scanner.nextByte();
            endDate.set(endYear, endMonth - 1, endDay);
        }
        long diffDays = (endDate.getTimeInMillis() - startDate.getTimeInMillis()) / (24 * 60 * 60 * 1000);
        double dailyRate = 0.01 / 365;
        double interest = amount * dailyRate * diffDays;
        DecimalFormat decimalFormat = new DecimalFormat("#.0000");
        System.out.println("存款金额：" + amount + " 元，存款天数：" + diffDays + " 天，日利率：" + decimalFormat.format(dailyRate * 100) + "%，利息为：" + decimalFormat.format(interest) + " 元");
    }
}
