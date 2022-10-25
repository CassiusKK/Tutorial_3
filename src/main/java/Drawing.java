import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;
import Shapes.Square;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Drawing extends Canvas {
    private Frame f;
    private Circle circ; //this line is important as you technically make circ a global variable that you can use and instantiate later on
    private Rectangle rect;
    private Square squ;

    public Drawing () {
        setupFrame();
        setupCanvas();

        Point p=new Point(200,200);
        Color c=new Color(0x992266);

        circ=new Circle(p,c,20);

        Point p1=new Point(100,100);
        Color c1=new Color(0x99234);

        rect=new Shapes.Rectangle(p1,c1,100,30);

        Point p2=new Point(200,200);
        Color c2= new Color(0xB4D51A);

        squ=new Shapes.Square(p2,c2,100,100);

    }

    private void setupCanvas() {
        setBackground(Color.WHITE);
        setSize(400, 400);
    }

    private void setupFrame() {
        f = new Frame("My window");
        f.add(this);            // Adds the Canvas (ie this object) to the Frame
        f.setLayout(null);        // Stops the frame from trying to layout contents
        f.setSize(400, 400);        // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void paint(Graphics g){
        rect.draw(g);
        squ.draw(g);
        circ.draw(g);

    }

}

