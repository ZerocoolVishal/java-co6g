package exp8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 * Created by visha on 06-02-2017.
 */
public class Exp8_2 extends Applet {

    Scrollbar s1,s2,s3;
    int r = 0,b = 0,g = 0;

    @Override
    public void init() {

        setLayout(new BorderLayout());

        setBackground(new Color(r,b,g));

        s1 = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
        s1.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                r = s1.getValue();
                setBackground(new Color(r,b,g));
            }
        });
        s1.setBackground(Color.RED);
        add(s1,BorderLayout.NORTH);

        s2 = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
        s2.setBackground(Color.GREEN);
        s2.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                b = s2.getValue();
                setBackground(new Color(r,b,g));
            }
        });
        add(s2,BorderLayout.SOUTH);

        s3 = new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);
        s3.setBackground(Color.BLUE);
        s3.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                g = s3.getValue();
                setBackground(new Color(r,b,g));
            }
        });
        add(s3,BorderLayout.EAST);
    }
}
