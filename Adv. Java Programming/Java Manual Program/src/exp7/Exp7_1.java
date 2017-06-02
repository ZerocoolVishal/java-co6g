package exp7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by visha on 14-02-2017.
 */
public class Exp7_1 extends JApplet {

    JTextField ans;

    public void init() {

        Container con = getContentPane();
        con.setLayout(new GridLayout(2,2));

        JTextField num1 = new JTextField();
        con.add(num1);

        JTextField num2 = new JTextField();
        con.add(num2);

        JButton but = new JButton("Largest");
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int n1 = Integer.parseInt(num1.getText());
                int n2 = Integer.parseInt(num2.getText());
                if(n1 > n2) {
                    ans.setText("Larger number is. " + num1.getText());
                } else {
                    ans.setText("Larger number is. " + num2.getText());
                }
            }
        });
        con.add(but);

        ans = new JTextField();
        ans.setEditable(false);
        con.add(ans);
    }
}
