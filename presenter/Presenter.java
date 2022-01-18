package presenter;

import java.io.IOException;

import views.GraphicalUserInterface;

public class Presenter {
    
    private GraphicalUserInterface gui;
    
    public Presenter() throws IOException {
        gui = new GraphicalUserInterface();
    }
    
}
