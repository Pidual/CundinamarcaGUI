package views;

import views.ButtonMods.ButtonTextOnImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class FithPanel extends JPanel {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JLabel image;

    public FithPanel(){

            add(setImage(button1,"src/resources/icono1.png","VENTANILLA UNICA" ,null));
            add(setImage(button7,"src/resources/icono7.png","PQRSD",null));
            add(setImage(button2,"src/resources/icono2.png","PLAN DE","DESARROLLO"));
            add(setImage(button3,"src/resources/icono3.png","COVID-19",null));
            add(setImage(button4,"src/resources/icono4.png","IMPUESTOS",null));
            add(setImage(button5,"src/resources/icono5.png","TRANSPARENCIA",null));
            add(setImage(button6,"src/resources/icono6.png","EVENTOS",null));
    }

    private JButton setImage(JButton button, String filepath , String text , String secondLine){
        BufferedImage buttonIcon = null;
        try {
            buttonIcon = ImageIO.read(new File(filepath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        button = new JButton(new ImageIcon(resizer(buttonIcon,100,100)));
        button.setContentAreaFilled(false);
        if(secondLine != null){
            button.setUI(new ButtonTextOnImage(text,secondLine));
        }else{
            button.setUI(new ButtonTextOnImage(text));
        }

        return  button;
    }

    public static BufferedImage resizer(BufferedImage img, int newW, int newH) { //Sacado de la internet not mine
        Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = dimg.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return dimg;
    }


}
