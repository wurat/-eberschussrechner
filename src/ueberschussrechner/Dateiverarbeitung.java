/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ueberschussrechner;

/**
 *
 * 
 */

public class Dateiverarbeitung {

    //Attribute
    String [][] data = new String [100][5];

    //Getter&Setter
    public void setData(String[][] data) {
        this.data = data;
    }

    public String[][] getData() {
        return data;
    }

    //Methode um den Saldo zu berechnen
    public String berechneSaldo (){
        int i=0;
        int j=0;
        double summeEinnahmen = 0;
        double summeAusgaben = 0;
        double ergebnis=0;
        
        //Schleife um die Einnamen zu berechnen von Anfang bis Ende
        while ((data[i][1] != null) && (data[i][2] != null)){
            //in einer Spalte darf nur ein sinnvoller Wert stehen in dem anderen muss eine 0 stehen
            if(data[i][1] != null || !data[i][1].equals("0")) {
                //Überprüfung der einzelnen Werte
                System.out.println(Double.valueOf(data[i][1]));
                //String in double umwandeln
                summeEinnahmen += Double.valueOf(data[i][1]);
            }
            i++;
        }
        //Schleife um die Ausgaben zu berechnen von Anfang bis Ende
         while ((data[j][1] != null) && (data[j][2] != null)){
            //in einer Spalte darf nur ein sinnvoller Wert stehen in dem anderen muss eine 0 stehen
            if(data[j][2] != null || !data[j][2].equals("0")) {
                //Überprüfung der einzelnen Werte
                System.out.println(Double.valueOf(data[j][2]));
                //String in double umwandeln 
                summeAusgaben += Double.valueOf(data[j][2]);
            }
            j++;
        }
        
         //Berechnung der Einnahmen und Ausgaben
         ergebnis = summeEinnahmen+summeAusgaben;
         //double in String umwandeln
         String saldo = String.valueOf(ergebnis);
         return saldo;
    }
    //Spaltenzuordnung, Unterscheidung ob Einnahme oder Ausgabe
    public void addtoArray (String datum, String betrag, String bemerkung, String belegnummer ){
        
    int i =0;
    
    while (data[i][0] != null){
        i++;
    }
    //Ausgabe
    if (betrag.startsWith("-")){
        data[i][2]=betrag;
        data[i][1]="0";
    //Einnahme
    } else {
        data[i][1]=betrag;
        data[i][2]="0";
    }
    //Zuordnung in die passenden Spalten
    data[i][0]=datum;
    data[i][3]=bemerkung;
    data[i][4]=belegnummer;
    
    }

}
