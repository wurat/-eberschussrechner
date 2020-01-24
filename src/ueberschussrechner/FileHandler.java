package ueberschussrechner;

import java.awt.*;
import java.io.PrintWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.print.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import javax.swing.*;

public class FileHandler implements Printable {

    Dateiverarbeitung dateiverarbeitung;

    String CSVPath = "";
    String CSVPathA = "C:\\Users\\";
    String CSVPathB = "\\Downloads\\data.txt";
    String CSVPathUser = "";
    
    //Konstruktor und Pfadeingabe
    public FileHandler(Dateiverarbeitung dateiverarbeitung) 
    {
        this.dateiverarbeitung = dateiverarbeitung;
        
        //Eingabe des Users für den Pfad in dem die CSVdatei gespeichert werden soll 
        CSVPathUser = JOptionPane.showInputDialog(null, "Zum festlegen des Speicherorts Benutzername eingeben:");
        CSVPath = CSVPathA+CSVPathUser+CSVPathB;
        
    }
    

    //Methode zum Laden einer CSVdatei
    public void laden() { 

        //Exception abfangen
        try {
            //Lesen der CSVdatei an dem eingegebenen Pfad
            BufferedReader buffer = new BufferedReader(new FileReader(CSVPath));
            String zeile = buffer.readLine();

            int zeilennummer = 0;
            
            //kopfgesteuerte Schleife um die Werte passend für die CSVdatei zu splitten und mit ; zu trennen
            while (zeile != null) {

                String split[] = zeile.split(";");
                this.dateiverarbeitung.data[zeilennummer][0] = split[0];
                this.dateiverarbeitung.data[zeilennummer][1] = split[1];
                this.dateiverarbeitung.data[zeilennummer][2] = split[2];
                this.dateiverarbeitung.data[zeilennummer][3] = split[3];
                this.dateiverarbeitung.data[zeilennummer][4] = split[4];
                zeilennummer++;
                zeile = buffer.readLine();
            }
            buffer.close();
        } catch (Exception e) {
            
        }
    }
    
    //Methode zum speichern des aktuellen Arrays in einer CSVdatei
    public void speichern()
    {  
        //Exception abfangen
        try
    {   
        //schreiben der Datei und einfügen in den eingegebenen Pfad
        BufferedWriter writer = new BufferedWriter(new FileWriter(CSVPath));
        String zeile= "";
        
        //Schleife um jede Zeile des Arrays in die Datei zu kopieren
        for(int i = 0; i < 100; i++){
            if (dateiverarbeitung.getData()[i][0] != null)
            {
                zeile =dateiverarbeitung.getData()[i][0]+";"+dateiverarbeitung.getData()[i][1]+";"+dateiverarbeitung.getData()[i][2]+";"+dateiverarbeitung.getData()[i][3]+";"+dateiverarbeitung.getData()[i][4];
                //schreiben in die Zeile
                writer.write(zeile);
                //neue Zeile
                writer.newLine();
            }
            else
            {
                break;
            }
        }
        writer.close();
    }
     
    catch(Exception e)
    {
         
    }

        
    }
    
    
    //Methode zum Ausführen des Drucks
    public int print(Graphics g, PageFormat pf, int Page) throws PrinterException {
        if (Page > 0) {
            return NO_SUCH_PAGE;
        }
        //Interpretieren des zu druckenden als 2D Grafik
        Graphics2D g2d = (Graphics2D)g;
        //Übersetzen der Grafik auf Seitenformat
        g2d.translate(pf.getImageableX(), pf.getImageableY());
        //
        int posY = 50;
        for(int i=0;i<dateiverarbeitung.getData().length;i++) {
            System.out.println(dateiverarbeitung.getData().length);
            int posX = 50;
            if(dateiverarbeitung.getData()[i][0]==null) {
                break;
            }
            for(int j=0;j<dateiverarbeitung.getData()[i].length;j++) {
                System.out.println(dateiverarbeitung.getData()[i].length);
                g.drawString(dateiverarbeitung.getData()[i][j],posX,posY);
                posX+=100;
            }
            posY+=25;
        }
        return PAGE_EXISTS;
    }

    //Methode zum Generieren des Druckauftrags, diese wird von dem Druckbutton aufgerufen
    public boolean drucken() {
        boolean doPrint = false;

        PrinterJob printJob = PrinterJob.getPrinterJob();
        printJob.setPrintable(this);
        doPrint = printJob.printDialog();
        if(doPrint) {
            //Abfangen der Exception
            try {
                printJob.print();
            } catch(PrinterException e) {
                System.out.println("Drucken fehlgeschlagen");
            }
        }
        return doPrint;
    }
}