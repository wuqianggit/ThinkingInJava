package gui;

import utils.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * gui
 * 文件对话框
 *
 * M:用于选择文件
 * 2018/4/30-16:18
 * 2018
 * Created by wuqiang on 2018/4/30.
 */
public class FileChooserTest extends JFrame {

    private JTextField filName=new JTextField(),
            dir=new JTextField();

    private JButton open=new JButton("Open"),
            save=new JButton("Save");

    public FileChooserTest() throws HeadlessException {
        JPanel p=new JPanel();
        open.addActionListener(new OpenL());
        p.add(open);
        save.addActionListener(new SaveL());
        p.add(save);

        add(p,BorderLayout.SOUTH);
        dir.setEditable(false);//不允许编辑
        filName.setEditable(false);

        p=new JPanel();
        p.setLayout(new GridLayout(2,1));
        p.add(filName);
        p.add(dir);

        add(p,BorderLayout.NORTH);
    }

    /**
     * 打开
     */
    class OpenL implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser c=new JFileChooser();

            int rVal=c.showOpenDialog(FileChooserTest.this);
            if(rVal==JFileChooser.APPROVE_OPTION){
                filName.setText(c.getSelectedFile().getName());
                dir.setText(c.getCurrentDirectory().toString());
            }
            if(rVal==JFileChooser.CANCEL_OPTION){
                filName.setText("You pressed Cancel");
                dir.setText("");
            }
        }
    }

    /**
     * 保存
     */
    class SaveL implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser c=new JFileChooser();
            //
            int rVal=c.showSaveDialog(FileChooserTest.this);
            if(rVal==JFileChooser.APPROVE_OPTION){
                filName.setText(c.getSelectedFile().getName());
                dir.setText(c.getCurrentDirectory().toString());
            }
            if(rVal==JFileChooser.CANCEL_OPTION){
                filName.setText("You pressed Cancel");
                dir.setText("");
            }
        }
    }

    public static void main(String[] args) {
        SwingConsole.run(new FileChooserTest(),250,150);
    }
}
