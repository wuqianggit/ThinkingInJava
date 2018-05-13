package gui;

import utils.SwingConsole;

import javax.swing.*;
import java.awt.*;

/**
 *
 * gui
 * FlowLayout
 *
 *
 * 2018/4/30-9:16
 * 2018
 * Created by wuqiang on 2018/4/30.
 */
public class FlowLayout1 extends JFrame {
    public FlowLayout1() throws HeadlessException {
        setLayout(new FlowLayout());
        for(int i=0;i<20;i++){
            add(new JButton("Button"+i));
        }
    }
    public static void main(String[] args) {
        SwingConsole.run(new FlowLayout1());
    }
}
