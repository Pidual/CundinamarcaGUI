package views;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;


/**
 * Se crea la vista
 */
public class GraphicalUserInterface extends JFrame{
    
    private HeaderPanel headP; 
    private SecondPanel secondP;
    private ThirdPanel thirdP;

    public GraphicalUserInterface() throws IOException {
        super("Goal Tracker Calendario");  
        initComponents();  
        this.setSize(1100,900);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        ImageIcon logo = new ImageIcon("resources/LogoCundinamarca.png");
        this.setIconImage(logo.getImage());
    }

    private void initComponents() throws IOException{
        this.setLayout(new GridLayout(7,1)); //Numero de filas y columnas
        headP = new HeaderPanel();
        headP.setBackground(new Color(51,102,204,255));
        headP.setSize(getPreferredSize());
        add(headP);

        
        secondP = new SecondPanel();
        secondP.setPreferredSize(getPreferredSize());
        secondP.setBackground(new Color(255,255,255));
        add(secondP);

        thirdP = new ThirdPanel();
        thirdP.setPreferredSize(getPreferredSize());
        thirdP.setBackground(new Color(27,86,143,255));
        add(thirdP);
    }

    



}
