/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author ecko
 */
public class KonverterGUI extends javax.swing.JFrame {
    String s, satKm, satHm, satDam, satM, satDm, satCm, satMm;
    double angka, satuanKm, satuanHm, satuanDam, satuanM, satuanDm, satuanCm, satuanMm;
    int pil;
    
    /**
     * Creates new form GUI
     */
    public KonverterGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtField1 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btnKonversi = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        fieldKm = new javax.swing.JTextField();
        labelKm = new javax.swing.JLabel();
        fieldHm = new javax.swing.JTextField();
        labelHm = new javax.swing.JLabel();
        fieldDam = new javax.swing.JTextField();
        labelDam = new javax.swing.JLabel();
        fieldM = new javax.swing.JTextField();
        labelM = new javax.swing.JLabel();
        fieldDm = new javax.swing.JTextField();
        labelDm = new javax.swing.JLabel();
        fieldCm = new javax.swing.JTextField();
        labelCm = new javax.swing.JLabel();
        fieldMm = new javax.swing.JTextField();
        labelMm = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        About = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        Tutorial = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Konverter Panjang");
        setResizable(false);

        jLabel2.setText("Masukkan Panjang :");

        txtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField1ActionPerformed(evt);
            }
        });

        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "pilih", "Km", "Hm", "Dam", "M", "Dm", "Cm", "Mm" }));
        cb1.setEnabled(false);
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.GridLayout(1, 2, 2, 2));

        btnKonversi.setText("Konversi");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });
        jPanel2.add(btnKonversi);

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset);

        jPanel3.setLayout(new java.awt.GridLayout(7, 2, 2, 2));

        fieldKm.setEditable(false);
        jPanel3.add(fieldKm);

        labelKm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelKm.setText("Km");
        jPanel3.add(labelKm);

        fieldHm.setEditable(false);
        jPanel3.add(fieldHm);

        labelHm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHm.setText("Hm");
        jPanel3.add(labelHm);

        fieldDam.setEditable(false);
        jPanel3.add(fieldDam);

        labelDam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDam.setText("Dam");
        jPanel3.add(labelDam);

        fieldM.setEditable(false);
        fieldM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMActionPerformed(evt);
            }
        });
        jPanel3.add(fieldM);

        labelM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM.setText("M");
        jPanel3.add(labelM);

        fieldDm.setEditable(false);
        jPanel3.add(fieldDm);

        labelDm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDm.setText("Dm");
        jPanel3.add(labelDm);

        fieldCm.setEditable(false);
        jPanel3.add(fieldCm);

        labelCm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCm.setText("Cm");
        jPanel3.add(labelCm);

        fieldMm.setEditable(false);
        jPanel3.add(fieldMm);

        labelMm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMm.setText("Mm");
        jPanel3.add(labelMm);

        menuFile.setText("File");

        About.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugasjavagui/Get info.png"))); // NOI18N
        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        menuFile.add(About);

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugasjavagui/mActionFileExit.png"))); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        menuFile.add(Exit);

        jMenuBar1.add(menuFile);

        menuHelp.setText("Help");

        Tutorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugasjavagui/1268860544_system-help.png"))); // NOI18N
        Tutorial.setText("Tutorial");
        Tutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutorialActionPerformed(evt);
            }
        });
        menuHelp.add(Tutorial);

        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Created by :\n1. Albertus Dwi Septianto\n2. Boby Ariesta\n3. Muhammad Rizky\n4. Riesta Sahara");
    }//GEN-LAST:event_AboutActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void TutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutorialActionPerformed
        JOptionPane.showMessageDialog(rootPane, "1.Masukkan angka kedalam textBox, kemudian tekan enter.\n2.pilih satuan panjangnya.\n3.tekan tombol konversi.\n4. tekan tombol reset untuk mengulang.");
    }//GEN-LAST:event_TutorialActionPerformed

    private void txtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField1ActionPerformed
        if(!txtField1.getText().isEmpty()){
            cb1.setEnabled(true);
        }
        else {
            cb1.setEnabled(false);
        }
    }//GEN-LAST:event_txtField1ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        s = cb1.getSelectedItem().toString();
        if(s.equalsIgnoreCase("km")){
            s = "1";
        }
        else if(s.equalsIgnoreCase("hm")){
            s = "2";
        }
        else if(s.equalsIgnoreCase("dam")){
            s = "3";
        }
        else if(s.equalsIgnoreCase("m")){
            s = "4";
        }
        else if(s.equalsIgnoreCase("dm")){
            s = "5";
        }
        else if(s.equalsIgnoreCase("cm")){
            s = "6";
        }
        else if(s.equalsIgnoreCase("mm")){
            s = "7";
        }
        else {
            s = "pilih";
        }
        
         angka = Double.parseDouble(txtField1.getText());
    }//GEN-LAST:event_cb1ActionPerformed

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
        if(txtField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Anda Belum Memasukkan Angka.");
        }
        else if(cb1.getSelectedItem().toString().equalsIgnoreCase("pilih")){
            JOptionPane.showMessageDialog(rootPane, "Anda Belum Memilih Satuan Panjang.");
        }
        else{
            pil = Integer.parseInt(s);
        
        switch(pil){
            case 1:
                satuanKm = angka;
                satuanHm = angka * 10;
                satuanDam = angka * 100;
                satuanM = angka * 1000;
                satuanDm = angka * 10000;
                satuanCm = angka * 100000;
                satuanMm = angka * 1000000;
                
                satKm = String.valueOf(satuanKm);
                satHm = String.valueOf(satuanHm);
                satDam = String.valueOf(satuanDam);
                satM = String.valueOf(satuanM);
                satDm = String.valueOf(satuanDm);
                satCm = String.valueOf(satuanCm);
                satMm = String.valueOf(satuanMm);
                break;
            
            case 2:
                satuanKm = angka / 10;
                satuanHm = angka;
                satuanDam = angka * 10;
                satuanM = angka* 100;
                satuanDm = angka * 1000;
                satuanCm = angka * 10000;
                satuanMm = angka * 100000;
                satKm = String.valueOf(satuanKm);
                satHm = String.valueOf(satuanHm);
                satDam = String.valueOf(satuanDam);
                satM = String.valueOf(satuanM);
                satDm = String.valueOf(satuanDm);
                satCm = String.valueOf(satuanCm);
                satMm = String.valueOf(satuanMm);
                
              
                break;
                
            case 3:
                satuanKm = angka / 100;
                satuanHm = angka / 10;
                satuanDam = angka;
                satuanM = angka * 10;
                satuanDm = angka * 100;
                satuanCm = angka * 1000;
                satuanMm = angka * 10000;
                satKm = String.valueOf(satuanKm);
                satHm = String.valueOf(satuanHm);
                satDam = String.valueOf(satuanDam);
                satM = String.valueOf(satuanM);
                satDm = String.valueOf(satuanDm);
                satCm = String.valueOf(satuanCm);
                satMm = String.valueOf(satuanMm);
                
               
                break;
                
            case 4:
                satuanKm = angka / 1000;
                satuanHm = angka / 100;
                satuanDam = angka/10;
                satuanM = angka;
                satuanDm = angka* 10;
                satuanCm = angka * 100;
                satuanMm = angka * 1000;
                satKm = String.valueOf(satuanKm);
                satHm = String.valueOf(satuanHm);
                satDam = String.valueOf(satuanDam);
                satM = String.valueOf(satuanM);
                satDm = String.valueOf(satuanDm);
                satCm = String.valueOf(satuanCm);
                satMm = String.valueOf(satuanMm);
                
               
                break;
                
            case 5:
                satuanKm = angka / 10000;
                satuanHm = angka/ 1000;
                satuanDam = angka /100;
                satuanM = angka/10;
                satuanDm = angka;
                satuanCm = angka * 10;
                satuanMm = angka* 100;
                satKm = String.valueOf(satuanKm);
                satHm = String.valueOf(satuanHm);
                satDam = String.valueOf(satuanDam);
                satM = String.valueOf(satuanM);
                satDm = String.valueOf(satuanDm);
                satCm = String.valueOf(satuanCm);
                satMm = String.valueOf(satuanMm);
                
               
                break;
                
            case 6:
                satuanKm = angka / 100000;
                satuanHm = angka / 10000;
                satuanDam = angka /1000;
                satuanM = angka /100;
                satuanDm = angka /10;
                satuanCm = angka;
                satuanMm = angka * 10;
                satKm = String.valueOf(satuanKm);
                satHm = String.valueOf(satuanHm);
                satDam = String.valueOf(satuanDam);
                satM = String.valueOf(satuanM);
                satDm = String.valueOf(satuanDm);
                satCm = String.valueOf(satuanCm);
                satMm = String.valueOf(satuanMm);
                
                
                break;
                
            case 7:
                satuanKm = angka / 1000000;
                satuanHm = angka / 100000;
                satuanDam = angka /10000;
                satuanM = angka/1000;
                satuanDm = angka /100;
                satuanCm = angka /10;
                satuanMm = angka;
                satKm = String.valueOf(satuanKm);
                satHm = String.valueOf(satuanHm);
                satDam = String.valueOf(satuanDam);
                satM = String.valueOf(satuanM);
                satDm = String.valueOf(satuanDm);
                satCm = String.valueOf(satuanCm);
                satMm = String.valueOf(satuanMm);
                
                
                break;
        }
        //ngambil dari textfield
       fieldKm.setText(satKm);
       fieldHm.setText(satHm);
       fieldDam.setText(satDam);
       fieldM.setText(satM);
       fieldDm.setText(satDm);
       fieldCm.setText(satCm);
       fieldMm.setText(satMm);
        
        }
    }//GEN-LAST:event_btnKonversiActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        if(!cb1.getSelectedItem().equals("pilih")){
            cb1.setSelectedIndex(0);
            cb1.setEnabled(false); 
            txtField1.setText(null);
            fieldKm.setText(null);
            fieldHm.setText(null);
            fieldDam.setText(null);
            fieldM.setText(null);
            fieldDm.setText(null);
            fieldCm.setText(null);
            fieldMm.setText(null);
            angka = 0;
       } 
       else {
            cb1.setEnabled(false);
            txtField1.setText(null);
            fieldKm.setText(null);
            fieldHm.setText(null);
            fieldDam.setText(null);
            fieldM.setText(null);
            fieldDm.setText(null);
            fieldCm.setText(null);
            fieldMm.setText(null);
            angka = 0;
       }
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(KonverterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonverterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonverterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonverterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonverterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem Tutorial;
    private javax.swing.JButton btnKonversi;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox cb1;
    private javax.swing.JTextField fieldCm;
    private javax.swing.JTextField fieldDam;
    private javax.swing.JTextField fieldDm;
    private javax.swing.JTextField fieldHm;
    private javax.swing.JTextField fieldKm;
    private javax.swing.JTextField fieldM;
    private javax.swing.JTextField fieldMm;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelCm;
    private javax.swing.JLabel labelDam;
    private javax.swing.JLabel labelDm;
    private javax.swing.JLabel labelHm;
    private javax.swing.JLabel labelKm;
    private javax.swing.JLabel labelM;
    private javax.swing.JLabel labelMm;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JTextField txtField1;
    // End of variables declaration//GEN-END:variables
}