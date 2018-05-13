package gui;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * gui
 * Swing基础
 *
 * M：初始化JFrame，也要交给分发线程
 * 2018/4/29-21:40
 * 2018
 * Created by wuqiang on 2018/4/29.
 */
public class SubmitSwingProgram extends JFrame{

    JLabel label;
    public SubmitSwingProgram() throws HeadlessException {
        super("Hello Swing");
        label=new JLabel("A label");
        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//告诉JFrame当用户执行关闭操作时，应该做些什么。
        setSize(300,100);
        setVisible(true);
    }

    static SubmitSwingProgram ssp;

    public static void main(String[] args) throws InterruptedException {
        SwingUtilities.invokeLater(new Runnable() {
            @Override public void run() {
                ssp=new SubmitSwingProgram();
            }
        });

        TimeUnit.SECONDS.sleep(1);;

        SwingUtilities.invokeLater(new Runnable() {
            @Override public void run() {
                ssp.label.setText("Hey! This is Different!");//这个是操作 lable的方法);
            }
        });
    }
}
