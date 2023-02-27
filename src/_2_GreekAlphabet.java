public class _2_GreekAlphabet
{
    public static void main (String args[ ])
    {
        int startPosition = 0,endPosition = 0;
        char cStart = 'α', cEnd = 'ω';
        startPosition = (int)cStart;  //cStart做int型转换据运算，并将结果赋值给startPosition
        endPosition = (int)cEnd;   //cEnd做int型转换运算，并将结果赋值给endPosition 6
        System.out.println("希腊字母\'α\'在unicode表中的顺序位置:" + (int)cStart);
        System.out.println("希腊字母表：");
        for(int i = startPosition; i <= endPosition; i++)
        {
            char c = '\0';
            c = (char)i;  //i做char型转换运算，并将结果赋值给c
            System.out.print(" " + c);
            if((i - startPosition + 1) % 10 == 0){
                System.out.println("");
            }
        }
    }
}