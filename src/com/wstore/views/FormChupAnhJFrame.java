/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.wstore.views;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.wstore.utilities.Helper;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ducan
 */
public class FormChupAnhJFrame extends javax.swing.JFrame {

    private Webcam webcam;
    private WebcamPanel webcamPanel;
    private BufferedImage image;

    public FormChupAnhJFrame() {
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
        webcamPanel.setImageSizeDisplayed(true);
        webcamPanel.setDisplayDebugInfo(true);
        pnlWebcam.add(webcamPanel,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 
                        pnlWebcam.getWidth(), pnlWebcam.getHeight()));
        webcam.open();        
        // xem webcam hỗ trợ độ phân giải
//        if (webcam != null) {
//            Dimension[] sizes = webcam.getViewSizes();
//            for (Dimension sizeHoTro : sizes) {
//                System.out.println("Supported resolution: " + sizeHoTro.width + "x" + sizeHoTro.height);
//            }
//        }
    }

    private void captureImage() {
        // lấy ảnh chụp từ webcam
        image = webcam.getImage();

        // kiểm tra ảnh đã được chụp chưa 
        // nếu đã chụp đưa ra thông báo thành công
        if (image != null) {
            JOptionPane.showMessageDialog(this, "Chụp ảnh thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Lỗi chụp ảnh");
            return;
        }
        // chọn vị trí lưu ảnh chụp
        // dẫn mặc định đến nơi sẽ lưu ảnh
        JFileChooser jfc = new JFileChooser("images//Images_NhanVien");
        jfc.setPreferredSize(Helper.dimensionJFileChooser);
        // đặt tiêu đề cho dialog
        jfc.setDialogTitle("Chọn vị trí lưu ảnh");
        // Tạo bộ lọc tệp tin cho phép chọn nhiều đuôi
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Images (*.jpg;*.jpeg;*.png;*.gif)",
                "jpg", "jpeg", "png", "gif");
        jfc.setFileFilter(imageFilter);

        // set mặc định tên ảnh và đuôi ảnh để lưu 
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hhmmss");
        jfc.setSelectedFile(new File("Screenshot " + sdf.format(new Date()) + ".png"));

        int choose = jfc.showSaveDialog(this);
        if (choose == JFileChooser.APPROVE_OPTION) {
            // lấy ra đối tượng file sẽ lưu file ảnh
            File outputFile = jfc.getSelectedFile();

            // lấy đường dẫn tuyệt đối đến tệp tin đó
            String filePath = outputFile.getAbsolutePath();
            // kiểm tra rằng đuôi file hợp lệ
            String[] arrDuoiImg = {".jpg", ".jpeg", ".png", ".gif"};
            if (!isDuoiFile(filePath, arrDuoiImg)) {
                // nếu không hợp lệ set cho đuôi file là .png
                outputFile = new File(filePath + ".png");
            }

            // lưu ảnh với các định dạng khác nhau
            try {
                if (filePath.toLowerCase().endsWith(".jpg")) {
                    ImageIO.write(image, "JPG", outputFile);
                } else if (filePath.toLowerCase().endsWith(".png")) {
                    ImageIO.write(image, "PNG", outputFile);
                } else if (filePath.toLowerCase().endsWith(".gif")) {
                    ImageIO.write(image, "GIF", outputFile);
                } else if (filePath.toLowerCase().endsWith(".jpeg")) {
                    ImageIO.write(image, "JPEG", outputFile);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private boolean isDuoiFile(String filePath, String[] validExtensions) {
        for (String duoiFile : validExtensions) {
            if (filePath.toLowerCase().endsWith(duoiFile.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
    
    private void closeWebcame() {
        if(webcam != null) {
            webcam.close();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlWebcam = new javax.swing.JPanel();
        btnChup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlWebcam.setBackground(new java.awt.Color(243, 243, 243));
        pnlWebcam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnChup.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnChup.setText("Chụp");
        btnChup.setToolTipText("Chụp ảnh");
        btnChup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnChup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
            .addComponent(pnlWebcam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlWebcam, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btnChup, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChupActionPerformed
        captureImage();
    }//GEN-LAST:event_btnChupActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        closeWebcame();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FormChupAnhJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormChupAnhJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormChupAnhJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormChupAnhJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormChupAnhJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChup;
    private javax.swing.JPanel pnlWebcam;
    // End of variables declaration//GEN-END:variables

}
