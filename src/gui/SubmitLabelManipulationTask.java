package gui;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * gui
 * Swing基础
 *
 * M:使用Swing事件分发线程提交要执行的任务。
 * 2018/4/29-21:35
 * 2018
 * Created by wuqiang on 2018/4/29.
 */
public class SubmitLabelManipulationTask {

    public static void main(String[] args) throws InterruptedException {
        JFrame frame=new JFrame("Hello Swing");
        JLabel label=new JLabel("A lable!");

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//告诉JFrame当用户执行关闭操作时，应该做些什么。
        frame.setSize(300,100);
        frame.setVisible(true);

        TimeUnit.SECONDS.sleep(1);//睡1s

        SwingUtilities.invokeLater(new Runnable() {
            @Override public void run() {
                label.setText("Hey! This is Different!");//这个是操作 lable的方法
            }
        });
    }
}
