package exp10;

import javax.swing.*;
import java.awt.*;
import java.net.InetAddress;

/**
 * Created by vishal on 21-03-2017.
 */
public class Exp10 extends JFrame {

    Exp10() {

        setTitle("Exp 10");
        setSize(320,240);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        try {

            InetAddress add = InetAddress.getLocalHost();

            JLabel ipAddressLable = new JLabel("Local Host Address : " + add.getHostAddress());
            add(ipAddressLable);

            JLabel nameLabe = new JLabel("Local Host Name : " + add.getHostName());
            add(nameLabe);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new Exp10();
    }
}
