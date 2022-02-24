package views.ButtonMods;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.util.Objects;

public class ButtonTextOnImage extends BasicButtonUI {

    String text;
    String textSecondLine = "";

    public ButtonTextOnImage(String text){
        this.text = text;
    }

    public ButtonTextOnImage(String text, String textSecondLine){
        this.text = text;
        this.textSecondLine = textSecondLine;
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawString(text,10,95);
        if(!Objects.equals(textSecondLine, "")){
            g2d.drawString(textSecondLine,10,105);
        }
        super.paint(g, c);
    }
}
