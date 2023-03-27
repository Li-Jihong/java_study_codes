/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-03-27
 * \* Time: 14:06
 * \
 */
public class _4_Village {
    static int waterAmount; //模拟水井的水量
    int peopleNumber; //村庄的人数
    String name; //村庄的名字
    _4_Village(String s) {
        name = s;
    }
    static void setWaterAmount(int m) {
        if(m>0)
            waterAmount = m;
    }
    void drinkWater(int n){
        if( waterAmount-n>=0) {
            waterAmount = waterAmount-n;
            System.out.println(name+"喝了"+n+"升水");
        }
        else
            waterAmount = 0;
    }
    static int lookWaterAmount() {
        return waterAmount;
    }
    void setPeopleNumber(int n) {
        peopleNumber = n;
    }
    int getPeopleNumber() {
        return peopleNumber;
    }
}
