package exp2;

import java.applet.Applet;
import java.awt.*;
import java.nio.Buffer;

/**
 * Created by vishal on 14-02-2017.
 */

//<applet code = Exp2_2 height = 400 width = 400> </applet>

public class Exp2_2 extends Applet {

    public void init() {

        setLayout(new FlowLayout(FlowLayout.RIGHT));

        Button ok = new Button("Ok");
        add(ok);

        Button can = new Button("Cancel");
        add(can);

        Button exi = new Button("Exit");
        add(exi);
    }
}
