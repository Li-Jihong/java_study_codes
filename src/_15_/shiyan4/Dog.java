package _15_.shiyan4;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: Dog
 * \* @author: li-jihong
 * \* Date: 2023-06-05 15:14
 */
public class Dog implements Comparable<Dog> {
    int weight;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.weight = 20;
        dog1.weight = 25;
        System.out.println(dog1.comparaTo(dog2));
    }

    @Override
    public int comparaTo(Dog m) {
        if (weight > m.weight) {
            return 1;
        } else if (weight == m.weight) {
            return 0;
        } else {
            return -1;
        }
    }
}
