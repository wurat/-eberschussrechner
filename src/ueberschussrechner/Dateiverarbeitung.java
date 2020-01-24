/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ueberschussrechner;

import java.util.regex.*;

/**
 *
 */

public class Dateiverarbeitung {

    //Attribute
    String[][] data = new String[100][5];

    //Getter&Setter
    public void setData(String[][] data) {
        this.data = data;
    }

    public String[][] getData() {
        return data;
    }

    //Methode um den Saldo zu berechnen
    public String berechneSaldo() {
        int i = 0;
        int j = 0;
        double summeEinnahmen = 0;
        double summeAusgaben = 0;
        double ergebnis = 0;

        //Schleife um die Einnamen zu berechnen von Anfang bis Ende
        while ((data[i][1] != null) && (data[i][2] != null)) {
            //in einer Spalte darf nur ein sinnvoller Wert stehen in dem anderen muss eine 0 stehen
            if (data[i][1] != null || !data[i][1].equals("0")) {
                //Überprüfung der einzelnen Werte
                System.out.println(Double.valueOf(data[i][1]));
                //String in double umwandeln
                summeEinnahmen += Double.valueOf(data[i][1]);
            }
            i++;
        }
        //Schleife um die Ausgaben zu berechnen von Anfang bis Ende
        while ((data[j][1] != null) && (data[j][2] != null)) {
            //in einer Spalte darf nur ein sinnvoller Wert stehen in dem anderen muss eine 0 stehen
            if (data[j][2] != null || !data[j][2].equals("0")) {
                //Überprüfung der einzelnen Werte
                System.out.println(Double.valueOf(data[j][2]));
                //String in double umwandeln 
                summeAusgaben += Double.valueOf(data[j][2]);
            }
            j++;
        }

        //Berechnung der Einnahmen und Ausgaben
        ergebnis = summeEinnahmen + summeAusgaben;
        //double in String umwandeln
        String saldo = String.valueOf(ergebnis);
        return saldo;
    }

    //Spaltenzuordnung, Unterscheidung ob Einnahme oder Ausgabe
    public void addtoArray(String datum, String betrag, String bemerkung, String belegnummer) {

        int i = 0;

        while (data[i][0] != null) {
            i++;
        }
        //Ausgabe
        if (betrag.startsWith("-")) {
            data[i][2] = betrag;
            data[i][1] = "0";
            //Einnahme
        } else {
            data[i][1] = betrag;
            data[i][2] = "0";
        }
        //Zuordnung in die passenden Spalten
        data[i][0] = datum;
        data[i][3] = bemerkung;
        data[i][4] = belegnummer;
    }

    public void sortieren() {
        String zeile;
        int i = 0;
        int datum[] = new int[100];
        String temp;
        while (data[i][0] != null)                                       // befüllen des Arrays im Format JahrMonatTag
        {
            System.out.println(data[i][0]);
            temp = data[i][0];
            String split[] = temp.split(Pattern.quote("."));
            System.out.println(split[0] + split[1] + split[2]);
            zeile = split[2] + split[1] + split[0];
            datum[i] = Integer.parseInt(zeile);
            i++;
        }
        bubblesort(datum);
    }

    public int[] bubblesort(int[] zusortieren)                       //http://www.java-programmieren.com/bubblesort-java.php
    {
        String temp2[][] = new String[100][5];
        int temp;
        for (int i = 1; i < zusortieren.length; i++) {
            for (int j = 0; j < zusortieren.length - i; j++) {
                if (zusortieren[j] > zusortieren[j + 1]) {
                    temp = zusortieren[j];
                    temp2[j][0] = data[j][0];
                    temp2[j][1] = data[j][1];
                    temp2[j][2] = data[j][2];
                    temp2[j][3] = data[j][3];
                    temp2[j][4] = data[j][4];
                    zusortieren[j] = zusortieren[j + 1];
                    data[j][0] = data[j + 1][0];
                    data[j][1] = data[j + 1][1];
                    data[j][2] = data[j + 1][2];
                    data[j][3] = data[j + 1][3];
                    data[j][4] = data[j + 1][4];
                    zusortieren[j + 1] = temp;
                    data[j + 1][0] = temp2[j + 1][0];
                    data[j + 1][1] = temp2[j + 1][1];
                    data[j + 1][2] = temp2[j + 1][2];
                    data[j + 1][3] = temp2[j + 1][3];
                    data[j + 1][4] = temp2[j + 1][4];
                }
            }
        }
        return zusortieren;
    }
}
