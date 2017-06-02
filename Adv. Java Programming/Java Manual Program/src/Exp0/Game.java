package Exp0;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by vishal on 19-02-2017.
 */
public class Game extends Applet {

    String message = "";

    int x = 0;
    int y = 0;
    int xx = 0;
    int yy = 0;

    boolean boo = false;

    Color c = Color.BLACK;

    @Override
    public void init() {

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

//                showStatus("Key Pressed : " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {

                message = "Key Pressed";
                repaint();
            }

            @Override
            public void keyReleased(KeyEvent e) {

                message = "Key Released";
                repaint();

            }
        });

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                message = "Mouse Clicked";
                repaint();

            }

            @Override
            public void mousePressed(MouseEvent e) {

                message = "Mouse Pressed";
                x = e.getX();
                y = e.getY();
                xx = e.getX();
                yy = e.getY();
                repaint();

            }

            @Override
            public void mouseReleased(MouseEvent e) {

                message = "Mouse Released";
                xx = e.getX();
                yy = e.getY();
                if (xx == 200 && yy == 200) {
                    c = Color.RED;
                    boo = true;
                    showStatus("It can be connect now");
                }
                repaint();

            }

            @Override
            public void mouseEntered(MouseEvent e) {

                message = "Mouse Entered";
                repaint();

            }

            @Override
            public void mouseExited(MouseEvent e) {

                message = "Mouse Exited";
                repaint();

            }
        });

        TextField tf = new TextField();
        tf.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                showStatus("Text Value Changed");

                if (boo == true) {
                    message = tf.getText();
                    repaint();
                }
            }
        });
        add(tf);

        Button b = new Button("Button");
        b.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                showStatus("Focus Gained");
            }

            @Override
            public void focusLost(FocusEvent e) {

                showStatus("Focus Lost");
            }
        });
        add(b);

        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

                xx = e.getX();
                yy = e.getY();
                if (xx > 200 && yy > 200) {
                    c = Color.RED;
                    boo = true;
                    showStatus("It can be connect now");
                }
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {


            }
        });

        CheckboxGroup g = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male", g, true);
        add(c1);
        Checkbox c2 = new Checkbox("Female", g, false);
        add(c2);
    }

    @Override
    public void paint(Graphics g) {

        g.setColor(Color.BLACK);
        g.drawString(message,200,200);
        g.setColor(c);
        g.drawLine(x,y,xx,yy);
    }
}
