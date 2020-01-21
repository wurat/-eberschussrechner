package ueberschussrechner;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileHandler {

    public static void getArraylist() {
        ArrayList<String> Data = new ArrayList<String>();
    }

    public ArrayList laden() {
        ArrayList<String> Data = new ArrayList<String>();
        int Zeilennummer = 0;
        int CSVPath = "C:\\Daten.csv";

        BufferedReader br = new BufferedReader(new FileReader(CSVPath));
        return Data;

    }

    public boolean speichern() {
        boolean status = false;

        return status;
    }

    public boolean drucken() {
        boolean status = false;

        return status;
    }
}
