package _6_.shiyan3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-10
 * \* Time: 17:11
 * \
 */
public class Dog {
    DogState state;//声明接口的变量
    public void show(){
        state.showState();//调用接口里面的函数
    }
    public void setState(DogState s){
        state=s;
    }
}
