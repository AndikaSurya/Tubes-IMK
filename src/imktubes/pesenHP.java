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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KiraAsBlued4
 */
public class pesenHP extends javax.swing.JFrame {

    String url= "src/Data/List Harga Barang.txt";
    File file= new File(url);
    BufferedReader br;
    BufferedWriter write;
    
    int beli,harga,totalH;
    
  
    
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
        Tottttttt = new javax.swing.JLabel();
        namaKonser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        kategori = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jumlah = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hg = new javax.swing.JTextField();

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

        Tottttttt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tottttttt.setText("0");
        jPanel1.add(Tottttttt);
        Tottttttt.setBounds(260, 500, 110, 30);

        namaKonser.setEditable(false);
        namaKonser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaKonserActionPerformed(evt);
            }
        });
        jPanel1.add(namaKonser);
        namaKonser.setBounds(260, 290, 293, 33);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Kategori Tiket:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 370, 159, 29);

        kategori.setEditable(false);
        kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriActionPerformed(evt);
            }
        });
        jPanel1.add(kategori);
        kategori.setBounds(260, 370, 280, 33);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Jumlah Tiket:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 460, 159, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Total Harga: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 500, 159, 32);

        jButton1.setText("Konfirmasi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(580, 370, 130, 130);

        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(400, 550, 91, 29);

        jButton3.setText("BUKTI PEMBELIAN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(160, 550, 167, 29);

        jButton4.setText("Tambah");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(870, 180, 91, 29);

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(870, 130, 92, 29);

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
        jButton6.setBounds(870, 230, 163, 29);

        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });
        jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jumlahKeyReleased(evt);
            }
        });
        jPanel1.add(jumlah);
        jumlah.setBounds(260, 460, 130, 26);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Harga 1 Tiket: ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 420, 170, 30);

        hg.setEditable(false);
        hg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hgActionPerformed(evt);
            }
        });
        jPanel1.add(hg);
        hg.setBounds(260, 420, 280, 26);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1050, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaKonserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaKonserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaKonserActionPerformed

    private void kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kategoriActionPerformed

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
        hg.setText(jTable2.getValueAt(row, 2).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        try {
            int SelectedRowIndex = jTable2.getSelectedRow();
            model.removeRow(SelectedRowIndex);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        namaKonser.setText("");
        kategori.setText("");
        
    

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        // TODO add your handling code here:
                String a, b;
        a=jumlah.getText();
        beli = Integer.parseInt(a);
        b = hg.getText();
        harga = Integer.parseInt(b);
        totalH = harga * beli;
        
        Tottttttt.setText(String.valueOf(totalH));
    }//GEN-LAST:event_jumlahActionPerformed

    private void hgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hgActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        namaKonser.setText("");
        kategori.setText("");
        hg.setText("");
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlahKeyReleased
        // TODO add your handling code here:
       
            int a, b, c;

            a = Integer.valueOf(jumlah.getText());
            b = Integer.valueOf(hg.getText());

            c = a * b;
            Tottttttt.setText("" + c);
        


    }//GEN-LAST:event_jumlahKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int selectedr= jTable2.getSelectedRow();
        String s =  jTable2.getValueAt(selectedr, 3).toString();
        int stok = Integer.parseInt(s);
        String jml = jumlah.getText();
        
        int stokBaru = (stok - Integer.parseInt(jml));
        
        jTable2.getModel().setValueAt(stokBaru,selectedr,3);
        System.out.println(stokBaru);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        bukti.setText("Nama Konser: "+namaKonser.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JLabel Tottttttt;
    private javax.swing.JTextField hg;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable2;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField kategori;
    private javax.swing.JTextField namaKonser;
    // End of variables declaration//GEN-END:variables
}
