package views;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class HeaderPanel extends JPanel{
    
    private JLabel imageLogo;
    private JLabel imageKey;
    private JLabel textLabel;
    
    public HeaderPanel() throws IOException{
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        BufferedImage myPicture = ImageIO.read(new File("resources/header_govco.png"));
        imageLogo = new JLabel(new ImageIcon(myPicture));
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0,0,0,400);
        
        add(imageLogo,gbc);

        myPicture = ImageIO.read(new File("resources/llave4.jpg"));
        imageKey = new JLabel(new ImageIcon(myPicture));
        gbc.gridx = 2;
        gbc.insets = new Insets(0,0,0,0);
        add(imageKey,gbc);

        textLabel = new JLabel("ingreso Intranet Nariño");
        gbc.gridx=3;
        add(textLabel,gbc);
    }
}
