package gui;

import utils.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * gui
 * 捕获事件
 *
 * M:将什么时候做和做什么事关联起来。
 * 2018/4/29-22:22
 * 2018
 * Created by wuqiang on 2018/4/29.
 */
public class Button2 extends JFrame {

    private JButton b1 = new JButton("Button 1"),
            b2 = new JButton("Button 2");

    private JTextField textField=new JTextField(10);//文本区域

    public Button2() throws HeadlessException {
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(((JButton)e.getSource()).getText());
            }
        });
        setLayout(new FlowLayout());
        add(b1);
        add(b2);

        add(textField);
    }

    public static void main(String[] args) {
        SwingConsole.run(new Button2());
    }
}
