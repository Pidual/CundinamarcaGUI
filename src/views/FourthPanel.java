package views;

import views.ButtonMods.RoundButton;


import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;

public class FourthPanel extends JPanel implements ActionListener { //SlideShowPanel

    private JLabel pic;
    private JButton leftButton;
    private JButton rigthButton;
    private Timer tm;
    private JLabel textLabel;
    private JPanel showCaserPanel;
    private int x = 0;
    String[][] list = {{"src/resources/Foto1.jpg", "<html>480 estudiantes de Tena se beneficiarán <br> con la nueva sede de la Institución Educativa <br> Departamental Fidel Cano </>foo</html> "},
            {"src/resources/Foto2.jpg","<html>Gobernación invertirá $16.000 millones<br> para garantizar el servicio <br>de gas natural en áreas rurales </html>"},
            {"src/resources/Foto3.jpg","<html>Más de 2600 dignatarios de Tres <br>provincias tomaron posesión<br>en las Juntas de Acción Comunal</html>"},
            {"src/resources/Foto4.jpg","<html>Dignatarios de tres provincias toman<br> posesión en Juntas de Acción Comunal</html>\n"}};


    public FourthPanel() throws IOException {

        pic = new JLabel();
        textLabel = new JLabel();
        pic.setBounds(40, 30, 700, 300);
        SetImageSize(x);
        tm = new Timer(3000, this);
        tm.setActionCommand("timer");

        leftButton = new JButton("<");
        leftButton.setActionCommand("leftButton");
        leftButton.addActionListener(this); //this this this
        leftButton.setUI(new RoundButton());
        leftButton.setBorderPainted(false);
        add(leftButton);

        showCaserPanel = new JPanel();
        showCaserPanel.setBackground(new Color(247,184,0,255));
        showCaserPanel.add(textLabel);
        showCaserPanel.add(pic);
        add(showCaserPanel);


        rigthButton = new JButton(">");
        rigthButton.setActionCommand("rightButton");
        rigthButton.addActionListener(this);
        rigthButton.setUI(new RoundButton());
        rigthButton.setBorderPainted(false);
        add(rigthButton);
        tm.start();

    }

    public void SetImageSize(int i) {
        ImageIcon icon = new ImageIcon(list[i][0]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
        textLabel.setText(list[i][1]); //Pone el texto del label
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "timer":
                SetImageSize(x);
                x ++;
                if (x >= list.length){
                    x = 0;
                }
                break;

            case "rightButton":
                x++;
                if (x >= list.length){
                    x=0;
                }
                tm.restart();
                SetImageSize( x );
                break;

            case "leftButton":
                x--;
                if (x < 0){
                    x=3;
                }
                tm.restart();
                SetImageSize( x );
                break;
        }
    }
}

