package views;

import javax.swing.*;
import java.awt.*;

public class ThePanelOfPanels extends JPanel {
    private HeaderPanel headP;
    private SecondPanel secondP;
    private ThirdPanel thirdP;
    private FourthPanel fourthPanel;
    private FithPanel fithPanel;
    private SixthPanel sixthPanel;

    public ThePanelOfPanels(){
        initComponents();
    }

    private  void initComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        this.setSize(1200, 900);

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

        gbc.gridy = 4;
        fithPanel = new FithPanel();
        add(fithPanel,gbc);

        gbc.gridy = 5;
        sixthPanel = new SixthPanel();
        add(sixthPanel,gbc);

    }
}
