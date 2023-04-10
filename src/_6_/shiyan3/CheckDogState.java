package _6_.shiyan3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-10
 * \* Time: 17:17
 * \
 */
public class CheckDogState {
    public static void main(String[] args) {
        Dog yelloDog = new Dog();
        System.out.print("狗在主人前面：");
        yelloDog.setState(new SoflyState());
        yelloDog.show();
        System.out.print("狗遇到敌人：");
        yelloDog.setState(new MeetEnemyState());
        yelloDog.show();
        System.out.print("狗遇到朋友：");
        yelloDog.setState(new MeetFriendState());
        yelloDog.show();
        System.out.print("狗遇到同伴：");
        yelloDog.setState(new MeetAnotherDog());
        yelloDog.show();
    }
}
