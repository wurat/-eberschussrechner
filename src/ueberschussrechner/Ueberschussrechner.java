package ueberschussrechner;

public class Ueberschussrechner {

    public static void main(String[] args) {
        
        GUI gui = new GUI();
        gui.setVisible(true);
        
        //Deklaration
        String [][] data = new String [100][5];
        
        
        FileHandler filehandler = new FileHandler();
        filehandler.laden(data);
        
        for (int i=0; i < data.length; i++) {
        
            for(int j=0; j < data[i].length; j++){
                
                gui.Buchungstabelle.setValueAt(data [i][j], i,j);
                gui.repaint();
            }
    }
        
        for(String[] tempString : data) {
            for(String string : tempString){
                System.out.println(string);
            }
        }

        
        
    }
    
}
