package views;

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

    public GraphicalUserInterface() throws IOException {
        super("Goal Tracker Calendario");  
        initComponents();  
        this.setSize(800, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }

    private void initComponents() throws IOException{
        this.setLayout(new GridLayout(5,1));
        headP = new HeaderPanel();
        headP.setBackground(new Color(51,102,204,255));
        headP.setSize(getPreferredSize());
        add(headP);

        
        secondP = new SecondPanel();
        add(secondP);
        

    }



}
