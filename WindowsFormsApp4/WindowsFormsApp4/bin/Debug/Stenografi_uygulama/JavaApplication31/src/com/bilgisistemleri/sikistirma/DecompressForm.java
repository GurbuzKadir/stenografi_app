package com.bilgisistemleri.sikistirma;

import com.bilgisistemleri.Stegnography.EmbProcess;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


      //decompressing a file into its original size.
public class DecompressForm extends javax.swing.JFrame {

    private EmbProcess ep;
    private File inputFile;
    private File outputFile;
    private static String dir= "";
    private static String dir2= "";
    private final CompressionDecompression comp = new CompressionDecompression();
    
   
    public DecompressForm() {
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
        jLabel3 = new javax.swing.JLabel();
        originalLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        decompressBtn = new javax.swing.JButton();
        titleL = new javax.swing.JLabel();
        decompressLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Video Stenografi - Dosya Genişletme");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Dosya :");

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

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        originalLbl.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        originalLbl.setText("Sıkıştırılmış dosya :");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        decompressBtn.setBackground(new java.awt.Color(255, 255, 255));
        decompressBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        decompressBtn.setText("Genişlet");
        decompressBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decompressBtnActionPerformed(evt);
            }
        });

        titleL.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        titleL.setText("Dosya Genişletme");

        decompressLbl.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        decompressLbl.setText("Genişletilmiş dosya :");

        jLabel9.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N

        closeBtn.setBackground(new java.awt.Color(255, 255, 255));
        closeBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        closeBtn.setText("Kapat");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(194, 194, 194)
                        .add(jLabel9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(titleL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 288, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(jLabel1)
                                .add(50, 50, 50)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(layout.createSequentialGroup()
                                        .add(pathTf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 311, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(browseBtn))
                                    .add(layout.createSequentialGroup()
                                        .add(closeBtn)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(decompressBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                        .add(0, 2, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(decompressLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 181, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(originalLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 159, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(titleL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(41, 41, 41)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(pathTf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseBtn))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(closeBtn)
                    .add(decompressBtn))
                .add(83, 83, 83)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(layout.createSequentialGroup()
                        .add(originalLbl)
                        .add(28, 28, 28))
                    .add(layout.createSequentialGroup()
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(decompressLbl)
                            .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(18, 18, 18)
                .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pathTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathTfActionPerformed

    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed

        FileDialog filedialog = new FileDialog(new JFrame(), "Sıkıştırılmış Dosyayı Seçin");
        String s = new String();
        filedialog.setVisible(true);
        filedialog.getFile();
        jLabel3.setText(filedialog.getFile());
        pathTf.setText(filedialog.getDirectory() + filedialog.getFile());
        String des = System.getProperty("user.home")+"/Desktop/Stenografi/";
                File fi=new File(des, "Açılmış Dosya");
                fi.mkdirs();    
        inputFile = new File(filedialog.getDirectory() + filedialog.getFile());
        outputFile = new File(fi, filedialog.getFile());
        if (outputFile.exists()) {
            outputFile.delete();
        }

        
    }//GEN-LAST:event_browseBtnActionPerformed
    private void decompressBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decompressBtnActionPerformed
        //add your handling code here;
         titleL.setText("Genişletme devam ediyor ...");
        try{
             comp.Idecompress(inputFile, outputFile);
             //JOptionPane.showMessageDialog(this, "decompression in progress");
             pathTf.setText("");
        }catch(IOException e)
        {
        }
         Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(this, "Genişletme bitti!");
        titleL.setText("Dosya sıkıştırma");
         
    }//GEN-LAST:event_decompressBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    

   

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DecompressForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton decompressBtn;
    private javax.swing.JLabel decompressLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel originalLbl;
    private javax.swing.JTextField pathTf;
    private javax.swing.JLabel titleL;
    // End of variables declaration//GEN-END:variables
}
