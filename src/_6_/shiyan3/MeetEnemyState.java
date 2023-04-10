package _6_.shiyan3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-10
 * \* Time: 17:13
 * \
 */
class MeetEnemyState implements DogState{//实现接口的类

    @Override
    public void showState() {
        System.out.println("遇到敌人狂叫！");
    }
}