package com.learning.recursion;

import javax.swing.*;
import java.awt.*;

public class TriangleCarpetFrame extends JFrame {

    public TriangleCarpetFrame() throws HeadlessException {
        super();
        this.setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width - 200, screenSize.height - 200);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new TriangleCarpetPanel());
    }

    public static void main(String[] args) {
        new TriangleCarpetFrame();
    }
}
