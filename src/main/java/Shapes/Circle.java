package Shapes;

import java.awt.*;
/**
 *  The Shapes.Circle class encapsulates the information describing a circle and can draw it in
 * an AWT Graphics object using AWT library methods
 * */
public class Circle extends Shape {
    private int rad;	// Fields

    public Circle(Point initPos, Color col, int radius){
        super(initPos, col); // The constructor
        rad=radius;	// Initialize the fields of the object
    }

    public void draw(Graphics g){
        g.setColor(col);
        g.fillOval(pos.x, pos.y, rad, rad);
    }

}

