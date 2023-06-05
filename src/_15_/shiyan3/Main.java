package _15_.shiyan3;

interface SpeakHello {
    void speakHello();
}

class Chinese implements SpeakHello {
    public void speakHello() {
        System.out.println("中国人习惯问候语：你好,吃饭了吗? ");
    }
}

class English implements SpeakHello {
    public void speakHello() {
        System.out.println("英国人习惯问候语:你好,天气不错 ");
    }
}

class KindHello {
    public void lookHello(SpeakHello hello) { //接口类型参数
        hello.speakHello();                    //接口回调
    }
}

public class Main {
    public static void main(String[] args) {
        KindHello a = new KindHello();
        Chinese ccc = new Chinese();
        a.lookHello(ccc);
        a.lookHello(new English());
        a.lookHello(() -> System.out.println("码农习惯问候语：no bug"));//向参数传递Lambda表达式的值
    }
}
