package gui;

import javax.swing.*;

/**
 *
 * gui
 * Swing基础
 * 2018/4/29-21:18
 * 2018
 * Created by wuqiang on 2018/4/29.
 */
public class HelloSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//告诉JFrame当用户执行关闭操作时，应该做些什么。
        frame.setSize(300,100);
        frame.setVisible(true);
    }
}
