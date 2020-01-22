package ueberschussrechner;

public class Ueberschussrechner {

    public static void main(String[] args) {
        
        GUI gui = new GUI();
        Dateiverarbeitung dateiverarbeitung = new Dateiverarbeitung ();
        FileHandler fileHandler = new FileHandler();
        
        gui.setVisible(true);
        gui.setDateiverarbeitung(dateiverarbeitung);
        gui.setFileHandler(fileHandler);
                 
        
        
        
        

        
        
    }
    
}
