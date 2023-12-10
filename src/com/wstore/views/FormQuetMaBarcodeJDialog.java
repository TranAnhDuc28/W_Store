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
import com.wstore.services.ISanPhamService;
import com.wstore.services.impl.SanPhamService;
import com.wstore.utilities.Helper;
import com.wstore.viewmodels.HoaDonChiTietViewModel;
import com.wstore.viewmodels.banhang.SanPhamBanHangViewModel;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author ducan
 */
public class FormQuetMaBarcodeJDialog extends javax.swing.JDialog {

    private Webcam webcam;
    private WebcamPanel webcamPanel;
    private Thread captureThread;
    private ISanPhamService sanPhamService = new SanPhamService();
    private Map<SanPhamBanHangViewModel, Integer> listUpdateSoLuongSP = new HashMap<>();
    private FormTabBanHangJPanel formTabBanHangJPanel;
    private SanPhamBanHangViewModel sp;

    public FormQuetMaBarcodeJDialog(java.awt.Frame parent, boolean modal, JPanel jPanel) {
        super(parent, modal);
        this.formTabBanHangJPanel = (FormTabBanHangJPanel) jPanel;
        initComponents();
        init();
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
                        txtMaBarCode.setText(result.getText());
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
        pnlShowWebcam = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnQuet = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblHinhAnh = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGiaKM = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spnSoLuongMua = new javax.swing.JSpinner();
        btnThemVaoGioHang = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        txtMaSanPham = new javax.swing.JTextField();
        txtTenSP = new javax.swing.JTextField();
        txtSoLuongTon = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaBarCode = new javax.swing.JTextField();

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

        pnlShowWebcam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlShowWebcam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.setOpaque(false);

        btnQuet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/barcode.png"))); // NOI18N
        btnQuet.setText("Quét");
        btnQuet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuet.setIconTextGap(5);
        btnQuet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuetActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 143, 143)));
        jPanel3.setPreferredSize(new java.awt.Dimension(180, 0));

        lblHinhAnh.setBackground(new java.awt.Color(243, 243, 243));
        lblHinhAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhAnh.setText("Hình ảnh");
        lblHinhAnh.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHinhAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHinhAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setText("Mã sản phẩm");

        jLabel4.setText("Tên sản phẩm");

        jLabel5.setText("Số lượng tồn");

        txtDonGia.setEditable(false);
        txtDonGia.setBackground(new java.awt.Color(255, 255, 255));
        txtDonGia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDonGia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDonGia.setOpaque(true);

        jLabel6.setText("Đơn giá");

        txtGiaKM.setEditable(false);
        txtGiaKM.setBackground(new java.awt.Color(255, 255, 255));
        txtGiaKM.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGiaKM.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel7.setText("Giá KM");

        jLabel8.setText("Số lượng mua");

        spnSoLuongMua.setModel(new javax.swing.SpinnerNumberModel());

        btnThemVaoGioHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add32x32.png"))); // NOI18N
        btnThemVaoGioHang.setText("Thêm vào giỏ hàng");
        btnThemVaoGioHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemVaoGioHang.setIconTextGap(5);
        btnThemVaoGioHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoGioHangActionPerformed(evt);
            }
        });

        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/cancel32x32.png"))); // NOI18N
        btnDong.setText("Đóng");
        btnDong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDong.setIconTextGap(5);
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        txtMaSanPham.setEditable(false);
        txtMaSanPham.setBackground(new java.awt.Color(255, 255, 255));
        txtMaSanPham.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMaSanPham.setOpaque(true);

        txtTenSP.setEditable(false);
        txtTenSP.setBackground(new java.awt.Color(255, 255, 255));
        txtTenSP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTenSP.setOpaque(true);

        txtSoLuongTon.setEditable(false);
        txtSoLuongTon.setBackground(new java.awt.Color(255, 255, 255));
        txtSoLuongTon.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSoLuongTon.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSoLuongTon.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGiaKM, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(spnSoLuongMua, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(txtMaSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(txtSoLuongTon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnQuet)
                        .addGap(18, 18, 18)
                        .addComponent(btnThemVaoGioHang)
                        .addGap(18, 18, 18)
                        .addComponent(btnDong)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSoLuongTon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnSoLuongMua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuet)
                    .addComponent(btnThemVaoGioHang)
                    .addComponent(btnDong))
                .addContainerGap())
        );

        jLabel1.setText("Kết quả");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quét sản phẩm");

        txtMaBarCode.setEditable(false);
        txtMaBarCode.setBackground(new java.awt.Color(255, 255, 255));
        txtMaBarCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMaBarCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaBarCode.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMaBarCode.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaBarCode))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlShowWebcam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlShowWebcam, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuetActionPerformed
        clearForm();
        captureThread();
    }//GEN-LAST:event_btnQuetActionPerformed

    private void btnThemVaoGioHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoGioHangActionPerformed
        int soLuongSPMua = 0;
        if (formTabBanHangJPanel.hoaDonViewModel == null) {
            Helper.alert(null, "Vui lòng tạo hóa đơn để mua hàng!");
            return;
        }
        soLuongSPMua = Integer.parseInt(spnSoLuongMua.getValue().toString());
        if (soLuongSPMua <= 0) {
            return;
        }
        if (sp == null) {
            return;
        }
        int soLuongTonCuaSP = sp.getSoLuong();
        if (soLuongTonCuaSP == 0) {
            return;
        }
        if (soLuongSPMua > soLuongTonCuaSP) {
            soLuongSPMua = soLuongTonCuaSP;
        }

        HoaDonChiTietViewModel hoaDonChiTietViewModel = new HoaDonChiTietViewModel();
        hoaDonChiTietViewModel.setSanPham(new SanPhamBanHangViewModel(
                sp.getId(),
                sp.getMaSanPham(),
                sp.getTenSanPham()));
        hoaDonChiTietViewModel.setSoLuong(soLuongSPMua);
        hoaDonChiTietViewModel.setDonGia(sp.getDonGia());
        hoaDonChiTietViewModel.setDonGiaKhuyenMai(sp.getGiaKhuyenMai());
        hoaDonChiTietViewModel.setIdHoaDon(null);
        boolean flag = true;
        if (!formTabBanHangJPanel.listHoaDonChiTiet.isEmpty()) { // kiem tra list hoa don chi tiet có san pham nao k ?
            // neu co san pham ben trong se duyet qua tung san pham 
            // neu trung ma san pham thi tang hoac giam so luong
            for (HoaDonChiTietViewModel hdct : formTabBanHangJPanel.listHoaDonChiTiet) {
                if (hdct.getSanPham().getId().equals(hoaDonChiTietViewModel.getSanPham().getId())) {
                    hdct.setSoLuong(hdct.getSoLuong() + soLuongSPMua);
                    flag = false;
                    break;
                }
            }
        }
        // neu list hoa don chua co san pham nao hoac
        // san pham chua co trong list
        // thi se them vao danh sach
        if (flag) {
            formTabBanHangJPanel.listHoaDonChiTiet.add(hoaDonChiTietViewModel);
        }

        // tru so luong san pham da chon
        sp.setSoLuong(soLuongTonCuaSP - soLuongSPMua);

        formTabBanHangJPanel.loadDataToTblGioHang(formTabBanHangJPanel.listHoaDonChiTiet);
        // luu du lieu de update so luong san pham vao co so du lieu neu thanh toan
        listUpdateSoLuongSP.put(sp, sp.getSoLuong());
        sanPhamService.updateSoLuong(listUpdateSoLuongSP);
        formTabBanHangJPanel.initPagination(sanPhamService.getAllSanPhamBanHang(
                formTabBanHangJPanel.page,
                formTabBanHangJPanel.pageSize,
                formTabBanHangJPanel.trangThai));
        formTabBanHangJPanel.showDataHoaDonTaiQuay(formTabBanHangJPanel.hoaDonViewModel);
        showData();
    }//GEN-LAST:event_btnThemVaoGioHangActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        webcam.close();
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        webcam.close();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        webcam.close();
    }//GEN-LAST:event_formWindowClosed

    private void init() {
        txtMaBarCode.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String maHangHoa = txtMaBarCode.getText();
                sp = sanPhamService.findByMaHangHoa(maHangHoa);
                showData();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
    }

    private void clearForm() {
        txtMaBarCode.setText("");
        txtMaSanPham.setText("");
        txtTenSP.setText("");
        txtSoLuongTon.setText("");
        txtDonGia.setText("");
        txtGiaKM.setText("");
        spnSoLuongMua.setValue(0);
        lblHinhAnh.setIcon(null);
        lblHinhAnh.setText("Hình ảnh");
    }

    private void showData() {
        if (sp == null) {
            Helper.alert(null, "Sai mã hàng hóa hoặc sản phẩm không có trong cửa hàng.");
            return;
        }
        txtMaSanPham.setText(sp.getMaSanPham());
        txtTenSP.setText(sp.getTenSanPham());
        txtSoLuongTon.setText(sp.getSoLuong().toString());
        txtDonGia.setText(Helper.dfTien.format(sp.getDonGia()));
        txtGiaKM.setText(Helper.dfTien.format(sp.getGiaKhuyenMai()));
        Helper.showHinhAnh("images/images-san-pham", lblHinhAnh, sp.getHinhAnh());
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
            java.util.logging.Logger.getLogger(FormQuenMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormQuenMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormQuenMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormQuenMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormQuetMaBarcodeJDialog dialog = new FormQuetMaBarcodeJDialog(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnQuet;
    private javax.swing.JButton btnThemVaoGioHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JPanel pnlShowWebcam;
    private javax.swing.JSpinner spnSoLuongMua;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtGiaKM;
    private javax.swing.JTextField txtMaBarCode;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtSoLuongTon;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables

}
