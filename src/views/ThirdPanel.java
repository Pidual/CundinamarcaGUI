package views;

import views.ButtonMods.ButtonModed;

import javax.swing.*;
import java.awt.*;

public class ThirdPanel extends JPanel {

    private JButton inicioButton;
    private JButton gobernacionButton;
    private JButton transparenciaButton;
    private JButton serviciosAlCiudadanoButton;
    private JButton participaButton;
    private JButton noticiasButton;
    private JButton normatividadButton;
    private JButton contratacionButton;
    private JButton secretariasYEntidadesButton;

    public ThirdPanel() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        inicioButton = new JButton("INICIO");
        addMouseListenerYellowAndWhiteAndRemoveBorder(inicioButton);
        add(inicioButton, gbc);

        gbc.gridx = 1;
        gobernacionButton = new JButton("GOBERNACION");
        addMouseListenerYellowAndWhiteAndRemoveBorder(gobernacionButton);
        add(gobernacionButton, gbc);

        gbc.gridx = 2;
        transparenciaButton = new JButton("TRANSPARENCIA");
        addMouseListenerYellowAndWhiteAndRemoveBorder(transparenciaButton);
        add(transparenciaButton, gbc);

        gbc.gridx = 3;
        serviciosAlCiudadanoButton = new JButton("SERVICIO AL CIUDADANO");
        addMouseListenerYellowAndWhiteAndRemoveBorder(serviciosAlCiudadanoButton);
        add(serviciosAlCiudadanoButton, gbc);

        gbc.gridx = 4;
        participaButton = new JButton("PARTICIPA");
        addMouseListenerYellowAndWhiteAndRemoveBorder(participaButton);
        add(participaButton, gbc);

        gbc.gridx = 5;
        noticiasButton = new JButton("NOTICIAS");
        addMouseListenerYellowAndWhiteAndRemoveBorder(noticiasButton);
        add(noticiasButton, gbc);

        gbc.gridx = 6;
        normatividadButton = new JButton("NORMATIVIDAD");
        addMouseListenerYellowAndWhiteAndRemoveBorder(normatividadButton);
        add(normatividadButton, gbc);

        gbc.gridx = 7;
        contratacionButton = new JButton("CONTRATACION");
        addMouseListenerYellowAndWhiteAndRemoveBorder(contratacionButton);
        add(contratacionButton, gbc);

        gbc.gridx = 8;
        secretariasYEntidadesButton = new JButton("SECRETARIAS Y ENTIDADES");
        addMouseListenerYellowAndWhiteAndRemoveBorder(secretariasYEntidadesButton);
        add(secretariasYEntidadesButton, gbc);
    }

    private void addMouseListenerYellowAndWhiteAndRemoveBorder(JButton button) {
        button.setForeground(Color.WHITE);
        button.setBorderPainted(false);
        button.setUI(new ButtonModed());
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setForeground(Color.YELLOW);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setForeground(Color.WHITE);
            }
        });
    }


}
