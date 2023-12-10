/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.wstore.views;

import com.formdev.flatlaf.FlatClientProperties;
import com.wstore.domainmodels.HinhThucThanhToan;
import com.wstore.domainmodels.HoaDon;
import com.wstore.domainmodels.KhachHang;
import com.wstore.services.IHinhThucThanhToanService;
import com.wstore.services.IHoaDonChiTietService;
import com.wstore.services.IHoaDonService;
import com.wstore.services.impl.SanPhamService;
import com.wstore.swing.table.TableActionCellEditor;
import com.wstore.swing.table.TableActionCellRender;
import com.wstore.swing.table.TableActionEvent;
import com.wstore.swing.table.TableImageCellRender;
import com.wstore.viewmodels.banhang.SanPhamBanHangViewModel;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import com.wstore.services.ISanPhamService;
import com.wstore.services.impl.HinhThucThanhToanService;
import com.wstore.services.impl.HoaDonChiTietService;
import com.wstore.services.impl.HoaDonService;
import com.wstore.swing.table.TableTextAlignmentRightCellRender;
import com.wstore.utilities.Helper;
import com.wstore.utilities.ReportManager;
import com.wstore.utilities.status.StatusHoaDon;
import com.wstore.viewmodels.HoaDonChiTietViewModel;
import com.wstore.viewmodels.HoaDonViewModel;
import java.awt.event.KeyEvent;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.swing.DefaultCellEditor;
import javax.swing.JTextField;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.TableCellEditor;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author ducan
 */
public final class FormTabBanHangJPanel extends javax.swing.JPanel {

    private final Frame formBanHangJFrame;
    private final ISanPhamService sanPhamService = new SanPhamService();
    private final IHoaDonService hoaDonService = new HoaDonService();
    private final IHoaDonChiTietService hoaDonChiTietService = new HoaDonChiTietService();
    private final IHinhThucThanhToanService hinhThucThanhToanService = new HinhThucThanhToanService();
    private DefaultTableModel dtmTblSanPham;
    private DefaultTableModel dtmTblGioHang;
    private List<SanPhamBanHangViewModel> listSanPham;
    List<HoaDonChiTietViewModel> listHoaDonChiTiet = new ArrayList<>();
    private Map<SanPhamBanHangViewModel, Integer> listUpdateSoLuongSP = new HashMap<>();
    private HoaDon hoaDon;
    HoaDonViewModel hoaDonViewModel;
    private KhachHang kh = new KhachHang();
    int trangThai = 0;
    int page = 1;
    private int tongSoBanGhiTheoTrangThai = 0;
    int totalPage = 1;
    int pageSize = 15;
    int tongTien = 0;
    int soLuongMua = 0;
    int donGiaSP = 0;
    int tienGiamGiaTrenSP = 0;
    int tongTienGiamGia = 0;
    int tienCanThanhToan = 0;
    int tienKhachDua = 0;
    int tienKhachCK = 0;
    int tienThua = 0;

    public FormTabBanHangJPanel(Frame parent) {
        initComponents();
        this.formBanHangJFrame = parent;
        try {
            ReportManager.getInstance().compileReport();
        } catch (JRException e) {
            e.printStackTrace();
        }
        init();
        customJTable();
        initPagination(sanPhamService.getAllSanPhamBanHang(page, pageSize, trangThai));
        tabbedThanhToan.removeTabAt(1);
    }

    private void init() {
        txtTimKiemSanPham.putClientProperty(
                FlatClientProperties.PLACEHOLDER_TEXT,
                "Nhập nội dung tìm kiếm...");
        txtTimKiemSanPham.putClientProperty(
                FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON,
                true);
        tabbedThanhToan.putClientProperty(
                FlatClientProperties.TABBED_PANE_SHOW_TAB_SEPARATORS,
                true);
        TableTextAlignmentRightCellRender textRightCellRender = new TableTextAlignmentRightCellRender();
        int countColumntblHDCT = tblGioHang.getColumnCount();
        for (int i = 2; i < countColumntblHDCT; i++) {
            tblGioHang.getColumnModel().getColumn(i).setCellRenderer(textRightCellRender);
        }
//        editorSoLuongTblGioHang();
    }

    private void customJTable() {
        tblDSSanPham.getColumnModel().getColumn(0).setCellRenderer(new TableImageCellRender());
        tblDSSanPham.getColumnModel().getColumn(6).setCellRenderer(new TableActionCellRender());
        tblDSSanPham.getColumnModel().getColumn(6).setCellEditor(new TableActionCellEditor(tableSanPhamActionEvent()));
//        TableTextAlignmentCellRender textCenter = new TableTextAlignmentCellRender();
//        tblDSSanPham.getColumnModel().getColumn(2).setCellRenderer(textCenter);
    }

