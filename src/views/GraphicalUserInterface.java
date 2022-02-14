package views;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

/**
 * Se crea la vista
 */
public class GraphicalUserInterface extends JFrame {

    private HeaderPanel headP;
    private SecondPanel secondP;
    private ThirdPanel thirdP;
    private FourthPanel fourthPanel;

    public GraphicalUserInterface() throws IOException {
        super("GOBERNACION DE CUNDINAMARCA");
        this.setSize(1200, 900);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        initComponents();
        this.setVisible(true);
        ImageIcon logo = new ImageIcon("src/resources/LogoCundinamarca.png");
        this.setIconImage(logo.getImage());
    }

    private void initComponents() throws IOException {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.PAGE_START;
        gbc.fill = GridBagConstraints.HORIZONTAL; //Hace que los elementos se estiren a los lados bien gucci
        gbc.gridy = 0;
        headP = new HeaderPanel();
        headP.setBackground(new Color(51, 102, 204, 255));

        add(headP,gbc);

        gbc.gridy = 1;
        secondP = new SecondPanel();
        secondP.setBackground(new Color(255, 255, 255));
        add(secondP,gbc);

        gbc.gridy = 2;
        thirdP = new ThirdPanel();
        thirdP.setBackground(new Color(27, 86, 143, 255));
        add(thirdP,gbc);

        gbc.gridy = 3;
        fourthPanel = new FourthPanel();
        fourthPanel.setBackground(Color.WHITE);
        add(fourthPanel,gbc);

    }


}
