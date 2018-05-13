package utils;

import javax.swing.*;

/**
 *
 * utils
 * 一个显示框架
 *
 * M:显示Frame的公共方法
 * 2018/4/29-21:46
 * 2018
 * Created by wuqiang on 2018/4/29.
 */
public class SwingConsole {
    public static void run(final JFrame frame,final int width,final int height){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.setTitle(frame.getClass().getName());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(width,height);
                frame.setVisible(true);
            }
        });
    }

    /**
     * 使用默认的 宽和高
     * @param frame
     */
    public static void run(JFrame frame){
        run(frame,300,300);
    }
}
