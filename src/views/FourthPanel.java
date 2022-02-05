package views;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class FourthPanel extends JPanel{ //SlideShowPanel
    
    private JComboBox combobox;
    private JButton button;
    private String [] lista = {"papu","lince","crack","mastodonte","mostruo"};

    public FourthPanel(){
        
        combobox = new JComboBox<>(lista);
        add(combobox);

        button = new JButton("Presiona para mejorar la vida");
        add(button);

        

    }


}
