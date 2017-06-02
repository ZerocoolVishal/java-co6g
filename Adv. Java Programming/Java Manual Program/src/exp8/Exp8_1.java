package exp8; /**
 * Created by visha on 06-02-2017.
 */

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exp8_1 extends Applet {

    @Override
    public void init() {

        setLayout(new GridLayout(0,2));

        JLabel num1 = new JLabel("Enter Number 1 ");
        add(num1);
        JTextField numberInput1 = new JTextField();
        numberInput1.setFont(new Font("Arial",Font.PLAIN,50));
        add(numberInput1);

        JLabel ans = new JLabel("Square of number is ");
        add(ans);
        TextField ansOutput = new TextField();
        ansOutput.setFont(new Font("Arial",Font.PLAIN,50));
        ansOutput.setEditable(false);
        add(ansOutput);

        JButton addButton = new JButton("Square");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numberInput1.getText());
                int ans = num1 * num1;
                ansOutput.setText(Integer.toString(ans));
            }
        });
        add(addButton);
    }
}
