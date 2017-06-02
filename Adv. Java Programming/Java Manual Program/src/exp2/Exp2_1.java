package exp2;

import java.awt.*;

/**
 * Created by vishal on 14-02-2017.
 */
public class Exp2_1 extends Frame {

    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setTitle("Exp. 2.1");
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,3));

        Button b1 = new Button("1");
        frame.add(b1);

        Button b2 = new Button("2");
        frame.add(b2);

        Button b3 = new Button("3");
        frame.add(b3);

        Button b4 = new Button("4");
        frame.add(b4);

        Button b5 = new Button("5");
        frame.add(b5);

        Button b6 = new Button("6");
        frame.add(b6);

    }
}
