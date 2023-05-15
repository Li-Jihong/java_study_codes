package _10_.shiyan2;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: FontFamilyNames
 * \* @author: li-jihong
 * \* Date: 2023-05-15 16:45
 */
import java.awt.GraphicsEnvironment;
public class FontFamilyNames {
    String allFontNames[];
    public String [] getFontName(){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        allFontNames = ge.getAvailableFontFamilyNames();
        return allFontNames;
    }
}
