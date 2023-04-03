package _5_;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-03
 * \* Time: 14:14
 * \
 */
public class SaveMoney{
    public static void main(String arg[]){
        int amount = 8000;
        Bank bank_1 = new Bank(8.236, 1, 0.0001,  0.035);
        bank_1.savedMoney = amount;
        Bank bank_2 = new Bank(8.236, 2, 0.00012,  0.035);
        bank_2.savedMoney = amount;
        Bank bank_3 = new Bank(8.236, 3, 0.00013,  0.035);
        bank_3.savedMoney = amount;
        double interest1 = bank_1.computerInterest();
        double interest2 = bank_2.computerInterest();
        double interest3 = bank_3.computerInterest();

        System.out.printf("三个银行利息分别是%f元 %f元 %f元",interest1, interest2, interest3);
    }
}
