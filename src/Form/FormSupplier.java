/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Form;

import ClassDatabase.ClassDatabase;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author FadhilCy
 */
public class FormSupplier extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormSupplier
     */
    public FormSupplier() {
        super("Menu Form Supplier |Administrator Fadhil Cahya Hilmi");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kodeSupplierTF = new javax.swing.JTextField();
        namaTF = new javax.swing.JTextField();
        noTelpTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        alamatTF = new javax.swing.JTextArea();

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("FORM ENTRI DATA SUPPLIER");
        jLabel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Kode Supplier");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Nama Supplier");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Alamat");

        kodeSupplierTF.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                kodeSupplierTFCaretUpdate(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("No. Telp");

        addBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        saveBtn.setText("SAVE");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        editBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        editBtn.setText("EDIT");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        closeBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        closeBtn.setText("CLOSE");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama", "Alamat", "No. Telp"
            }
        ));
        jScrollPane3.setViewportView(tabelData);

        alamatTF.setColumns(20);
        alamatTF.setRows(5);
        jScrollPane4.setViewportView(alamatTF);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(noTelpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaTF)
                            .addComponent(kodeSupplierTF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kodeSupplierTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noTelpTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(saveBtn)
                    .addComponent(editBtn)
                    .addComponent(deleteBtn)
                    .addComponent(closeBtn))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kodeSupplierTFCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_kodeSupplierTFCaretUpdate
        try {
            Connection c = ClassDatabase.getkoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM supplier where kode_supplier = '" + this.kodeSupplierTF.getText() + "'";
            ResultSet r = s.executeQuery(sql);
            while (r.next()){
                this.namaTF.setText(r.getString(2));
                this.alamatTF.setText(r.getString("alamat"));
                this.noTelpTF.setText(r.getString("notelp"));
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Kesalahan" + e);
        }
    }//GEN-LAST:event_kodeSupplierTFCaretUpdate

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        kodeSupplierTF.setText("");
        namaTF.setText("");
        alamatTF.setText("");
        noTelpTF.setText("");
        kodeSupplierTF.requestFocus();
    }//GEN-LAST:event_addBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String kode_supplier = this.kodeSupplierTF.getText();
        String nama = this.namaTF.getText();
        String alamat = this.alamatTF.getText();
        String notelp = this.noTelpTF.getText();
        if (kodeSupplierTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Kode Supplier Tidak Boleh Kosong");
        } else {
            if (namaTF.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Data Belum Lengkap, Nama Supplier Tidak Boleh Kosong");
            }
            else {
                if (alamatTF.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this,"Data Belum Lengkap, Alamat Tidak Boleh Kosong");
                }
                else {
                    if (noTelpTF.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this,"Data Belum Lengkap, Nomor Telepon Tidak Boleh Kosong");
                    }
                    else {
                        try {
                            Connection c = ClassDatabase.getkoneksi();
                            String sql = "INSERT INTO supplier values (?, ?, ?, ?)";
                            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);
                            p.setString(1, kode_supplier);
                            p.setString(2, nama);
                            p.setString(3, alamat);
                            p.setString(4, notelp);
                            p.executeUpdate();
                            p.close();
                            JOptionPane.showMessageDialog(this,"Sukses Tambah Data");
                        } catch (SQLException e){
                            System.out.println(e);
                        } finally {
                        }
                    }
                }
            }
        }
        try {
            Connection c = ClassDatabase.getkoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT kode_supplier, nama, alamat, notelp FROM supplier";
            ResultSet r = s.executeQuery(sql);
            tabelData.setModel(DbUtils.resultSetToTableModel(r));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        String kode_supplier = this.kodeSupplierTF.getText();
        String nama = this.namaTF.getText();
        String alamat = this.alamatTF.getText();
        String notelp = this.noTelpTF.getText();
        if (kodeSupplierTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Kode Supplier Tidak Boleh Kosong");
        } else {
            if (namaTF.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nama Supplier Tidak Boleh Kosong");
            }
            else {
                if (alamatTF.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Alamat Tidak Boleh Kosong");
                }
                else {
                    if (noTelpTF.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nomor Telepon Tidak Boleh Kosong");
                    }
                    else {
                        try {
                            Connection c = ClassDatabase.getkoneksi();
                            String sql = "UPDATE `fadhil`.`supplier` SET `nama` = ?, `alamat` = ?, `notelp` = ? WHERE `kode_supplier` = ?";
                            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);
                            p.setString(4, kode_supplier);
                            p.setString(1, nama);
                            p.setString(2, alamat);
                            p.setString(3, notelp);
                            p.executeUpdate();
                            p.close();
                            JOptionPane.showMessageDialog(this,"Sukses Update Data");
                        } catch (SQLException e){
                            System.out.println(e);
                        } finally {
                        }
                    }
                }
            }
        }
        try {
            Connection c = ClassDatabase.getkoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT kode_supplier, nama, alamat, notelp FROM supplier";
            ResultSet r = s.executeQuery(sql);
            tabelData.setModel(DbUtils.resultSetToTableModel(r));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
   String kode_supplier = this.kodeSupplierTF.getText();

try {
    Connection c = ClassDatabase.getkoneksi();
    String deleteSql = "DELETE FROM supplier WHERE kode_supplier=?";
    PreparedStatement p = c.prepareStatement(deleteSql);
    p.setString(1, kode_supplier);

    int rowsAffected = p.executeUpdate();
    p.close();

    if (rowsAffected > 0) {
        JOptionPane.showMessageDialog(this, "Sukses Hapus data");
    } else {
        JOptionPane.showMessageDialog(this, "Gagal menghapus data. Kode supplier tidak ditemukan.");
    }

    // Refresh table data after deletion
    String selectSql = "SELECT kode_supplier, nama, Alamat, notelp FROM supplier";
    Statement s = c.createStatement();
    ResultSet r = s.executeQuery(selectSql);
    tabelData.setModel(DbUtils.resultSetToTableModel(r));
    
    s.close(); // Close statement
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
}
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        int ex = JOptionPane.showConfirmDialog(null, "Apakah Anda akan Keluar?", "Anda Yakin?",
            JOptionPane.YES_NO_OPTION);
        if (ex == 0) {
            dispose();
        }
    }//GEN-LAST:event_closeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextArea alamatTF;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField kodeSupplierTF;
    private javax.swing.JTextField namaTF;
    private javax.swing.JTextField noTelpTF;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTable tabelData;
    // End of variables declaration//GEN-END:variables
}