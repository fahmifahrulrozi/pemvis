package main;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

public class masterBarang extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    
    public masterBarang() {
        initComponents();
        setLocationRelativeTo(this);
        datatable();
        btn_edit.setEnabled(false);
        btn_hapus.setEnabled(false);
    }
    
    protected void aktif(){
        txt_kdbarang.setEnabled(true);
        txt_nmbarang.setEnabled(true);
        txt_kelengkapan.setEnabled(true);
        txt_hrgjual.setEnabled(true);
        txt_stok.setEnabled(true);
        txt_garansi.setEnabled(true);
        txt_kdbarang.requestFocus();
    }
    
    protected void kosong(){
        txt_kdbarang.setText(null);
        txt_nmbarang.setText(null);
        txt_kelengkapan.setText(null);
        txt_hrgjual.setText(null);
        txt_garansi.setText(null);
        cb_kondisi.setSelectedIndex(0);
        txt_stok.setText(null);
        btn_edit.setEnabled(false);
        btn_hapus.setEnabled(false);
    }
    
    protected void datatable() {
        Object[] Baris = {"Kode Barang","Nama Barang","Kondisi","Kelengkapan","Harga Jual","Garansi","Stok"};
        tabmode = new DefaultTableModel(null, Baris);
        tabelbarang.setModel(tabmode);
        String sql = "SELECT * FROM barang";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()) {
                String a = hasil.getString("kdbarang");
                String b = hasil.getString("nmbarang");
                String c = hasil.getString("kondisi");
                String d = hasil.getString("kelengkapan");
                String e = hasil.getString("hrgjual");
                String f = hasil.getString("garansi");
                String g = hasil.getString("stok");

                String[] data = {a,b,c,d,e,f,g};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_kdbarang = new javax.swing.JTextField();
        txt_nmbarang = new javax.swing.JTextField();
        txt_kelengkapan = new javax.swing.JTextField();
        cb_kondisi = new javax.swing.JComboBox<>();
        btn_edit = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelbarang = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txt_garansi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_hrgjual = new javax.swing.JTextField();
        txt_stok = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblnama = new javax.swing.JLabel();
        lblnama2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FAHMI FAHRULROZI");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 232, 133));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(16, 169, 103));
        jLabel4.setText("KODE BARANG");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 100, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(16, 169, 103));
        jLabel5.setText("NAMA BARANG");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(16, 169, 103));
        jLabel6.setText("KONDISI");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(16, 169, 103));
        jLabel7.setText("KELENGKAPAN");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, 20));

        txt_kdbarang.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_kdbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kdbarangActionPerformed(evt);
            }
        });
        jPanel1.add(txt_kdbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 231, 25));

        txt_nmbarang.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_nmbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nmbarangActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nmbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 231, 25));

        txt_kelengkapan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(txt_kelengkapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 231, 25));

        cb_kondisi.setBackground(new java.awt.Color(16, 169, 103));
        cb_kondisi.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cb_kondisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baru", "Bekas" }));
        cb_kondisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_kondisiActionPerformed(evt);
            }
        });
        jPanel1.add(cb_kondisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 140, 25));

        btn_edit.setBackground(new java.awt.Color(16, 169, 103));
        btn_edit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 100, 33));

        btn_simpan.setBackground(new java.awt.Color(16, 169, 103));
        btn_simpan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel1.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 100, 33));

        btn_hapus.setBackground(new java.awt.Color(16, 169, 103));
        btn_hapus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_hapus.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 100, 33));

        tabelbarang.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelbarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelbarang);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 630, 180));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(16, 169, 103));
        jLabel8.setText("GARANSI");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 162, 100, 20));

        txt_garansi.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_garansi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_garansiActionPerformed(evt);
            }
        });
        jPanel1.add(txt_garansi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 231, 25));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(16, 169, 103));
        jLabel9.setText("HARGA JUAL");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 20));

        txt_hrgjual.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_hrgjual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hrgjualActionPerformed(evt);
            }
        });
        jPanel1.add(txt_hrgjual, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 231, 25));

        txt_stok.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stokActionPerformed(evt);
            }
        });
        jPanel1.add(txt_stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 231, 25));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(16, 169, 103));
        jLabel10.setText("STOK");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 670, 430));

        lbl.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lbl.setForeground(new java.awt.Color(245, 232, 133));
        lbl.setText("Data Kamera");
        getContentPane().add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        lblnama.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblnama.setForeground(new java.awt.Color(255, 255, 255));
        lblnama.setText("202143500864");
        getContentPane().add(lblnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        lblnama2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblnama2.setText("FAHMI FAHRULROZI");
        getContentPane().add(lblnama2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bg 650x.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_kdbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kdbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kdbarangActionPerformed

    private void txt_nmbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nmbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nmbarangActionPerformed

    private void cb_kondisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_kondisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_kondisiActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        try {
            String sql = "UPDATE barang SET nmbarang=?,kondisi=?,kelengkapan=?,hrgjual=?,garansi=?,stok=? WHERE kdbarang=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txt_nmbarang.getText());
            stat.setString(2, cb_kondisi.getSelectedItem().toString());
            stat.setString(3, txt_kelengkapan.getText());
            stat.setString(4, txt_hrgjual.getText());
            stat.setString(5, txt_garansi.getText());
            stat.setString(6, txt_stok.getText());
            stat.setString(7, txt_kdbarang.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            kosong();
            txt_kdbarang.requestFocus();
            datatable();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah "+e);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        String sql = "INSERT INTO barang VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txt_kdbarang.getText());
            stat.setString(2, txt_nmbarang.getText());
            stat.setString(3, cb_kondisi.getSelectedItem().toString());
            stat.setString(4, txt_kelengkapan.getText());
            stat.setString(5, txt_hrgjual.getText());
            stat.setString(6, txt_garansi.getText());
            stat.setString(7, txt_stok.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            txt_kdbarang.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan "+e);
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Hapus?","Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0) {
            String sql = "DELETE FROM barang WHERE kdbarang ='"+txt_kdbarang.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                kosong();
                txt_kdbarang.requestFocus();
                datatable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus "+e);
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void tabelbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbarangMouseClicked
        int bar = tabelbarang.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
        String g = tabmode.getValueAt(bar, 6).toString();

        txt_kdbarang.setText(a);
        txt_nmbarang.setText(b);
        cb_kondisi.setSelectedItem(c);
        txt_kelengkapan.setText(d);
        txt_hrgjual.setText(e);
        txt_garansi.setText(f);
        txt_stok.setText(g);
        btn_edit.setEnabled(true);
        btn_hapus.setEnabled(true);
    }//GEN-LAST:event_tabelbarangMouseClicked

    private void txt_garansiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_garansiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_garansiActionPerformed

    private void txt_hrgjualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hrgjualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hrgjualActionPerformed

    private void txt_stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stokActionPerformed

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
            java.util.logging.Logger.getLogger(masterBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(masterBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(masterBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(masterBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new masterBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox<String> cb_kondisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblnama;
    private javax.swing.JLabel lblnama2;
    private javax.swing.JTable tabelbarang;
    private javax.swing.JTextField txt_garansi;
    private javax.swing.JTextField txt_hrgjual;
    private javax.swing.JTextField txt_kdbarang;
    private javax.swing.JTextField txt_kelengkapan;
    private javax.swing.JTextField txt_nmbarang;
    private javax.swing.JTextField txt_stok;
    // End of variables declaration//GEN-END:variables
}
