package views.ButtonMods;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;

public class RoundButton extends BasicButtonUI {

    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(27, 86, 143, 255));
        g2d.fillArc(0,0,c.getWidth(),c.getHeight(),0,360);
        super.paint(g, c);
    }
}
