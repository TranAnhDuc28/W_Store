/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.wstore.views;

import com.formdev.flatlaf.FlatClientProperties;
import com.wstore.services.IDongSanPhamService;
import com.wstore.services.ITinhNangSanPhamService;
import com.wstore.services.impl.SanPhamService;
import com.wstore.services.impl.thuoctinhsanpham.ChatLieuDayService;
import com.wstore.services.impl.thuoctinhsanpham.ChatLieuKinhService;
import com.wstore.services.impl.thuoctinhsanpham.DongMayService;
import com.wstore.services.impl.thuoctinhsanpham.DongSanPhamService;
import com.wstore.services.impl.thuoctinhsanpham.ThuongHieuService;
import com.wstore.services.impl.thuoctinhsanpham.TinhNangSanPhamService;
import com.wstore.utilities.Helper;
import com.wstore.utilities.excel.WriteExcel;
import com.wstore.viewmodels.QLsanpham.SanPhamViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuDayViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuKinhViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.DongMayViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ThuongHieuViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.TinhNangViewModel;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import com.wstore.services.ISanPhamService;
import com.wstore.services.IThuocTinhSanPhamService;
import com.wstore.swing.table.TableTextAlignmentCellRender;
import com.wstore.utilities.status.StatusSanPham;
import javax.swing.JPanel;

/**
 *
 * @author ducan
 */
public class FormSanPhamJPanel extends javax.swing.JPanel {

    private final IThuocTinhSanPhamService thuongHieuService = new ThuongHieuService();
    private final IThuocTinhSanPhamService dongMayService = new DongMayService();
    private final IThuocTinhSanPhamService chatLieuDayService = new ChatLieuDayService();
    private final IThuocTinhSanPhamService chatLieuKinhService = new ChatLieuKinhService();
    private final IDongSanPhamService dongSanPhamService = new DongSanPhamService();
    DefaultComboBoxModel dcbmThuongHieu = new DefaultComboBoxModel();
    DefaultComboBoxModel dcbmDongMay = new DefaultComboBoxModel();
    DefaultComboBoxModel dcbmChatLieuDay = new DefaultComboBoxModel();
    DefaultComboBoxModel dcbmChatLieuKinh = new DefaultComboBoxModel();
    private final ISanPhamService sanPhamService = new SanPhamService();
    private final ITinhNangSanPhamService tinhNangSanPhamService = new TinhNangSanPhamService();
    FormThemVaSuaSanPhamJFrame formThemVaSuaSanPham;
    private DefaultTableModel dtmTblSanPham;
    protected List<SanPhamViewModel> listSP;
    public int trangThai = 0;
    private int index = -1;
    public int page = 1;
    private int tongSoBanGhi = 0;
    private int tongSoBanGhiTheoTrangThai = 0;
    private int totalPage = 1;
    public int pageSize = 15;
    private ProgressExportExcel progressExportExcel;

    public FormSanPhamJPanel() {
        initComponents();
        init();
        turnOffFilter();
        cboThuongHieu.setModel(dcbmThuongHieu);
        cboDongMay.setModel(dcbmDongMay);
        cboChatLieuDay.setModel(dcbmChatLieuDay);
        cboChatLieuKinh.setModel(dcbmChatLieuKinh);
        loadDataCboThuongHieu();
        loadDataCboDongMay();
        loadDataCboChatLieuDay();
        loadDataCboChatLieuKinh();
        loadDataCboHinhDang();
        loadDataCboDoiTuongSuDung();
        loadDataCboTrangThai();
        initPagination(sanPhamService.getAll(page, pageSize, trangThai));
    }

