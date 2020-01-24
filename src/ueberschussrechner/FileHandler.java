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
    
    public FileHandler(Dateiverarbeitung dateiverarbeitung) 
    {
        this.dateiverarbeitung = dateiverarbeitung;
        
      
        CSVPathUser = JOptionPane.showInputDialog(null, "Zum festlegen des Speicherorts Benutzername eingeben:");
        CSVPath = CSVPathA+CSVPathUser+CSVPathB;
        
    }
    
//final String CSVPath = "C:\\Users\\schoe\\Desktop\\data.txt"; //"C:\\Program Files\\data.txt";

    public void laden() { 


        try {
            BufferedReader buffer = new BufferedReader(new FileReader(CSVPath));
            String zeile = buffer.readLine();

            int zeilennummer = 0;

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

    public boolean speichern()
    {  
        try
    {   
        BufferedWriter writer = new BufferedWriter(new FileWriter(CSVPath));
       // String test[][]=dateiverarbeitung.getData();
        String zeile= "";
        for(int i = 0; i < 100; i++){
            if (dateiverarbeitung.getData()[i][0] != null)
            {
                zeile =dateiverarbeitung.getData()[i][0]+";"+dateiverarbeitung.getData()[i][1]+";"+dateiverarbeitung.getData()[i][2]+";"+dateiverarbeitung.getData()[i][3]+";"+dateiverarbeitung.getData()[i][4];
                writer.write(zeile);
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

        boolean status = false;

      


        return status;
    }

    public int print(Graphics g, PageFormat pf, int Page) throws PrinterException {
        if (Page > 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
        int posY = 50;
        for(int i=0;i<this.dateiverarbeitung.data.length;i++) {
            System.out.println(this.dateiverarbeitung.data.length);
            int posX = 50;
            if(this.dateiverarbeitung.data[i][0]==null) {
                break;
            }
            for(int j=0;j<this.dateiverarbeitung.data[i].length;j++) {
                System.out.println(this.dateiverarbeitung.data[i].length);
                g.drawString(this.dateiverarbeitung.data[i][j],posX,posY);
                posX+=100;
            }
            posY+=25;
        }
        return PAGE_EXISTS;
    }

    public boolean drucken() {
        boolean doPrint = false;

        PrinterJob printJob = PrinterJob.getPrinterJob();
        printJob.setPrintable(this);
        doPrint = printJob.printDialog();
        if(doPrint) {
            try {
                printJob.print();
            } catch(PrinterException e) {
                System.out.println("Drucken fehlgeschlagen");
            }
        }

        return doPrint;
    }
}