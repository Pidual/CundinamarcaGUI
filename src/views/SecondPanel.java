package views;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;

public class SecondPanel extends JPanel{
    
    private JLabel imageLogo;
    private JTextField searchBar;
    private JLabel lupaLogo;
    
    public SecondPanel() throws IOException{
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        BufferedImage myPicture = ImageIO.read(new File("src/resources/logo-gobernacion.jpg"));
        imageLogo = new JLabel(new ImageIcon(myPicture));
        gbc.insets = new Insets(0,0,0,40);
        add(imageLogo,gbc);

        
        searchBar = new JTextField(20);
        searchBar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        gbc.gridx = 1;
        add(searchBar,gbc);

        gbc.gridx = 2;
        myPicture = ImageIO.read(new File("src/resources/lupa.png"));
        lupaLogo = new JLabel(new ImageIcon(myPicture));
        add(lupaLogo,gbc);

    }
}
