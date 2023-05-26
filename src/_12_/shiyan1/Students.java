package _12_.shiyan1;

import java.sql.*;
import java.util.Random;
import java.util.Vector;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: students
 * \* @author: li-jihong
 * \* Date: 2023-05-22 17:29
 */
public class Students {
    public static void main(String args[]){
        int wantRecordAmount = 20;
        Random random = new Random();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.print(e);
        }
        Connection con;
        Statement sql;
        ResultSet rs;
        try {
            String uri = "jdbc:mysql://127.0.0.1:3306/shiyan12?user=root&password=123456&useSSL=true";
            con = DriverManager.getConnection(uri);
            sql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = sql.executeQuery("SELECT * FROM score");
            rs.last();
            int count = rs.getRow();
            Vector<Integer> vector = new Vector<Integer>();
            for(int i=1;i<=count;i++){
                vector.add(i);
            }
            int itemAmount = Math.min(wantRecordAmount,count);
            System.out.println("随即抽取"+itemAmount+"条记录");
            System.out.println("学生信息如下：");
            double sum = 0,n = itemAmount;
            while(itemAmount>0){
                int randomIndex = random.nextInt(vector.size());
                int index = (vector.elementAt(randomIndex)).intValue();
                rs.absolute(index);
                String name = rs.getString("name");
                float grade = rs.getFloat("score");
                System.out.println(name+":"+grade);
                sum = sum +grade;
                itemAmount--;
                vector.removeElementAt(randomIndex);
            }
            con.close();
            double aver = sum/n;
            System.out.println("平均成绩："+aver+"分");
        }
        catch (SQLException e){
            System.out.println(""+e);
        }
    }
}
