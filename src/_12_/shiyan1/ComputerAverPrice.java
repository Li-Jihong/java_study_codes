package _12_.shiyan1;

import java.sql.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: ComputerAverPrice
 * \* @author: li-jihong
 * \* Date: 2023-05-22 16:47
 */
public class ComputerAverPrice {
    public static void main(String[] args) {
        Connection con = null;
        Statement sql;
        ResultSet rs;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {}
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shiyan12?useSSL=TRUE", "root","");
        } catch (SQLException e) {
            System.out.println(e);
        }
        try{
            sql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = sql.executeQuery("select * from booklist");
            rs.last();
            int max  = rs.getRow();
            System.out.println("表中共有" + max + "条记录，随机抽取10条记录： ");
            int [] a = RandomGetRecord.getRandomNUmber(max, 10);
            float sum = 0;
            for(int i : a){
                rs.absolute(i);
                float price = rs.getFloat(3);
                sum = sum + price;
            }
            con.close();
            System.out.println("平均价格：" + sum/a.length);
        }
        catch (SQLException e){}
    }
}
