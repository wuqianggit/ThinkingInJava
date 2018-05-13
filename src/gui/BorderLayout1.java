package gui;

import utils.SwingConsole;

import javax.swing.*;
import java.awt.*;

/**
 *
 * gui
 * Borderlayout
 * M:使用布局
 * 2018/4/30-9:09
 * 2018
 * Created by wuqiang on 2018/4/30.
 */
public class BorderLayout1 extends JFrame {

    public BorderLayout1() throws HeadlessException {
        add(BorderLayout.NORTH,new JButton("North"));
        add(BorderLayout.SOUTH,new JButton("SOUTH"));
        add(BorderLayout.EAST,new JButton("EAST"));
        add(BorderLayout.WEST,new JButton("WEST"));
        add(BorderLayout.CENTER,new JButton("CENTER"));
    }

    public static void main(String[] args) {
        SwingConsole.run(new BorderLayout1());
    }
}
