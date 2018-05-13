package gui;

import utils.SwingConsole;

import javax.swing.*;
import java.awt.*;

/**
 *
 * gui
 * GridLayout
 *
 * 2018/4/30-9:23
 * 2018
 * Created by wuqiang on 2018/4/30.
 */
public class GridLayout1 extends JFrame {
    public GridLayout1() {
        setLayout(new GridLayout(7,3));//相当于创建了一个7行3列的表格。

        for(int i=0;i<20;i++){
            add(new JButton("BUtton"+i));
        }
    }
    public static void main(String[] args) {
        SwingConsole.run(new GridLayout1());
    }
}
