public class Hello {
    public static void main(String[] args) {
        System.out.println("大家好！");
        System.out.println("Nice to meet you");
        Student stu = new Student();
        stu.speak("We are students666");
    }
}

class Student{
    public  void speak(String s){
        System.out.println(s);
    }
}