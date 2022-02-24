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

public class SecondPanel extends JPanel {

    private JLabel imageLogo;
    private JTextField searchBar;

    public SecondPanel(){
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        BufferedImage myPicture = null;

        try {
            myPicture = ImageIO.read(new File("src/resources/logo-gobernacion.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        imageLogo = new JLabel(new ImageIcon(myPicture));
        gbc.insets = new Insets(0, 0, 0, 40);
        add(imageLogo, gbc);

        gbc.weightx = 0.25;
        gbc.gridx = 1;
        searchBar = new JTextField(20);
        searchBar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(searchBar, gbc);
    }
}
