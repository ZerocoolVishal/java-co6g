package exp3;

import java.awt.*;

/**
 * Created by vishal on 14-02-2017.
 */
public class Exp3_1 extends Frame {

    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setTitle("Exp. 3.1");
        frame.setSize(400,400);
        frame.setVisible(true);

        MenuBar mb = new MenuBar();
        frame.setMenuBar(mb);

        Menu menu = new Menu("Menu");
        mb.add(menu);

        CheckboxMenuItem pic = new CheckboxMenuItem("Picture",true);
        menu.add(pic);

        Menu home = new Menu("Home");
        mb.add(home);

        MenuItem paste = new MenuItem("Paste");
        home.add(paste);

    }
}
