package views;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class ThirdPanel extends JPanel{
    
    private JButton inicioButton;
    private JButton gobernacionButton;
    private JButton transparenciaButton;
    private JButton serviciosAlCiudadanoButton;
    private JButton participaButton;
    private JButton noticiasButton;
    private JButton normatividadButton;
    private JButton contratacionButton;
    private JButton secretariasYEntidadesButton;

    public ThirdPanel(){
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
    
        inicioButton = new JButton("inicio");
        add(inicioButton,gbc);

        gbc.gridx = 1;
        gobernacionButton = new JButton("GOBERNACION");
        add(gobernacionButton,gbc);

        gbc.gridx = 2;
        transparenciaButton = new JButton("TRANSPARENCIA");
        add(transparenciaButton,gbc);

        
        gbc.gridx = 3;
        serviciosAlCiudadanoButton = new JButton("SERVICIO AL CIUDADANO");
        add(serviciosAlCiudadanoButton,gbc);

        gbc.gridx = 4;
        participaButton = new JButton("PARTICIPA");
        add(participaButton,gbc);

        gbc.gridx = 5;
        noticiasButton = new JButton("NOTICIAS");
        add(noticiasButton,gbc);

        gbc.gridx = 6;
        normatividadButton = new JButton("NORMATIVIDAD");
        add(normatividadButton,gbc);

        gbc.gridx = 7;
        contratacionButton = new JButton("CONTRATACION");
        add(contratacionButton,gbc);

        gbc.gridx = 8;
        secretariasYEntidadesButton = new JButton("SECRETARIAS Y ENTIDADES");
        add(secretariasYEntidadesButton,gbc);
    }
}
