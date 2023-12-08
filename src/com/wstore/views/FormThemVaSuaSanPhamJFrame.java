/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.wstore.views;

import com.formdev.flatlaf.FlatClientProperties;
import com.wstore.domainmodels.SanPham;
import com.wstore.domainmodels.thuoctinhsanpham.ChatLieuDay;
import com.wstore.domainmodels.thuoctinhsanpham.ChatLieuKinh;
import com.wstore.domainmodels.thuoctinhsanpham.ChatLieuVo;
import com.wstore.domainmodels.thuoctinhsanpham.DongMay;
import com.wstore.domainmodels.thuoctinhsanpham.Mau;
import com.wstore.domainmodels.thuoctinhsanpham.ThuongHieu;
import com.wstore.domainmodels.thuoctinhsanpham.TinhNangSanPham;
import com.wstore.domainmodels.thuoctinhsanpham.XuatXu;
import com.wstore.services.IDongSanPhamService;
import com.wstore.services.ITinhNangSanPhamService;
import com.wstore.services.impl.SanPhamService;
import com.wstore.services.impl.thuoctinhsanpham.ChatLieuDayService;
import com.wstore.services.impl.thuoctinhsanpham.ChatLieuKinhService;
import com.wstore.services.impl.thuoctinhsanpham.ChatLieuVoService;
import com.wstore.services.impl.thuoctinhsanpham.DongMayService;
import com.wstore.services.impl.thuoctinhsanpham.DongSanPhamService;
import com.wstore.services.impl.thuoctinhsanpham.MauService;
import com.wstore.services.impl.thuoctinhsanpham.ThuongHieuService;
import com.wstore.services.impl.thuoctinhsanpham.TinhNangSanPhamService;
import com.wstore.services.impl.thuoctinhsanpham.TinhNangService;
import com.wstore.services.impl.thuoctinhsanpham.XuatXuService;
import com.wstore.utilities.Helper;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuDayViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuKinhViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuVoViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.DongMayViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.DongSanPhamViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.MauViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ThuongHieuViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.TinhNangViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.XuatXuViewModel;
import com.wstore.views.thuoctinhsanpham.FormChatLieuDayJDialog;
import com.wstore.views.thuoctinhsanpham.FormChatLieuKinhJDialog;
import com.wstore.views.thuoctinhsanpham.FormChatLieuVoJDialog;
import com.wstore.views.thuoctinhsanpham.FormDongMayJDialog;
import com.wstore.views.thuoctinhsanpham.FormDongSanPhamJDialog;
import com.wstore.views.thuoctinhsanpham.FormMauJDialog;
import com.wstore.views.thuoctinhsanpham.FormThuongHieuJDialog;
import com.wstore.views.thuoctinhsanpham.FormTinhNangJDialog;
import com.wstore.views.thuoctinhsanpham.FormXuatXuJDialog;
import java.awt.Dimension;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import com.wstore.services.ISanPhamService;
import com.wstore.services.IThuocTinhSanPhamService;

/**
 *
 * @author ducan
 */
public class FormThemVaSuaSanPhamJFrame extends javax.swing.JFrame {

    private ISanPhamService sanPhamService = new SanPhamService();
    private ITinhNangSanPhamService tinhNangSanPhamService = new TinhNangSanPhamService();
    private final FormSanPhamJPanel formSanPhamJPanel;
    private final IThuocTinhSanPhamService thuongHieuService = new ThuongHieuService();
    private final IThuocTinhSanPhamService dongMayService = new DongMayService();
    private final IThuocTinhSanPhamService xuatXuService = new XuatXuService();
    private final IThuocTinhSanPhamService mauVoService = new MauService();
    private final IThuocTinhSanPhamService mauMatService = new MauService();
    private final IThuocTinhSanPhamService chatLieuDayService = new ChatLieuDayService();
    private final IThuocTinhSanPhamService chatLieuKinhService = new ChatLieuKinhService();
    private final IThuocTinhSanPhamService chatLieuVoService = new ChatLieuVoService();
    private final IDongSanPhamService dongSanPhamService = new DongSanPhamService();
    private final IThuocTinhSanPhamService tinhNangService = new TinhNangService();
    DefaultComboBoxModel dcbmThuongHieu = new DefaultComboBoxModel();
    DefaultComboBoxModel dcbmDongMay = new DefaultComboBoxModel();
    DefaultComboBoxModel dcbmXuatXu = new DefaultComboBoxModel();
    DefaultComboBoxModel dcbmMauVo = new DefaultComboBoxModel();
    DefaultComboBoxModel dcbmMauMat = new DefaultComboBoxModel();
    DefaultComboBoxModel dcbmChatLieuDay = new DefaultComboBoxModel();
    DefaultComboBoxModel dcbmChatLieuKinh = new DefaultComboBoxModel();
    DefaultComboBoxModel dcbmChatLieuVo = new DefaultComboBoxModel();
    DefaultComboBoxModel dcbmDongSanPham = new DefaultComboBoxModel();
    DefaultComboBoxModel dcbmTinhNang = new DefaultComboBoxModel();
    DefaultComboBoxModel dcbmPhongCach = new DefaultComboBoxModel();
    private String tenHinhAnh = null;
    private int rowSelected = -1;

