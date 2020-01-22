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

    public void berechneMittelwert(double[]a){
       
       a = new double[5];
    }
    
    public String [][] laden(String[][] data) {
        
        
        final String CSVPath = "C:\\Program Files\\data.txt";
        
        
        try {
           BufferedReader buffer = new BufferedReader(new FileReader(CSVPath)); 
           String zeile = buffer.readLine(); 
           
           int zeilennummer=0;
           
            while (zeile != null) {
                
                String split[]= zeile.split(";");
                data[zeilennummer] [0]=split[0] ;
                data[zeilennummer] [1]=split[1] ;
                data[zeilennummer] [2]=split[2] ;
                data[zeilennummer] [3]=split[3] ;
                data[zeilennummer] [4]=split[4] ;
                
                zeilennummer ++;
                System.out.print(data);
                zeile = buffer.readLine();
            }
            buffer.close();
            System.out.println(data[0][0]);
            
        } catch (Exception e) {
            System.out.println("Fehler beim Lesen der Datei");
        }
        return data;
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