/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-03-27
 * \* Time: 14:07
 * \
 */

public class _4_Land {
    public static void main(String args[]) {
        _4_Village.setWaterAmount(200); // 用类名调用_4_Village.setWaterAmount(int m),并向参数传值 200
        int leftWater = _4_Village.waterAmount; //用 _4_Village 类的类名访问 waterAmount
        System.out.println("水井中有 "+leftWater+" 升水");
        _4_Village zhaoZhuang,maJiaHeZi;
        zhaoZhuang = new _4_Village("赵庄");
        maJiaHeZi = new _4_Village("马家河子");
        zhaoZhuang.setPeopleNumber(80);
        maJiaHeZi.setPeopleNumber(120);
        zhaoZhuang.drinkWater(50);//zhaoZhuang 调 用drinkWater(int n),并向参数传值 50
        leftWater = _4_Village.lookWaterAmount();//maJiaHeZi 调用 lookWaterAmount()方法
        String name=maJiaHeZi.name;
        System.out.println(name+"发现水井中有 "+leftWater+" 升水");
        maJiaHeZi.drinkWater(100);
        leftWater = zhaoZhuang.lookWaterAmount();//zhaoZhuang 调用 lookWaterAmount()方法
        name=zhaoZhuang.name;
        System.out.println(name+"发现水井中有 "+leftWater+" 升水");
        int peopleNumber = zhaoZhuang.getPeopleNumber();
        System.out.println("赵庄的人口:"+peopleNumber);
        peopleNumber = maJiaHeZi.getPeopleNumber();
        System.out.println("马家河子的人口:"+peopleNumber);
    }
}
