package Shapes;

import java.awt.*;

public abstract class Shape {
    protected Point pos;    // AWT class Point
    protected Color col;     // AWT class Color

    public Shape(Point initPos, Color col) {
        pos = initPos;
        this.col = col;
    }

    public abstract void draw(Graphics g);    // A method that draws the object in g
}
