package ueberschussrechner;

public class GUI extends javax.swing.JFrame {

    Dateiverarbeitung dateiverarbeitung;
    FileHandler fileHandler;
  
    public GUI() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Buchungsübersicht = new javax.swing.JLabel();
        Tabellenscroller = new javax.swing.JScrollPane();
        Buchungstabelle = new javax.swing.JTable();
        Datum = new javax.swing.JLabel();
        Betrag = new javax.swing.JLabel();
        Betragseingabe = new javax.swing.JTextField();
        Datumseingabe = new javax.swing.JTextField();
        Buchenbutton = new javax.swing.JButton();
        Ladenbutton = new javax.swing.JButton();
        Soeichernbutton = new javax.swing.JButton();
        Druckenbutton = new javax.swing.JButton();
        Saldo = new javax.swing.JLabel();
        Saldoanzeige = new javax.swing.JTextField();
        Buchungen = new javax.swing.JLabel();
        Belegnummereingabe = new javax.swing.JTextField();
        Bemerkungseingabe = new javax.swing.JTextField();
        Datum1 = new javax.swing.JLabel();
        Datum2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Buchungsübersicht.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Buchungsübersicht.setText("Buchungsübersicht");

        Buchungstabelle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Buchungsdatum", "Einnahme", "Ausgabe", "Bemerkung", "Belegnummer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabellenscroller.setViewportView(Buchungstabelle);

        Datum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Datum.setText("Datum");

        Betrag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Betrag.setText("Betrag");

