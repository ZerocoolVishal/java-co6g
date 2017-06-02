package exp12;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by vishal on 21-03-2017.
 */
public class Exp12 extends JFrame {

    Exp12(){

        setTitle("Exp 11");
        setSize(320,240);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        String url = JOptionPane.showInputDialog(null,"Enter URL");
        System.out.println(url);

        try {

            URL u = new URL(url);

            JLabel protocol = new JLabel("Protocol : " + u.getProtocol());
            add(protocol);

            JLabel port = new JLabel("Port : " + u.getPort());
            add(port);

            JLabel host = new JLabel("Host : " + u.getHost());
            add(host);

            JLabel file = new JLabel("File : " + u.getFile());
            add(file);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new Exp12();
    }
}
