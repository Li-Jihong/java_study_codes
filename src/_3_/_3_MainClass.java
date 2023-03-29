package _3_;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-03-06
 * \* Time: 0:26
 * \
 */
public class _3_MainClass {
    public static void main(String args[]) {
        _3_TV haierTV = new _3_TV();
        haierTV.setChannel(5); //haierTV 调用 setChannel(int m),并向参数 m传递 5
        System.out.println("haierTV 的频道是 " + haierTV.getChannel());
        _3_Family zhangSanFamily = new _3_Family();
        zhangSanFamily.buyTV(haierTV);//zhangSanFamily 调 用void buyTV(_3_._3_TV tv)方法,并将 haierTV 传递给参数 TV
        System.out.println("zhangSanFamily 开始看电视节目");
        zhangSanFamily.seeTV();
        int m = 2;
        System.out.println("hangSanFamily 将电视更换到" + m + "频 道");
        zhangSanFamily.remoteControl(m);
        System.out.println("haierTV 的频道是 " + haierTV.getChannel());
        System.out.println("hangSanFamily 再看电视节目");
        zhangSanFamily.seeTV();
        _3_Family lisiFamily = new _3_Family();
        lisiFamily.buyTV(haierTV);
        lisiFamily.seeTV();
    }

}
