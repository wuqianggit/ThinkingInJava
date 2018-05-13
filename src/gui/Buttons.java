package gui;

import utils.SwingConsole;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;

/**
 *
 * gui
 * 按钮
 *
 * 2018/4/30-10:15
 * 2018
 * Created by wuqiang on 2018/4/30.
 */
public class Buttons extends JFrame {

    private JButton jb=new JButton("JButton ");

    private AbstractButton up=new BasicArrowButton(BasicArrowButton.NORTH),
            down=new BasicArrowButton(BasicArrowButton.SOUTH),
            right=new BasicArrowButton(BasicArrowButton.EAST),
            left=new BasicArrowButton(BasicArrowButton.WEST);
    private ButtonGroup bg=new ButtonGroup();
    public Buttons() throws HeadlessException {
        setLayout(new FlowLayout());

        add(jb);
        add(new JToggleButton("JToggleButton"));
        add(new JCheckBox("JCheckBox"));
        /**
         * 注意：如果单选按钮不放在同一个按钮组中，那么所有的单选按钮，都可以选中
         *
         * 按钮组不是一个组件，只是逻辑上的一个东西。
         */
        JRadioButton rb1=new JRadioButton("rb1");
        JRadioButton rb2=new JRadioButton("rb2");
        bg.add(rb1);
        bg.add(rb2);
        add(rb1);
        add(rb2);

        JPanel jp=new JPanel();
        jp.setBorder(new TitledBorder("Directions"));
        jp.add(up);
        jp.add(down);
        jp.add(right);
        jp.add(left);


        add(jp);
    }

    public static void main(String[] args) {
        SwingConsole.run(new Buttons());
    }
}
