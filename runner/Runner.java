package runner;

import java.io.IOException;

import presenter.Presenter;

public class Runner {
    
    public static void main(String[] args) {
        
        try {

            Presenter presenter = new Presenter();
        } catch (IOException e) {

        
            e.printStackTrace();
        }
    }
}
