/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.wstore.views;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;
import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

/**
 *
 * @author ducan
 */
public class FormTaoMaBarCodeSPJDialog extends javax.swing.JDialog {

    private Webcam webcam;
    private WebcamPanel webcamPanel;
    private Thread captureThread;
    private FormThemVaSuaSanPhamJFrame formThemVaSuaSanPhamJFrame;
    private ByteArrayOutputStream baos;

    public FormTaoMaBarCodeSPJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        formThemVaSuaSanPhamJFrame = (FormThemVaSuaSanPhamJFrame) parent;
        initComponents();
        initWebcam();
    }

    private void initWebcam() {
        webcam = Webcam.getWebcams().get(0);
        Dimension size = WebcamResolution.VGA.getSize();
        webcam.setViewSize(size);
        webcamPanel = new WebcamPanel(webcam);
        webcamPanel.setPreferredSize(size);
        webcamPanel.setFPSDisplayed(true);
        pnlShowWebcam.add(webcamPanel,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0,
                        pnlShowWebcam.getWidth(), pnlShowWebcam.getHeight()));
    }

    public void captureThread() {
        captureThread = new Thread() {
            @Override
            public void run() {
                do {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    Result result = null;
                    BufferedImage image = null;
                    if (webcam.open()) {
                        if ((image = webcam.getImage()) == null) {
                            continue;
                        }
                    }
                    LuminanceSource source = new BufferedImageLuminanceSource(image);
                    BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
                    try {
                        result = new MultiFormatReader().decode(bitmap);
                    } catch (NotFoundException ex) {
                        ex.printStackTrace();
                    }
                    if (result != null) {
                        System.out.println("Quét thành công!");
                        txtMaBarcode.setText(result.getText());
                        return;
                    }
                } while (true);
            }
        };
        captureThread.setDaemon(true);
        captureThread.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlShowWebcam = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnTaoImageBarcode = new javax.swing.JButton();
        txtMaBarcode = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblImageBarcode = new javax.swing.JLabel();
        btnQuet = new javax.swing.JButton();
        btnXacNhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(241, 246, 251));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tạo Barcode");

        pnlShowWebcam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlShowWebcam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);

        btnTaoImageBarcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/Download.png"))); // NOI18N
        btnTaoImageBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoImageBarcodeActionPerformed(evt);
            }
        });

        txtMaBarcode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMaBarcode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaBarcode.setMinimumSize(new java.awt.Dimension(64, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 143, 143)));
        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImageBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImageBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnQuet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/barcode.png"))); // NOI18N
        btnQuet.setText("Quét");
        btnQuet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuet.setIconTextGap(5);
        btnQuet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuetActionPerformed(evt);
            }
        });

        btnXacNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/verified.png"))); // NOI18N
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.setIconTextGap(5);
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtMaBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaoImageBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnQuet)
                .addGap(18, 18, 18)
                .addComponent(btnXacNhan)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaoImageBarcode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuet)
                    .addComponent(btnXacNhan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pnlShowWebcam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlShowWebcam, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaoImageBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoImageBarcodeActionPerformed
        getMaBarCode();
    }//GEN-LAST:event_btnTaoImageBarcodeActionPerformed

    private void btnQuetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuetActionPerformed
        txtMaBarcode.setText("");
        lblImageBarcode.setIcon(null);
        captureThread();
    }//GEN-LAST:event_btnQuetActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        formThemVaSuaSanPhamJFrame.txtMaVach.setText(txtMaBarcode.getText());
        this.dispose();
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        webcam.close();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        webcam.close();
    }//GEN-LAST:event_formWindowClosing

    private void getMaBarCode() {
        String nameFile = null;
        try {
            String barcodeData = txtMaBarcode.getText().trim();
            if (barcodeData.isEmpty()) {
                return;
            }
            nameFile = txtMaBarcode.getText().trim();
            Code128Bean code128 = new Code128Bean();
            code128.setHeight(17);
            code128.setModuleWidth(0.2);
            code128.setQuietZone(5); // kích thước khu vực yên tĩnh hay trái và phải nơi không có vạch mã
            baos = new ByteArrayOutputStream();
            BitmapCanvasProvider canvas = new BitmapCanvasProvider(
                    baos, "image/x-png", 300,
                    BufferedImage.TYPE_BYTE_BINARY, false, 0);
            code128.generateBarcode(canvas, nameFile);
            canvas.finish();
            FileOutputStream fos = new FileOutputStream("images/images_barcode_san-pham/" + nameFile + ".png");
            fos.write(baos.toByteArray());
            fos.flush();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Image img = new ImageIcon("images/images_barcode_san-pham/" + nameFile + ".png").getImage()
                .getScaledInstance(lblImageBarcode.getWidth(), lblImageBarcode.getHeight(), Image.SCALE_SMOOTH);
        lblImageBarcode.setIcon(new ImageIcon(img));
    }

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
            java.util.logging.Logger.getLogger(FormTaoMaBarCodeSPJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTaoMaBarCodeSPJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTaoMaBarCodeSPJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTaoMaBarCodeSPJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormTaoMaBarCodeSPJDialog dialog = new FormTaoMaBarCodeSPJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuet;
    private javax.swing.JButton btnTaoImageBarcode;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblImageBarcode;
    private javax.swing.JPanel pnlShowWebcam;
    private javax.swing.JTextField txtMaBarcode;
    // End of variables declaration//GEN-END:variables
}
