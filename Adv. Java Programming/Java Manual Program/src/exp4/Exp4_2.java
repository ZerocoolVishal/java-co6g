package exp4;

import javax.swing.*;
import java.awt.*;

/**
 * Created by vishal on 14-02-2017.
 */
public class Exp4_2 extends JFrame {

    Exp4_2() {

        setTitle("Login Page");
        setSize(400,150);
        setLayout(new FlowLayout());
        setVisible(true);
        setResizable(true);
        setLayout(new GridLayout(3,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel id = new JLabel("Login ID");
        add(id);

        JTextField idt = new JTextField();
        add(idt);

        JLabel pss = new JLabel("Password");
        add(pss);

        JPasswordField pst = new JPasswordField();
        add(pst);

        JButton login = new JButton("Login");
        add(login);

        JButton cancel = new JButton("Cancel");
        add(cancel);
    }

    public static void main(String[] args) {

        Exp4_2 frame = new Exp4_2();
    }
}
