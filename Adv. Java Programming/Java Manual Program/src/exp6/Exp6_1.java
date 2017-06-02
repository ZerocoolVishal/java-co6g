package exp6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by visha on 14-02-2017.
 */
public class Exp6_1 extends JApplet {

    public void init() {

        Container con = getContentPane();
        con.setLayout(new FlowLayout());

        JRadioButton r = new JRadioButton("RED");
        r.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(r.isSelected()) {
                    con.setBackground(Color.RED);
                }
            }
        });
        con.add(r);

        JRadioButton g = new JRadioButton("GREEN");
        g.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(g.isSelected()) {
                    con.setBackground(Color.GREEN);
                }
            }
        });
        con.add(g);

        JRadioButton b = new JRadioButton("BLUE");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.isSelected()) {
                    con.setBackground(Color.BLUE);
                }
            }
        });
        con.add(b);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r);
        bg.add(g);
        bg.add(b);

    }
}
