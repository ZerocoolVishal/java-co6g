package exp7;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * Created by visha on 14-02-2017.
 */
public class Exp7_2 extends Applet {

    int x = 0;
    int y = 0;

    public void init() {

        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

                x = e.getX();
                y = e.getY();
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {

                showStatus("X : " + e.getX() + " Y : " + e.getY());
            }
        });
    }

    public void paint(Graphics g) {

        g.setColor(Color.RED);
        g.drawLine(0,0,x,y);
        g.setColor(Color.GREEN);
        g.drawLine(0,getHeight(),x,y);
        g.setColor(Color.BLUE);
        g.drawLine(getWidth(),0,x,y);
        g.setColor(Color.DARK_GRAY);
        g.drawLine(getWidth(),getHeight(),x,y);
        g.setColor(Color.CYAN);
        g.fillOval(x-25,y-25,50,50);
    }
}
