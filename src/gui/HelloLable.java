package gui;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * gui
 * Swing 基础
 * 2018/4/29-21:23
 * 2018
 * Created by wuqiang on 2018/4/29.
 */
public class HelloLable {

    public static void main(String[] args) throws InterruptedException {
        JFrame frame=new JFrame("Hello Swing");
        JLabel label=new JLabel("A lable!");

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//告诉JFrame当用户执行关闭操作时，应该做些什么。
        frame.setSize(300,100);
        frame.setVisible(true);

        TimeUnit.SECONDS.sleep(1);

        label.setText("Hey! This is Different!");
        /**
         * 直接对GUI组件编写代码，不是一个很好的想法。
         *
         * Swing有它自己的专用的线程来接收UI事件，并更新屏幕。
         *
         * 如果 从其它线程对屏幕进行操作，很可能会产生冲突，或者死锁。
         *
         * 应该使用Swing事件分发线程，提交要执行的任务。
         *
         */
    }
}
