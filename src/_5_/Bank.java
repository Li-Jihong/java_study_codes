package _5_;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-03
 * \* Time: 14:12
 * \
 */
public class Bank {
    int i;
    int savedMoney;
    double year;
    double dayRate;
    double yearRate;
    double interest;

    public Bank(double year, int i, double dayRate, double yearRate) {
        this.i = i;
        this.year = year;
        this.dayRate = dayRate;
        this.yearRate = yearRate;
    }

    public double computerInterest() {
        double r = year - (int) year;
        int day = (int) (r * 1000);
        double dayInterest = day * this.dayRate * savedMoney;
        double yearInterest = (int) year * this.yearRate * savedMoney;
        interest = yearInterest + dayInterest;
        System.out.printf("%d 元存在银行%d %d 年零%d 天的利息:%f 元\n", savedMoney, i, (int) year, day, interest);
        return interest;
    }
}