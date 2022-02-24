package views;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class SixthPanel extends JPanel {

    public SixthPanel(){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 10;
        gbc.ipady = 10;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight=2;
        add(setImageAndTextForPlacement("<html>Arbeláez instaló Consejo, municipal de paz, reconciliación, <br/>convivencia,DDHH y DIH</html>"
                ,"<html><U>Arbeláez instaló Consejo, municipal de paz, reconciliación, <br/>convivencia,DDHH y DIH</U></html>"
                        ,"src/resources/SixthPanelImage1.jpg"
                ,500,250)
                ,gbc);//Primera imagen

        gbc.gridx=1;
        gbc.gridheight=1;
        gbc.gridy=0;
        add(setImageAndTextForPlacement("<html>Cundinamarca, presente en la Vitrina<br/>Turística Anato 2022 con “Pueblos Dorados</html> "
                ,"<html><U>Cundinamarca, presente en la Vitrina<br/>Turística Anato 2022 con “Pueblos Dorados</U></html>"
                        , "src/resources/SixthPanelImage2.jpg"
                ,200,100)
                ,gbc);//Segunda imagen

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(setImageAndTextForPlacement("<html>Asamblea Departamental estudió en primer <br/>debate dos Proyectos de Ordenanza en sesiones<br/> extraordinarias 2022</html>"
                ,"<HTML><U>Asamblea Departamental estudió en primer <br/>debate dos Proyectos de Ordenanza en sesiones<br/> extraordinarias 2022</U></HTML>"
                        , "src/resources/SixthPanelImage3.jpg"
                ,200,100)
                ,gbc);//Tercera imagen
        gbc.gridheight=2;
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(setImageAndTextForPlacement("El turismo equino es noticia en la Asamblea de Cundinamarca"
                ,"<HTML><U>El turismo equino es noticia en la Asamblea de Cundinamarca</U></HTML>"
                ,"src/resources/SixthPanelImage4.jpg"
                ,500,250)
                ,gbc);//Cuarta imagen

        gbc.gridx=1; //columna 2
        gbc.gridheight=1;
        gbc.gridy=2;
        add(setImageAndTextForPlacement("<html>Lotería de Cundinamarca,<br/> 210 años al servicio de los colombianos</html>"
                ,"<html><U>Lotería de Cundinamarca,<br/> 210 años al servicio de los colombianos</U>/html>"
                        ,"src/resources/SixthPanelImage5.jpg"
                ,200,100)
                ,gbc);//Quinta img

        gbc.gridx=1; //columna 2
        gbc.gridy=3;
        add(setImageAndTextForPlacement("<html>Cundinamarqueses celebran sanción <br/>de la Ley de la Región Metropolitana<br/>Bogotá-Cundinamarca</html>"
                ,"<html><U>Cundinamarqueses celebran sanción <br/>de la Ley de la Región Metropolitana<br/>Bogotá-Cundinamarca</U></html>"
                ,"src/resources/SixthPanelImage6.jpg"
                ,200,100)
                ,gbc);//Sexta img
    }

    private JPanel setImageAndTextForPlacement(String text,String underlinedText,String filepath,int width,int heigth){

        JPanel imageAndText = new JPanel();
        imageAndText.setLayout(new BoxLayout(imageAndText, BoxLayout.Y_AXIS));
        JLabel imageLabel = new JLabel();

        JLabel textLabel = new JLabel(text);
        textLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textLabel.setText(underlinedText);
                textLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textLabel.setText(text);

            }
        });
        ImageIcon imageIcon = new ImageIcon(filepath); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(width, heigth,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);  // transform it back

        imageLabel.setIcon(imageIcon);
        imageAndText.add(imageLabel);
        imageAndText.add(textLabel);

        return  imageAndText;
    }






}
