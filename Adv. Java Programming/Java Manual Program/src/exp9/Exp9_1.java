package exp9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * Created by vishal on 01-03-2017.
 */

public class Exp9_1 extends JApplet {

    int x = 0;
    int y = 0;
    String point = "";

    @Override
    public void init() {

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {

                x = e.getX();
                y = e.getY();
                point = "X : " + e.getX() + ", Y : " + e.getY();
                showStatus("Moving mouse at : " + point);
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {

        g.setColor(Color.WHITE);
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(Color.black);
        g.drawLine(0,0,x,y);
        g.setColor(Color.black);
        g.drawLine(getWidth(),0,x,y);
        g.setFont(new Font("Arial",Font.PLAIN,40));
        g.drawString(point,getWidth()/2,getHeight()/2);

    }
}