    private TableActionEvent tableSanPhamActionEvent() {
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onAdd(int row) {
                if (hoaDonViewModel == null) {
                    Helper.alert(null, "Vui lòng tạo hóa đơn để mua hàng!");
                    return;
                }
                String strSoLuong = JOptionPane.showInputDialog("Số lượng ");
                if (Helper.isValidNumber(strSoLuong)) {
                    int soLuong = Integer.parseInt(strSoLuong);
                    if (soLuong <= 0) {
                        return;
                    }
                    themSanPhamVaoGioHang(row, soLuong);
                    showDataHoaDonTaiQuay(hoaDonViewModel);
                    System.out.println("SP trong giỏ hàng: ");
                    for (HoaDonChiTietViewModel hdct : listHoaDonChiTiet) {
                        System.out.println(hdct.toString());
                    }
                }
            }

            @Override
            public void onMinus(int row) {

            }
        };
        return event;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDSSanPham = new javax.swing.JTable();
        txtTimKiemSanPham = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboSoBanGhi = new javax.swing.JComboBox<>();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        lblPageOfTotalPage = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblGioHang = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        btnBo = new javax.swing.JButton();
        btnQuetMa = new javax.swing.JButton();
        btnTaoHoaDon = new javax.swing.JButton();
        cboCachThucBanHang = new javax.swing.JComboBox<>();
        btnHoaDon = new javax.swing.JButton();
        lblHoaDonDangMuaHang = new javax.swing.JLabel();
        btnRefesh = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        tabbedThanhToan = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        txtNhanVien = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtGiamGiaKM = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtThanhToan = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cboHinhThucThanhToan = new javax.swing.JComboBox<>();
        txtNgayTao = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtTienKhachDua = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtTienKhachChietKhau = new javax.swing.JTextField();
        txtTienThua = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        btnThanhToanTaiQuay = new javax.swing.JButton();
        pnlDatHang = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        txtTenKH = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        txtSDT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnTimKiemKhachHang = new javax.swing.JButton();

