package _15_.shiyan2;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: Main
 * \* @author: li-jihong
 * \* Date: 2023-06-05 15:09
 */
class Student {
    int number;
    String name;

    Student() {
    }

    Student(int number, String name) {
        this.number = number;
        this.name = name;
        System.out.println("我的名字是:" + name + " 学号是:" + number);
    }
}

class UniverStudent extends Student {
    boolean 婚否;

    UniverStudent(int number, String name, boolean b) {
        super(number, name);
        婚否 = b;
        System.out.println("婚否=" + 婚否);
    }
}

public class Main {
    public static void main(String[] args) {
        UniverStudent zhang = new UniverStudent(9901, "何晓林", false);
    }
}


