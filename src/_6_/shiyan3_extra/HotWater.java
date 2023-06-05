package _6_.shiyan3_extra;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-10
 * \* Time: 17:27
 * \
 */
public class HotWater implements Water {
    private double temperature;

    public HotWater() {
        this.temperature = 100;
    }

    public void increaseTemperature(double degree) {
        this.temperature += degree;
        if (this.temperature > 100) {
            this.temperature = 100;
        }
    }

    public void decreaseTemperature(double degree) {
        this.temperature -= degree;
    }

    public String getState() {
        if (this.temperature < 4) {
            return "cold";
        } else if (this.temperature >= 4 && this.temperature < 100) {
            return "liquid";
        } else {
            return "gas";
        }
    }

    public double getTemperature() {
        return this.temperature;
    }
}