        setBackground(new java.awt.Color(241, 246, 251));
        setPreferredSize(new java.awt.Dimension(1377, 725));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                formComponentRemoved(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1377, 760));
        jPanel1.setRequestFocusEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sản phẩm\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.setOpaque(false);

        tblDSSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDSSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hình ảnh", "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Đơn giá", "Giá khuyến mãi", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSSanPham.setRowHeight(80);
        tblDSSanPham.setSelectionBackground(new java.awt.Color(137, 187, 201));
        tblDSSanPham.setShowHorizontalLines(true);
        tblDSSanPham.setShowVerticalLines(true);
        tblDSSanPham.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblDSSanPham);
        if (tblDSSanPham.getColumnModel().getColumnCount() > 0) {
            tblDSSanPham.getColumnModel().getColumn(0).setMinWidth(80);
            tblDSSanPham.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblDSSanPham.getColumnModel().getColumn(0).setMaxWidth(80);
            tblDSSanPham.getColumnModel().getColumn(1).setMinWidth(120);
            tblDSSanPham.getColumnModel().getColumn(1).setPreferredWidth(120);
            tblDSSanPham.getColumnModel().getColumn(1).setMaxWidth(120);
            tblDSSanPham.getColumnModel().getColumn(3).setMinWidth(100);
            tblDSSanPham.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblDSSanPham.getColumnModel().getColumn(3).setMaxWidth(100);
            tblDSSanPham.getColumnModel().getColumn(4).setMinWidth(150);
            tblDSSanPham.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(4).setMaxWidth(150);
            tblDSSanPham.getColumnModel().getColumn(5).setMinWidth(150);
            tblDSSanPham.getColumnModel().getColumn(5).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(5).setMaxWidth(150);
            tblDSSanPham.getColumnModel().getColumn(6).setMinWidth(60);
            tblDSSanPham.getColumnModel().getColumn(6).setPreferredWidth(60);
            tblDSSanPham.getColumnModel().getColumn(6).setMaxWidth(60);
        }

        txtTimKiemSanPham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemSanPhamKeyReleased(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(243, 243, 243));
        jPanel8.setOpaque(false);

        jLabel2.setText("Số bản ghi:");
        jPanel8.add(jLabel2);

        cboSoBanGhi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15", "20", "30", "50", "100" }));
        cboSoBanGhi.setPreferredSize(new java.awt.Dimension(70, 25));
        cboSoBanGhi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSoBanGhiItemStateChanged(evt);
            }
        });
        jPanel8.add(cboSoBanGhi);

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/first16x16.png"))); // NOI18N
        btnFirst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel8.add(btnFirst);

        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/prev16x16.png"))); // NOI18N
        btnPrev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel8.add(btnPrev);

        lblPageOfTotalPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPageOfTotalPage.setText("1/50");
        lblPageOfTotalPage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPageOfTotalPage.setPreferredSize(new java.awt.Dimension(70, 22));
        jPanel8.add(lblPageOfTotalPage);

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/next16x16.png"))); // NOI18N
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel8.add(btnNext);

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/last16x16.png"))); // NOI18N
        btnLast.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel8.add(btnLast);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Tìm kiếm:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimKiemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giỏ hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel4.setOpaque(false);

        tblGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng ", "Đơn giá", "Giảm giá", "Giá bán", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGioHang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblGioHang.setRowHeight(30);
        tblGioHang.setShowGrid(true);
        tblGioHang.getTableHeader().setReorderingAllowed(false);
        tblGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGioHangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblGioHang);

        jPanel10.setOpaque(false);

        btnBo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/remove-from-cart.png"))); // NOI18N
        btnBo.setText("Bỏ");
        btnBo.setIconTextGap(10);
        btnBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoActionPerformed(evt);
            }
        });

        btnQuetMa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/barcode.png"))); // NOI18N
        btnQuetMa.setText("Quét mã");
        btnQuetMa.setToolTipText("Quét mã barcode để tìm và nhập số lượng sản phẩm vào giỏ hàng");
        btnQuetMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuetMaActionPerformed(evt);
            }
        });

        btnTaoHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add32x32.png"))); // NOI18N
        btnTaoHoaDon.setText("Tạo hóa đơn");
        btnTaoHoaDon.setIconTextGap(5);
        btnTaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonActionPerformed(evt);
            }
        });

        cboCachThucBanHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tại quầy", "Đặt hàng" }));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnQuetMa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTaoHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboCachThucBanHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(btnBo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuetMa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaoHoaDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboCachThucBanHang))
        );

        btnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/hoa-don-cho-xu-li.png"))); // NOI18N
        btnHoaDon.setText("Hóa đơn");
        btnHoaDon.setToolTipText("Xem danh sách hóa đơn chờ, chờ giao, đang giao");
        btnHoaDon.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });

        lblHoaDonDangMuaHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnRefesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/refesh24x24.png"))); // NOI18N
        btnRefesh.setMargin(new java.awt.Insets(5, 5, 5, 5));
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnHoaDon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHoaDonDangMuaHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoaDonDangMuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đơn hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel6.setOpaque(false);

        tabbedThanhToan.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(241, 246, 251));

        jLabel11.setText("Mã HĐ");

        txtMaHD.setEditable(false);
        txtMaHD.setBackground(new java.awt.Color(255, 255, 255));

        txtNhanVien.setEditable(false);
        txtNhanVien.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Nhân viên");

        jLabel13.setText("Tổng tiền");

        txtTongTien.setEditable(false);
        txtTongTien.setBackground(new java.awt.Color(255, 255, 255));
        txtTongTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTongTien.setText("0");

        jLabel14.setText("Giảm giá KM ");

        txtGiamGiaKM.setEditable(false);
        txtGiamGiaKM.setBackground(new java.awt.Color(255, 255, 255));
        txtGiamGiaKM.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGiamGiaKM.setText("0");

        jLabel15.setText("Tiền cần thanh toán");

        txtThanhToan.setEditable(false);
        txtThanhToan.setBackground(new java.awt.Color(255, 255, 255));
        txtThanhToan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtThanhToan.setText("0");

        jLabel16.setText("Hình thức thanh toán");

        cboHinhThucThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền mặt", "Chuyển khoản", "Tiền mặt và Chuyển khoản" }));
        cboHinhThucThanhToan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboHinhThucThanhToanItemStateChanged(evt);
            }
        });

        txtNgayTao.setEditable(false);
        txtNgayTao.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setText("Ngày tạo");

        jLabel19.setText("Tiền khách đưa");

        txtTienKhachDua.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTienKhachDua.setText("0");
        txtTienKhachDua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTienKhachDuaFocusLost(evt);
            }
        });
        txtTienKhachDua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTienKhachDuaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTienKhachDuaKeyTyped(evt);
            }
        });

        jLabel20.setText("Tiền khách CK");

        txtTienKhachChietKhau.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTienKhachChietKhau.setText("0");
        txtTienKhachChietKhau.setEnabled(false);
        txtTienKhachChietKhau.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTienKhachChietKhauFocusLost(evt);
            }
        });
        txtTienKhachChietKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTienKhachChietKhauKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTienKhachChietKhauKeyTyped(evt);
            }
        });

        txtTienThua.setEditable(false);
        txtTienThua.setBackground(new java.awt.Color(255, 255, 255));
        txtTienThua.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTienThua.setText("0");

        jLabel21.setText("Tiền thừa");

        jLabel22.setText("Ghi chú");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        txtGhiChu.setToolTipText("");
        txtGhiChu.setWrapStyleWord(true);
        jScrollPane6.setViewportView(txtGhiChu);

        btnThanhToanTaiQuay.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnThanhToanTaiQuay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/payment.png"))); // NOI18N
        btnThanhToanTaiQuay.setText("Thanh toán");
        btnThanhToanTaiQuay.setIconTextGap(10);
        btnThanhToanTaiQuay.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnThanhToanTaiQuay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanTaiQuayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtThanhToan)
                            .addComponent(txtGiamGiaKM)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboHinhThucThanhToan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel17)
                            .addComponent(jLabel11))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayTao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNhanVien)
                            .addComponent(txtMaHD)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTongTien))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addGap(18, 18, 18))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTienKhachDua)
                            .addComponent(txtTienThua)
                            .addComponent(txtTienKhachChietKhau)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
                    .addComponent(btnThanhToanTaiQuay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiamGiaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboHinhThucThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTienKhachChietKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThanhToanTaiQuay)
                .addContainerGap())
        );

        tabbedThanhToan.addTab("Tại quầy", jPanel3);

        pnlDatHang.setBackground(new java.awt.Color(241, 246, 251));

        javax.swing.GroupLayout pnlDatHangLayout = new javax.swing.GroupLayout(pnlDatHang);
        pnlDatHang.setLayout(pnlDatHangLayout);
        pnlDatHangLayout.setHorizontalGroup(
            pnlDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );
        pnlDatHangLayout.setVerticalGroup(
            pnlDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        tabbedThanhToan.addTab("Đặt hàng", pnlDatHang);

        jPanel12.setBackground(new java.awt.Color(243, 243, 243));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel12.setOpaque(false);

        txtTenKH.setEditable(false);
        txtTenKH.setBackground(new java.awt.Color(255, 255, 255));
        txtTenKH.setText("Khách hàng lẻ");

        jLabel8.setText("Tên KH ");

        jLabel10.setText("Địa chỉ");

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        txtDiaChi.setText("Tại cửa hàng");
        jScrollPane4.setViewportView(txtDiaChi);

        txtSDT.setEditable(false);
        txtSDT.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("SĐT");

        btnTimKiemKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/icons8-search-24.png"))); // NOI18N
        btnTimKiemKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemKhachHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(txtTenKH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimKiemKhachHang))
                    .addComponent(txtSDT))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(btnTimKiemKhachHang))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(7, 7, 7)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabbedThanhToan))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedThanhToan))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDonActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");
        if (Helper.comfirm(this, "Xác nhận tạo hóa đơn tại quầy?")) {
            hoaDon = new HoaDon();
            hoaDon.setMaHoaDon("HD" + sdf.format(new Date()));
            hoaDon.setNgayTao(new Timestamp(new Date().getTime()));
            hoaDon.setTenKhachHang(txtTenKH.getText().trim());
            hoaDon.setSoDienThoai(txtSDT.getText().trim());
            hoaDon.setDiaChi(txtDiaChi.getText().trim());
            hoaDon.setTrangThai(0);
            hoaDon.setIdNhanVien(Helper.USER_LOGIN.getId());
            if (hoaDonService.insert(hoaDon)) {
                hoaDonViewModel = hoaDonService.getOne(hoaDon.getMaHoaDon());
                showHoaDonDuocChon(hoaDonViewModel);
                showDataHoaDonTaiQuay(hoaDonViewModel);
                Helper.alert(this, "Tạo hóa đơn thành công!");
                btnTaoHoaDon.setEnabled(false);
                btnHoaDon.setEnabled(false);
            } else {
                Helper.alert(this, "Tạo hóa đơn thất bại!");
            }
        }
    }//GEN-LAST:event_btnTaoHoaDonActionPerformed

    private void btnQuetMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuetMaActionPerformed
        new FormQuetMaBarcodeJDialog(formBanHangJFrame, false, this).setVisible(true);
    }//GEN-LAST:event_btnQuetMaActionPerformed

    private void btnTimKiemKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemKhachHangActionPerformed
        new FormKhachHang_BanHangJDialog(null, true, this).setVisible(true);
    }//GEN-LAST:event_btnTimKiemKhachHangActionPerformed

    private void btnThanhToanTaiQuayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanTaiQuayActionPerformed
        if (listHoaDonChiTiet.isEmpty()) {
            return;
        }
        if (!validateForm()) {
            if (hoaDonService.update(getDataToForm(), hoaDonViewModel.getId())) {
                HinhThucThanhToan httt = new HinhThucThanhToan();
                httt.setLoaiHinhThanhToan(cboHinhThucThanhToan.getSelectedItem().toString());
                httt.setIdHoaDon(new HoaDon(hoaDonViewModel.getId()));
                hinhThucThanhToanService.insert(httt);
                List<Integer> listIDOrderDetails = new ArrayList();
                for (HoaDonChiTietViewModel hoaDonChiTietViewModel : listHoaDonChiTiet) {
                    if (hoaDonChiTietViewModel.getId() != null) {
                        listIDOrderDetails.add(Integer.valueOf(hoaDonChiTietViewModel.getId().toString()));
                    }
                }
                hoaDonChiTietService.deleteListOrderDetails(listIDOrderDetails);
                int idHoaDon = hoaDonViewModel.getId();
                for (HoaDonChiTietViewModel hoaDonChiTietViewModel : listHoaDonChiTiet) {
                    hoaDonChiTietViewModel.setIdHoaDon(new HoaDon(idHoaDon));
                }
                hoaDonChiTietService.addListOrderDetails(idHoaDon, listHoaDonChiTiet);
                sanPhamService.updateSoLuong(listUpdateSoLuongSP);
                Helper.alert(this, "Thanh toán thành công!");
                if (Helper.comfirm(this, "Bạn có muốn in hóa đơn không?")) {
                    try {
                        ReportManager.getInstance().printReportPayment(hoaDonViewModel);
                    } catch (JRException ex) {
                        ex.printStackTrace();
                    }
                }
                clearForm();
                btnTaoHoaDon.setEnabled(true);
                btnHoaDon.setEnabled(true);
            } else {
                Helper.alert(this, "Thanh toán thất bại!");
            }
        }
    }//GEN-LAST:event_btnThanhToanTaiQuayActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        new FormHoaDon_BanHangJDialog(null, true, this).setVisible(true);
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void cboSoBanGhiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSoBanGhiItemStateChanged
        initPagination(sanPhamService.getAllSanPhamBanHang(page, pageSize, trangThai));
    }//GEN-LAST:event_cboSoBanGhiItemStateChanged

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        page = 1;
        initPagination(sanPhamService.getAllSanPhamBanHang(page, pageSize, trangThai));
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if (page > 1) {
            page--;
            initPagination(sanPhamService.getAllSanPhamBanHang(page, pageSize, trangThai));
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (page < totalPage) {
            page++;
            initPagination(sanPhamService.getAllSanPhamBanHang(page, pageSize, trangThai));
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        page = totalPage;
        initPagination(sanPhamService.getAllSanPhamBanHang(page, pageSize, trangThai));
    }//GEN-LAST:event_btnLastActionPerformed

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
            SwingWorker<List<SanPhamBanHangViewModel>, Void> woker = new SwingWorker<List<SanPhamBanHangViewModel>, Void>() {
                @Override
                protected List<SanPhamBanHangViewModel> doInBackground() throws Exception {
                    return sanPhamService.findSPBanHangByNameOrMa(1, 50, name, trangThai);
                }

                @Override
                protected void done() {
                    try {
                        List<SanPhamBanHangViewModel> searchResult = get();
                        initPagination(searchResult);
                    } catch (InterruptedException | ExecutionException e) {
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
            initPagination(sanPhamService.getAllSanPhamBanHang(page, pageSize, trangThai));
        }
    }//GEN-LAST:event_txtTimKiemSanPhamKeyReleased

    private void tblGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGioHangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGioHangMouseClicked

    private void btnBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoActionPerformed
        rollBackSoLuongSP();
    }//GEN-LAST:event_btnBoActionPerformed

    private void txtTienKhachDuaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienKhachDuaKeyReleased
        if (txtTienKhachDua.getText().isEmpty()) {
            txtTienKhachDua.setText("0");
        }
        tienKhachCK = Integer.parseInt(txtTienKhachChietKhau.getText());
        tienKhachDua = Integer.parseInt(txtTienKhachDua.getText());
        tienThua = (tienKhachDua + tienKhachCK) - tienCanThanhToan;
        txtTienThua.setText(Helper.dfTien.format(tienThua));
    }//GEN-LAST:event_txtTienKhachDuaKeyReleased

    private void txtTienKhachDuaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTienKhachDuaFocusLost
        JTextField source = (JTextField) evt.getSource();
        String text = source.getText().trim();

        // Kiểm tra xem giá trị có rỗng hoặc không hợp lệ không
        if (text.isEmpty() || !Helper.isValidNumber(text)) {
            source.setText("0"); // Đặt giá trị mặc định là 0
        }
    }//GEN-LAST:event_txtTienKhachDuaFocusLost

    private void txtTienKhachDuaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienKhachDuaKeyTyped
        char c = evt.getKeyChar();
        // Kiểm tra xem ký tự có phải là số không
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume(); // Ngăn chặn ký tự nhập vào nếu không phải là số
        }
    }//GEN-LAST:event_txtTienKhachDuaKeyTyped

    private void txtTienKhachChietKhauFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTienKhachChietKhauFocusLost
        JTextField source = (JTextField) evt.getSource();
        String text = source.getText().trim();
        if (text.isEmpty() || !Helper.isValidNumber(text)) {
            source.setText("0");
        }
    }//GEN-LAST:event_txtTienKhachChietKhauFocusLost

    private void txtTienKhachChietKhauKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienKhachChietKhauKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTienKhachChietKhauKeyTyped

    private void txtTienKhachChietKhauKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienKhachChietKhauKeyReleased
        if (txtTienKhachChietKhau.getText().isEmpty()) {
            txtTienKhachChietKhau.setText("0");
        }
        tienKhachDua = Integer.parseInt(txtTienKhachDua.getText());
        tienKhachCK = Integer.parseInt(txtTienKhachChietKhau.getText());
        tienThua = (tienKhachDua + tienKhachCK) - tienCanThanhToan;
        txtTienThua.setText(Helper.dfTien.format(tienThua));
    }//GEN-LAST:event_txtTienKhachChietKhauKeyReleased

    private void cboHinhThucThanhToanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboHinhThucThanhToanItemStateChanged
        switch (cboHinhThucThanhToan.getSelectedIndex()) {
            case 0:
                txtTienKhachDua.setEnabled(true);
                txtTienKhachChietKhau.setEnabled(false);
                txtTienKhachChietKhau.setText("0");
                txtTienKhachDua.setText(String.valueOf(tienCanThanhToan));
                break;
            case 1:
                txtTienKhachDua.setEnabled(false);
                txtTienKhachChietKhau.setEnabled(true);
                txtTienKhachChietKhau.setText(String.valueOf(tienCanThanhToan));
                txtTienKhachDua.setText("0");
                break;
            case 2:
                txtTienKhachDua.setEnabled(true);
                txtTienKhachChietKhau.setEnabled(true);
                tienKhachDua = (int) tienCanThanhToan / 2;
                tienKhachCK = (int) tienCanThanhToan / 2;
                txtTienKhachDua.setText(String.valueOf(tienKhachDua));
                txtTienKhachChietKhau.setText(String.valueOf(tienKhachCK));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cboHinhThucThanhToanItemStateChanged

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        if (hoaDonViewModel == null) {
            return;
        }
        HoaDon hd = getDataToForm();
        hd.setTrangThai(0);
        if (hoaDonService.update(hd, hoaDonViewModel.getId())) {
            List<Integer> listIDOrderDetails = new ArrayList();
            System.out.println("DS HDCT cũ: ");
            for (HoaDonChiTietViewModel hoaDonChiTietViewModel : listHoaDonChiTiet) {
                System.out.println(hoaDonChiTietViewModel.toString());
                if (hoaDonChiTietViewModel.getId() != null) {
                    listIDOrderDetails.add(Integer.valueOf(hoaDonChiTietViewModel.getId().toString()));
                }
            }
            if (!listIDOrderDetails.isEmpty()) {
                hoaDonChiTietService.deleteListOrderDetails(listIDOrderDetails);
            }
            System.out.println("DS HDCT mới: ");
            int idHoaDon = hoaDonViewModel.getId();
            for (HoaDonChiTietViewModel hoaDonChiTietViewModel : listHoaDonChiTiet) {
                System.out.println(hoaDonChiTietViewModel.toString());
                hoaDonChiTietViewModel.setIdHoaDon(new HoaDon(idHoaDon));
            }
            hoaDonChiTietService.addListOrderDetails(idHoaDon, listHoaDonChiTiet);
            sanPhamService.updateSoLuong(listUpdateSoLuongSP);
            clearForm();
        }
        btnTaoHoaDon.setEnabled(true);
        btnHoaDon.setEnabled(true);
    }//GEN-LAST:event_btnRefeshActionPerformed

    private void formComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentRemoved
        rollBackSoLuongSP();
    }//GEN-LAST:event_formComponentRemoved

    public void initPagination(List<SanPhamBanHangViewModel> list) {
        tongSoBanGhiTheoTrangThai = sanPhamService.getRecordCountByTrangThai(trangThai);
        pageSize = Integer.parseInt(cboSoBanGhi.getSelectedItem().toString());
        totalPage = (int) Math.ceil((double) tongSoBanGhiTheoTrangThai / pageSize);
        if (page > totalPage) {
            page = 1;
        }
        listSanPham = list;
        loadDataToTblSanPham(listSanPham);
        lblPageOfTotalPage.setText(page + "/" + totalPage);
    }

    private void loadDataToTblSanPham(List<SanPhamBanHangViewModel> list) {
        dtmTblSanPham = (DefaultTableModel) tblDSSanPham.getModel();
        dtmTblSanPham.setRowCount(0);
        for (SanPhamBanHangViewModel sp : list) {
            dtmTblSanPham.addRow(sp.toDataRow());
        }
    }

    public void loadDataToTblGioHang(List<HoaDonChiTietViewModel> list) {
        listHoaDonChiTiet = list;
        dtmTblGioHang = (DefaultTableModel) tblGioHang.getModel();
        dtmTblGioHang.setRowCount(0);
        for (HoaDonChiTietViewModel hdct : listHoaDonChiTiet) {
            dtmTblGioHang.addRow(hdct.toDataRow());
        }
    }

    private void editorSoLuongTblGioHang() {
        tblGioHang.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(new JTextField()));
        TableCellEditor editor = tblGioHang.getColumnModel().getColumn(2).getCellEditor();
        editor.addCellEditorListener(new CellEditorListener() {
            @Override
            public void editingStopped(ChangeEvent e) {
                int selectedRow = tblGioHang.getSelectedRow();
                int selectedCol = tblGioHang.getSelectedColumn();
                if (selectedCol == 2) {
                    int soLuongMoi = Integer.parseInt(tblGioHang.getValueAt(selectedRow, selectedCol).toString());
                    System.out.println("Số lượng mới: " + soLuongMoi);
                    HoaDonChiTietViewModel hoaDonChiTietViewModel = listHoaDonChiTiet.get(selectedRow);
                    hoaDonChiTietViewModel.setSoLuong(soLuongMoi);
                    loadDataToTblGioHang(listHoaDonChiTiet);
                    showDataHoaDonTaiQuay(hoaDonViewModel);
                    System.out.println("SP trong giỏ hàng: ");
                    for (HoaDonChiTietViewModel hdct : listHoaDonChiTiet) {
                        System.out.println(hdct.toString());
                    }
                }
            }

            @Override
            public void editingCanceled(ChangeEvent e) {
            }
        });
    }

    private void themSanPhamVaoGioHang(int sanPhamSelected, int soLuongSPMua) {
        // add vao list hoa don chi tiet
        SanPhamBanHangViewModel sanPham = listSanPham.get(sanPhamSelected);
        int soLuongCuaSPSelected = sanPham.getSoLuong();
        if (soLuongCuaSPSelected == 0) {
//            JOptionPane.showMessageDialog(null, "Sản phẩm hết hàng!");
            return;
        }
        if (soLuongSPMua > soLuongCuaSPSelected) {
            soLuongSPMua = soLuongCuaSPSelected;
        }

        HoaDonChiTietViewModel hoaDonChiTietViewModel = new HoaDonChiTietViewModel();
        hoaDonChiTietViewModel.setSanPham(new SanPhamBanHangViewModel(
                sanPham.getId(),
                sanPham.getMaSanPham(),
                sanPham.getTenSanPham()));
        hoaDonChiTietViewModel.setSoLuong(soLuongSPMua);
        hoaDonChiTietViewModel.setDonGia(sanPham.getDonGia());
        hoaDonChiTietViewModel.setDonGiaKhuyenMai(sanPham.getGiaKhuyenMai());
        hoaDonChiTietViewModel.setIdHoaDon(null);
        boolean flag = true;
        if (!listHoaDonChiTiet.isEmpty()) { // kiem tra list hoa don chi tiet có san pham nao k ?
            // neu co san pham ben trong se duyet qua tung san pham 
            // neu trung ma san pham thi tang hoac giam so luong
            for (HoaDonChiTietViewModel hdct : listHoaDonChiTiet) {
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
            listHoaDonChiTiet.add(hoaDonChiTietViewModel);
        }

        // tru so luong san pham da chon
        sanPham.setSoLuong(soLuongCuaSPSelected - soLuongSPMua);

//        listSanPham.set(sanPhamSelected, sanPham);
//        loadDataToTblSanPham(listSanPham);
        loadDataToTblGioHang(listHoaDonChiTiet);

        listUpdateSoLuongSP.put(sanPham, sanPham.getSoLuong());
        sanPhamService.updateSoLuong(listUpdateSoLuongSP);
        initPagination(sanPhamService.getAllSanPhamBanHang(page, pageSize, trangThai));
    }

    public void showDataHoaDonTaiQuay(HoaDonViewModel hd) {
        txtTenKH.setText(hd.getTenKhachHang());
        txtSDT.setText(hd.getSoDienThoai());
        txtDiaChi.setText(hd.getDiaChi());
        txtMaHD.setText(hd.getMaHoaDon());
        txtNgayTao.setText(Helper.sdfNgayThangThoiGian.format(hd.getNgayTao()));
        txtNhanVien.setText(hd.getNhanVien().toString());
        int rowGioHang = tblGioHang.getRowCount();
        tongTien = 0;
        tienGiamGiaTrenSP = 0;
        tienCanThanhToan = 0;
        tongTienGiamGia = 0;
        soLuongMua = 0;
        for (int i = 0; i < rowGioHang; i++) {
            donGiaSP = Integer.parseInt(tblGioHang.getValueAt(i, 3).toString());
            tienGiamGiaTrenSP = Integer.parseInt(tblGioHang.getValueAt(i, 4).toString());
            soLuongMua = Integer.parseInt(tblGioHang.getValueAt(i, 2).toString());
            System.out.println("Số lượng mua SP " + (i + 1) + " " + soLuongMua);
            tongTien += donGiaSP * soLuongMua;
            tongTienGiamGia += tienGiamGiaTrenSP * soLuongMua;
            System.out.println("Tổng tiền giảm giá SP: " + tongTienGiamGia);
            tienCanThanhToan += Integer.parseInt(tblGioHang.getValueAt(i, 6).toString());
        }
        txtTongTien.setText(Helper.dfTien.format(tongTien));
        txtGiamGiaKM.setText(Helper.dfTien.format(tongTienGiamGia));
        txtThanhToan.setText(Helper.dfTien.format(tienCanThanhToan));
        txtTienKhachDua.setText(String.valueOf(tienCanThanhToan));
    }

    public void showHoaDonDuocChon(HoaDonViewModel hd) {
        lblHoaDonDangMuaHang.setText(
                hd.getMaHoaDon() + " | "
                + Helper.sdfNgayThangThoiGian.format(hd.getNgayTao()) + " | "
                + hd.getTenKhachHang() + " | "
                + hd.getNhanVien() + " | "
                + StatusHoaDon.getNameByValue(hd.getTrangThai()));
    }

    private HoaDon getDataToForm() {
        HoaDon hd = new HoaDon();
        hd.setId(hoaDonViewModel.getId());
        hd.setMaHoaDon(txtMaHD.getText());
        hd.setIdNhanVien(Helper.USER_LOGIN.getId());
        hd.setTenKhachHang(txtTenKH.getText());
        hd.setSoDienThoai(txtSDT.getText());
        hd.setDiaChi(txtDiaChi.getText());
        hd.setNgayThanhToan(new Timestamp(new Date().getTime()));
        hd.setGhiChu(txtGhiChu.getText());
        hd.setIdKhachHang(kh == null ? null : kh.getId());
        hd.setTrangThai(1);
        return hd;
    }

    private void clearForm() {
        lblHoaDonDangMuaHang.setText("");
        txtTenKH.setText("Khách hàng lẻ");
        txtSDT.setText("");
        txtDiaChi.setText("Tại cửa hàng");
        txtMaHD.setText("");
        txtNgayTao.setText("");
        txtNhanVien.setText("");
        txtTongTien.setText("0");
        txtGiamGiaKM.setText("0");
        txtThanhToan.setText("0");
        cboHinhThucThanhToan.setSelectedIndex(0);
        txtTienKhachDua.setText("0");
        txtTienKhachChietKhau.setText("0");
        txtTienThua.setText("0");
        txtGhiChu.setText("");
        tongTien = 0;
        soLuongMua = 0;
        tienGiamGiaTrenSP = 0;
        tongTienGiamGia = 0;
        tienCanThanhToan = 0;
        tienKhachDua = 0;
        tienKhachCK = 0;
        tienThua = 0;
        listHoaDonChiTiet.clear();
        if (dtmTblGioHang != null) {
            dtmTblGioHang.setRowCount(0);
        }
        listUpdateSoLuongSP.clear();
        hoaDonViewModel = null;
    }

    private void updateSoLuongSP(int SPSelected) {
        int idSanPham;
        int soLuongTrongGH;
        HoaDonChiTietViewModel hdct = listHoaDonChiTiet.get(SPSelected);
        idSanPham = hdct.getSanPham().getId();
        soLuongTrongGH = hdct.getSoLuong();
        SanPhamBanHangViewModel spbh = sanPhamService.getOne(idSanPham);
        Map<SanPhamBanHangViewModel, Integer> list = new HashMap<>();
        list.put(spbh, spbh.getSoLuong() + soLuongTrongGH);
        sanPhamService.updateSoLuong(list);
    }

    public void rollBackSoLuongSP() {
        int[] seletedRowGioHang = tblGioHang.getSelectedRows();
        int rowCountTblGioHang = tblGioHang.getRowCount();
        List<Integer> listIDOrderDetails = new ArrayList();
        int arrLenght = seletedRowGioHang.length;
        if (arrLenght > 0) {
            if (arrLenght == 1) {
                updateSoLuongSP(seletedRowGioHang[0]);
                HoaDonChiTietViewModel hdct = listHoaDonChiTiet.get(seletedRowGioHang[0]);
                if (hdct.getId() != null) {
                    listIDOrderDetails.add(Integer.valueOf(hdct.getId().toString()));
                }
                if (!listIDOrderDetails.isEmpty()) {
                    hoaDonChiTietService.deleteListOrderDetails(listIDOrderDetails);
                }
                listHoaDonChiTiet.remove(seletedRowGioHang[0]);
            } else if (arrLenght > 1 && arrLenght < rowCountTblGioHang) {
                for (int i = arrLenght - 1; i >= 0; i--) {
                    updateSoLuongSP(seletedRowGioHang[i]);
                    HoaDonChiTietViewModel hdct = listHoaDonChiTiet.get(seletedRowGioHang[i]);
                    if (hdct.getId() != null) {
                        listIDOrderDetails.add(Integer.valueOf(hdct.getId().toString()));
                    }
                    listHoaDonChiTiet.remove(seletedRowGioHang[i]);
                }
                if (!listIDOrderDetails.isEmpty()) {
                    hoaDonChiTietService.deleteListOrderDetails(listIDOrderDetails);
                }
            } else if (arrLenght == rowCountTblGioHang) {
                for (int i = rowCountTblGioHang - 1; i >= 0; i--) {
                    updateSoLuongSP(seletedRowGioHang[i]);
                    HoaDonChiTietViewModel hdct = listHoaDonChiTiet.get(seletedRowGioHang[i]);
                    if (hdct.getId() != null) {
                        listIDOrderDetails.add(Integer.valueOf(hdct.getId().toString()));
                    }
                }
                if (!listIDOrderDetails.isEmpty()) {
                    hoaDonChiTietService.deleteListOrderDetails(listIDOrderDetails);
                }
                listHoaDonChiTiet.clear();
            }
            loadDataToTblGioHang(listHoaDonChiTiet);
            showDataHoaDonTaiQuay(hoaDonViewModel);
            initPagination(sanPhamService.getAllSanPhamBanHang(page, pageSize, trangThai));
            System.out.println("SP còn lại trong giỏ hàng: ");
            for (HoaDonChiTietViewModel hdct : listHoaDonChiTiet) {
                System.out.println(hdct.toString());
            }
        }
    }

    private boolean validateForm() {
        int tongTien = Integer.parseInt(Helper.removeDauPhay(txtTongTien.getText()));
        System.out.println(Helper.removeDauPhay(txtTongTien.getText()));
        if (tongTien == 0) {
            Helper.alert(this, "Vui lòng chọn sản phẩm muốn mua!");
            return true;
        }
        int tienKhachTra = Integer.parseInt(txtTienKhachDua.getText()) + Integer.parseInt(txtTienKhachChietKhau.getText());
        if (tienKhachTra < tienCanThanhToan) {
            Helper.alert(this, "Tiền thanh toán chưa đủ");
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBo;
    private javax.swing.JButton btnFirst;
    javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnQuetMa;
    private javax.swing.JButton btnRefesh;
    public javax.swing.JButton btnTaoHoaDon;
    private javax.swing.JButton btnThanhToanTaiQuay;
    private javax.swing.JButton btnTimKiemKhachHang;
    private javax.swing.JComboBox<String> cboCachThucBanHang;
    javax.swing.JComboBox<String> cboHinhThucThanhToan;
    private javax.swing.JComboBox<String> cboSoBanGhi;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JLabel lblHoaDonDangMuaHang;
    private javax.swing.JLabel lblPageOfTotalPage;
    private javax.swing.JPanel pnlDatHang;
    private javax.swing.JTabbedPane tabbedThanhToan;
    private javax.swing.JTable tblDSSanPham;
    public javax.swing.JTable tblGioHang;
    javax.swing.JTextArea txtDiaChi;
    javax.swing.JTextArea txtGhiChu;
    javax.swing.JTextField txtGiamGiaKM;
    javax.swing.JTextField txtMaHD;
    javax.swing.JTextField txtNgayTao;
    javax.swing.JTextField txtNhanVien;
    javax.swing.JTextField txtSDT;
    javax.swing.JTextField txtTenKH;
    javax.swing.JTextField txtThanhToan;
    javax.swing.JTextField txtTienKhachChietKhau;
    javax.swing.JTextField txtTienKhachDua;
    javax.swing.JTextField txtTienThua;
    private javax.swing.JTextField txtTimKiemSanPham;
    javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
