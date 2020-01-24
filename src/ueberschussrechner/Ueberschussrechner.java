package ueberschussrechner;

public class Ueberschussrechner {

    public static void main(String[] args) {

        //Instanzierung der Klassen
        GUI gui = new GUI();
        Dateiverarbeitung dateiverarbeitung = new Dateiverarbeitung();
        FileHandler fileHandler = new FileHandler(dateiverarbeitung);

        //Gui sichtbar machen
        gui.setVisible(true);
        //setter aufrufen
        gui.setDateiverarbeitung(dateiverarbeitung);
        gui.setFileHandler(fileHandler);
        //Sortierung
        //gui.Buchungstabelle.setAutoCreateRowSorter(true);
        
    }
}
