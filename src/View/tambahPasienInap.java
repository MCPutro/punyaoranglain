/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Sabda Yagra Pratama
 */
public class tambahPasienInap extends javax.swing.JFrame {

    /**
     * Creates new form tambahPasienInap
     */
    public tambahPasienInap() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labPasienInap = new javax.swing.JLabel();
        labKelas = new javax.swing.JLabel();
        labNoKamar = new javax.swing.JLabel();
        labLantai = new javax.swing.JLabel();
        labNamaPasien = new javax.swing.JLabel();
        labNamaDokter = new javax.swing.JLabel();
        labPenyakit = new javax.swing.JLabel();
        Ok = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        boxKelas = new javax.swing.JComboBox<>();
        boxLantai = new javax.swing.JComboBox<>();
        tfNoKamar = new javax.swing.JTextField();
        tfNamaPasien = new javax.swing.JTextField();
        tfNamaDokter = new javax.swing.JTextField();
        tfPenyakit = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labPasienInap.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labPasienInap.setText("Tambah Pasien Inap");

        labKelas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labKelas.setText("Kelas");

        labNoKamar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labNoKamar.setText("No.Kamar");

        labLantai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labLantai.setText("Lantai");

        labNamaPasien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labNamaPasien.setText("Nama Pasien");

        labNamaDokter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labNamaDokter.setText("Nama Dokter");

        labPenyakit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labPenyakit.setText("Penyakit");

        Ok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ok.setText("Ok");

        Reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Reset.setText("Reset");

        boxKelas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kelas", "A", "B", "C" }));

        boxLantai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxLantai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Lantai", "Lantai 1", "Lantai 2 ", "Lantai 3" }));

        tfNamaDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaDokterActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Java\\Tugas Besar PBO\\Home.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labNamaPasien)
                                    .addComponent(labPenyakit)
                                    .addComponent(labLantai)
                                    .addComponent(labNoKamar)
                                    .addComponent(labKelas))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labNamaDokter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfNoKamar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(boxKelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boxLantai, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfPenyakit, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfNamaDokter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfNamaPasien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(labPasienInap)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(1, 1, 1)
                .addComponent(labPasienInap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labKelas)
                            .addComponent(boxKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labNoKamar)
                            .addComponent(tfNoKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labLantai)
                            .addComponent(boxLantai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labNamaPasien)
                            .addComponent(tfNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addComponent(labPenyakit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNamaDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labNamaDokter))
                        .addGap(26, 26, 26)
                        .addComponent(tfPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNamaDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaDokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaDokterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

//    public String getNamaDokter() {
//        return NamaDokter.getText();
//    }
//
//    public String getNamaPasien() {
//        return NamaPasien.getText();
//    }
//
//
//    public String getBoxKelas() {
//        return boxKelas.getSelectedItem().toString();
//    }
//
//    public String getBoxLantai() {
//        return boxLantai.getSelectedItem().toString();
//    }
//
//    public int getNoKamar() {
//        return Integer.parseInt(noKamar.getText()) ;
//    }
//
//    public String getPenyakit() {
//        return penyakit.getText();
//    }
//  public void addListen (ActionListener a){
//        this.Tambah.addActionListener(a);
//    }
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(tambahPasienInap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(tambahPasienInap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(tambahPasienInap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(tambahPasienInap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new tambahPasienInap().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ok;
    private javax.swing.JButton Reset;
    private javax.swing.JComboBox<String> boxKelas;
    private javax.swing.JComboBox<String> boxLantai;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labKelas;
    private javax.swing.JLabel labLantai;
    private javax.swing.JLabel labNamaDokter;
    private javax.swing.JLabel labNamaPasien;
    private javax.swing.JLabel labNoKamar;
    private javax.swing.JLabel labPasienInap;
    private javax.swing.JLabel labPenyakit;
    private javax.swing.JTextField tfNamaDokter;
    private javax.swing.JTextField tfNamaPasien;
    private javax.swing.JTextField tfNoKamar;
    private javax.swing.JTextField tfPenyakit;
    // End of variables declaration//GEN-END:variables

    public Object getTambah() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
