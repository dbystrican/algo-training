package com.learning.recursion;

import javax.swing.*;
import java.awt.*;

public class TriangleCarpetPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        drawCarpet(20, 100, 100, 60, g);
    }

    private int drawCarpet(int count, int startx, int starty, int triangleSide, Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        if (count > 0) {
            //draws top line of triangles line
            graphics2D.drawLine(startx,
                    starty,
                    startx + count * triangleSide,
                    starty);
            //make triangles beneath this line by compleating its sides
            fillWithTriangles(count * 2,
                    startx, starty,
                    triangleSide,
                    graphics2D);
            return drawCarpet(count - 1,
                    startx + triangleSide / 2,
                    starty + triangleSide / 2,
                    triangleSide,
                    graphics);
        } else return 0;
    }

    private int fillWithTriangles(int count, int startx, int starty, int triangleSide, Graphics2D graphics) {
        if (count > 0) {
            //draws line like this \
            if (count % 2 == 0) {
                graphics.drawLine(startx, starty, startx + triangleSide / 2, starty + triangleSide / 2);
                return fillWithTriangles(count - 1,
                        startx + triangleSide / 2,
                        starty + triangleSide / 2,
                        triangleSide,
                        graphics);
            } else {
                //draws line like this /
                graphics.drawLine(startx, starty, startx + triangleSide / 2, starty - triangleSide / 2);
                return fillWithTriangles(count - 1,
                        startx + triangleSide / 2,
                        starty - triangleSide / 2,
                        triangleSide,
                        graphics);
            }
        } else return 0;
    }

}
