package _7_.shiyan3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-17
 * \* Time: 16:53
 * \
 */
public class ComputerPrice {
    public static void main(String[] args) {
        String menu = "北京烤鸭：189元 西芹炒肉：12.9元 酸菜鱼：69元 铁板牛肉：32元";
        Scanner scanner = new Scanner(menu);
        String regex = "[^0123456789.]+";
        scanner.useDelimiter(regex);
        double sum = 0;
        while (scanner.hasNext()) {
            try {
                double price = scanner.nextDouble();
                sum = sum + price;
                System.out.println(price);
            } catch (InputMismatchException exp) {
                String t = scanner.next();
            }
        }
        System.out.println("菜单总价格：" + sum + "元");
        System.out.println("----------------------------------------------");
        String wangzhi = "中央电视台:www.cctv.com 清华大学:www.tsinghua.edu.cn";
//        String regex_1 = "[^(http//|www)\56?\\w+\56{1}\\w+56{1}\\p{Alpha}]+";
//        String regex_1 = "[^(http//|www)\\.+\\w+\\.+\\w+\\.\\p{Alpha}]+";
        String regex_1 = "(?i)\\b(https?://|www\\.)\\S+\\b";
        Pattern pattern = Pattern.compile(regex_1);
        Matcher matcher = pattern.matcher(wangzhi);
        while (matcher.find()) {
            String link = matcher.group();
            System.out.println(link);
        }
    }
}
