package ru.mirea.lab5;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.*;
import java.awt.geom.*;


public class Draw extends JFrame {
    public Draw() {
        setSize(500, 300);
        setVisible(true);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Shape rectangle = new Rectangle2D.Double(3, 3, 500 ,300);
        Shape line = new Line2D.Double(3, 3, 500, 300);
        Shape circle = new Ellipse2D.Double(100, 100, 100, 100);
        Shape ellips = new Ellipse2D.Double(200, 200, 120, 80);
        Shape roundRect = new RoundRectangle2D.Double(20, 20, 250, 250, 100, 100);

        g2.setColor(Color.red);
        g2.fill(rectangle);
        g2.setColor(Color.PINK);
        g2.fill(roundRect);
        g2.setColor(Color.green);
        g2.fill(circle);
        g2.setColor(Color.yellow);
        g2.fill(ellips);
        g2.setColor(Color.BLUE);
        g2.draw(line);

    }
}
