package exp1;

import java.applet.Applet;
import java.awt.*;

//<applet code = Exp1_1 height = 400 width = 400> </applet>

public class Exp1_1 extends Applet {

    public void init() {

        Checkbox cb = new Checkbox("Apple");
        add(cb);
        Checkbox cb2 = new Checkbox("Microsoft",true);
        add(cb2);

        CheckboxGroup cbg = new CheckboxGroup();

        Checkbox rb = new Checkbox("Desktop",cbg,true);
        add(rb);
        Checkbox rb2 = new Checkbox("Laptop",cbg,false);
        add(rb2);

    }
}
