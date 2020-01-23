package ueberschussrechner;

import java.awt.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.print.*;

public class FileHandler implements Printable {

    Dateiverarbeitung dateiverarbeitung;

    public FileHandler(Dateiverarbeitung dateiverarbeitung) {
        this.dateiverarbeitung = dateiverarbeitung;
    }

    public void laden() {


        final String CSVPath = "C:\\Program Files\\data.txt";


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
            System.out.println("Fehler beim Lesen der Datei");
        }
    }

    public boolean speichern() {
        //StringWriter stringWriter = new StringWriter();
        boolean status = false;

        try {

        } catch (Exception e) {
            System.out.println("Fehler beim Speichern der Datei");
        }


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