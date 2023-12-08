/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.wstore.views;

import com.formdev.flatlaf.FlatClientProperties;
import com.wstore.services.IHoaDonChiTietService;
import com.wstore.services.IHoaDonService;
import com.wstore.services.impl.HoaDonChiTietService;
import com.wstore.services.impl.HoaDonService;
import com.wstore.swing.table.TableTextAlignmentRightCellRender;
import com.wstore.utilities.Helper;
import com.wstore.utilities.ReportManager;
import com.wstore.utilities.status.StatusHoaDon;
import com.wstore.viewmodels.HoaDonChiTietViewModel;
import com.wstore.viewmodels.HoaDonViewModel;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author ducan
 */
public class FormHoaDonJPanel extends javax.swing.JPanel {

    private IHoaDonService hoaDonService = new HoaDonService();
    private final IHoaDonChiTietService hoaDonChiTietService = new HoaDonChiTietService();
    private DefaultTableModel dtmHoaDon;
    private DefaultTableModel dtmHoaDonChiTiet;
    private DefaultComboBoxModel dcbmTrangThai = new DefaultComboBoxModel();
    private List<HoaDonViewModel> listHD;
    private int rowSelected = -1;
    private Integer trangThai = 0;
    private Integer page = 1;
    private Integer totalRowData = 0;
    private Integer totalPage = 1;
    private Integer pageSize = 15;

    public FormHoaDonJPanel() {
        initComponents();
        init();
        try {
            ReportManager.getInstance().compileReport();
        } catch (JRException e) {
            e.printStackTrace();
        }
        cboTrangThai.setModel(dcbmTrangThai);
        loadCboTrangThai();
        initPagination(hoaDonService.getAll(page, pageSize));
    }

