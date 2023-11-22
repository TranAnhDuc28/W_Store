/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.wstore.views;

import com.wstore.services.IDongSanPhamService;
import com.wstore.services.IThuocTinhSanPhamService;
import com.wstore.services.impl.thuoctinhsanpham.ChatLieuDayService;
import com.wstore.services.impl.thuoctinhsanpham.ChatLieuKinhService;
import com.wstore.services.impl.thuoctinhsanpham.ChatLieuVoService;
import com.wstore.services.impl.thuoctinhsanpham.DongMayService;
import com.wstore.services.impl.thuoctinhsanpham.DongSanPhamService;
import com.wstore.services.impl.thuoctinhsanpham.MauService;
import com.wstore.services.impl.thuoctinhsanpham.PhongCachService;
import com.wstore.services.impl.thuoctinhsanpham.ThuongHieuService;
import com.wstore.services.impl.thuoctinhsanpham.TinhNangService;
import com.wstore.services.impl.thuoctinhsanpham.XuatXuService;
import com.wstore.utilities.Helper;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuDayViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuKinhViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuVoViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.DongMayViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.DongSanPhamViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.MauViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.PhongCachViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ThuongHieuViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.TinhNangViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.XuatXuViewModel;
import com.wstore.views.thuoctinhsanpham.FormChatLieuDayJDialog;
import com.wstore.views.thuoctinhsanpham.FormChatLieuKinhJDialog;
import com.wstore.views.thuoctinhsanpham.FormChatLieuVoJDialog;
import com.wstore.views.thuoctinhsanpham.FormDongMayJDialog;
import com.wstore.views.thuoctinhsanpham.FormDongSanPhamJDialog;
import com.wstore.views.thuoctinhsanpham.FormMauJDialog;
import com.wstore.views.thuoctinhsanpham.FormPhongCachJDialog;
import com.wstore.views.thuoctinhsanpham.FormThuongHieuJDialog;
import com.wstore.views.thuoctinhsanpham.FormTinhNangJDialog;
import com.wstore.views.thuoctinhsanpham.FormXuatXuJDialog;
import java.awt.Dimension;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ducan
 */
public class FormThemVaSuaSanPhamJFrame extends javax.swing.JFrame {

    private final IThuocTinhSanPhamService thuongHieuService = new ThuongHieuService();
    private final IThuocTinhSanPhamService dongMayService = new DongMayService();
    private final IThuocTinhSanPhamService xuatXuService = new XuatXuService();
    private final IThuocTinhSanPhamService mauVoService = new MauService();
    private final IThuocTinhSanPhamService mauMatService = new MauService();
    private final IThuocTinhSanPhamService chatLieuDayService = new ChatLieuDayService();
    private final IThuocTinhSanPhamService chatLieuKinhService = new ChatLieuKinhService();
    private final IThuocTinhSanPhamService chatLieuVoService = new ChatLieuVoService();
    private final IDongSanPhamService dongSanPhamService = new DongSanPhamService();
    private final IThuocTinhSanPhamService phongCachService = new PhongCachService();
    private final IThuocTinhSanPhamService tinhNangService = new TinhNangService();
    private final DefaultComboBoxModel dcbmThuongHieu = new DefaultComboBoxModel();
    private final DefaultComboBoxModel dcbmDongMay = new DefaultComboBoxModel();
    private final DefaultComboBoxModel dcbmXuatXu = new DefaultComboBoxModel();
    private final DefaultComboBoxModel dcbmMauVo = new DefaultComboBoxModel();
    private final DefaultComboBoxModel dcbmMauMat = new DefaultComboBoxModel();
    private final DefaultComboBoxModel dcbmChatLieuDay = new DefaultComboBoxModel();
    private final DefaultComboBoxModel dcbmChatLieuKinh = new DefaultComboBoxModel();
    private final DefaultComboBoxModel dcbmChatLieuVo = new DefaultComboBoxModel();
    private final DefaultComboBoxModel dcbmDongSanPham = new DefaultComboBoxModel();
    private final DefaultComboBoxModel dcbmTinhNang = new DefaultComboBoxModel();
    private final DefaultComboBoxModel dcbmPhongCach = new DefaultComboBoxModel();

