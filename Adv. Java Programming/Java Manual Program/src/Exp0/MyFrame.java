package Exp0;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by vishal on 19-02-2017.
 */
public class MyFrame extends Frame {

    MyFrame() {

        setTitle("MyFrame");
        setSize(300,300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {

        MyFrame f = new MyFrame();
    }
}