    private void init() {
        txtTimKiemHD.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT,
                "Nhập nội dung tìm kiếm...");
        TableTextAlignmentRightCellRender textRightCellRender = new TableTextAlignmentRightCellRender();
        int countColumntblHDCT = tblHoaDonChiTiet.getColumnCount();
        for (int i = 2; i < countColumntblHDCT; i++) {
            tblHoaDonChiTiet.getColumnModel().getColumn(i).setCellRenderer(textRightCellRender);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnInHoaDon = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnXemChiTietHD = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiemHD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboTrangThai = new javax.swing.JComboBox<>();
        dcTuNgay = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dcDenNgay = new com.toedter.calendar.JDateChooser();
        btnLoc = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboSoBanGhi = new javax.swing.JComboBox<>();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        lblPageOfTotalPage = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHoaDonChiTiet = new javax.swing.JTable();

        setBackground(new java.awt.Color(241, 246, 251));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToolBar1.setEnabled(false);

        btnInHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/printer.png"))); // NOI18N
        btnInHoaDon.setText("In hóa đơn ");
        btnInHoaDon.setFocusable(false);
        btnInHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInHoaDon.setIconTextGap(5);
        btnInHoaDon.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });
        jToolBar1.add(btnInHoaDon);
        jToolBar1.add(jSeparator5);

        btnXemChiTietHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/see-details.png"))); // NOI18N
        btnXemChiTietHD.setText("Xem chi tiết");
        btnXemChiTietHD.setFocusable(false);
        btnXemChiTietHD.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnXemChiTietHD.setIconTextGap(5);
        btnXemChiTietHD.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnXemChiTietHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietHDActionPerformed(evt);
            }
        });
        jToolBar1.add(btnXemChiTietHD);
        jToolBar1.add(jSeparator1);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/export-excel32x32.png"))); // NOI18N
        jButton5.setText("Xuất excel");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton5.setIconTextGap(5);
        jButton5.setMargin(new java.awt.Insets(5, 14, 5, 14));
        jToolBar1.add(jButton5);
        jToolBar1.add(jSeparator3);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Ngày tạo", "Tên khách hàng", "Số điện thoại", "Địa chỉ", "Nhân viên", "Ngày thanh toán", "Hình thức thanh toán", "Tổng tiền", "Trạng thái", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDon.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tblHoaDon);
        if (tblHoaDon.getColumnModel().getColumnCount() > 0) {
            tblHoaDon.getColumnModel().getColumn(0).setPreferredWidth(150);
            tblHoaDon.getColumnModel().getColumn(1).setPreferredWidth(170);
            tblHoaDon.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblHoaDon.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblHoaDon.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblHoaDon.getColumnModel().getColumn(5).setPreferredWidth(150);
            tblHoaDon.getColumnModel().getColumn(6).setPreferredWidth(170);
            tblHoaDon.getColumnModel().getColumn(7).setPreferredWidth(150);
            tblHoaDon.getColumnModel().getColumn(8).setPreferredWidth(150);
            tblHoaDon.getColumnModel().getColumn(9).setPreferredWidth(150);
            tblHoaDon.getColumnModel().getColumn(10).setPreferredWidth(150);
        }

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DANH SÁCH HÓA ĐƠN");
        jPanel1.add(jLabel8, java.awt.BorderLayout.PAGE_START);

        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Tìm kiếm");

        txtTimKiemHD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemHDKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Trạng thái");

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboTrangThai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTrangThaiItemStateChanged(evt);
            }
        });

        dcTuNgay.setDateFormatString("yyyy-MM-dd");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Từ ngày");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Đến ngày");

        dcDenNgay.setDateFormatString("yyyy-MM-dd");

        btnLoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/filter.png"))); // NOI18N
        btnLoc.setText("Lọc");
        btnLoc.setToolTipText("Lọc hóa đơn theo thời gian");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtTimKiemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dcTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dcDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLoc)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cboTrangThai)
                    .addComponent(dcTuNgay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dcDenNgay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTimKiemHD, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        jPanel6.setOpaque(false);

        jLabel2.setText("Số bản ghi:");
        jPanel6.add(jLabel2);

        cboSoBanGhi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15", "20", "30", "50", "100" }));
        cboSoBanGhi.setPreferredSize(new java.awt.Dimension(70, 25));
        cboSoBanGhi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSoBanGhiItemStateChanged(evt);
            }
        });
        jPanel6.add(cboSoBanGhi);

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/first16x16.png"))); // NOI18N
        btnFirst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel6.add(btnFirst);

        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/prev16x16.png"))); // NOI18N
        btnPrev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel6.add(btnPrev);

        lblPageOfTotalPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPageOfTotalPage.setText("1/50");
        lblPageOfTotalPage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPageOfTotalPage.setPreferredSize(new java.awt.Dimension(70, 22));
        jPanel6.add(lblPageOfTotalPage);

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/next16x16.png"))); // NOI18N
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel6.add(btnNext);

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/last16x16.png"))); // NOI18N
        btnLast.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel6.add(btnLast);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HÓA ĐƠN CHI TIẾT");
        jPanel3.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        tblHoaDonChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Đơn giá", "Giảm giá", "Giá bán", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblHoaDonChiTiet);

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboSoBanGhiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSoBanGhiItemStateChanged
        if (cboTrangThai.getSelectedIndex() == 0) {
            initPagination(hoaDonService.getAll(page, pageSize));
        } else {
            initPagination(hoaDonService.getAllByTrangThai(page, pageSize, trangThai));
        }
    }//GEN-LAST:event_cboSoBanGhiItemStateChanged

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        page = 1;
        if (cboTrangThai.getSelectedIndex() == 0) {
            initPagination(hoaDonService.getAll(page, pageSize));
        } else {
            initPagination(hoaDonService.getAllByTrangThai(page, pageSize, trangThai));
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if (page > 1) {
            page--;
            if (cboTrangThai.getSelectedIndex() == 0) {
                initPagination(hoaDonService.getAll(page, pageSize));
            } else {
                initPagination(hoaDonService.getAllByTrangThai(page, pageSize, trangThai));
            }
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (page < totalPage) {
            page++;
            if (cboTrangThai.getSelectedIndex() == 0) {
                initPagination(hoaDonService.getAll(page, pageSize));
            } else {
                initPagination(hoaDonService.getAllByTrangThai(page, pageSize, trangThai));
            }
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        page = totalPage;
        if (cboTrangThai.getSelectedIndex() == 0) {
            initPagination(hoaDonService.getAll(page, pageSize));
        } else {
            initPagination(hoaDonService.getAllByTrangThai(page, pageSize, trangThai));
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
        rowSelected = tblHoaDon.getSelectedRow();
        if (rowSelected < 0) {
            return;
        }
        HoaDonViewModel hd = new HoaDonViewModel();
        hd.setMaHoaDon(tblHoaDon.getValueAt(rowSelected, 0).toString());
        try {
            ReportManager.getInstance().printReportPayment(hd);
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnInHoaDonActionPerformed

    private void txtTimKiemHDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemHDKeyReleased
        String maHD = txtTimKiemHD.getText();
        initPagination(hoaDonService.findByMaHD(1, 50, maHD));
    }//GEN-LAST:event_txtTimKiemHDKeyReleased

    private void cboTrangThaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTrangThaiItemStateChanged
        if (cboTrangThai.getSelectedIndex() == 0) {
            initPagination(hoaDonService.getAll(page, pageSize));
        } else {
            initPagination(hoaDonService.getAllByTrangThai(page, pageSize, trangThai));
        }
    }//GEN-LAST:event_cboTrangThaiItemStateChanged

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (dcTuNgay.getDate() == null || dcDenNgay.getDate() == null) {
            initPagination(hoaDonService.getAll(page, pageSize));
            return;
        }
        String tuNgay = sdf.format(dcTuNgay.getDate());
        String denNgay = sdf.format(dcDenNgay.getDate());
        initPagination(hoaDonService.filterHoaDonByNgayTao(page, pageSize, tuNgay, denNgay));
    }//GEN-LAST:event_btnLocActionPerformed

    private void btnXemChiTietHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietHDActionPerformed
        rowSelected = tblHoaDon.getSelectedRow();
        int idHoaDon = listHD.get(rowSelected).getId();
        loadDataToTblHDCT(hoaDonChiTietService.getAllByIDHoaDon(idHoaDon));
    }//GEN-LAST:event_btnXemChiTietHDActionPerformed

    private void initPagination(List<HoaDonViewModel> list) {
        if (cboTrangThai.getSelectedIndex() != 0) {
            StatusHoaDon sHD = (StatusHoaDon) cboTrangThai.getSelectedItem();
            trangThai = sHD.getValue();
        }
        totalRowData = hoaDonService.getCountRecord();
        pageSize = Integer.valueOf(cboSoBanGhi.getSelectedItem().toString());
        totalPage = (int) Math.ceil(totalRowData.doubleValue() / pageSize.doubleValue());
        if (page > totalPage) {
            page = 1;
        }
        listHD = list;
        loadDataToTable(listHD);
        lblPageOfTotalPage.setText(page + "/" + totalPage);
//        lblTongSo.setText("Tổng số: " + totalRowData);
    }

    private void loadDataToTable(List<HoaDonViewModel> list) {
        dtmHoaDon = (DefaultTableModel) tblHoaDon.getModel();
        dtmHoaDon.setRowCount(0);
        for (HoaDonViewModel hd : list) {
            dtmHoaDon.addRow(hd.toDataRow());
        }
    }

    public void loadDataToTblHDCT(List<HoaDonChiTietViewModel> list) {
        dtmHoaDonChiTiet = (DefaultTableModel) tblHoaDonChiTiet.getModel();
        dtmHoaDonChiTiet.setRowCount(0);
        for (HoaDonChiTietViewModel hdct : list) {
            dtmHoaDonChiTiet.addRow(new Object[]{
                hdct.getSanPham().getMaSanPham(),
                hdct.getSanPham().getTenSanPham(),
                hdct.getSoLuong(),
                Helper.dfTien.format(hdct.getDonGia()),
                Helper.dfTien.format(hdct.getDonGia().subtract(hdct.getDonGiaKhuyenMai()).intValue()),
                Helper.dfTien.format(hdct.getDonGiaKhuyenMai().intValue()),
                Helper.dfTien.format(hdct.getThanhTien().intValue())});
        }
    }

    private void loadCboTrangThai() {
        dcbmTrangThai.removeAllElements();
        dcbmTrangThai.addElement("Tất cả");
        dcbmTrangThai.addElement(StatusHoaDon.CHO_THANH_TOAN);
        dcbmTrangThai.addElement(StatusHoaDon.DA_THANH_TOAN);
        dcbmTrangThai.addElement(StatusHoaDon.DA_HUY);
        dcbmTrangThai.addElement(StatusHoaDon.CHO_GIAO_HANG);
        dcbmTrangThai.addElement(StatusHoaDon.DANG_GIAO_HANG);
        dcbmTrangThai.addElement(StatusHoaDon.GIAO_HANG_THANH_CONG);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInHoaDon;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnXemChiTietHD;
    private javax.swing.JComboBox<String> cboSoBanGhi;
    private javax.swing.JComboBox<String> cboTrangThai;
    private com.toedter.calendar.JDateChooser dcDenNgay;
    private com.toedter.calendar.JDateChooser dcTuNgay;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblPageOfTotalPage;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblHoaDonChiTiet;
    private javax.swing.JTextField txtTimKiemHD;
    // End of variables declaration//GEN-END:variables
}
