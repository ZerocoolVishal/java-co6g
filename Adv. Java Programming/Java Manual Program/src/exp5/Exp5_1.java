package exp5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by vishal on 14-02-2017.
 */
public class Exp5_1 extends JApplet {


    public void init() {

        Container con = getContentPane();
        con.setLayout(new FlowLayout());

        JButton b = new JButton("Change Color");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (new Random().nextInt(3)) {
                    case 0:
                        con.setBackground(Color.RED);
                        break;
                    case 1:
                        con.setBackground(Color.GREEN);
                        break;
                    case 2:
                        con.setBackground(Color.BLUE);
                        break;
                }
            }
        });
        con.add(b);
    }
}
