package exp11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

/**
 * Created by vishal on 21-03-2017.
 */
public class Exp11 extends JFrame {

    private JEditorPane htmlViewer;

    Exp11() {

        setTitle("Exp 11");
        setSize(630,480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        htmlViewer = new JEditorPane();
        htmlViewer.setEditable(true);
        JScrollPane scrollPane = new JScrollPane(htmlViewer);
        add(scrollPane,BorderLayout.CENTER);

        JTextField urlText = new JTextField();
        urlText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == e.VK_ENTER) {
                    try{
                        htmlViewer.setPage(urlText.getText());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        add(urlText,BorderLayout.SOUTH);

    }

    public static void main(String[] args) throws Exception {

        new Exp11();
    }
}
