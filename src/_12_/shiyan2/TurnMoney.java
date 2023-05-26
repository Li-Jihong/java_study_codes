    package _12_.shiyan2;

    /**
     * \* Created with IntelliJ IDEA.
     * \* @ProjectName: java_study_codes
     * \* @FileName: TurnMoney
     * \* @author: li-jihong
     * \* Date: 2023-05-22 17:36
     */
    import java.sql.*;
    public class TurnMoney {
        public static void main(String args[]) {
            Connection con = null;
            Statement sql;
            ResultSet rs;

            try {
                double n = 100;
                String uri = "jdbc:mysql://127.0.0.1:3306/shiyan12?user=root&password=123456&useSSL=true";
                con = DriverManager.getConnection(uri);
                con.setAutoCommit(false);
                sql = con.createStatement();
                rs = sql.executeQuery("SELECT * FROM car1 WHERE name = 'zhangsan'");
                rs.next();
                double amountOne = rs.getDouble("amount");
                System.out.println("转账操作之前zhangsan的钱款数额：" + amountOne);
                rs = sql.executeQuery("SELECT * FROM car2 WHERE name = 'lisi'");
                rs.next();
                double amountTwo = rs.getDouble("amount");
                System.out.println("转账操作之前lisi的钱款数额：" + amountTwo);
                amountOne = amountOne - n;
                amountTwo = amountTwo + n;
                sql.execute("UPDATE car1 SET amount = " + amountOne + " WHERE name = 'zhangsan'");
                sql.execute("UPDATE car2 SET amount = " + amountTwo + " WHERE name = 'lisi'");
                con.commit();
                con.setAutoCommit(true);
                rs = sql.executeQuery("SELECT * FROM car1 WHERE name = 'zhangsan'");
                rs.next();
                amountOne = rs.getDouble("amount");
                System.out.println("转账操作之后zhangsan的钱款数额：" + amountOne);
                rs = sql.executeQuery("SELECT * FROM car2 WHERE name = 'lisi'");
                rs.next();
                amountTwo = rs.getDouble("amount");
                System.out.println("转账操作之后lisi的钱款数额：" + amountTwo);
                con.close();
            } catch (SQLException e) {
                try {
                    con.rollback();
                } catch (SQLException exp) {
                }
                System.out.println(e.toString());
            }
        }
    }
