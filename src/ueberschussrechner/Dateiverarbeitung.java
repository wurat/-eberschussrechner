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
    
    String [][] data = new String [100][5];

    public void setData(String[][] data) {
        this.data = data;
    }

    public String[][] getData() {
        return data;
    }
    
    
    
    double ueberschuss=0;
    double betrag=0;
    
    public String berechneSaldo (){
        int i=0;
        int j=0;
        double summeEinnahmen = 0;
        double summeAusgaben = 0;
        double ergebnis=0;
        
        //Einnahmeschleife
        while ((this.data[i][1] != null) && (this.data[i][2] != null)){
            if(this.data[i][1] != null) {
                System.out.println(Double.parseDouble(this.data[i][1]));
                summeEinnahmen += Double.parseDouble(this.data[i][1]);
            }
            i++;
        }
         while ((this.data[j][1] != null) && (this.data[j][2] != null)){
            if(this.data[j][2] != null) {
                System.out.println(Double.parseDouble(this.data[j][2]));
                summeAusgaben += Double.parseDouble(this.data[j][2]);
            }
            j++;
        }
        
         ergebnis = summeEinnahmen+summeAusgaben;
         String saldo = Double.toString(ergebnis);
         return saldo;
    }
    public String [][] addtoArray (String datum, String betrag, String bemerkung, String belegnummer ){
        
    int i =0;
    
    while (this.data[i][0] != null){
        i++;
    }
    
    if (betrag.startsWith("-")){
    
        data[i][2]=betrag;
    }
    
    else {
        data [i][1]=betrag;
    }
    
    data[i][0]=datum;
    data[i][3]=bemerkung;
    data[i][4]=belegnummer;
   
    return data;
    
    }
 
    
}
