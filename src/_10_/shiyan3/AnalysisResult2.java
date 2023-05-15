package _10_.shiyan3;

import java.io.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: AnalysisResult2
 * \* @author: li-jihong
 * \* Date: 2023-05-15 17:00
 */
public class AnalysisResult2 {
    public static void main(String args[]) {
        File fRead = new File("src/goods.txt");
        File fWrite = new File("src/goodsVolume.txt");
        try{
            Writer out = new FileWriter(fWrite,true); //以尾加方式创建指向文件fWrite的out流
            BufferedWriter bufferWrite = new BufferedWriter(out); //创建指向out的bufferWrite流
            Reader in = new FileReader(fRead); //创建指向文件fRead的in流
            BufferedReader bufferRead = new BufferedReader(in); //创建指向in的bufferRead流
            String str = null;
            while((str=bufferRead.readLine())!=null) {
                double volume=Fenxi2.getTotalScore(str);
                str = str+" 体积:"+volume;
                System.out.println(str);
                bufferWrite.write(str);
                bufferWrite.newLine();
            }
            bufferRead.close();
            bufferWrite.close();
        }
        catch(IOException e) {
            System.out.println(e.toString());
        }
    }
}
