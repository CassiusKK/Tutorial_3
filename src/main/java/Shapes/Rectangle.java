package Shapes;

import java.awt.*;

public class Rectangle extends Shape{
    private int w;
    private int h;

    public Rectangle (Point initPos, Color col, int width, int height){
        super(initPos,col);
        w = width;
        h = height;
    }

    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x,pos.y,w,h);
    }

}
