package _12_.shiyan2;

import java.sql.*;

public class NewTransaction {
    public static void main(String[] args) {
        Connection con = null;
        Statement sql;
        ResultSet rs;

        try {
            double amount = 500;
            String uri = "jdbc:mysql://127.0.0.1:3306/shiyan12?user=root&password=123456&useSSL=true";
            con = DriverManager.getConnection(uri);
            con.setAutoCommit(false);
            sql = con.createStatement();
            rs = sql.executeQuery("SELECT * FROM car1 WHERE name = 'zhangsan'");
            rs.next();
            double zhangsanAmount = rs.getDouble("amount");
            System.out.println("转账操作之前zhangsan的钱款数额：" + zhangsanAmount);
            rs = sql.executeQuery("SELECT * FROM car2 WHERE name = 'lisi'");
            rs.next();
            double lisiAmount = rs.getDouble("amount");
            System.out.println("转账操作之前lisi的钱款数额：" + lisiAmount);

            if (zhangsanAmount >= amount) {
                zhangsanAmount -= amount;
                lisiAmount += amount;

                sql.execute("UPDATE car1 SET amount = " + zhangsanAmount + " WHERE name = 'zhangsan'");
                sql.execute("UPDATE car2 SET amount = " + lisiAmount + " WHERE name = 'lisi'");

                System.out.println("转账成功！");
                System.out.println("转账操作之后zhangsan的钱款数额：" + zhangsanAmount);
                System.out.println("转账操作之后lisi的钱款数额：" + lisiAmount);

                con.commit();
            } else {
                System.out.println("转账失败：zhangsan的钱款数额不足！");
                con.rollback();
            }

            con.setAutoCommit(true);
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
