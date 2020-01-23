
package ueberschussrechner;

public class Dateiverarbeitung 
{
    String [][] data = new String [100][5];                             // Deklaration + instanzierung des Arrays data [100] [5]

    public void setData(String[][] data)                                // setter für das Array data 
    {
        this.data = data;
    }

    public String[][] getData()                                         //  getter für dasArray data 
    {
        return data;
    }
    
    double ueberschuss=0;
    double betrag=0;
    
    public String berechneSaldo ()                                      // Berechnes des Saldos mit den werten aus dem Array Data[][]
    {
        int i=0;                                                        // Zähler 1
        int j=0;                                                        // Zähler 2
        double summeEinnahmen = 0;                                      // Einnahmen
        double summeAusgaben = 0;                                       // Ausgaben
        double ergebnis=0;                                              // Einnahmen-Ausgaben
        
        //Einnahmeschleife
        while ((this.data[i][1] != null) && (this.data[i][2] != null))  //Solange erste Spalte der aktuellen Zeile und erste Spalte der aktuellen Zeile nicht null sind
        {
            if(this.data[i][1] != null)                                 
            {
                System.out.println(Double.parseDouble(this.data[i][1]));
                summeEinnahmen += Double.parseDouble(this.data[i][1]);
            }
            i++;
        }
        while ((this.data[j][1] != null) && (this.data[j][2] != null)) ////Solange erste Spalte der aktuellen Zeile und erste Spalte der aktuellen Zeile nicht null sind
        {
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
    public String [][] addtoArray (String datum, String betrag, String bemerkung, String belegnummer )  // Eingabewerte aus GUI dem Array Data hinzufügen
    { 
        int i =0;
 
        while (this.data[i][0] != null)                                                                 // Herausfinden, welche die nächste frei Zeile in dem Array ist
        {
            i++;
        }

            if (betrag.startsWith("-"))                                                                 // Herausfinden, ob Betrag negativ oder positiv ist und dementsprechend abspeichern
            {

                data[i][2]=betrag;
            }

            else 
            {
                data [i][1]=betrag;
            }
    
        data[i][0]=datum;                                                                               // Restliche Eingabewerte in das Array speichern
        data[i][3]=bemerkung;
        data[i][4]=belegnummer;

        return data;  
    }
}
