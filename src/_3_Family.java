/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-03-06
 * \* Time: 0:26
 * \
 */
public class _3_Family {
    _3_TV homeTV;
    void buyTV(_3_TV tv) {
        homeTV = tv; //将参数 tv 赋值给 homeTV
    }
    void remoteControl(int m) {
        homeTV.setChannel(m);
    }
    void seeTV() {
        homeTV.showProgram(); //homeTV 调用 showProgram()方法
    }

}
