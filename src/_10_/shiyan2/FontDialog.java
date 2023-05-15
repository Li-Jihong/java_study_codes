package _10_.shiyan2;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: FontDialog
 * \* @author: li-jihong
 * \* Date: 2023-05-15 16:44
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class FontDialog extends JDialog  {
    FontFamilyNames fontFamilyNames;
    int fontSize=38;
    String fontName;
    JComboBox fontNameList,fontSizeList;
    JLabel label;
    Font font;
    JButton yes,cancel;
    static int YES=1,NO=0;
    int state=-1;
    FontDialog(JFrame f) {
        super(f);
        setTitle("字体对话框");
        font=new Font("宋体",Font.PLAIN,12);
        fontFamilyNames=new FontFamilyNames();
        setModal(true);    //当前对话框调用setModal(boolean b)设置为有模式
        yes=new JButton("Yes");
        cancel=new JButton("cancel");
        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==yes) {
                    state=YES;
                    setVisible(false);        //对话框设置为不可见
                }
                else if(e.getSource()==cancel) {
                    state=NO;
                    setVisible(false);        //对话框设置为不可见
                }
            }
        });
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==yes) {
                    state=YES;
                    setVisible(false);        //对话框设置为不可见
                }
                else if(e.getSource()==cancel) {
                    state=NO;
                    setVisible(false);        //对话框设置为不可见
                }
            }
        });
        label=new JLabel("hello,奥运",JLabel.CENTER);
        fontNameList=new JComboBox();
        fontSizeList=new JComboBox();
        String name[]=fontFamilyNames.getFontName();
        fontNameList.addItem("字体");
        for(int k=0;k<name.length;k++)
            fontNameList.addItem(name[k]);
        fontSizeList.addItem("大小");
        for(int k=8;k<72;k=k+2)
            fontSizeList.addItem(new Integer(k));
        fontNameList.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource()==fontNameList) {
                    fontName=(String)fontNameList.getSelectedItem();
                    font=new Font(fontName,Font.PLAIN,fontSize);
                }
                else if(e.getSource()==fontSizeList) {
                    Integer m=(Integer)fontSizeList.getSelectedItem();
                    fontSize=m.intValue();
                    font=new Font(fontName,Font.PLAIN,fontSize);
                }
                label.setFont(font);
                label.repaint();
                validate();
            }
        });
        fontSizeList.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource()==fontNameList) {
                    fontName=(String)fontNameList.getSelectedItem();
                    font=new Font(fontName,Font.PLAIN,fontSize);
                }
                else if(e.getSource()==fontSizeList) {
                    Integer m=(Integer)fontSizeList.getSelectedItem();
                    fontSize=m.intValue();
                    font=new Font(fontName,Font.PLAIN,fontSize);
                }
                label.setFont(font);
                label.repaint();
                validate();
            }
        });
        JPanel pNorth=new JPanel();
        pNorth.add(fontNameList);
        pNorth.add(fontSizeList);
        add(pNorth,BorderLayout.NORTH);
        add(label,BorderLayout.CENTER);
        JPanel pSouth=new JPanel();
        pSouth.add(yes);
        pSouth.add(cancel);
        add(pSouth,BorderLayout.SOUTH);
        setBounds(100,100,280,170);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        validate();
    }


    public int getState() {
        return state;
    }
    public Font getFont() {
        return font;
    }
}
