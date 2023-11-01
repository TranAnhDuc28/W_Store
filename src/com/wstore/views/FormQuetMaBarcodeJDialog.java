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
import java.awt.image.BufferedImage;

/**
 *
 * @author ducan
 */
public class FormQuetMaBarcodeJDialog extends javax.swing.JDialog {

    private Webcam webcam;
    private WebcamPanel webcamPanel;
    //Tạo ra một Thread chạy song song với Thread chính
    //để có thể chụp ảnh liên tiếp mà k ảnh hưởng đến thread chính
    private Thread captureThread;

    public FormQuetMaBarcodeJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initWebcam();
    }


    private void initWebcam() {
        //khởi tạo thuộc tính webcam của jFrame
        //qua hàm getWebcam của lớp Webcam
        webcam = Webcam.getWebcams().get(0);
        //Tạo một đối tượng Dimension để lấy kích thước
        //của độ phân giải VGA qua hàm getSize() của lớp
        //WebcamResolution.
        Dimension size = WebcamResolution.VGA.getSize();
        //Set kích thước hiển thị của webcam theo đối tượng
        //Dimension vừa tạo
        webcam.setViewSize(size);
        //Khởi tạo thuộc tính webcamPanel với tham số
        //là thuộc tính webcam
        webcamPanel = new WebcamPanel(webcam);
        //Set kích thước của panel bằng với kích thước
        //hiển thị của webcam
        webcamPanel.setPreferredSize(size);
        //Set thuộc tính FPSDisplayed của panel thành true
        //để hiển thị số khung hình lên
        webcamPanel.setFPSDisplayed(true);
        //Thêm webcamPanel vào showPanel mà chúng ta đã tạo
        //lúc đầu và set vị trị của webcamPanel thông qua
        //hàm khởi tạo của Absolute Layout
        pnlShowWebcam.add(webcamPanel,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0,
                        pnlShowWebcam.getWidth(), pnlShowWebcam.getHeight()));
    }

    public void captureThread() {
        captureThread = new Thread() {
            //Ghi đề phương thức run để thực hiện code
            @Override
            public void run() {
                //tạo một vòng while để Thread thực hiện
                //chụp ảnh liên tục
                do {
                    try {
                        //Sử dụng phương thức sleep() của Thread
                        //để sau mỗi 100mili giây mới tiến hành chụp
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    //Khai báo một đối tượng Result thuộc thư viện Zxing
                    //để lưu kết quả giải mã
                    Result result = null;
                    //Tạo một đối tượng ảnh để lưu ảnh chụp được
                    BufferedImage image = null;
                    //Kiểm tra xem webcam đã mở hay chưa
                    if (webcam.open()) {
                        //Nếu webcam không trả về ảnh được ảnh chụp thì
                        //lặp lại vòng lặp ngay lập tức
                        if ((image = webcam.getImage()) == null) {
                            continue;
                        }
                    }
                    //Tạo một đối tượng để giải mã ảnh vừa chụp được ra dạng Bitmap
                    LuminanceSource source = new BufferedImageLuminanceSource(image);
                    //Tạo một đối tượng Bitmap để lưu bitmap vừa được giải mã
                    BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
                    try {
                        //Giải mã bitmap thông qua đối tượng MultiFormatReader
                        //với phương thức decode() và lưu vào biến result
                        result = new MultiFormatReader().decode(bitmap);
                    } catch (NotFoundException ex) {
                        ex.printStackTrace();
                    }
                    //Kiểm tra nếu giải mã thành công và gán giá trị
                    //cho biến result thì in kết quả đó lên TextField
                    if (result != null) {
                        System.out.println("Quét thành công!");
                        txtCode.setText(result.getText());
                        btnQuet.setEnabled(false);
                        return;
                    }
                } while (true); //Vòng lặp vô hạn                            
            }
        };
//        Phương thức setDaemon() của lớp luồng được sử dụng để đánh dấu luồng 
//        hoặc luồng daemon hoặc luồng người dùng.
//        Tuổi thọ của nó phụ thuộc vào các luồng người dùng, tức là 
//        khi tất cả các luồng người dùng chết, JVM sẽ tự động chấm dứt luồng này.
//        Nó phải được gọi trước khi luồng được bắt đầu.       
        //Set thread này là một Daemon thread và chạy thread
        captureThread.setDaemon(true);
        captureThread.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCode = new javax.swing.JTextArea();
        btnQuet = new javax.swing.JButton();
        pnlShowWebcam = new javax.swing.JPanel();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Result");

        txtCode.setColumns(20);
        txtCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCode.setLineWrap(true);
        txtCode.setRows(5);
        jScrollPane2.setViewportView(txtCode);

        btnQuet.setText("Quét");
        btnQuet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuetActionPerformed(evt);
            }
        });

        pnlShowWebcam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlShowWebcam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlShowWebcam, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnQuet, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 365, Short.MAX_VALUE))))
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlShowWebcam, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnQuet, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuetActionPerformed
        captureThread();
    }//GEN-LAST:event_btnQuetActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        txtCode.setText("");
        btnQuet.setEnabled(true);
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(FormQuetMaBarcodeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormQuetMaBarcodeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormQuetMaBarcodeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormQuetMaBarcodeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormQuetMaBarcodeJDialog dialog = new FormQuetMaBarcodeJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlShowWebcam;
    private javax.swing.JTextArea txtCode;
    // End of variables declaration//GEN-END:variables
}
