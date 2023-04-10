package _6_.shiyan3_extra;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-10
 * \* Time: 17:34
 * \
 */
public class WaterTest {
    public static void main(String[] args) {
        Water water = new ColdWater();
        System.out.println("冷水最初状态：" + water.getState() + " " + water.getTemperature() + " 度"); // 输出 cold

        water.increaseTemperature(10);
        System.out.println("加了10°：" + water.getState() + " " + water.getTemperature() + " 度"); // 输出 liquid

        water.increaseTemperature(90);
        System.out.println("加了90°：" + water.getState() + " " + water.getTemperature() + " 度"); // 输出 gas

        water.decreaseTemperature(50);
        System.out.println("减了50°：" + water.getState() + " " + water.getTemperature() + " 度"); // 输出 liquid

        water = new HotWater();
        System.out.println("热水最初状态：" + water.getState() + " " + water.getTemperature() + " 度"); // 输出 gas

        water.decreaseTemperature(20);
        System.out.println("减了20°：" + water.getState() + " " + water.getTemperature() + " 度"); // 输出 liquid

        water.decreaseTemperature(110);
        System.out.println("减了110°：" + water.getState() + " " + water.getTemperature() + " 度"); // 输出 cold
    }
}
