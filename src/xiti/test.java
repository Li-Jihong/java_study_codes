package xiti;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: test
 * \* @author: li-jihong
 * \* Date: 2023-05-29 11:25
 */
public class test {
    public static void main(String[] args) {
        try{
            File file = new File("src/hello.txt");
            FileOutputStream out = new FileOutputStream(file);
            PrintStream ps = new PrintStream(out);
            ps.print("4666666666666666666666666666666");
            ps.println(" 李季鸿");
            ps.println(false);
            ps.close();
        }
        catch(IOException e){

        }
    }
}