    public FormThemVaSuaSanPhamJFrame(JPanel panel) {
        initComponents();
        init();
        this.formSanPhamJPanel = (FormSanPhamJPanel) panel;
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
        loadDataCboThuongHieu();
        loadDataCboDongSanPham();
        loadDataCboDongMay();
        loadDataCboXuatXu();
        loadDataCboMauVo();
        loadDataCboMauMat();
        loadDataCboChatLieuDay();
        loadDataCboChatLieuKinh();
        loadDataCboChatLieuVo();
        loadDataCboHinhDang();
        loadDataCboDoiTuongSuDung();
        loadDataCboTinhNang();
    }

    private void init() {
        txtMaSanPham.putClientProperty(
                FlatClientProperties.PLACEHOLDER_TEXT,
                "Mã sản phẩm tự động");
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
        jLabel6 = new javax.swing.JLabel();
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
        cboDoiTuongSuDung = new javax.swing.JComboBox<>();
        spnDoDay = new javax.swing.JSpinner();
        spnKhangNuoc = new javax.swing.JSpinner();
        spnSizeMat = new javax.swing.JSpinner();
        spnKhoangTruCot = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        btnInMaVach = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        spnGiaNhap = new javax.swing.JSpinner();
        spnGiaBan = new javax.swing.JSpinner();
        jToolBar1 = new javax.swing.JToolBar();
        btnLuu = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnDong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sản phẩm");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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

        jLabel6.setText("Giá nhập");

        jLabel8.setText("Giá bán");

        spnSoLuong.setModel(new javax.swing.SpinnerNumberModel());

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
        jPanel17.setLayout(new java.awt.GridLayout(8, 0, 0, 12));

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
                            .addComponent(cboMauVo, 0, 253, Short.MAX_VALUE)
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
                            .addComponent(cboChatLieuDay, javax.swing.GroupLayout.Alignment.LEADING, 0, 253, Short.MAX_VALUE)
                            .addComponent(cboDongMay, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        cboHinhDang.setPreferredSize(new java.awt.Dimension(220, 30));

        cboDoiTuongSuDung.setPreferredSize(new java.awt.Dimension(220, 30));

        spnDoDay.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));

        spnKhangNuoc.setModel(new javax.swing.SpinnerNumberModel());

