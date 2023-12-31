/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppDataMHSC3;

/**
 *
 * @author ReS
 */
import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
     private void kosongkan_form(){
    nama.setEditable(true);
    nama.setText(null);
    nim.setText(null);
    prodi.setSelectedItem(this);
    email.setText(null);
    }
       private void tampilkan_data(){
        
        //Mengisi Baris ke 1 pada tabel (Judul)
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("N0");
        model.addColumn("NAMA");
        model.addColumn("NIM");
        model.addColumn("PRODI");
        model.addColumn("Email");
        
        //Memanggil Data dari Database
        try{
            int no = 1;
            String sql = "SELECT * FROM datamahasiswa_javac3 ";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.Statement stm= conn.createStatement();
            java.sql.ResultSet res= stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow (new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4)});
            }
            datamahasiswa_javac3.setModel(model);
            
            
        }catch(SQLException e){
            System.out.println("Error : "  + e.getMessage());
        }
    
    }
    
    public Home() {
        initComponents();  
        tampilkan_data();
        kosongkan_form();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datamahasiswa_javac3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        nim = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        prodi = new javax.swing.JComboBox<>();
        kosongdata = new javax.swing.JButton();
        hapusdata = new javax.swing.JButton();
        editdata = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        keluar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 196, 25));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel1.setForeground(new java.awt.Color(17, 196, 25));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\AppDataMHSC3\\img\\logostmik.jpg")); // NOI18N

        logout.setBackground(new java.awt.Color(255, 51, 0));
        logout.setFont(new java.awt.Font("Algerian", 0, 16)); // NOI18N
        logout.setText("Logout !");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logout)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 281, 500);

        jPanel3.setBackground(new java.awt.Color(255, 204, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));

        jLabel2.setFont(new java.awt.Font("Algerian", 2, 36)); // NOI18N
        jLabel2.setText("DAFTAR MAHASISWA JAVA C3");

        datamahasiswa_javac3.setModel(new javax.swing.table.DefaultTableModel(
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
        datamahasiswa_javac3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datamahasiswa_javac3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(datamahasiswa_javac3);

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 16)); // NOI18N
        jLabel4.setText("NAMA");

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 16)); // NOI18N
        jLabel5.setText("NIM");

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 16)); // NOI18N
        jLabel6.setText("PRODI");

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 16)); // NOI18N
        jLabel7.setText("EMAIL");

        nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimActionPerformed(evt);
            }
        });

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        prodi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IFSI", "IFD3", "IFRPL" }));

        kosongdata.setFont(new java.awt.Font("Algerian", 0, 16)); // NOI18N
        kosongdata.setText("KOSONGKAN DATA");
        kosongdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kosongdataActionPerformed(evt);
            }
        });

        hapusdata.setBackground(new java.awt.Color(255, 0, 0));
        hapusdata.setFont(new java.awt.Font("Algerian", 0, 16)); // NOI18N
        hapusdata.setText("HAPUS DATA");
        hapusdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusdataActionPerformed(evt);
            }
        });

        editdata.setBackground(new java.awt.Color(255, 255, 0));
        editdata.setFont(new java.awt.Font("Algerian", 0, 16)); // NOI18N
        editdata.setText("EDIT DATA");
        editdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editdataActionPerformed(evt);
            }
        });

        simpan.setBackground(new java.awt.Color(102, 204, 0));
        simpan.setFont(new java.awt.Font("Algerian", 0, 16)); // NOI18N
        simpan.setText("TAMBAH DATA");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        keluar.setBackground(new java.awt.Color(255, 51, 0));
        keluar.setFont(new java.awt.Font("Algerian", 0, 16)); // NOI18N
        keluar.setText("EXIT");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(prodi, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(editdata)
                                        .addGap(18, 18, 18)
                                        .addComponent(simpan))
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(hapusdata)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kosongdata)
                                .addGap(18, 18, 18)
                                .addComponent(keluar))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(prodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hapusdata)
                            .addComponent(editdata)
                            .addComponent(simpan)
                            .addComponent(kosongdata)
                            .addComponent(keluar))
                        .addContainerGap())))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(280, 0, 820, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1096, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void kosongdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kosongdataActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_kosongdataActionPerformed

    private void hapusdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusdataActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM datamahasiswa_javac3 WHERE Nim= '"+nim.getText()+"'";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "HAPUS Data Berhasil !!");
            tampilkan_data();
            kosongkan_form();
        }catch(HeadlessException |SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_hapusdataActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
      
    }//GEN-LAST:event_keluarActionPerformed

    private void datamahasiswa_javac3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datamahasiswa_javac3MouseClicked
        // TODO add your handling code here:
        int kolom = datamahasiswa_javac3.rowAtPoint(evt.getPoint());
        String Nama = datamahasiswa_javac3.getValueAt(kolom, 1).toString();
        nama.setText(Nama);
        
        String Nim = datamahasiswa_javac3.getValueAt(kolom, 2).toString();
        nim.setText(Nim);
        
        String Prodi = datamahasiswa_javac3.getValueAt(kolom, 3).toString();
        prodi.setSelectedItem(Prodi);
        
        String Email = datamahasiswa_javac3.getValueAt(kolom, 4).toString();
        email.setText(Email);
    }//GEN-LAST:event_datamahasiswa_javac3MouseClicked

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
                try{
            String sql = "INSERT INTO datamahasiswa_javac3 VALUES ('"+nama.getText()+"','"+nim.getText()+"','"+prodi.getSelectedItem()+"','"+email.getText()+"')";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses Simpan Data Berhasil !!");
            tampilkan_data();
            kosongkan_form();
            
        }catch(HeadlessException |SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void editdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editdataActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "UPDATE datamahasiswa_javac3 "
                    + "SET Nama='"+nama.getText()+"',Nim='"+nim.getText()+"',Prodi='"+prodi.getSelectedItem()+"',Email='"+email.getText()+"'"
                    + " WHERE Nim = '"+nim.getText()+"'"; 
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "EDIT Data Berhasil !!");
            
        }catch(HeadlessException |SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        tampilkan_data();
        kosongkan_form();
    }//GEN-LAST:event_editdataActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        int dialogBtn = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Anda Yakin Keluar ?", "PERINGATAN",dialogBtn);
        if(dialogResult == 0){
            //kondisi  jika klik ya
            Login n = new Login();
            n.setVisible(true);
            this.setVisible(false);
            
        }else {
            
        }        
// TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable datamahasiswa_javac3;
    private javax.swing.JButton editdata;
    private javax.swing.JTextField email;
    private javax.swing.JButton hapusdata;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton kosongdata;
    private javax.swing.JButton logout;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nim;
    private javax.swing.JComboBox<String> prodi;
    private javax.swing.JButton simpan;
    // End of variables declaration//GEN-END:variables
}
