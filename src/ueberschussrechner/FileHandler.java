package ueberschussrechner;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileHandler {
    
    public FileHandler(){
        
    }

    public static void getArraylist() {
        
        //ArrayList<String> Data = new ArrayList<String>();
        
    }

    public ArrayList laden() {
        //ArrayList<String> Data = new ArrayList<String>();
        final int Arraydimensionen = 5;
        ArrayList<ArrayList<String>> Data = new ArrayList<>(Arraydimensionen);
        /*for (int i=0; i<Arraydimensionen; i++)
        {
            Data.add(new ArrayList<String>());
        }*/
        
        final String CSVPath = "C:\\Program Files\\data.txt";
        
        
        try {
           BufferedReader buffer = new BufferedReader(new FileReader(CSVPath)); 
           String zeile = buffer.readLine(); 
           
            while (zeile != null) {
                int zeilenummer=0;
            
                String split[]= zeile.split(";");
                Data.add(zeilenummer, split[4]);
            
                zeilenummer ++;
                System.out.print(Data);
                zeile = buffer.readLine();
            }
            buffer.close();
            
        } catch (Exception e) {
            System.out.println("Fehler beim Lesen der Datei");
        }
        return Data;
    }

    public boolean speichern() {
        //StringWriter stringWriter = new StringWriter();
        boolean status = false;
       
       try{
           
       }
       catch(Exception e){
           System.out.println("Fehler beim Speichern der Datei");
       }
       
       
       return status;
    }

    public boolean drucken() {
        boolean status = false;

        return status;
    }
}