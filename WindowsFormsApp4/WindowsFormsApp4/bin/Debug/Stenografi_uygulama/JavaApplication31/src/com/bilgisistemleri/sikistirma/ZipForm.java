package com.bilgisistemleri.sikistirma;

import java.awt.FileDialog;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * CRCForm.java
 *
 * Created on November 3, 2007, 12:12 PM
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class ZipForm extends javax.swing.JFrame {

//    EmbProcess ep;
   
    private final Zip zip = new Zip();
    private File[] file;

    /**
     * Creates new form CRCForm
     */
    public ZipForm() {
        initComponents();
        int lebar = this.getWidth() / 2;
        int tinggi = this.getHeight() / 2;
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width / 2) - lebar;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height / 2) - tinggi;
        this.setLocation(x, y);
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pathTf = new javax.swing.JTextField();
        browseBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        originalLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        closeBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Video Stenografi - ZIP");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Zip ile sıkıştırılacak dosya :");

        pathTf.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pathTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathTfActionPerformed(evt);
            }
        });

        browseBtn.setBackground(new java.awt.Color(255, 255, 255));
        browseBtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        browseBtn.setText("...");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel6.setText("ZIP");

        originalLbl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        originalLbl.setText("Orjinal dosya :");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        closeBtn.setBackground(new java.awt.Color(255, 255, 255));
        closeBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        closeBtn.setText("Kapat");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        closeBtn1.setBackground(new java.awt.Color(255, 255, 255));
        closeBtn1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        closeBtn1.setText("ZIP");
        closeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtn1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(143, 143, 143)
                                .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jLabel10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(originalLbl)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .add(layout.createSequentialGroup()
                        .add(319, 319, 319)
                        .add(closeBtn)
                        .add(18, 18, 18)
                        .add(closeBtn1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(pathTf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 252, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(browseBtn)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 106, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(158, 158, 158))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(20, 20, 20)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(pathTf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseBtn))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(closeBtn)
                    .add(closeBtn1))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(originalLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pathTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathTfActionPerformed

    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
        // TODO add your handling code here:
        FileDialog filedialog = new FileDialog(new JFrame(), "Sıkıştırılacak Dosyayı Seçin");
//        filedialog.setFile("*.mpeg;");
        String s = new String();
        filedialog.setVisible(true);
        file = filedialog.getFiles();
        jLabel5.setText(filedialog.getFile());
        pathTf.setText(filedialog.getDirectory() + filedialog.getFile());
        closeBtn1.setEnabled(true);
//String des = System.getProperty("user.home")+"/Desktop/SteganFile/";
//                File fi=new File(des, "CompressedFile");
//                fi.mkdirs();
//                
//        inputFile = new File(filedialog.getDirectory() + file);
//        outputFile = new File(fi, filedialog.getFile());
//        if (outputFile.exists()) {
//            outputFile.delete();
//        }

    }//GEN-LAST:event_browseBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void closeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtn1ActionPerformed
        // TODO add your handling code here:
                
        if(pathTf.getText().equals("") ){
         JOptionPane.showMessageDialog(null," Sıkıştırılacak dosya seçilmelidir");
 
        }else{
            try {
                for(File files: file)
                {
                 zip.zipFile(files);
                JOptionPane.showMessageDialog(null, " Sıkıştırma Devam Ediyor.. ");
                pathTf.setText(" ");
                }
            } catch (IOException ex) {
                Logger.getLogger(ZipForm.class.getName()).log(Level.SEVERE, null, ex);
                
            }
       
      Toolkit.getDefaultToolkit().beep();
      JOptionPane.showMessageDialog(this, "Sıkıştırma tamamlandı!");
}
    }//GEN-LAST:event_closeBtn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZipForm().setVisible(true);
            }
        });
    }

   


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton closeBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel originalLbl;
    private javax.swing.JTextField pathTf;
    // End of variables declaration//GEN-END:variables
}
