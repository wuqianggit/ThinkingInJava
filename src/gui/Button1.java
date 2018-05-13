package gui;

import utils.SwingConsole;

import javax.swing.*;
import java.awt.*;

/**
 *
 * gui
 * 创建按钮
 * 2018/4/29-21:54
 * 2018
 * Created by wuqiang on 2018/4/29.
 */
public class Button1 extends JFrame {

    private JButton b1 = new JButton("button 1"),
            b2 = new JButton("button2");

    public Button1() throws HeadlessException {
        /**
         * 在向JFrame添加任何组件之前，先给出 该Frame的布局管理器。
         * 布局管理器是，frame用来隐式地决定控件在窗体上的位置的工具。
         * 缺省布局管理器是BorderLayout，它的默认行为是：每加入一个控件，将其完全覆盖其它的控件。
         * FlowLayout布局，使得控件可以在窗体上从左到右，从上到下，连续均匀分布。
         * （关于布局管理器，后面再学）
         */
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
    }

    public static void main(String[] args) {
        SwingConsole.run(new Button1());
    }
}