        Betragseingabe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BetragseingabeActionPerformed(evt);
            }
        });

        Datumseingabe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatumseingabeActionPerformed(evt);
            }
        });

        Buchenbutton.setText("Buchen");
        Buchenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuchenbuttonActionPerformed(evt);
            }
        });

        Ladenbutton.setText("Laden");
        Ladenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LadenbuttonActionPerformed(evt);
            }
        });

        Soeichernbutton.setText("Speichern");
        Soeichernbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoeichernbuttonActionPerformed(evt);
            }
        });

        Druckenbutton.setText("Drucken");
        Druckenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DruckenbuttonActionPerformed(evt);
            }
        });

        Saldo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Saldo.setText("Saldo");

        Saldoanzeige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaldoanzeigeActionPerformed(evt);
            }
        });

        Buchungen.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Buchungen.setText("Buchungen");

        Belegnummereingabe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BelegnummereingabeActionPerformed(evt);
            }
        });

        Bemerkungseingabe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BemerkungseingabeActionPerformed(evt);
            }
        });

        Datum1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Datum1.setText("Beleg Nr.");

        Datum2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Datum2.setText("Bemerkung");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tabellenscroller, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Betrag)
                                .addComponent(Datum))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Datum1)
                                    .addComponent(Datum2))))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Betragseingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Datumseingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bemerkungseingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Belegnummereingabe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Ladenbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Soeichernbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                            .addComponent(Druckenbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Saldo)
                                .addGap(88, 88, 88))
                            .addComponent(Saldoanzeige, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Buchungen)
                                .addGap(59, 59, 59))
                            .addComponent(Buchenbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buchungsübersicht)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Buchungsübersicht)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(Buchungen)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Datum)
                            .addComponent(Datumseingabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Betrag)
                            .addComponent(Betragseingabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Tabellenscroller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bemerkungseingabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Datum2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Belegnummereingabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Datum1))
                .addGap(29, 29, 29)
                .addComponent(Buchenbutton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ladenbutton)
                    .addComponent(Soeichernbutton))
                .addGap(18, 18, 18)
                .addComponent(Druckenbutton)
                .addGap(32, 32, 32)
                .addComponent(Saldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Saldoanzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setDateiverarbeitung(Dateiverarbeitung input)                   
    {
        this.dateiverarbeitung = input;
    }
    
    public void setFileHandler(FileHandler input) 
    {
        this.fileHandler = input;
    }
    
    //Betragseingabe
    private void BetragseingabeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BetragseingabeActionPerformed
        
    }//GEN-LAST:event_BetragseingabeActionPerformed

    
    //Datumseingabe
    private void DatumseingabeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatumseingabeActionPerformed
       
    }//GEN-LAST:event_DatumseingabeActionPerformed

    
    //Buchungsbutton
    private void BuchenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuchenbuttonActionPerformed

      String tempDatum =  Datumseingabe.getText();
      Datumseingabe.setText("");
      String tempBetrag = Betragseingabe.getText();
      Betragseingabe.setText("");
      String tempBemerkung = Bemerkungseingabe.getText();
      Bemerkungseingabe.setText("");
      String tempBelegnummer = Belegnummereingabe.getText();
      Belegnummereingabe.setText("");
      dateiverarbeitung.addtoArray(tempDatum, tempBetrag, tempBemerkung, tempBelegnummer);
      tabelleFuellen(dateiverarbeitung.getData());
      Saldoanzeige.setText(dateiverarbeitung.berechneSaldo());
    }//GEN-LAST:event_BuchenbuttonActionPerformed

    
    //Ladenbutton
    private void LadenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LadenbuttonActionPerformed
       // String data[100][5]=dateiverarbeitung.getData();
       //if(data[0][0] != 0){}
        dateiverarbeitung.setData(fileHandler.laden(dateiverarbeitung.getData()));  // Laden des Arrays aus dateiverarbeitung.getdata(Braucht Filehandler!) -> Filehandler Lädt CSV in das Array von dateiverarbeitung -> Das befüllte Array von laden wird wieder an Dateiverarbeitung zurückgegeben  
        tabelleFuellen(dateiverarbeitung.getData());                                // Füllen der Tabelle + "repaint", Array[][] Abrufen aus Dateiverarbeitung
        Saldoanzeige.setText(dateiverarbeitung.berechneSaldo());                    // Setzen des texten für Jtextfield Saldoanzeige + Aufruf Methode zum berechen des Saldos
    }//GEN-LAST:event_LadenbuttonActionPerformed

    //JForm befüllen
    private void tabelleFuellen(String[][] input)                                   // Methode zum füllen der Tabelle Buchungstabelle + "repaint"
    {
        for (int i=0; i < input.length; i++)                                        // jede Zeile und Spalte wird nacheinander gefüllt + repaint pro Zeilenweret
        {
            for(int j=0; j < input[i].length; j++)
            {
                Buchungstabelle.setValueAt(input [i][j], i,j);
                repaint();
            }
        }
    }
    
    //Speicherbutton
    private void SoeichernbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoeichernbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SoeichernbuttonActionPerformed

    
    //Druckbutton
    private void DruckenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DruckenbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DruckenbuttonActionPerformed

    
    //Saldopanel
    private void SaldoanzeigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaldoanzeigeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaldoanzeigeActionPerformed

    private void BelegnummereingabeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BelegnummereingabeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BelegnummereingabeActionPerformed

    private void BemerkungseingabeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BemerkungseingabeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BemerkungseingabeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Belegnummereingabe;
    private javax.swing.JTextField Bemerkungseingabe;
    private javax.swing.JLabel Betrag;
    private javax.swing.JTextField Betragseingabe;
    private javax.swing.JButton Buchenbutton;
    private javax.swing.JLabel Buchungen;
    public javax.swing.JTable Buchungstabelle;
    private javax.swing.JLabel Buchungsübersicht;
    private javax.swing.JLabel Datum;
    private javax.swing.JLabel Datum1;
    private javax.swing.JLabel Datum2;
    private javax.swing.JTextField Datumseingabe;
    private javax.swing.JButton Druckenbutton;
    private javax.swing.JButton Ladenbutton;
    private javax.swing.JLabel Saldo;
    private javax.swing.JTextField Saldoanzeige;
    private javax.swing.JButton Soeichernbutton;
    private javax.swing.JScrollPane Tabellenscroller;
    // End of variables declaration//GEN-END:variables
}
