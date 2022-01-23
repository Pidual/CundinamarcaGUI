package views;


import java.io.IOException;


import javax.swing.*;

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

        ImageIcon icon = new ImageIcon("resources/header_govco.png");
        imageLogo = new JLabel(icon);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(0,0,0,400);
        add(imageLogo,gbc);

        ImageIcon myPicture = new ImageIcon("resources/llave4.jpg");
        imageKey = new JLabel(myPicture);
        gbc.gridx = 2;
        gbc.insets = new Insets(0,0,0,0);
        add(imageKey,gbc);

        textLabel = new JLabel("ingreso Intranet Nariño");
        gbc.gridx=3;
        add(textLabel,gbc);
    }
}
