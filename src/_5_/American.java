package _5_;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-03
 * \* Time: 13:33
 * \
 */
public class American extends People {
    public void speakHello() {
        System.out.println("How do you do");
    }
    //重写 public void speakHello()方法，输出"How do you do"
    public void averageHeight() {
        height=176;
        System.out.println("American's average height:"+height+"厘米");
    }
    //重写 public void averageHeight()方法，输出"American'saverage height:176 cm"
    public void averageWeight() {
        weight = 75;
        System.out.println("American's average weight:"+weight+" kg");
    }
    public void americanBoxing() {
        System.out.println("直拳、钩拳、组合拳");
    }
}