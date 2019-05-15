/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imktubes;

import imktubes.AddList.Add;
import imktubes.AddList.addList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.graalvm.compiler.nodes.PauseNode;

/**
 *
 * @author KiraAsBlued4
 */
public class pesenHP extends javax.swing.JFrame {

    String url= "src/Data/List Harga Barang.txt";
    File file= new File(url);
    BufferedReader br;
    BufferedWriter write;
   
    DefaultTableModel model;
    public static Vector temp;

    public pesenHP() {
        initComponents();
        loadData();

    }

    public void loadData() {
        
        try {
            br = new BufferedReader(new FileReader(file));
            String barisPertama = br.readLine();
            String[] namaKolom = barisPertama.split(",");
            model = (DefaultTableModel) jTable2.getModel();
            model.setColumnIdentifiers(namaKolom);

            Object[] dataBaris = br.lines().toArray();
            for (int i = 0; i < dataBaris.length; i++) {
                String baris = dataBaris[i].toString();
                String[] data = baris.split("/");
                model.addRow(data);
            }

        } catch (Exception e) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        namaKonser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        kategori = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jumlah = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("karcis.com");
        setBackground(new java.awt.Color(153, 0, 153));
        setMinimumSize(new java.awt.Dimension(1047, 626));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(92, 111, 756, 159);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Nama Konser: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(92, 288, 159, 33);

        namaKonser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaKonserActionPerformed(evt);
            }
        });
        jPanel1.add(namaKonser);
        namaKonser.setBounds(255, 294, 293, 33);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Kategori Tiket:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(92, 342, 159, 29);

        kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriActionPerformed(evt);
            }
        });
        jPanel1.add(kategori);
        kategori.setBounds(255, 338, 280, 33);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Jumlah Tiket:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(92, 389, 159, 29);

        jumlah.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 TICKET", "2 TICKET", "3 TICKET", "4 TICKET", "5 TICKET", " " }));
        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });
        jPanel1.add(jumlah);
        jumlah.setBounds(255, 399, 136, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Total Harga: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(92, 430, 159, 32);
        jPanel1.add(Total);
        Total.setBounds(255, 436, 280, 32);

        jButton1.setText("OK");
        jPanel1.add(jButton1);
        jButton1.setBounds(92, 496, 102, 23);

        jButton2.setText("CANCEL");
        jPanel1.add(jButton2);
        jButton2.setBounds(255, 496, 71, 23);

        jButton3.setText("BUKTI PEMBELIAN");
        jPanel1.add(jButton3);
        jButton3.setBounds(429, 496, 119, 23);

        jButton4.setText("Tambah");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(648, 275, 71, 23);

        jButton5.setText("Delete");
        jPanel1.add(jButton5);
        jButton5.setBounds(866, 218, 92, 23);

        jLabel5.setFont(new java.awt.Font("Square721 Cn BT", 0, 65)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BookMySeat");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(41, 11, 297, 79);

        jButton6.setText("Update Tambahan");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(725, 275, 121, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Untitled-1.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 1048, 630);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1050, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaKonserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaKonserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaKonserActionPerformed

    private void kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kategoriActionPerformed

    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        Add add = new Add();

        add.setVisible(true);
        addList addlist = new addList();

        System.out.println(addlist.getAddList());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       url = "src/Data/newfile.txt";
       file = new File(url);
       PrintWriter a;
       if (temp == null) {

        } else {
           model.addRow(temp);
           try {
               a = new PrintWriter(new FileWriter(file));

               /*for (int i = 0;i< jTable2.getRowCount(); i++) {
                   for (int j = 0;j< jTable2.getColumnCount(); j++) {
                       write.write(jTable2.getValueAt(i, j).toString());
                   }
               }*/
               a.print(url);
           } catch (Exception e) {

            }
        }

        temp = null;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int row = jTable2.getSelectedRow();
        namaKonser.setText(jTable2.getValueAt(row, 0).toString());
        kategori.setText(jTable2.getValueAt(row, 1).toString());
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(pesenHP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pesenHP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pesenHP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pesenHP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pesenHP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Total;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable2;
    private javax.swing.JComboBox jumlah;
    private javax.swing.JTextField kategori;
    private javax.swing.JTextField namaKonser;
    // End of variables declaration//GEN-END:variables
}
