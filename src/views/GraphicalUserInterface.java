package views;

import javax.swing.*;
import java.io.IOException;

/**
 * Se crea la vista
 */
public class GraphicalUserInterface extends JFrame {

    private JScrollPane jScrollPane;
    private ThePanelOfPanels thePanelOfPanels;


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
        thePanelOfPanels = new ThePanelOfPanels();
        jScrollPane = new JScrollPane(thePanelOfPanels);
        jScrollPane.getVerticalScrollBar().setUnitIncrement(16); //Hace que el scroll sea mas rapidongo
        add(jScrollPane);
    }


}
