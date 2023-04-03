package _5_;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-03
 * \* Time: 13:33
 * \
 */
public class Beijingman extends Chinese {
    public void averageHeight() {
        height=172.5;
        System.out.println("北京人的平均 身高:"+height+"厘米 ");
    }
    //重写 public void averageHeight()方法,输出:"北京人的平均身高: 172.5 厘米"
    public void averageWeight() {
        weight=70;
        System.out.println("北京人的平均 体重:"+weight+"千克 ");
    }
    //重写 public void averageWeight()方法,输出:"北京人的平均体重：70 公斤"
    public void beijingOpera() {
        System.out.println("花脸、青衣、花旦和老生");
    }
}