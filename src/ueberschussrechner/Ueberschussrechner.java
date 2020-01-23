package ueberschussrechner;

public class Ueberschussrechner {

    public static void main(String[] args) {

        GUI gui = new GUI();
        Dateiverarbeitung dateiverarbeitung = new Dateiverarbeitung();
        FileHandler fileHandler = new FileHandler(dateiverarbeitung);

        gui.setVisible(true);
        gui.setDateiverarbeitung(dateiverarbeitung);
        gui.setFileHandler(fileHandler);
        gui.Buchungstabelle.setAutoCreateRowSorter(true);
    }
}
