package exp3;

import java.awt.*;

/**
 * Created by vishal on 14-02-2017.
 */
public class Exp3_2 extends Frame {

    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setTitle("Exp. 3.2");
        frame.setSize(400,400);
        frame.setVisible(true);

        MenuBar mb = new MenuBar();
        frame.setMenuBar(mb);

        Menu pageLayout = new Menu("PageLayout");
        mb.add(pageLayout);

        Menu referances = new Menu("Referances");
        mb.add(referances);

        Menu mailing = new Menu("Mailing");
        mailing.setEnabled(false);
        mb.add(mailing);

    }
}
