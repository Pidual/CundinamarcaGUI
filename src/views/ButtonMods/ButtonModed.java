package views.ButtonMods;

import javax.swing.*;

import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;

public class ButtonModed extends BasicButtonUI {
    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(27, 86, 143, 255));
        g2d.fillRect(0, 0, c.getWidth(), c.getHeight());
        super.paint(g, c);
    }
}
