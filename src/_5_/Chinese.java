package _5_;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-03
 * \* Time: 13:32
 * \
 */
public class Chinese extends People {
    public void speakHello() {
        System.out.println("您好");
    }

    public void averageHeight() {
        height = 168.78;
        System.out.println("中国人的平均身高:" + height + " 厘米");
    }

    public void averageWeight() {
        weight = 65;
        System.out.println("中国人的平均体重:" + weight + "千克 ");
    }

    //重写 public void averageWeight()方法，输出:"中国人的平均体重：65 公斤"
    public void chinaGongfu() {
        System.out.println("坐如钟,站如松,睡如弓");
    }
}