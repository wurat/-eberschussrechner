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

    //Methoden
    public String berechneSaldo (){
        int i=0;
        int j=0;
        double summeEinnahmen = 0;
        double summeAusgaben = 0;
        double ergebnis=0;
        
        //Einnahmeschleife
        while ((data[i][1] != null) && (data[i][2] != null)){
            if(data[i][1] != null || !data[i][1].equals("0")) {
                System.out.println(Double.valueOf(data[i][1]));
                summeEinnahmen += Double.valueOf(data[i][1]);
            }
            i++;
        }
         while ((data[j][1] != null) && (data[j][2] != null)){
            if(data[j][2] != null || !data[j][2].equals("0")) {
                System.out.println(Double.valueOf(data[j][2]));
                summeAusgaben += Double.valueOf(data[j][2]);
            }
            j++;
        }
        
         ergebnis = summeEinnahmen+summeAusgaben;
         String saldo = String.valueOf(ergebnis);
         return saldo;
    }
    public void addtoArray (String datum, String betrag, String bemerkung, String belegnummer ){
        
    int i =0;
    
    while (data[i][0] != null){
        i++;
    }
    
    if (betrag.startsWith("-")){
        data[i][2]=betrag;
        data[i][1]="0";
    } else {
        data[i][1]=betrag;
        data[i][2]="0";
    }
    
    data[i][0]=datum;
    data[i][3]=bemerkung;
    data[i][4]=belegnummer;
    
    }

}