    private void turnOffFilter() {
        pnlLoc.setVisible(false);
        btnLocSanPham.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbebQLSanPham = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnThem = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnSua = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnNgungKinhDoanh = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnNhapExcel = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnXuatExcel = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtTimKiemSanPham = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pnlLoc = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cboThuongHieu = new javax.swing.JComboBox<>();
        cboDongMay = new javax.swing.JComboBox<>();
        cboDoiTuongSuDung = new javax.swing.JComboBox<>();
        cboChatLieuDay = new javax.swing.JComboBox<>();
        cboChatLieuKinh = new javax.swing.JComboBox<>();
        cboHinhDangMat = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSSanPham = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboSoBanGhi = new javax.swing.JComboBox<>();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        lblPageOfTotalPage = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        lblTongSoBanGhi = new javax.swing.JLabel();
        chkChonTat = new javax.swing.JCheckBox();
        btnKhoiPhuc = new javax.swing.JButton();
        btnLocSanPham = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cboTrangThai = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 246, 251));
        setPreferredSize(new java.awt.Dimension(1140, 800));

        tabbebQLSanPham.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(241, 246, 251));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);
        jToolBar1.setEnabled(false);

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add32x32.png"))); // NOI18N
        btnThem.setText("Thêm sản phẩm");
        btnThem.setFocusable(false);
        btnThem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnThem.setIconTextGap(5);
        btnThem.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jToolBar1.add(btnThem);
        jToolBar1.add(jSeparator1);

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/chinh-sua32x32.png"))); // NOI18N
        btnSua.setText("Điều chỉnh");
        btnSua.setFocusable(false);
        btnSua.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSua.setIconTextGap(5);
        btnSua.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSua);
        jToolBar1.add(jSeparator2);

        btnNgungKinhDoanh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/xoa32x32.png"))); // NOI18N
        btnNgungKinhDoanh.setText("Ngừng kinh doanh");
        btnNgungKinhDoanh.setFocusable(false);
        btnNgungKinhDoanh.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNgungKinhDoanh.setIconTextGap(5);
        btnNgungKinhDoanh.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnNgungKinhDoanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNgungKinhDoanhActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNgungKinhDoanh);
        jToolBar1.add(jSeparator3);

        btnNhapExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/import-excel32x32.png"))); // NOI18N
        btnNhapExcel.setText("Nhập từ excel");
        btnNhapExcel.setFocusable(false);
        btnNhapExcel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNhapExcel.setIconTextGap(5);
        btnNhapExcel.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnNhapExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapExcelActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNhapExcel);
        jToolBar1.add(jSeparator4);

        btnXuatExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/export-excel32x32.png"))); // NOI18N
        btnXuatExcel.setText("Xuất excel");
        btnXuatExcel.setFocusable(false);
        btnXuatExcel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnXuatExcel.setIconTextGap(5);
        btnXuatExcel.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnXuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExcelActionPerformed(evt);
            }
        });
        jToolBar1.add(btnXuatExcel);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel8.setOpaque(false);

        jPanel4.setBackground(new java.awt.Color(243, 243, 243));
        jPanel4.setOpaque(false);

        txtTimKiemSanPham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemSanPhamKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTimKiemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlLoc.setBackground(new java.awt.Color(243, 243, 243));
        pnlLoc.setOpaque(false);
        pnlLoc.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 2));

        jLabel7.setText("Thương hiệu");
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 16));
        pnlLoc.add(jLabel7);

        jLabel10.setText("Dòng máy");
        jLabel10.setPreferredSize(new java.awt.Dimension(150, 16));
        pnlLoc.add(jLabel10);

        jLabel9.setText("Đối tượng sử dụng");
        jLabel9.setPreferredSize(new java.awt.Dimension(150, 16));
        pnlLoc.add(jLabel9);

        jLabel11.setText("Chất liệu dây");
        jLabel11.setPreferredSize(new java.awt.Dimension(150, 16));
        pnlLoc.add(jLabel11);

        jLabel8.setText("Chất liệu kính");
        jLabel8.setPreferredSize(new java.awt.Dimension(150, 16));
        pnlLoc.add(jLabel8);

        jLabel13.setText("Hình dạng mặt");
        jLabel13.setPreferredSize(new java.awt.Dimension(150, 16));
        pnlLoc.add(jLabel13);

        cboThuongHieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboThuongHieu.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlLoc.add(cboThuongHieu);

        cboDongMay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboDongMay.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlLoc.add(cboDongMay);

        cboDoiTuongSuDung.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboDoiTuongSuDung.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlLoc.add(cboDoiTuongSuDung);

        cboChatLieuDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChatLieuDay.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlLoc.add(cboChatLieuDay);

        cboChatLieuKinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChatLieuKinh.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlLoc.add(cboChatLieuKinh);

        cboHinhDangMat.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlLoc.add(cboHinhDangMat);

        jPanel7.setBackground(new java.awt.Color(243, 243, 243));
        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.BorderLayout());

        tblDSSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Thương hiệu", "Mã hàng hóa", "Giá nhập", "Giá bán", "Số lượng tồn", "Đối tượng sử dụng", "Dòng sản phẩm", "Dòng máy", "Chất liệu dây", "Chất liệu kính", "Kháng nước", "Khoảng trữ cót", "Size mặt", "Xuất xứ", "Chất liệu vỏ", "Hình dạng mặt", "Màu vỏ", "Tính năng", "Độ dầy", "Màu mặt", "Hình ảnh", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSSanPham.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblDSSanPham.setRowHeight(30);
        tblDSSanPham.setSelectionBackground(new java.awt.Color(137, 187, 201));
        tblDSSanPham.setShowGrid(false);
        tblDSSanPham.setShowHorizontalLines(true);
        tblDSSanPham.setShowVerticalLines(true);
        tblDSSanPham.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDSSanPham);
        if (tblDSSanPham.getColumnModel().getColumnCount() > 0) {
            tblDSSanPham.getColumnModel().getColumn(0).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblDSSanPham.getColumnModel().getColumn(6).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(7).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(8).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(9).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(10).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(11).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(12).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(13).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(14).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(15).setPreferredWidth(170);
            tblDSSanPham.getColumnModel().getColumn(16).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(17).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(18).setPreferredWidth(400);
            tblDSSanPham.getColumnModel().getColumn(19).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(20).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(21).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(22).setPreferredWidth(150);
        }

        jPanel7.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DANH SÁCH SẢN PHẨM");
        jPanel7.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jPanel.setBackground(new java.awt.Color(243, 243, 243));
        jPanel.setOpaque(false);

        jLabel2.setText("Số bản ghi:");
        jPanel.add(jLabel2);

        cboSoBanGhi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15", "20", "30", "50", "100" }));
        cboSoBanGhi.setPreferredSize(new java.awt.Dimension(70, 25));
        cboSoBanGhi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSoBanGhiItemStateChanged(evt);
            }
        });
        jPanel.add(cboSoBanGhi);

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/first16x16.png"))); // NOI18N
        btnFirst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel.add(btnFirst);

        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/prev16x16.png"))); // NOI18N
        btnPrev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel.add(btnPrev);

        lblPageOfTotalPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPageOfTotalPage.setText("1/50");
        lblPageOfTotalPage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPageOfTotalPage.setPreferredSize(new java.awt.Dimension(70, 22));
        jPanel.add(lblPageOfTotalPage);

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/next16x16.png"))); // NOI18N
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel.add(btnNext);

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/last16x16.png"))); // NOI18N
        btnLast.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel.add(btnLast);

        lblTongSoBanGhi.setText("Tổng số: ");
        lblTongSoBanGhi.setPreferredSize(new java.awt.Dimension(125, 16));
        jPanel.add(lblTongSoBanGhi);

        chkChonTat.setText("All");
        chkChonTat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkChonTatItemStateChanged(evt);
            }
        });

        btnKhoiPhuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/restore.png"))); // NOI18N
        btnKhoiPhuc.setText("Khôi phục");
        btnKhoiPhuc.setEnabled(false);
        btnKhoiPhuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoiPhucActionPerformed(evt);
            }
        });

        btnLocSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/filter32x32.png"))); // NOI18N
        btnLocSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocSanPhamActionPerformed(evt);
            }
        });

        jPanel2.setOpaque(false);

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboTrangThai.setPreferredSize(new java.awt.Dimension(72, 30));
        cboTrangThai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTrangThaiItemStateChanged(evt);
            }
        });

        jLabel3.setText("Trạng thái");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboTrangThai, 0, 150, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(chkChonTat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKhoiPhuc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(pnlLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocSanPham)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLocSanPham)
                    .addComponent(pnlLoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnKhoiPhuc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkChonTat))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbebQLSanPham.addTab("DANH SÁCH SẢN PHẨM", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbebQLSanPham)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbebQLSanPham)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        tblDSSanPham.clearSelection();
        formThemVaSuaSanPham = new FormThemVaSuaSanPhamJFrame(this);
        formThemVaSuaSanPham.txtMaSanPham.setText(sanPhamService.getMaSanPhamTuDongSinh());
        formThemVaSuaSanPham.setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        index = tblDSSanPham.getSelectedRow();
        if (index < 0) {
            return;
        }
        formThemVaSuaSanPham = new FormThemVaSuaSanPhamJFrame(this);
        showData();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnNgungKinhDoanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNgungKinhDoanhActionPerformed
        int selectedRowCount = tblDSSanPham.getSelectedRowCount();
        if (selectedRowCount == 0) {
            Helper.alert(this, "Vui lòng chọn sản phẩm muốn ngừng kinh doanh!");
            return;
        }
        if (selectedRowCount == 1) {
            index = tblDSSanPham.getSelectedRow();
            if (Helper.comfirm(this, "Xác nhận thao tác? Bạn muốn ngừng kinh doanh sản phẩm này? ")) {
                int id = listSP.get(index).getId();
                sanPhamService.updateAStatus(1, id);
                initPagination(sanPhamService.getAll(page, pageSize, trangThai));
            }
            System.out.println("Update 1");
        } else {
            List<Integer> listID = new ArrayList<>();
            int count = tblDSSanPham.getSelectedRows().length;
            for (int i = 0; i < count; i++) {
                listID.add(listSP.get(i).getId());
            }
            if (Helper.comfirm(this, "Xác nhận thao tác? Bạn muốn ngừng kinh doanh các sản phẩm này? ")) {
                sanPhamService.updateStatuses(1, listID);
                page = 1;
                initPagination(sanPhamService.getAll(page, pageSize, trangThai));
                chkChonTat.setSelected(false);
            }
            System.out.println("Update nhiều");
        }
    }//GEN-LAST:event_btnNgungKinhDoanhActionPerformed

    private void btnNhapExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapExcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNhapExcelActionPerformed

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        btnXuatExcel.setEnabled(false);
        ProgressJDialog progressJDialog = new ProgressJDialog(null, true);
        if (progressExportExcel != null && !progressExportExcel.isDone()) {
            progressExportExcel.cancel(true);
        }
        progressExportExcel = new ProgressExportExcel(progressJDialog.pgbLoadData, progressJDialog, this);
        progressExportExcel.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if ("state".equals(evt.getPropertyName()) && SwingWorker.StateValue.DONE == evt.getNewValue()) {
                    // Enable the button when the task is done
                    btnXuatExcel.setEnabled(true);
                    JFileChooser jfc = new JFileChooser();
                    jfc.setDialogTitle("Export excel");
                    jfc.setPreferredSize(Helper.dimensionJFileChooser);
                    FileNameExtensionFilter excelFilter = new FileNameExtensionFilter("Microsoft Excel (*.xlsx)",
                            "xlsx");
                    jfc.setFileFilter(excelFilter);
                    SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
                    jfc.setSelectedFile(new File(("DanhSachSanPham_" + sdf.format(new java.util.Date()) + ".xlsx")));
                    int choose = jfc.showSaveDialog(null);
                    if (choose == JFileChooser.APPROVE_OPTION) {
                        File excelFilePath = jfc.getSelectedFile();
                        String filePath = excelFilePath.getPath();
                        try {
                            WriteExcel.writeExcel(tblDSSanPham, progressExportExcel.listData, filePath);
                            Helper.alert(FormSanPhamJPanel.this, "Xuất file thành công");
                        } catch (IOException ex) {
                            ex.printStackTrace();
                            Helper.alert(FormSanPhamJPanel.this, "Xuất file thất bại");
                        }
                    }
                }
            }
        });
        progressExportExcel.execute();
        progressJDialog.setVisible(true);
    }//GEN-LAST:event_btnXuatExcelActionPerformed

    private void btnLocSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLocSanPhamActionPerformed

    private void btnKhoiPhucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoiPhucActionPerformed
        int selectedRowCount = tblDSSanPham.getSelectedRowCount();
        if (selectedRowCount == 0) {
            Helper.alert(this, "Vui lòng chọn sản phẩm muốn ngừng kinh doanh!");
            return;
        }
        if (selectedRowCount == 1) {
            index = tblDSSanPham.getSelectedRow();
            if (Helper.comfirm(this, "Xác nhận thao tác? Bạn muốn tiếp tục kinh doanh sản phẩm này? ")) {
                int id = listSP.get(index).getId();
                sanPhamService.updateAStatus(0, id);
                initPagination(sanPhamService.getAll(page, pageSize, trangThai));
            }
            System.out.println("Update 1");
        } else {
            List<Integer> listID = new ArrayList<>();
            int count = tblDSSanPham.getSelectedRows().length;
            for (int i = 0; i < count; i++) {
                listID.add(listSP.get(i).getId());
            }
            if (Helper.comfirm(this, "Xác nhận thao tác? Bạn muốn tiếp tục kinh doanh các sản phẩm này? ")) {
                sanPhamService.updateStatuses(0, listID);
                initPagination(sanPhamService.getAll(page, pageSize, trangThai));
                chkChonTat.setSelected(false);
            }
        }
    }//GEN-LAST:event_btnKhoiPhucActionPerformed

    private void chkChonTatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkChonTatItemStateChanged
        if (chkChonTat.isSelected()) {
            int rowCount = tblDSSanPham.getRowCount();
            tblDSSanPham.setRowSelectionInterval(0, rowCount - 1);
        } else {
            tblDSSanPham.clearSelection();
        }
    }//GEN-LAST:event_chkChonTatItemStateChanged

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        page = totalPage;
        initPagination(sanPhamService.getAll(page, pageSize, trangThai));
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (page < totalPage) {
            page++;
            initPagination(sanPhamService.getAll(page, pageSize, trangThai));
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if (page > 1) {
            page--;
            initPagination(sanPhamService.getAll(page, pageSize, trangThai));
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        page = 1;
        initPagination(sanPhamService.getAll(page, pageSize, trangThai));
    }//GEN-LAST:event_btnFirstActionPerformed

    private void cboSoBanGhiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSoBanGhiItemStateChanged
        initPagination(sanPhamService.getAll(page, pageSize, trangThai));
    }//GEN-LAST:event_cboSoBanGhiItemStateChanged

    private void txtTimKiemSanPhamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemSanPhamKeyReleased
        String name = txtTimKiemSanPham.getText();
        //        initPagination(sanPhamService.findByNameOrMa(page, pageSize, name));
        if (!name.trim().isEmpty()) {
            cboSoBanGhi.setEnabled(false);
            btnFirst.setEnabled(false);
            btnPrev.setEnabled(false);
            btnNext.setEnabled(false);
            btnLast.setEnabled(false);
            lblPageOfTotalPage.setEnabled(false);
            lblTongSoBanGhi.setEnabled(false);
            SwingWorker<List<SanPhamViewModel>, Void> woker = new SwingWorker<List<SanPhamViewModel>, Void>() {
                @Override
                protected List<SanPhamViewModel> doInBackground() throws Exception {
                    return sanPhamService.findSPByNameOrMa(1, 50, name, trangThai);
                }

                @Override
                protected void done() {
                    try {
                        List<SanPhamViewModel> searchResult = get();
                        initPagination(searchResult);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            woker.execute();
        } else {
            cboSoBanGhi.setEnabled(true);
            btnFirst.setEnabled(true);
            btnPrev.setEnabled(true);
            btnNext.setEnabled(true);
            btnLast.setEnabled(true);
            lblPageOfTotalPage.setEnabled(true);
            lblTongSoBanGhi.setEnabled(true);
            initPagination(sanPhamService.getAll(page, pageSize, trangThai));
        }

    }//GEN-LAST:event_txtTimKiemSanPhamKeyReleased

    private void cboTrangThaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTrangThaiItemStateChanged
        initPagination(sanPhamService.getAll(page, pageSize, trangThai));
        if (cboTrangThai.getSelectedIndex() == 0) {
            btnKhoiPhuc.setEnabled(false);
            chkChonTat.setSelected(false);
        } else {
            btnKhoiPhuc.setEnabled(true);
            chkChonTat.setSelected(false);
        }
    }//GEN-LAST:event_cboTrangThaiItemStateChanged

    private void init() {
        txtTimKiemSanPham.putClientProperty(
                FlatClientProperties.PLACEHOLDER_TEXT,
                "Nhập nội dung tìm kiếm...");
//        txtTimKiemSanPham.putClientProperty(
//                FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON,
//                true);
        tabbebQLSanPham.putClientProperty(FlatClientProperties.TABBED_PANE_SHOW_TAB_SEPARATORS, true);
        tabbebQLSanPham.addTab("THUỘC TÍNH SẢN PHẨM", new FormTabThuocTinhSanPham());
//        TableTextAlignmentCellRender textCenter = new TableTextAlignmentCellRender();
//        int countColumntblSP = tblDSSanPham.getColumnCount();
//        for (int i = 0; i < countColumntblSP; i++) {
//            tblDSSanPham.getColumnModel().getColumn(i).setCellRenderer(textCenter);
//        }
    }

    public void initPagination(List<SanPhamViewModel> list) {
        trangThai = cboTrangThai.getSelectedIndex();
        tongSoBanGhiTheoTrangThai = sanPhamService.getRecordCountByTrangThai(trangThai);
        tongSoBanGhi = sanPhamService.getRecordCount();
        pageSize = Integer.parseInt(cboSoBanGhi.getSelectedItem().toString());
        totalPage = (int) Math.ceil((double) tongSoBanGhiTheoTrangThai / pageSize);
        if (page > totalPage) {
            page = 1;
        }
        listSP = list;
        loadDataToTable(listSP);
        lblPageOfTotalPage.setText(page + "/" + totalPage);
        lblTongSoBanGhi.setText("Tổng số: " + tongSoBanGhiTheoTrangThai + "/" + tongSoBanGhi);
    }

    private void loadDataToTable(List<SanPhamViewModel> list) {
        dtmTblSanPham = (DefaultTableModel) tblDSSanPham.getModel();
        dtmTblSanPham.setRowCount(0);
        for (SanPhamViewModel sp : list) {
            dtmTblSanPham.addRow(sp.toDataRow());
        }

    }

    private void loadDataCboThuongHieu() {
        List<ThuongHieuViewModel> list = thuongHieuService.getAll();
        int size = list.size();
        dcbmThuongHieu.removeAllElements();
        dcbmThuongHieu.addElement("Tất cả");
        for (int i = 1; i < size; i++) {
            dcbmThuongHieu.addElement(list.get(i));
        }
    }

    private void loadDataCboDongMay() {
        List<DongMayViewModel> list = dongMayService.getAll();
        int size = list.size();
        dcbmDongMay.removeAllElements();
        dcbmDongMay.addElement("Tất cả");
        for (int i = 1; i < size; i++) {
            dcbmDongMay.addElement(list.get(i));
        }
    }

    private void loadDataCboDoiTuongSuDung() {
        cboDoiTuongSuDung.removeAllItems();
        cboDoiTuongSuDung.addItem("Tất cả");
        cboDoiTuongSuDung.addItem("Unisex");
        cboDoiTuongSuDung.addItem("Nam");
        cboDoiTuongSuDung.addItem("Nữ");
        cboDoiTuongSuDung.addItem("Trẻ em");
    }

    private void loadDataCboChatLieuDay() {
        List<ChatLieuDayViewModel> list = chatLieuDayService.getAll();
        int size = list.size();
        dcbmChatLieuDay.removeAllElements();
        dcbmChatLieuDay.addElement("Tất cả");
        for (int i = 1; i < size; i++) {
            dcbmChatLieuDay.addElement(list.get(i));
        }
    }

    private void loadDataCboChatLieuKinh() {
        List<ChatLieuKinhViewModel> list = chatLieuKinhService.getAll();
        int size = list.size();
        dcbmChatLieuKinh.removeAllElements();
        dcbmChatLieuKinh.addElement("Tất cả");
        for (int i = 1; i < size; i++) {
            dcbmChatLieuKinh.addElement(list.get(i));
        }
    }

    private void loadDataCboHinhDang() {
        cboHinhDangMat.removeAllItems();
        cboHinhDangMat.addItem("Tất cả");
        cboHinhDangMat.addItem("Mặt tròn");
        cboHinhDangMat.addItem("Mặt vuông");
        cboHinhDangMat.addItem("Mặt chữ nhật");
        cboHinhDangMat.addItem("Đa giác");
    }

    private void loadDataCboTrangThai() {
        cboTrangThai.removeAllItems();
        cboTrangThai.addItem("Đang kinh doanh");
        cboTrangThai.addItem("Ngừng kinh doanh");
    }

    private void showData() {
        SanPhamViewModel sp = listSP.get(index);
        formThemVaSuaSanPham.txtMaSanPham.setText(sp.getMaSanPham());
        formThemVaSuaSanPham.txtMaVach.setText(sp.getMaHangHoa());
        formThemVaSuaSanPham.spnSoLuong.setValue(sp.getSoLuongTon());
        formThemVaSuaSanPham.spnGiaNhap.setValue(sp.getGiaNhap());
        formThemVaSuaSanPham.spnGiaBan.setValue(sp.getDonGia());
        formThemVaSuaSanPham.dcbmThuongHieu.setSelectedItem(sp.getThuongHieu());
        formThemVaSuaSanPham.dcbmDongSanPham.setSelectedItem(sp.getDongSanPham());
        formThemVaSuaSanPham.dcbmXuatXu.setSelectedItem(sp.getXuatXu());
        formThemVaSuaSanPham.dcbmMauVo.setSelectedItem(sp.getMauVo());
        formThemVaSuaSanPham.dcbmMauMat.setSelectedItem(sp.getMauMat());
        formThemVaSuaSanPham.dcbmDongMay.setSelectedItem(sp.getDongMay());
        formThemVaSuaSanPham.dcbmChatLieuDay.setSelectedItem(sp.getChatLieuDay());
        formThemVaSuaSanPham.dcbmChatLieuKinh.setSelectedItem(sp.getChatLieuKinh());
        formThemVaSuaSanPham.dcbmChatLieuVo.setSelectedItem(sp.getChatLieuVo());
        formThemVaSuaSanPham.cboHinhDang.setSelectedItem(sp.getHinhDang());
        formThemVaSuaSanPham.cboDoiTuongSuDung.setSelectedItem(sp.getDoiTuongSuDung());
        formThemVaSuaSanPham.spnKhangNuoc.setValue(sp.getKhangNuoc());
        formThemVaSuaSanPham.spnSizeMat.setValue(sp.getSizeMat());
        formThemVaSuaSanPham.spnDoDay.setValue(sp.getDoDay());
        formThemVaSuaSanPham.spnKhoangTruCot.setValue(sp.getKhoangTruCot());
        List<TinhNangViewModel> listTNSP = new ArrayList<>(tinhNangSanPhamService.getAllByIdSanPham(sp.getId()));
        formThemVaSuaSanPham.cboTinhNang.clearSelectedItems();
        formThemVaSuaSanPham.cboTinhNang.setSelectedItems(listTNSP);
        Helper.showHinhAnh("images\\images-san-pham",
                formThemVaSuaSanPham.lblHinhAnh, sp.getHinhAnh());
        formThemVaSuaSanPham.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnKhoiPhuc;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnLocSanPham;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNgungKinhDoanh;
    private javax.swing.JButton btnNhapExcel;
    private javax.swing.JButton btnPrev;
    public javax.swing.JButton btnSua;
    public javax.swing.JButton btnThem;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.JComboBox<String> cboChatLieuDay;
    private javax.swing.JComboBox<String> cboChatLieuKinh;
    private javax.swing.JComboBox<String> cboDoiTuongSuDung;
    private javax.swing.JComboBox<String> cboDongMay;
    private javax.swing.JComboBox<String> cboHinhDangMat;
    private javax.swing.JComboBox<String> cboSoBanGhi;
    private javax.swing.JComboBox<String> cboThuongHieu;
    javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JCheckBox chkChonTat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblPageOfTotalPage;
    private javax.swing.JLabel lblTongSoBanGhi;
    private javax.swing.JPanel pnlLoc;
    private javax.swing.JTabbedPane tabbebQLSanPham;
    public javax.swing.JTable tblDSSanPham;
    private javax.swing.JTextField txtTimKiemSanPham;
    // End of variables declaration//GEN-END:variables
}

class ProgressExportExcel extends SwingWorker<List<SanPhamViewModel>, Void> {

    private final JProgressBar progressBar;
    private final ProgressJDialog progressJDialog;
    private FormSanPhamJPanel formSanPhamJPanel;
    private final ISanPhamService sanPhamService = new SanPhamService();
    List<SanPhamViewModel> listData = new ArrayList<>();

    public ProgressExportExcel(JProgressBar progressBar, ProgressJDialog progressJDialog, JPanel jPanel) {
        this.progressBar = progressBar;
        this.progressJDialog = progressJDialog;
        this.formSanPhamJPanel = (FormSanPhamJPanel) jPanel;
    }

    @Override
    protected List<SanPhamViewModel> doInBackground() throws Exception {
        progressBar.setIndeterminate(true);
        int trangThai = formSanPhamJPanel.cboTrangThai.getSelectedIndex();
        int count = 0;
        if (trangThai == StatusSanPham.DANG_KINH_DOANH) {
            count = sanPhamService.getRecordCountByTrangThai(StatusSanPham.DANG_KINH_DOANH);
        } else {
            count = sanPhamService.getRecordCountByTrangThai(StatusSanPham.NGUNG_KINH_DOANH);
        }
        listData.addAll(sanPhamService.getAll(1, count, trangThai));
        System.out.println("Số bản ghi: " + listData.size());
        return listData;
    }

    @Override
    protected void done() {
        progressBar.setIndeterminate(false);
        System.out.println("Succecfully");
        progressJDialog.dispose();
    }
}
