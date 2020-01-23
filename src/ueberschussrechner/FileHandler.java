package ueberschussrechner;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileHandler {
    
    public FileHandler(){
        
    }

    public static void getArraylist() {
        
    }

    public void berechneMittelwert(double[]a)
    {
       a = new double[5];
    }
    
    public String [][] laden(String[][] data) {
        
        final String CSVPath = "C:\\Program Files\\data.txt";
        
        try 
        {
           // Variablendeklaration
           BufferedReader buffer = new BufferedReader(new FileReader(CSVPath)); // Deklaration und Instaziiereung des buffered Readers mit der Variable CSVPath als übergabeparameter
           String zeile = buffer.readLine();                                    // Lesen der ersten Zeile aus der CSV in CSVPath
           int zeilennummer=0;                                                  // Deklaration und Instaziiereung zeilennummer (Zähler) mit 0)
           
            while (zeile != null) {                                             // Lese weiter Zeilen ein, solange bis die aktuelle Zeile leer ist
                
                String split[]= zeile.split(";");                               // Aufteilen der Zeile in Teil String. Seperator ist ";". Werte weren in array split[] gespeichert 
                data[zeilennummer] [0]=split[0] ;                               // Das Array Data mit werten aus split (CSV Werte) füllen
                data[zeilennummer] [1]=split[1] ;
                data[zeilennummer] [2]=split[2] ;
                data[zeilennummer] [3]=split[3] ;
                data[zeilennummer] [4]=split[4] ;
                
                zeilennummer ++;                                                // Zähler incrementieren
                System.out.print(data);
                zeile = buffer.readLine();                                      // nächste Zeile einlesen
            }
            
            buffer.close();                                                     // schließen des streams zur Datei
            System.out.println(data[0][0]);
            
        } catch (Exception e) 
        {
            System.out.println("Fehler beim Lesen der Datei");
        }
        
        return data;
    }

    
    public boolean speichern() {
        //StringWriter stringWriter = new StringWriter();
        boolean status = false;
    
       try
       {
           
       }
       catch(Exception e){
           System.out.println("Fehler beim Speichern der Datei");
       }
       
       
       return status;
    }

    public boolean drucken() 
    {
        boolean status = false;

        return status;
    }
}