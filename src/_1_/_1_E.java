package _1_;

public class _1_E {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int startPosition;
        int endPosition;
        char cStart = 'α', cEnd = 'ω';
        startPosition = cStart;   //cStart做int型转换，并将结果赋值给startPosition
        endPosition = cEnd;      //cEnd做int型转换，并将结果赋值给endPosition
        System.out.println("希腊字母表：");
        for (int i = startPosition; i <= endPosition; i++) {
            char c;
            c = (char) i;//i做char型转换运算，并将结果赋值给c
            System.out.print(" " + c);//输出希腊字母空格分开
        }

    }

}