    private String hinhAnh = null;

    public FormThemVaSuaSanPhamJFrame() {
        initComponents();
        cboThuongHieu.setModel(dcbmThuongHieu);
        cboDongMay.setModel(dcbmDongMay);
        cboXuatXu.setModel(dcbmXuatXu);
        cboMauVo.setModel(dcbmMauVo);
        cboMauMat.setModel(dcbmMauMat);
        cboChatLieuDay.setModel(dcbmChatLieuDay);
        cboChatLieuKinh.setModel(dcbmChatLieuKinh);
        cboChatLieuVo.setModel(dcbmChatLieuVo);
        cboDongSanPham.setModel(dcbmDongSanPham);
        cboTinhNang.setModel(dcbmTinhNang);
        cboPhongCach.setModel(dcbmPhongCach);
        loadDataCboThuongHieu();
        loadDataCboDongSanPham();
        loadDataCboDongMay();
        loadDataCboXuatXu();
        loadDataCboMauVo();
        loadDataCboMauMat();
        loadDataCboChatLieuDay();
        loadDataCboChatLieuKinh();
        loadDataCboChatLieuVo();
        loadDataCboTinhNang();
        loadDataCboPhongCach();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtMaSanPham = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaVach = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGiaNhap = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGiaBan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        spnSoLuong = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblHinhAnh = new javax.swing.JLabel();
        btnChupAnh = new javax.swing.JButton();
        btnChonAnh = new javax.swing.JButton();
        btnResetAnh = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cboThuongHieu = new javax.swing.JComboBox<>();
        cboDongSanPham = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        btnThemThuongHieu = new javax.swing.JButton();
        btnResetDefaultCboThuongHieu = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        btnThemDongSanPham = new javax.swing.JButton();
        btnResetCboDongSanPham = new javax.swing.JButton();
        cboXuatXu = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        btnThemXuatXu = new javax.swing.JButton();
        btnResetCboXuatXu = new javax.swing.JButton();
        cboMauVo = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        btnThemMauVo = new javax.swing.JButton();
        btnResetMauVo = new javax.swing.JButton();
        cboMauMat = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        btnThemMauMat = new javax.swing.JButton();
        btnResetMauMat = new javax.swing.JButton();
        cboDongMay = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        btnThemDongMay = new javax.swing.JButton();
        btnResetCboDongMay = new javax.swing.JButton();
        cboChatLieuDay = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        btnThemChatLieuDay = new javax.swing.JButton();
        btnReseCboChatLieuDay = new javax.swing.JButton();
        cboTinhNang = new com.wstore.swing.combobox.ComboBoxMultiSelection();
        jPanel23 = new javax.swing.JPanel();
        btnThemTinhNang = new javax.swing.JButton();
        btnResetCboTinhNang = new javax.swing.JButton();
        cboPhongCach = new com.wstore.swing.combobox.ComboBoxMultiSelection();
        jPanel24 = new javax.swing.JPanel();
        btnThemPhongCach = new javax.swing.JButton();
        btnResetCboPhongCach = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboChatLieuKinh = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        btnThemChatLieuKinh = new javax.swing.JButton();
        btnResetChatLieuKinh = new javax.swing.JButton();
        cboChatLieuVo = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        btnThemChatLieuVo = new javax.swing.JButton();
        btnResetCboChatLieuVo = new javax.swing.JButton();
        cboHinhDang = new javax.swing.JComboBox<>();
        cboDoiTuongSuDong = new javax.swing.JComboBox<>();
        txtKhangNuoc = new javax.swing.JTextField();
        txtSizeMat = new javax.swing.JTextField();
        txtDoDay = new javax.swing.JTextField();
        txtKhoangTruCot = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnInMaVach = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnLuu = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnLuuVaNhapMoi = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnDong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sản phẩm");

        jPanel1.setBackground(new java.awt.Color(241, 246, 251));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("THÔNG TIN SẢN PHẨM");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setOpaque(false);

        txtMaSanPham.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabel4.setText("Mã sản phẩm");

        txtMaVach.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabel5.setText("Mã vạch");

        txtGiaNhap.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabel6.setText("Giá nhập");

        txtGiaBan.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabel8.setText("Giá bán");

        jLabel9.setText("Số lượng");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thuộc tính sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.setOpaque(false);

        jPanel5.setOpaque(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 143, 143)));
        jPanel4.setPreferredSize(new java.awt.Dimension(320, 320));

        lblHinhAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhAnh.setText("Hình ảnh");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnChupAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/camera24x24.png"))); // NOI18N
        btnChupAnh.setText("Chụp ảnh");
        btnChupAnh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChupAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChupAnhActionPerformed(evt);
            }
        });

        btnChonAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/upload-image24x24.png"))); // NOI18N
        btnChonAnh.setText("Chọn ảnh");
        btnChonAnh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonAnhActionPerformed(evt);
            }
        });

        btnResetAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/refresh16x16.png"))); // NOI18N
        btnResetAnh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetAnhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnChupAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnResetAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnChupAnh)
                        .addComponent(btnChonAnh))
                    .addComponent(btnResetAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setOpaque(false);
        jPanel21.setPreferredSize(new Dimension(410, 370));

        jPanel17.setOpaque(false);
        jPanel17.setLayout(new java.awt.GridLayout(9, 0, 0, 12));

        jLabel2.setText("Thương hiệu");
        jPanel17.add(jLabel2);

        jLabel10.setText("Dòng sản phẩm");
        jPanel17.add(jLabel10);

        jLabel17.setText("Xuất xứ");
        jPanel17.add(jLabel17);

        jLabel19.setText("Màu vỏ");
        jPanel17.add(jLabel19);

        jLabel20.setText("Màu mặt");
        jPanel17.add(jLabel20);

        jLabel7.setText("Dòng máy");
        jPanel17.add(jLabel7);

        jLabel22.setText("Chất liệu dây");
        jPanel17.add(jLabel22);

        jLabel25.setText("Tính năng");
        jPanel17.add(jLabel25);

        jLabel24.setText("Phong cách");
        jPanel17.add(jLabel24);

        cboThuongHieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboThuongHieu.setPreferredSize(new java.awt.Dimension(220, 30));
        cboThuongHieu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThuongHieuItemStateChanged(evt);
            }
        });

        cboDongSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboDongSanPham.setAutoscrolls(true);
        cboDongSanPham.setPreferredSize(new java.awt.Dimension(290, 30));

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnThemThuongHieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add16x16.png"))); // NOI18N
        btnThemThuongHieu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemThuongHieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemThuongHieuActionPerformed(evt);
            }
        });
        jPanel8.add(btnThemThuongHieu);

        btnResetDefaultCboThuongHieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/refresh16x16.png"))); // NOI18N
        btnResetDefaultCboThuongHieu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetDefaultCboThuongHieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDefaultCboThuongHieuActionPerformed(evt);
            }
        });
        jPanel8.add(btnResetDefaultCboThuongHieu);

        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnThemDongSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add16x16.png"))); // NOI18N
        btnThemDongSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemDongSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDongSanPhamActionPerformed(evt);
            }
        });
        jPanel14.add(btnThemDongSanPham);

        btnResetCboDongSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/refresh16x16.png"))); // NOI18N
        btnResetCboDongSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetCboDongSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCboDongSanPhamActionPerformed(evt);
            }
        });
        jPanel14.add(btnResetCboDongSanPham);

        cboXuatXu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboXuatXu.setPreferredSize(new java.awt.Dimension(220, 30));

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnThemXuatXu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add16x16.png"))); // NOI18N
        btnThemXuatXu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemXuatXu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemXuatXuActionPerformed(evt);
            }
        });
        jPanel10.add(btnThemXuatXu);

        btnResetCboXuatXu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/refresh16x16.png"))); // NOI18N
        btnResetCboXuatXu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetCboXuatXu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCboXuatXuActionPerformed(evt);
            }
        });
        jPanel10.add(btnResetCboXuatXu);

        cboMauVo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboMauVo.setPreferredSize(new java.awt.Dimension(220, 30));

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnThemMauVo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add16x16.png"))); // NOI18N
        btnThemMauVo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemMauVo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMauVoActionPerformed(evt);
            }
        });
        jPanel6.add(btnThemMauVo);

        btnResetMauVo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/refresh16x16.png"))); // NOI18N
        btnResetMauVo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetMauVo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetMauVoActionPerformed(evt);
            }
        });
        jPanel6.add(btnResetMauVo);

        cboMauMat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboMauMat.setPreferredSize(new java.awt.Dimension(220, 30));

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnThemMauMat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add16x16.png"))); // NOI18N
        btnThemMauMat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemMauMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMauMatActionPerformed(evt);
            }
        });
        jPanel7.add(btnThemMauMat);

        btnResetMauMat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/refresh16x16.png"))); // NOI18N
        btnResetMauMat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetMauMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetMauMatActionPerformed(evt);
            }
        });
        jPanel7.add(btnResetMauMat);

        cboDongMay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboDongMay.setPreferredSize(new java.awt.Dimension(220, 30));

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnThemDongMay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add16x16.png"))); // NOI18N
        btnThemDongMay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemDongMay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDongMayActionPerformed(evt);
            }
        });
        jPanel15.add(btnThemDongMay);

        btnResetCboDongMay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/refresh16x16.png"))); // NOI18N
        btnResetCboDongMay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetCboDongMay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCboDongMayActionPerformed(evt);
            }
        });
        jPanel15.add(btnResetCboDongMay);

        cboChatLieuDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChatLieuDay.setPreferredSize(new java.awt.Dimension(220, 30));

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnThemChatLieuDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add16x16.png"))); // NOI18N
        btnThemChatLieuDay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemChatLieuDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemChatLieuDayActionPerformed(evt);
            }
        });
        jPanel13.add(btnThemChatLieuDay);

        btnReseCboChatLieuDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/refresh16x16.png"))); // NOI18N
        btnReseCboChatLieuDay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReseCboChatLieuDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReseCboChatLieuDayActionPerformed(evt);
            }
        });
        jPanel13.add(btnReseCboChatLieuDay);

        cboTinhNang.setPreferredSize(new java.awt.Dimension(72, 30));

        jPanel23.setOpaque(false);
        jPanel23.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnThemTinhNang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add16x16.png"))); // NOI18N
        btnThemTinhNang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemTinhNang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTinhNangActionPerformed(evt);
            }
        });
        jPanel23.add(btnThemTinhNang);

        btnResetCboTinhNang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/refresh16x16.png"))); // NOI18N
        btnResetCboTinhNang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetCboTinhNang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCboTinhNangActionPerformed(evt);
            }
        });
        jPanel23.add(btnResetCboTinhNang);

        cboPhongCach.setPreferredSize(new java.awt.Dimension(72, 30));

        jPanel24.setOpaque(false);
        jPanel24.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnThemPhongCach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add16x16.png"))); // NOI18N
        btnThemPhongCach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemPhongCach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPhongCachActionPerformed(evt);
            }
        });
        jPanel24.add(btnThemPhongCach);

        btnResetCboPhongCach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/refresh16x16.png"))); // NOI18N
        btnResetCboPhongCach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetCboPhongCach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCboPhongCachActionPerformed(evt);
            }
        });
        jPanel24.add(btnResetCboPhongCach);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboMauVo, 0, 254, Short.MAX_VALUE)
                            .addComponent(cboDongSanPham, 0, 0, Short.MAX_VALUE)
                            .addComponent(cboThuongHieu, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboXuatXu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboMauMat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboTinhNang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboChatLieuDay, javax.swing.GroupLayout.Alignment.LEADING, 0, 254, Short.MAX_VALUE)
                            .addComponent(cboDongMay, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(cboPhongCach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboThuongHieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboDongSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboXuatXu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboMauVo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboMauMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboDongMay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboChatLieuDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboTinhNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                .addComponent(cboPhongCach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.setOpaque(false);
        jPanel22.setPreferredSize(new Dimension(410, 370));

        jPanel18.setOpaque(false);
        jPanel18.setLayout(new java.awt.GridLayout(8, 0, 0, 12));

        jLabel18.setText("Chất liệu kính");
        jPanel18.add(jLabel18);

        jLabel21.setText("Chất liệu vỏ");
        jPanel18.add(jLabel21);

        jLabel14.setText("Hình dạng");
        jPanel18.add(jLabel14);

        jLabel3.setText("Đối tượng sử dụng");
        jPanel18.add(jLabel3);

        jLabel11.setText("Kháng nước");
        jPanel18.add(jLabel11);

        jLabel13.setText("Size mặt");
        jPanel18.add(jLabel13);

        jLabel15.setText("Độ dày");
        jPanel18.add(jLabel15);

        jLabel12.setText("Khoảng trữ cót");
        jPanel18.add(jLabel12);

        cboChatLieuKinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChatLieuKinh.setPreferredSize(new java.awt.Dimension(220, 30));

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnThemChatLieuKinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add16x16.png"))); // NOI18N
        btnThemChatLieuKinh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemChatLieuKinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemChatLieuKinhActionPerformed(evt);
            }
        });
        jPanel9.add(btnThemChatLieuKinh);

        btnResetChatLieuKinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/refresh16x16.png"))); // NOI18N
        btnResetChatLieuKinh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetChatLieuKinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetChatLieuKinhActionPerformed(evt);
            }
        });
        jPanel9.add(btnResetChatLieuKinh);

        cboChatLieuVo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChatLieuVo.setPreferredSize(new java.awt.Dimension(220, 30));

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnThemChatLieuVo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add16x16.png"))); // NOI18N
        btnThemChatLieuVo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemChatLieuVo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemChatLieuVoActionPerformed(evt);
            }
        });
        jPanel12.add(btnThemChatLieuVo);

        btnResetCboChatLieuVo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/refresh16x16.png"))); // NOI18N
        btnResetCboChatLieuVo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetCboChatLieuVo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCboChatLieuVoActionPerformed(evt);
            }
        });
        jPanel12.add(btnResetCboChatLieuVo);

        cboHinhDang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặt tròn", "Mặt vuông", "Mặt chữ nhật", "Đa giác" }));
        cboHinhDang.setPreferredSize(new java.awt.Dimension(220, 30));

        cboDoiTuongSuDong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unisex", "Nam", "Nữ", "Trẻ em" }));
        cboDoiTuongSuDong.setPreferredSize(new java.awt.Dimension(220, 30));

        txtKhangNuoc.setPreferredSize(new java.awt.Dimension(220, 30));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKhangNuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSizeMat)
                            .addComponent(txtDoDay)
                            .addComponent(txtKhoangTruCot))
                        .addGap(82, 82, 82))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(cboChatLieuKinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(cboChatLieuVo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboHinhDang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboDoiTuongSuDong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(76, 76, 76)))
                        .addContainerGap())))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboChatLieuKinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboChatLieuVo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboHinhDang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboDoiTuongSuDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtKhangNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSizeMat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDoDay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtKhoangTruCot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setPreferredSize(new java.awt.Dimension(232, 100));
        jScrollPane1.setViewportView(jTextArea1);

        btnInMaVach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/generate-barcode-product.png"))); // NOI18N

        jLabel16.setText("Ghi chú");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaVach, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInMaVach, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnSoLuong)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGiaNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1)))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInMaVach)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtMaVach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);
        jToolBar1.setEnabled(false);

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/luu32x32.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.setFocusable(false);
        btnLuu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLuu.setIconTextGap(5);
        btnLuu.setMargin(new java.awt.Insets(5, 14, 5, 14));
        jToolBar1.add(btnLuu);
        jToolBar1.add(jSeparator1);

        btnLuuVaNhapMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/luu-va-lam-moi32x32.png"))); // NOI18N
        btnLuuVaNhapMoi.setText("Lưu và Nhập mới");
        btnLuuVaNhapMoi.setFocusable(false);
        btnLuuVaNhapMoi.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLuuVaNhapMoi.setIconTextGap(5);
        btnLuuVaNhapMoi.setMargin(new java.awt.Insets(5, 14, 5, 14));
        jToolBar1.add(btnLuuVaNhapMoi);
        jToolBar1.add(jSeparator2);

        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/cancel32x32.png"))); // NOI18N
        btnDong.setText("Đóng");
        btnDong.setFocusable(false);
        btnDong.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDong.setIconTextGap(5);
        btnDong.setMargin(new java.awt.Insets(5, 14, 5, 14));
        jToolBar1.add(btnDong);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cboThuongHieuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThuongHieuItemStateChanged
        loadDataCboDongSanPham();
    }//GEN-LAST:event_cboThuongHieuItemStateChanged

    private void btnThemThuongHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemThuongHieuActionPerformed
        new FormThuongHieuJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnThemThuongHieuActionPerformed

    private void btnResetDefaultCboThuongHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDefaultCboThuongHieuActionPerformed
        loadDataCboThuongHieu();
    }//GEN-LAST:event_btnResetDefaultCboThuongHieuActionPerformed

    private void btnThemDongSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDongSanPhamActionPerformed
        new FormDongSanPhamJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnThemDongSanPhamActionPerformed

    private void btnResetCboDongSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCboDongSanPhamActionPerformed
        loadDataCboDongSanPham();
    }//GEN-LAST:event_btnResetCboDongSanPhamActionPerformed

    private void btnThemDongMayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDongMayActionPerformed
        new FormDongMayJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnThemDongMayActionPerformed

    private void btnResetCboDongMayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCboDongMayActionPerformed
        loadDataCboDongMay();
    }//GEN-LAST:event_btnResetCboDongMayActionPerformed

    private void btnThemXuatXuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemXuatXuActionPerformed
        new FormXuatXuJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnThemXuatXuActionPerformed

    private void btnResetCboXuatXuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCboXuatXuActionPerformed
        loadDataCboXuatXu();
    }//GEN-LAST:event_btnResetCboXuatXuActionPerformed

    private void btnThemMauVoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMauVoActionPerformed
        new FormMauJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnThemMauVoActionPerformed

    private void btnResetMauVoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetMauVoActionPerformed
        loadDataCboMauVo();
    }//GEN-LAST:event_btnResetMauVoActionPerformed

    private void btnThemMauMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMauMatActionPerformed
        new FormMauJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnThemMauMatActionPerformed

    private void btnResetMauMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetMauMatActionPerformed
        loadDataCboMauMat();
    }//GEN-LAST:event_btnResetMauMatActionPerformed

    private void btnThemChatLieuDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemChatLieuDayActionPerformed
        new FormChatLieuDayJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnThemChatLieuDayActionPerformed

    private void btnReseCboChatLieuDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReseCboChatLieuDayActionPerformed
        loadDataCboChatLieuDay();
    }//GEN-LAST:event_btnReseCboChatLieuDayActionPerformed

    private void btnThemChatLieuKinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemChatLieuKinhActionPerformed
        new FormChatLieuKinhJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnThemChatLieuKinhActionPerformed

    private void btnResetChatLieuKinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetChatLieuKinhActionPerformed
        loadDataCboChatLieuKinh();
    }//GEN-LAST:event_btnResetChatLieuKinhActionPerformed

    private void btnThemChatLieuVoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemChatLieuVoActionPerformed
        new FormChatLieuVoJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnThemChatLieuVoActionPerformed

    private void btnResetCboChatLieuVoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCboChatLieuVoActionPerformed
        loadDataCboChatLieuVo();
    }//GEN-LAST:event_btnResetCboChatLieuVoActionPerformed

    private void btnChupAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChupAnhActionPerformed
        new FormChupAnhJFrame().setVisible(true);
    }//GEN-LAST:event_btnChupAnhActionPerformed

    private void btnChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonAnhActionPerformed
        hinhAnh = Helper.chonAnh("images", lblHinhAnh);
    }//GEN-LAST:event_btnChonAnhActionPerformed

    private void btnResetAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetAnhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetAnhActionPerformed

    private void btnThemTinhNangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTinhNangActionPerformed
        new FormTinhNangJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnThemTinhNangActionPerformed

    private void btnResetCboTinhNangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCboTinhNangActionPerformed
        loadDataCboTinhNang();
    }//GEN-LAST:event_btnResetCboTinhNangActionPerformed

    private void btnThemPhongCachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPhongCachActionPerformed
        new FormPhongCachJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnThemPhongCachActionPerformed

    private void btnResetCboPhongCachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCboPhongCachActionPerformed
        loadDataCboPhongCach();
    }//GEN-LAST:event_btnResetCboPhongCachActionPerformed

    private void loadDataCboThuongHieu() {
        List<ThuongHieuViewModel> list = thuongHieuService.getAll();
        dcbmThuongHieu.removeAllElements();
        for (ThuongHieuViewModel th : list) {
            dcbmThuongHieu.addElement(th);
        }
        cboThuongHieu.setSelectedIndex(-1);
    }

    private void loadDataCboDongMay() {
        List<DongMayViewModel> list = dongMayService.getAll();
        dcbmDongMay.removeAllElements();
        for (DongMayViewModel dm : list) {
            dcbmDongMay.addElement(dm);
        }
        cboDongMay.setSelectedIndex(-1);
    }

    private void loadDataCboXuatXu() {
        List<XuatXuViewModel> list = xuatXuService.getAll();
        dcbmXuatXu.removeAllElements();
        for (XuatXuViewModel xx : list) {
            dcbmXuatXu.addElement(xx);
        }
        cboXuatXu.setSelectedIndex(-1);
    }

    private void loadDataCboMauVo() {
        List<MauViewModel> list = mauVoService.getAll();
        dcbmMauVo.removeAllElements();
        for (MauViewModel mv : list) {
            dcbmMauVo.addElement(mv);
        }
        cboMauVo.setSelectedIndex(-1);
    }

    private void loadDataCboMauMat() {
        List<MauViewModel> list = mauMatService.getAll();
        dcbmMauMat.removeAllElements();
        for (MauViewModel mm : list) {
            dcbmMauMat.addElement(mm);
        }
        cboMauMat.setSelectedIndex(-1);
    }

    private void loadDataCboChatLieuDay() {
        List<ChatLieuDayViewModel> list = chatLieuDayService.getAll();
        dcbmChatLieuDay.removeAllElements();
        for (ChatLieuDayViewModel cld : list) {
            dcbmChatLieuDay.addElement(cld);
        }
        cboChatLieuDay.setSelectedIndex(-1);
    }

    private void loadDataCboChatLieuKinh() {
        List<ChatLieuKinhViewModel> list = chatLieuKinhService.getAll();
        dcbmChatLieuKinh.removeAllElements();
        for (ChatLieuKinhViewModel clk : list) {
            dcbmChatLieuKinh.addElement(clk);
        }
        cboChatLieuKinh.setSelectedIndex(-1);
    }

    private void loadDataCboChatLieuVo() {
        List<ChatLieuVoViewModel> list = chatLieuVoService.getAll();
        dcbmChatLieuVo.removeAllElements();
        for (ChatLieuVoViewModel clv : list) {
            dcbmChatLieuVo.addElement(clv);
        }
        cboChatLieuVo.setSelectedIndex(-1);
    }

    private void loadDataCboDongSanPham() {
        int idThuongHieu = -1;
        ThuongHieuViewModel th = (ThuongHieuViewModel) cboThuongHieu.getSelectedItem();
        if (th != null) {
            idThuongHieu = th.getMaThuongHieu();
        }
        List<DongSanPhamViewModel> list = dongSanPhamService.getAllByIDThuongHieu(idThuongHieu);
        dcbmDongSanPham.removeAllElements();
        for (DongSanPhamViewModel dsp : list) {
            dcbmDongSanPham.addElement(dsp.getTenDongSanPham());
        }
        cboDongSanPham.setSelectedIndex(-1);
    }
    
    private void loadDataCboTinhNang() {
        List<TinhNangViewModel> list = tinhNangService.getAll();
        dcbmTinhNang.removeAllElements();
        for (TinhNangViewModel tn : list) {
            dcbmTinhNang.addElement(tn);
        }
        cboTinhNang.setSelectedItem(null);
    }
    
    private void loadDataCboPhongCach() {
        List<PhongCachViewModel> list = phongCachService.getAll();
        dcbmPhongCach.removeAllElements();
        for (PhongCachViewModel clv : list) {
            dcbmPhongCach.addElement(clv);
        }
        cboPhongCach.setSelectedItem(null);
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
            java.util.logging.Logger.getLogger(FormThemVaSuaSanPhamJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormThemVaSuaSanPhamJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormThemVaSuaSanPhamJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormThemVaSuaSanPhamJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormThemVaSuaSanPhamJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChonAnh;
    private javax.swing.JButton btnChupAnh;
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnInMaVach;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnLuuVaNhapMoi;
    private javax.swing.JButton btnReseCboChatLieuDay;
    private javax.swing.JButton btnResetAnh;
    private javax.swing.JButton btnResetCboChatLieuVo;
    private javax.swing.JButton btnResetCboDongMay;
    private javax.swing.JButton btnResetCboDongSanPham;
    private javax.swing.JButton btnResetCboPhongCach;
    private javax.swing.JButton btnResetCboTinhNang;
    private javax.swing.JButton btnResetCboXuatXu;
    private javax.swing.JButton btnResetChatLieuKinh;
    private javax.swing.JButton btnResetDefaultCboThuongHieu;
    private javax.swing.JButton btnResetMauMat;
    private javax.swing.JButton btnResetMauVo;
    private javax.swing.JButton btnThemChatLieuDay;
    private javax.swing.JButton btnThemChatLieuKinh;
    private javax.swing.JButton btnThemChatLieuVo;
    private javax.swing.JButton btnThemDongMay;
    private javax.swing.JButton btnThemDongSanPham;
    private javax.swing.JButton btnThemMauMat;
    private javax.swing.JButton btnThemMauVo;
    private javax.swing.JButton btnThemPhongCach;
    private javax.swing.JButton btnThemThuongHieu;
    private javax.swing.JButton btnThemTinhNang;
    private javax.swing.JButton btnThemXuatXu;
    javax.swing.JComboBox<String> cboChatLieuDay;
    javax.swing.JComboBox<String> cboChatLieuKinh;
    javax.swing.JComboBox<String> cboChatLieuVo;
    javax.swing.JComboBox<String> cboDoiTuongSuDong;
    javax.swing.JComboBox<String> cboDongMay;
    javax.swing.JComboBox<String> cboDongSanPham;
    javax.swing.JComboBox<String> cboHinhDang;
    javax.swing.JComboBox<String> cboMauMat;
    javax.swing.JComboBox<String> cboMauVo;
    com.wstore.swing.combobox.ComboBoxMultiSelection cboPhongCach;
    javax.swing.JComboBox<String> cboThuongHieu;
    com.wstore.swing.combobox.ComboBoxMultiSelection cboTinhNang;
    javax.swing.JComboBox<String> cboXuatXu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblHinhAnh;
    javax.swing.JSpinner spnSoLuong;
    javax.swing.JTextField txtDoDay;
    javax.swing.JTextField txtGiaBan;
    javax.swing.JTextField txtGiaNhap;
    javax.swing.JTextField txtKhangNuoc;
    javax.swing.JTextField txtKhoangTruCot;
    javax.swing.JTextField txtMaSanPham;
    javax.swing.JTextField txtMaVach;
    javax.swing.JTextField txtSizeMat;
    // End of variables declaration//GEN-END:variables
}
