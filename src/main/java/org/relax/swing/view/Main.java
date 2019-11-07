package org.relax.swing.view;

import javax.swing.*;

/**
 * TODO
 *
 * @author caodahuan
 * @version 2019/11/7
 */
public class Main {

    public static void main(String[] args) {
        JFrame jf = new JFrame("demo");
        jf.setSize(450,450);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton btn = new JButton("按钮");
        panel.add(btn);

        jf.setContentPane(panel);

        jf.setVisible(true);
    }


}