        spnSizeMat.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));

        spnKhoangTruCot.setModel(new javax.swing.SpinnerNumberModel());

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
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(cboChatLieuKinh, 0, 240, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(cboChatLieuVo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboHinhDang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboDoiTuongSuDung, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spnKhangNuoc))
                                .addGap(76, 76, 76)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnSizeMat)
                            .addComponent(spnDoDay)
                            .addComponent(spnKhoangTruCot))
                        .addGap(82, 82, 82))))
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
                        .addComponent(cboDoiTuongSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnKhangNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(spnSizeMat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnDoDay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(spnKhoangTruCot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                        .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        txtGhiChu.setPreferredSize(new java.awt.Dimension(232, 100));
        jScrollPane1.setViewportView(txtGhiChu);

        btnInMaVach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/generate-barcode-product.png"))); // NOI18N
        btnInMaVach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInMaVachActionPerformed(evt);
            }
        });

        jLabel16.setText("Ghi chú");

        spnGiaNhap.setModel(new javax.swing.SpinnerNumberModel());

        spnGiaBan.setModel(new javax.swing.SpinnerNumberModel());

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
                                .addComponent(txtMaVach, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInMaVach, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnSoLuong)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spnSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel6)
                        .addComponent(spnGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(spnGiaNhap))
                .addGap(7, 7, 7)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
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
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLuu);
        jToolBar1.add(jSeparator1);

        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/cancel32x32.png"))); // NOI18N
        btnDong.setText("Đóng");
        btnDong.setFocusable(false);
        btnDong.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDong.setIconTextGap(5);
        btnDong.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });
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
        tenHinhAnh = Helper.chonAnh("images", lblHinhAnh);
    }//GEN-LAST:event_btnChonAnhActionPerformed

    private void btnResetAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetAnhActionPerformed
        tenHinhAnh = null;
        lblHinhAnh.setIcon(null);
        lblHinhAnh.setText("Hình ảnh");
    }//GEN-LAST:event_btnResetAnhActionPerformed

    private void btnThemTinhNangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTinhNangActionPerformed
        new FormTinhNangJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnThemTinhNangActionPerformed

    private void btnResetCboTinhNangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCboTinhNangActionPerformed
        loadDataCboTinhNang();
    }//GEN-LAST:event_btnResetCboTinhNangActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        rowSelected = formSanPhamJPanel.tblDSSanPham.getSelectedRow();
        if (rowSelected < 0) {
            System.out.println("Bạn đang chọn thêm");
            if (!validateForm()) {
                if (sanPhamService.insert(getDataToForm())) {
                    Helper.alert(this, "Thêm thành công");
                    formSanPhamJPanel.initPagination(sanPhamService.getAll(
                            formSanPhamJPanel.page,
                            formSanPhamJPanel.pageSize,
                            formSanPhamJPanel.trangThai));
                    clearForm();
                } else {
                    Helper.alert(this, "Thêm thất bại");
                }
            }
        } else {
            System.out.println("Bạn đang chọn sửa");
            if (Helper.comfirm(null, "Xác nhận sửa?")) {
                if (!validateForm()) {
                    System.out.println("Row: " + rowSelected);
                    int idSanPham = formSanPhamJPanel.listSP.get(rowSelected).getId();
                    System.out.println("ID-SP: " + idSanPham);
                    if (sanPhamService.update(getDataToForm(), idSanPham)) {
                        Helper.alert(this, "Sửa thành công");
                        formSanPhamJPanel.initPagination(sanPhamService.getAll(
                                formSanPhamJPanel.page,
                                formSanPhamJPanel.pageSize,
                                formSanPhamJPanel.trangThai));
                        formSanPhamJPanel.tblDSSanPham.setRowSelectionInterval(rowSelected, rowSelected);
                    } else {
                        Helper.alert(this, "Sửa thất bại");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        this.dispose();
        rowSelected = -1;
        formSanPhamJPanel.tblDSSanPham.clearSelection();
    }//GEN-LAST:event_btnDongActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        rowSelected = -1;
        formSanPhamJPanel.tblDSSanPham.clearSelection();
    }//GEN-LAST:event_formWindowClosing

    private void btnInMaVachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInMaVachActionPerformed
        new FormTaoMaBarCodeSPJDialog(this, false).setVisible(true);
    }//GEN-LAST:event_btnInMaVachActionPerformed

    private SanPham getDataToForm() {
        SanPham sp = new SanPham();
        sp.setMaSanPham(txtMaSanPham.getText().trim());
        sp.setMaHangHoa(txtMaVach.getText().trim());
        sp.setSoLuongTon(Integer.valueOf(spnSoLuong.getValue().toString().trim()));
        sp.setGiaNhap(BigDecimal.valueOf(Long.parseLong(spnGiaNhap.getValue().toString())));
        sp.setDonGia(BigDecimal.valueOf(Long.parseLong(spnGiaBan.getValue().toString())));
        ThuongHieuViewModel th = null;
        if (dcbmThuongHieu.getSelectedItem() != null) {
            th = (ThuongHieuViewModel) dcbmThuongHieu.getSelectedItem();
            sp.setThuongHieu(new ThuongHieu(th.getMaThuongHieu()));
        } else {
            sp.setThuongHieu(null);
        }
        System.out.println("ID thương hiệu: " + ((sp.getThuongHieu() == null || sp.getThuongHieu().getId() == 0) ? null : sp.getThuongHieu().getId()));

        if (dcbmDongSanPham.getSelectedItem() != null) {
            sp.setDongSanPham(dcbmDongSanPham.getSelectedItem().toString());
        } else {
            sp.setDongSanPham(null);
        }

        XuatXuViewModel xx = null;
        if (dcbmXuatXu.getSelectedItem() != null) {
            xx = (XuatXuViewModel) dcbmXuatXu.getSelectedItem();
            sp.setXuatXu(new XuatXu(xx.getMaXuatXu()));
        } else {
            sp.setXuatXu(null);
        }
        System.out.println("ID xuất xứ: " + ((sp.getXuatXu() == null || sp.getXuatXu().getId() == 0) ? null : sp.getXuatXu().getId()));

        MauViewModel mv = null;
        if (dcbmMauVo.getSelectedItem() != null) {
            mv = (MauViewModel) dcbmMauVo.getSelectedItem();
            sp.setMauVo(new Mau(mv.getMaMau()));
        } else {
            sp.setMauVo(null);
        }
        System.out.println("ID màu vỏ: " + ((sp.getMauVo() == null || sp.getMauVo().getId() == 0) ? null : sp.getMauVo().getId()));

        MauViewModel mm = null;
        if (dcbmMauMat.getSelectedItem() != null) {
            mm = (MauViewModel) dcbmMauMat.getSelectedItem();
            sp.setMauMat(new Mau(mm.getMaMau()));
        } else {
            sp.setMauMat(null);
        }
        System.out.println("ID màu mặt: " + ((sp.getMauMat() == null || sp.getMauMat().getId() == 0) ? null : sp.getMauMat().getId()));

        DongMayViewModel dm = null;
        if (dcbmDongMay.getSelectedItem() != null) {
            dm = (DongMayViewModel) dcbmDongMay.getSelectedItem();
            sp.setDongMay(new DongMay(dm.getIdDongMay()));
        } else {
            sp.setDongMay(null);
        }
        System.out.println("ID dòng máy: " + ((sp.getDongMay() == null || sp.getDongMay().getId() == 0) ? null : sp.getDongMay().getId()));

        ChatLieuDayViewModel cld = null;
        if (dcbmChatLieuDay.getSelectedItem() != null) {
            cld = (ChatLieuDayViewModel) dcbmChatLieuDay.getSelectedItem();
            sp.setChatLieuDay(new ChatLieuDay(cld.getMaChatLieuDay()));
        } else {
            sp.setChatLieuDay(null);
        }
        System.out.println("ID chất liệu dây: " + ((sp.getChatLieuDay() == null || sp.getChatLieuDay().getId() == 0) ? null : sp.getChatLieuDay().getId()));

        ChatLieuKinhViewModel clk = null;
        if (dcbmChatLieuKinh.getSelectedItem() != null) {
            clk = (ChatLieuKinhViewModel) dcbmChatLieuKinh.getSelectedItem();
            sp.setChatLieuKinh(new ChatLieuKinh(clk.getMaChatLieuKinh()));
        } else {
            sp.setChatLieuKinh(null);
        }
        System.out.println("ID chất liệu kính: " + ((sp.getChatLieuKinh() == null || sp.getChatLieuKinh().getId() == 0) ? null : sp.getChatLieuKinh().getId()));

        ChatLieuVoViewModel clv = null;
        if (dcbmChatLieuVo.getSelectedItem() != null) {
            clv = (ChatLieuVoViewModel) dcbmChatLieuVo.getSelectedItem();
            sp.setChatLieuVo(new ChatLieuVo(clv.getIdChatLieuVo()));
        } else {
            sp.setChatLieuVo(null);
        }
        System.out.println("ID chất liệu vỏ: " + ((sp.getChatLieuVo() == null || sp.getChatLieuVo().getId() == 0) ? null : sp.getChatLieuVo().getId()));

        sp.setHinhDang(cboHinhDang.getSelectedItem().toString());
        sp.setDoiTuongSuDung(cboDoiTuongSuDung.getSelectedItem().toString());
        sp.setKhangNuoc(Integer.valueOf(spnKhangNuoc.getValue().toString()));
        sp.setSizeMat(Float.valueOf(spnSizeMat.getValue().toString()));
        sp.setDoDay(Float.valueOf(spnDoDay.getValue().toString()));
        sp.setKhoangTruCot(Integer.valueOf(spnKhoangTruCot.getValue().toString()));
        String hinh = null;
        if (tenHinhAnh != null) {
            hinh = tenHinhAnh;
            tenHinhAnh = null;
        } else {
            if (rowSelected >= 0) {
                Object hinhAnhOnTbl = formSanPhamJPanel.tblDSSanPham.getValueAt(rowSelected, 21);
                if (hinhAnhOnTbl != null && !(hinhAnhOnTbl.equals("No image"))) {
                    hinh = hinhAnhOnTbl.toString();
                }
                if (lblHinhAnh.getIcon() == null) {
                    hinh = "No image";
                }
            } else {
                hinh = "No image";
            }
        }
        sp.setHinhAnh(hinh);
        sp.setGhiChu(txtGhiChu.getText());
        return sp;
    }

    private List<TinhNangSanPham> getDataTinhNangToForm() {
        List<TinhNangViewModel> listTnspView = cboTinhNang.getSelectedItems();
        int id = sanPhamService.findByMa(txtMaSanPham.getText().trim()).getId();
        List<TinhNangSanPham> listTnspModel = new ArrayList<>();
        if (!listTnspView.isEmpty()) {
            for (TinhNangViewModel tnspView : listTnspView) {
                TinhNangSanPham tnspModel = new TinhNangSanPham();
                tnspModel.setIdSanPham(id);
                tnspModel.setIdTinhNang(tnspView.getMaTinhNang());
            }
        }
        return listTnspModel;
    }

    private void clearForm() {
        txtMaSanPham.setText(sanPhamService.getMaSanPhamTuDongSinh());
        txtMaVach.setText("");
        spnSoLuong.setValue(0);
        spnGiaNhap.setValue(0);
        spnGiaBan.setValue(0);
        cboThuongHieu.setSelectedIndex(-1);
        cboDongSanPham.setSelectedIndex(-1);
        cboXuatXu.setSelectedIndex(-1);
        cboMauVo.setSelectedIndex(-1);
        cboMauMat.setSelectedIndex(-1);
        cboDongMay.setSelectedIndex(-1);
        cboChatLieuDay.setSelectedIndex(-1);
        cboChatLieuKinh.setSelectedIndex(-1);
        cboChatLieuVo.setSelectedIndex(-1);
        cboHinhDang.setSelectedIndex(0);
        cboDoiTuongSuDung.setSelectedIndex(0);
        cboTinhNang.clearSelectedItems();
        spnKhangNuoc.setValue(0);
        spnSizeMat.setValue(0);
        spnDoDay.setValue(0);
        spnKhoangTruCot.setValue(0);
        txtGhiChu.setText("");
    }

    private boolean validateForm() {
        if (cboThuongHieu.getSelectedItem() == null) {
            Helper.alert(this, "Vui lòng chọn thương hiệu cho sản phẩm!");
            return true;
        }
        return false;
    }

    private void loadDataCboThuongHieu() {
        List<ThuongHieuViewModel> list = thuongHieuService.getAllByTrangThai(true);
        dcbmThuongHieu.removeAllElements();
        for (ThuongHieuViewModel th : list) {
            dcbmThuongHieu.addElement(th);
        }
        cboThuongHieu.setSelectedIndex(-1);
    }

    private void loadDataCboDongMay() {
        List<DongMayViewModel> list = dongMayService.getAllByTrangThai(true);
        dcbmDongMay.removeAllElements();
        for (DongMayViewModel dm : list) {
            dcbmDongMay.addElement(dm);
        }
        cboDongMay.setSelectedIndex(-1);
    }

    private void loadDataCboXuatXu() {
        List<XuatXuViewModel> list = xuatXuService.getAllByTrangThai(true);
        dcbmXuatXu.removeAllElements();
        for (XuatXuViewModel xx : list) {
            dcbmXuatXu.addElement(xx);
        }
        cboXuatXu.setSelectedIndex(-1);
    }

    private void loadDataCboMauVo() {
        List<MauViewModel> list = mauVoService.getAllByTrangThai(true);
        dcbmMauVo.removeAllElements();
        for (MauViewModel mv : list) {
            dcbmMauVo.addElement(mv);
        }
        cboMauVo.setSelectedIndex(-1);
    }

    private void loadDataCboMauMat() {
        List<MauViewModel> list = mauMatService.getAllByTrangThai(true);
        dcbmMauMat.removeAllElements();
        for (MauViewModel mm : list) {
            dcbmMauMat.addElement(mm);
        }
        cboMauMat.setSelectedIndex(-1);
    }

    private void loadDataCboChatLieuDay() {
        List<ChatLieuDayViewModel> list = chatLieuDayService.getAllByTrangThai(true);
        dcbmChatLieuDay.removeAllElements();
        for (ChatLieuDayViewModel cld : list) {
            dcbmChatLieuDay.addElement(cld);
        }
        cboChatLieuDay.setSelectedIndex(-1);
    }

    private void loadDataCboChatLieuKinh() {
        List<ChatLieuKinhViewModel> list = chatLieuKinhService.getAllByTrangThai(true);
        dcbmChatLieuKinh.removeAllElements();
        for (ChatLieuKinhViewModel clk : list) {
            dcbmChatLieuKinh.addElement(clk);
        }
        cboChatLieuKinh.setSelectedIndex(-1);
    }

    private void loadDataCboChatLieuVo() {
        List<ChatLieuVoViewModel> list = chatLieuVoService.getAllByTrangThai(true);
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
        List<DongSanPhamViewModel> list = dongSanPhamService.getAllByIDThuongHieuAndTrangThai(idThuongHieu, true);
        dcbmDongSanPham.removeAllElements();
        for (DongSanPhamViewModel dsp : list) {
            dcbmDongSanPham.addElement(dsp.getTenDongSanPham());
        }
        cboDongSanPham.setSelectedIndex(-1);
    }

    private void loadDataCboTinhNang() {
        List<TinhNangViewModel> list = tinhNangService.getAllByTrangThai(true);
        dcbmTinhNang.removeAllElements();
        for (TinhNangViewModel tn : list) {
            dcbmTinhNang.addElement(tn);
        }
        cboTinhNang.setSelectedItem(null);
    }

    private void loadDataCboHinhDang() {
        cboHinhDang.addItem("Mặt tròn");
        cboHinhDang.addItem("Mặt vuông");
        cboHinhDang.addItem("Mặt chữ nhật");
        cboHinhDang.addItem("Đa giác");
    }

    private void loadDataCboDoiTuongSuDung() {
        cboDoiTuongSuDung.addItem("Unisex");
        cboDoiTuongSuDung.addItem("Nam");
        cboDoiTuongSuDung.addItem("Nữ");
        cboDoiTuongSuDung.addItem("Trẻ em");
    }

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FormThemVaSuaSanPhamJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormThemVaSuaSanPhamJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormThemVaSuaSanPhamJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormThemVaSuaSanPhamJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormThemVaSuaSanPhamJFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChonAnh;
    private javax.swing.JButton btnChupAnh;
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnInMaVach;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnReseCboChatLieuDay;
    private javax.swing.JButton btnResetAnh;
    private javax.swing.JButton btnResetCboChatLieuVo;
    private javax.swing.JButton btnResetCboDongMay;
    private javax.swing.JButton btnResetCboDongSanPham;
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
    private javax.swing.JButton btnThemThuongHieu;
    private javax.swing.JButton btnThemTinhNang;
    private javax.swing.JButton btnThemXuatXu;
    javax.swing.JComboBox<String> cboChatLieuDay;
    javax.swing.JComboBox<String> cboChatLieuKinh;
    javax.swing.JComboBox<String> cboChatLieuVo;
    javax.swing.JComboBox<String> cboDoiTuongSuDung;
    javax.swing.JComboBox<String> cboDongMay;
    javax.swing.JComboBox<String> cboDongSanPham;
    javax.swing.JComboBox<String> cboHinhDang;
    javax.swing.JComboBox<String> cboMauMat;
    javax.swing.JComboBox<String> cboMauVo;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JLabel lblHinhAnh;
    protected javax.swing.JSpinner spnDoDay;
    protected javax.swing.JSpinner spnGiaBan;
    protected javax.swing.JSpinner spnGiaNhap;
    protected javax.swing.JSpinner spnKhangNuoc;
    protected javax.swing.JSpinner spnKhoangTruCot;
    protected javax.swing.JSpinner spnSizeMat;
    javax.swing.JSpinner spnSoLuong;
    private javax.swing.JTextArea txtGhiChu;
    javax.swing.JTextField txtMaSanPham;
    javax.swing.JTextField txtMaVach;
    // End of variables declaration//GEN-END:variables
}
