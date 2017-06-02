package exp4;

import exp1.Exp1_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by vishal on 14-02-2017.
 */
public class Exp4_1 extends JFrame {


    Exp4_1() {

        setTitle("Changing Color");
        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] colors = {"Red", "Green", "Blue"};

        JComboBox cb = new JComboBox(colors);
        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                switch (cb.getSelectedIndex()) {
                    case 0:
                        getContentPane().setBackground(Color.RED);
                        break;
                    case 1:
                        getContentPane().setBackground(Color.GREEN);
                        break;
                    case 2:
                        getContentPane().setBackground(Color.BLUE);
                        break;
                }
            }
        });
        add(cb);
    }

    public static void main(String[] args) {

        Exp4_1 frame = new Exp4_1();

    }
}
