package ueberschussrechner;

public class Ueberschussrechner {

    public static void main(String[] args) {
        
        // Instanzierungen aller Klassen
        GUI gui = new GUI();
        Dateiverarbeitung dateiverarbeitung = new Dateiverarbeitung ();
        FileHandler fileHandler = new FileHandler();
        
        gui.setVisible(true);                                                   // Gui sichtbar machen
        gui.setDateiverarbeitung(dateiverarbeitung);
        gui.setFileHandler(fileHandler);
    }
    
}
