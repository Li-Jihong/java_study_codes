package _7_.shiyan2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-17
 * \* Time: 16:40
 * \
 */
public class FindMess {
    public static void main(String args[]) {
        String mess = "姓名:张三 出生时间:1989.10.16 个人网站:http://www.zhang.com。身高:185cm,体重:72kg";
        int index = mess.indexOf(":"); //mess 调用 indexOf(String s)方法返回字符串中首次出现冒号的位置
        String name = mess.substring(index + 1);
        if (name.startsWith("张")) {
            System.out.println("简历中的姓名姓\"张\"");
        }
        index = mess.indexOf(":", index + 1); //mess 调用 indexOf(Strings,int start)方法返回字符串中第 2 次出现冒号的位置
        String date = mess.substring(index + 1, index + 11);
        System.out.println(date);
        index = mess.indexOf(":", index + 1);
        int heightPosition = mess.indexOf("身高"); // mess 调用indexOf(String s) 方法返回字符串中首次出现 "身高" 的位置
        String personNet = mess.substring(index + 1, heightPosition - 1);
        System.out.println(personNet);
        index = mess.indexOf(":", heightPosition); //mess 调 用indexOf(String s, int start)方法返回字符串中 "身高" 后面的冒号位置
        int cmPosition = mess.indexOf("cm");
        String height = mess.substring(index + 1, cmPosition);
        height = height.trim();
        int h = Integer.parseInt(height);
        if (h >= 180) {
            System.out.println("简历中的身高" + height + "大于或等于 180 cm");
        } else {
            System.out.println("简历中的身高" + height + "小于 180 cm");
        }
        index = mess.lastIndexOf(":"); //mess 调用 lastIndexOf(Strings)返回字符串中最后一个冒号位置
        int kgPosition = mess.indexOf("kg");
        String weight = mess.substring(index + 1, kgPosition);
        weight = weight.trim();

        int w = Integer.parseInt(weight);
        if (w >= 75) {
            System.out.println("简历中的体重" + weight + "大于或等于 75 kg");
        } else {
            System.out.println("简历中的体重" + weight + "小于 75 kg");
        }
        String str1 = new String("ABCABC");
        String str2 = null;
        String str3 = null;
        String str4 = null;
        str2 = str1.replaceAll("A", "First");
        str3 = str2.replaceAll("B", "Second");
        str4 = str3.replaceAll("C", "Third");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(Long.toBinaryString(12345));
        System.out.println(Long.toOctalString(12345));
        System.out.println(Long.toHexString(12345));
        System.out.println(Long.toString(8, 2));
    }
}