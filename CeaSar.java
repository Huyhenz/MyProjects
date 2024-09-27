package week1;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CeaSar extends javax.swing.JFrame {

    /**
     * Creates new form GIAODIENBAI1
     */
    public CeaSar() {
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

        CEASAR = new javax.swing.JLabel();
        PlainText = new javax.swing.JLabel();
        txt_PT = new javax.swing.JTextField();
        Key = new javax.swing.JLabel();
        txt_key = new javax.swing.JTextField();
        bt_E = new javax.swing.JButton();
        CinpherText = new javax.swing.JLabel();
        txt_CP = new javax.swing.JTextField();
        bt_D = new javax.swing.JButton();
        F_F = new javax.swing.JButton();
        OP_F = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CEASAR.setText("                             CEASAR");

        PlainText.setText("Plain Text: ");

        txt_PT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PTActionPerformed(evt);
            }
        });

        Key.setText("Key: ");

        bt_E.setText("Encrypt");
        bt_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EActionPerformed(evt);
            }
        });

        CinpherText.setText("Cinpher Text: ");

        txt_CP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CPActionPerformed(evt);
            }
        });

        bt_D.setText("Decrypt");
        bt_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_DActionPerformed(evt);
            }
        });

        F_F.setText("Fill File");
        F_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_FActionPerformed(evt);
            }
        });

        OP_F.setText("Open File");
        OP_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OP_FActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CinpherText)
                    .addComponent(PlainText)
                    .addComponent(Key))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_CP)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_D)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OP_F))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_E)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(F_F))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CEASAR, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 85, Short.MAX_VALUE))
                            .addComponent(txt_PT)
                            .addComponent(txt_key))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(CEASAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_PT, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_E)
                            .addComponent(F_F))
                        .addGap(18, 18, 18)
                        .addComponent(txt_CP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PlainText)
                        .addGap(51, 51, 51)
                        .addComponent(Key)
                        .addGap(72, 72, 72)
                        .addComponent(CinpherText)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_D)
                    .addComponent(OP_F))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_PTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PTActionPerformed

    private void bt_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_EActionPerformed
                // TODO add your handling code here:
        int k = Integer.valueOf(this.txt_key.getText());
        String br = this.txt_PT.getText();
        this.txt_CP.setText(mahoa(br,k));
        
    }//GEN-LAST:event_bt_EActionPerformed

    private void txt_CPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CPActionPerformed

    private void F_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_FActionPerformed
        // TODO add your handling code here:
        try{
            BufferedWriter bw = null;
            String fileName = "M:\\Dulieu.txt";
            String s = txt_CP.getText();
            
            bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(s);
            bw.close();
            JOptionPane.showMessageDialog(null, "Da ghi file thanh cong!");
            
        }catch(IOException ex)
        {
            Logger.getLogger(Ceasar.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_F_FActionPerformed

    private void bt_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_DActionPerformed
        // TODO add your handling code here:
        int k = Integer.valueOf(this.txt_key.getText());
        String br = this.txt_CP.getText();
        this.txt_PT.setText(mahoa(br, -k));
    }//GEN-LAST:event_bt_DActionPerformed

    private void OP_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OP_FActionPerformed
        // TODO add your handling code here:
        try{
            BufferedReader br = null;
            String fileName = "M:\\Dulieu.txt";
            br = new BufferedReader(new FileReader(fileName));
            
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null, "Da mo file thanh cong!");
            
            char [] ca = new char[5];
            while(br.ready()){
                int len = br.read(ca);
                sb.append(ca,0,len);
            }
            br.close();
            
            System.out.println("Du lieu la: " + " " + sb);
            String str = sb.toString();
            
            txt_PT.setText(str);
            
        }catch(IOException ex){
            Logger.getLogger(Ceasar.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_OP_FActionPerformed
    char mahoakt(char c, int k)
    {
        if(!Character.isLetter(c))
            return c;
        return (char) ((((Character.toUpperCase(c) - 'A') +k) % 26 + 26) % 26 + 'A');
    }
    
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
            java.util.logging.Logger.getLogger(CeaSar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CeaSar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CeaSar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CeaSar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
          
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CeaSar().setTitle("Ma hoa Ceasar");
                new CeaSar().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CEASAR;
    private javax.swing.JLabel CinpherText;
    private javax.swing.JButton F_F;
    private javax.swing.JLabel Key;
    private javax.swing.JButton OP_F;
    private javax.swing.JLabel PlainText;
    private javax.swing.JButton bt_D;
    private javax.swing.JButton bt_E;
    private javax.swing.JTextField txt_CP;
    private javax.swing.JTextField txt_PT;
    private javax.swing.JTextField txt_key;
    // End of variables declaration//GEN-END:variables

    private String mahoa(String br, int k) {
            String kq = " ";
            for(int i = 0; i < br.length(); i++)
                kq += mahoakt(br.charAt(i), k);
            return kq;
    }

    private static class Ceasar {

        public Ceasar() {
        }
    }
}
