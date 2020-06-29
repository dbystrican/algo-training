package com.learning.recursion;

import javax.swing.*;
import java.awt.*;

public class TriangleCarpet {
    public TriangleCarpet() {
        JFrame frame = new JFrame("JFrame Example");
        frame.setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width-200, screenSize.height-200);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
