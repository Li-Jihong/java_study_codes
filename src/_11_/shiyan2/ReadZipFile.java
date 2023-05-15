    package _11_.shiyan2;

    import java.io.File;
    import java.io.FileInputStream;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.util.zip.ZipEntry;
    import java.util.zip.ZipInputStream;

    /**
     * \* Created with IntelliJ IDEA.
     * \* @ProjectName: java_study_codes
     * \* @FileName: ReadZipFile
     * \* @author: li-jihong
     * \* Date: 2023-05-15 17:25
     */
    public class ReadZipFile {
        public static void main(String args[]) {
            File f = new File("src/book.zip");
            File dir = new File("src/mybook");
            byte b[] = new byte[1024];
            dir.mkdir();
            try {
                ZipInputStream in = new ZipInputStream(new FileInputStream(f));
                ZipEntry zipEntry = null;
                while ((zipEntry = in.getNextEntry()) != null) {
                    File file = new File(dir, zipEntry.getName());
                    FileOutputStream out = new FileOutputStream(file);
                    int n = -1;
                    System.out.println(file.getAbsolutePath() + "的内容：");
                    while ((n = in.read(b)) != -1) {
                        out.write(b, 0, n);
                        System.out.print(new String(b, 0, n, "UTF-8"));
                    }
                    out.close();
                }
                in.close();
            } catch (IOException ee) {
                System.out.println(ee);
            }
        }
    }