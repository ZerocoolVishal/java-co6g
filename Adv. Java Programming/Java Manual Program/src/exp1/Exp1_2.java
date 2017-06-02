package exp1;

import java.awt.*;

/**
 * Created by vishal on 14-02-2017.
 */
public class Exp1_2 extends Frame {

    public static void main(String[] args) {

        Exp1_2 frame = new Exp1_2();
        frame.setTitle("Exp. 1.2");
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));

        Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL);
        sb.setBackground(Color.WHITE);
        frame.add(sb);

        Label l = new Label("Scroll Bar");
        frame.add(l);
    }
}
