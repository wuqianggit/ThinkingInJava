package gui.mine;

import utils.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * gui.mine
 * Encryption加密一个文件
 *
 * 2018/4/30-15:53
 * 2018
 * Created by wuqiang on 2018/4/30.
 */
public class Encryption extends JFrame {
    private static final String SOURCE_BTN = "选择源";
    private static final String TARGET_BTN = "选择目标";
    JPanel inputPanel = new JPanel();//输入的文件夹名称
    JPanel outputPanel = new JPanel();//输出的文件夹名称

    JButton sourceFileBtn = new JButton(SOURCE_BTN);
    JButton targetFileBtn = new JButton(TARGET_BTN);

    JTextField sourceFileDir = new JTextField(30);//源文件路径
    JTextField targetFileDir = new JTextField(30);//目标文件路径

    JButton encryptBtn = new JButton("加密/解密");//加密按钮
    JTextField textField = new JTextField();

    public Encryption() {
        setLayout(new GridLayout(4, 1));

        inputPanel.setLayout(new FlowLayout());
        sourceFileBtn.addActionListener(new OpenFileListener());//注册监听事件
        inputPanel.add(sourceFileBtn);
        inputPanel.add(sourceFileDir);
        add(inputPanel);

        outputPanel.setLayout(new FlowLayout());
        targetFileBtn.addActionListener(new OpenFileListener());
        outputPanel.add(targetFileBtn);
        outputPanel.add(targetFileDir);
        add(outputPanel);

        add(encryptBtn);
        add(textField);
    }

    /**
     * 选择文件的监听事件
     */
    class OpenFileListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser c=new JFileChooser();
            int rVal=c.showOpenDialog(Encryption.this);
            switch (e.getActionCommand()) {
            case SOURCE_BTN: {//点击的是，选择源的按钮
                if(rVal==JFileChooser.APPROVE_OPTION){
                    sourceFileDir.setText(c.getCurrentDirectory().toString());
                }
                if(rVal==JFileChooser.CANCEL_OPTION){
                    sourceFileDir.setText("");
                }
                break;
            }
            case TARGET_BTN: {//点击的是，选择目标的按钮
                if(rVal==JFileChooser.APPROVE_OPTION){
                    targetFileDir.setText(c.getCurrentDirectory().toString());
                }
                if(rVal==JFileChooser.CANCEL_OPTION){
                    targetFileDir.setText("");
                }
                break;
            }
            }
        }
    }

    public static void main(String[] args) {
        //显示页面
        SwingConsole.run(new Encryption(), 500, 200);
    }
}
