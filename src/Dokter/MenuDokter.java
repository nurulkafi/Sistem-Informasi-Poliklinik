/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dokter;

import Koneksi.GlobalVar;
import java.awt.Color;
import java.awt.Frame;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author donih
 */
public class MenuDokter extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuDokter() {
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

        MIN = new javax.swing.JButton();
        MAX = new javax.swing.JButton();
        CLOSE = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnPembayaran = new javax.swing.JButton();
        btnObat = new javax.swing.JButton();
        btnJadwalPraktek = new javax.swing.JButton();
        btnPemeriksaan = new javax.swing.JButton();
        btnPoli = new javax.swing.JButton();
        btnDokter = new javax.swing.JButton();
        btnPegawai = new javax.swing.JButton();
        btnPendaftaran = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CLOSE1 = new javax.swing.JButton();
        CLOSE2 = new javax.swing.JButton();
        CLOSE3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        navi = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MIN.setBackground(new Color(0,0,0,0));
        MIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/-Off.png"))); // NOI18N
        MIN.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MIN.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Min.png"))); // NOI18N
        MIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MINActionPerformed(evt);
            }
        });
        getContentPane().add(MIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 30, 30));

        MAX.setBackground(new Color(0,0,0,0));
        MAX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/maxOff.png"))); // NOI18N
        MAX.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MAX.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Max.png"))); // NOI18N
        getContentPane().add(MAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 30, 30));

        CLOSE.setBackground(new Color(0,0,0,0));
        CLOSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/xOff.png"))); // NOI18N
        CLOSE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CLOSE.setBorderPainted(false);
        CLOSE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CLOSE.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Close.png"))); // NOI18N
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });
        getContentPane().add(CLOSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 30, 30));

        btnLogout.setBackground(new Color(0,0,0,0));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Logout.png"))); // NOI18N
        btnLogout.setBorder(null);
        btnLogout.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/LogoutAktif.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 664, -1, -1));

        btnPembayaran.setBackground(new Color(0,0,0,0));
        btnPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/pembayaran.png"))); // NOI18N
        btnPembayaran.setBorder(null);
        btnPembayaran.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/PembayaranAktif.png"))); // NOI18N
        btnPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPembayaranActionPerformed(evt);
            }
        });
        getContentPane().add(btnPembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 588, -1, -1));

        btnObat.setBackground(new Color(0,0,0,0));
        btnObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Obat.png"))); // NOI18N
        btnObat.setBorder(null);
        btnObat.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/ObatAktif.png"))); // NOI18N
        btnObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObatActionPerformed(evt);
            }
        });
        getContentPane().add(btnObat, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 514, -1, -1));

        btnJadwalPraktek.setBackground(new Color(0,0,0,0));
        btnJadwalPraktek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/JadwalPraktek.png"))); // NOI18N
        btnJadwalPraktek.setBorder(null);
        btnJadwalPraktek.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/JadwalPraktekAktif.png"))); // NOI18N
        btnJadwalPraktek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJadwalPraktekActionPerformed(evt);
            }
        });
        getContentPane().add(btnJadwalPraktek, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 440, -1, -1));

        btnPemeriksaan.setBackground(new Color(0,0,0,0));
        btnPemeriksaan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Pemeriksaan.png"))); // NOI18N
        btnPemeriksaan.setBorder(null);
        btnPemeriksaan.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/PemeriksaanAktif.png"))); // NOI18N
        btnPemeriksaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPemeriksaanActionPerformed(evt);
            }
        });
        getContentPane().add(btnPemeriksaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 366, -1, -1));

        btnPoli.setBackground(new Color(0,0,0,0));
        btnPoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Poli.png"))); // NOI18N
        btnPoli.setBorder(null);
        btnPoli.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/PoliAktif.png"))); // NOI18N
        btnPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoliActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoli, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 292, -1, -1));

        btnDokter.setBackground(new Color(0,0,0,0));
        btnDokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Dokter.png"))); // NOI18N
        btnDokter.setBorder(null);
        btnDokter.setSelected(true);
        btnDokter.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/DokterAktif.png"))); // NOI18N
        btnDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDokterActionPerformed(evt);
            }
        });
        getContentPane().add(btnDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 218, -1, -1));

        btnPegawai.setBackground(new Color(0,0,0,0));
        btnPegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Pegawai.png"))); // NOI18N
        btnPegawai.setBorder(null);
        btnPegawai.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/PegawaiAktif.png"))); // NOI18N
        btnPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 144, -1, -1));

        btnPendaftaran.setBackground(new Color(0,0,0,0));
        btnPendaftaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Pendaftaran.png"))); // NOI18N
        btnPendaftaran.setBorder(null);
        btnPendaftaran.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/PendaftaranAktif.png"))); // NOI18N
        btnPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendaftaranActionPerformed(evt);
            }
        });
        getContentPane().add(btnPendaftaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 70, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 870, 460));

        CLOSE1.setBackground(new Color(0,0,0,0));
        CLOSE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dokter/Asset/Group 11.png"))); // NOI18N
        CLOSE1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CLOSE1.setBorderPainted(false);
        CLOSE1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CLOSE1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Dokter/Asset/Group 12 (1).png"))); // NOI18N
        CLOSE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSE1ActionPerformed(evt);
            }
        });
        getContentPane().add(CLOSE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 310, 90, 70));

        CLOSE2.setBackground(new Color(0,0,0,0));
        CLOSE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dokter/Asset/Group 9.png"))); // NOI18N
        CLOSE2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CLOSE2.setBorderPainted(false);
        CLOSE2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CLOSE2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Dokter/Asset/Group 12.png"))); // NOI18N
        CLOSE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSE2ActionPerformed(evt);
            }
        });
        getContentPane().add(CLOSE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 230, 90, 80));

        CLOSE3.setBackground(new Color(0,0,0,0));
        CLOSE3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dokter/Asset/input.png"))); // NOI18N
        CLOSE3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CLOSE3.setBorderPainted(false);
        CLOSE3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CLOSE3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Dokter/Asset/input (2).png"))); // NOI18N
        CLOSE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSE3ActionPerformed(evt);
            }
        });
        getContentPane().add(CLOSE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 150, 90, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dokter/Asset/Acc (1).png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        navi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/navi.png"))); // NOI18N
        getContentPane().add(navi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/header.png"))); // NOI18N
        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dokter/Asset/MenuPegawai (1).png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MINActionPerformed
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MINActionPerformed

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CLOSEActionPerformed

    private void btnPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendaftaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPendaftaranActionPerformed

    private void btnPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPegawaiActionPerformed

    private void btnDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDokterActionPerformed

    private void btnPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPoliActionPerformed

    private void btnPemeriksaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPemeriksaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPemeriksaanActionPerformed

    private void btnJadwalPraktekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJadwalPraktekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJadwalPraktekActionPerformed

    private void btnObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnObatActionPerformed

    private void btnPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPembayaranActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int opsi = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan keluar?", "Log out!", JOptionPane.YES_NO_OPTION);
        if (opsi == JOptionPane.YES_OPTION){
            new Login.Login().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void CLOSE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CLOSE1ActionPerformed

    private void CLOSE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSE2ActionPerformed
        // TODO add your handling code here:
        new Dokter.EditData().setVisible(true);
        dispose();
    }//GEN-LAST:event_CLOSE2ActionPerformed

    private void CLOSE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSE3ActionPerformed
        // TODO add your handling code here:
        Dokter.TambahData frm = new Dokter.TambahData();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_CLOSE3ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLOSE;
    private javax.swing.JButton CLOSE1;
    private javax.swing.JButton CLOSE2;
    private javax.swing.JButton CLOSE3;
    private javax.swing.JButton MAX;
    private javax.swing.JButton MIN;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnDokter;
    private javax.swing.JButton btnJadwalPraktek;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnObat;
    private javax.swing.JButton btnPegawai;
    private javax.swing.JButton btnPembayaran;
    private javax.swing.JButton btnPemeriksaan;
    private javax.swing.JButton btnPendaftaran;
    private javax.swing.JButton btnPoli;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel navi;
    // End of variables declaration//GEN-END:variables
}
