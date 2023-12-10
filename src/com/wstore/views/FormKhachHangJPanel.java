/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.wstore.views;

import com.formdev.flatlaf.FlatClientProperties;
import com.wstore.services.IKhachHangService;
import com.wstore.services.impl.KhachHangService;
import com.wstore.utilities.Helper;
import com.wstore.utilities.excel.WriteExcel;
import com.wstore.utilities.status.StatusKhachHang;
import com.wstore.viewmodels.KhachHangViewModel;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ducan
 */
public class FormKhachHangJPanel extends javax.swing.JPanel {

    private final IKhachHangService khachHangService = new KhachHangService();
    private DefaultTableModel dtmKhachHang = new DefaultTableModel();
    List<KhachHangViewModel> ListKH;
    FormThemVaSuaKhachHangJFrame formThemVaSuaKhachHangJFrame;
    private int index = -1;
    public Integer trangThai = 0;
    public Integer page = 1;
    private Integer totalRowData = 0;
    private Integer totalPage = 1;
    public Integer pageSize = 15;

    public FormKhachHangJPanel() {
        initComponents();
        init();
        initPagination(khachHangService.getAll(page, pageSize, trangThai));
    }

    private void init() {
        txtTimKiemKhachHang.putClientProperty(
                FlatClientProperties.PLACEHOLDER_TEXT,
                "Nhập nội dung tìm kiếm...");
//        txtTimKiemKhachHang.putClientProperty(
//                FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON,
//                true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnThem = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnDieuChinh = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnXoa = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnNhapTuExcel = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnXuatExcel = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnLichSuMuaHang = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtTimKiemKhachHang = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        cboTrangThai = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboSoBanGhi = new javax.swing.JComboBox<>();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        lblPageOfTotalPage = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        lblTongSoBanGhi = new javax.swing.JLabel();
        btnKhoiPhuc = new javax.swing.JButton();
        chkChonTat = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(243, 243, 243));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToolBar1.setEnabled(false);

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add32x32.png"))); // NOI18N
        btnThem.setText("Thêm khách hàng");
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

        btnDieuChinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/chinh-sua32x32.png"))); // NOI18N
        btnDieuChinh.setText("Điều chỉnh");
        btnDieuChinh.setFocusable(false);
        btnDieuChinh.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDieuChinh.setIconTextGap(5);
        btnDieuChinh.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnDieuChinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDieuChinhActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDieuChinh);
        jToolBar1.add(jSeparator2);

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/xoa32x32.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setFocusable(false);
        btnXoa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnXoa.setIconTextGap(5);
        btnXoa.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnXoa);
        jToolBar1.add(jSeparator3);

        btnNhapTuExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/import-excel32x32.png"))); // NOI18N
        btnNhapTuExcel.setText("Nhập từ excel");
        btnNhapTuExcel.setFocusable(false);
        btnNhapTuExcel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNhapTuExcel.setIconTextGap(5);
        btnNhapTuExcel.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnNhapTuExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapTuExcelActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNhapTuExcel);
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
        jToolBar1.add(jSeparator5);

        btnLichSuMuaHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/lich-su-mua-hang.png"))); // NOI18N
        btnLichSuMuaHang.setText("Lịch sử mua hàng");
        btnLichSuMuaHang.setFocusable(false);
        btnLichSuMuaHang.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLichSuMuaHang.setIconTextGap(5);
        btnLichSuMuaHang.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnLichSuMuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichSuMuaHangActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLichSuMuaHang);

        jPanel3.setBackground(new java.awt.Color(241, 246, 251));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel4.setOpaque(false);

        txtTimKiemKhachHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKhachHangKeyReleased(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTimKiemKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTimKiemKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setOpaque(false);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Trạng thái");

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khách hàng hiện tại", "Khách hàng xóa tạm" }));
        cboTrangThai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTrangThaiItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Họ tên", "Giới tính", "Ngày sinh", "Số điện thoại", "Email", "Địa chỉ", "Hình ảnh", "Ngày tạo", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachHang.setRowHeight(30);
        tblKhachHang.setSelectionBackground(new java.awt.Color(137, 187, 201));
        tblKhachHang.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblKhachHang);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("DANH SÁCH KHÁCH HÀNG\n");
        jPanel2.add(jLabel20, java.awt.BorderLayout.PAGE_START);

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

        lblTongSoBanGhi.setText("Tổng số: ");
        lblTongSoBanGhi.setMaximumSize(new java.awt.Dimension(125, 16));
        lblTongSoBanGhi.setPreferredSize(new java.awt.Dimension(125, 16));
        jPanel6.add(lblTongSoBanGhi);

        btnKhoiPhuc.setBackground(new java.awt.Color(243, 243, 243));
        btnKhoiPhuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/restore.png"))); // NOI18N
        btnKhoiPhuc.setText("Khôi phục");
        btnKhoiPhuc.setEnabled(false);
        btnKhoiPhuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoiPhucActionPerformed(evt);
            }
        });

        chkChonTat.setText("All");
        chkChonTat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkChonTatItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkChonTat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKhoiPhuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 514, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnKhoiPhuc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkChonTat)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboTrangThaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTrangThaiItemStateChanged
        initPagination(khachHangService.getAll(page, pageSize, trangThai));
        if (cboTrangThai.getSelectedIndex() == StatusKhachHang.KHACH_HANG_HIEN_TAI) {
            btnXoa.setEnabled(true);
            btnKhoiPhuc.setEnabled(false);
        } else if (cboTrangThai.getSelectedIndex() == StatusKhachHang.KHACH_HANG_XOA_TAM) {
            btnXoa.setEnabled(false);
            btnKhoiPhuc.setEnabled(true);
        }
    }//GEN-LAST:event_cboTrangThaiItemStateChanged

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
       formThemVaSuaKhachHangJFrame = new FormThemVaSuaKhachHangJFrame(this);
       formThemVaSuaKhachHangJFrame.txtMaKhachHang.setText(khachHangService.getMaKhachHangTuDongSinh());
       formThemVaSuaKhachHangJFrame.setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        page = 1;
        initPagination(khachHangService.getAll(page, pageSize, trangThai));
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if (page > 1) {
            page--;
            initPagination(khachHangService.getAll(page, pageSize, trangThai));
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (page < totalPage) {
            page++;
            initPagination(khachHangService.getAll(page, pageSize, trangThai));
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        page = totalPage;
        initPagination(khachHangService.getAll(page, pageSize, trangThai));
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnDieuChinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDieuChinhActionPerformed
        index = tblKhachHang.getSelectedRow();
        if (index < 0) {
            Helper.alert(this, "Vui lòng chọn thông tin khách hàng muốn sửa!");
            return;
        }
        formThemVaSuaKhachHangJFrame = new FormThemVaSuaKhachHangJFrame(this);
        showData();
    }//GEN-LAST:event_btnDieuChinhActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int selectedRowCount = tblKhachHang.getSelectedRowCount();
        if (selectedRowCount == 0) {
            Helper.alert(this, "Vui lòng chọn thông tin khách hàng muốn xóa!");
            return;
        }
        if (selectedRowCount == 1) {
            index = tblKhachHang.getSelectedRow();
            if (Helper.comfirm(this, "Xác nhận thao tác? Bạn muốn thay đổi trạng thái khách hàng xóa tạm? ")) {
                Integer id = ListKH.get(index).getId();
                khachHangService.updateStatus(1, id);
                initPagination(khachHangService.getAll(page, pageSize, trangThai));
            }
            System.out.println("Update 1");
        } else {
            List<Integer> listID = new ArrayList<>();
            int count = tblKhachHang.getSelectedRows().length;
            for (int i = 0; i < count; i++) {
                listID.add(ListKH.get(i).getId());
            }
            if (Helper.comfirm(this, "Xác nhận thao tác? Bạn muốn thay đổi trạng thái khách hàng xóa tạm? ")) {
                khachHangService.updatesSatus(1, listID);
                initPagination(khachHangService.getAll(page, pageSize, trangThai));
                chkChonTat.setSelected(false);
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnNhapTuExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapTuExcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNhapTuExcelActionPerformed

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        int count = khachHangService.getCountRecordByTrangThai(trangThai);
        List<KhachHangViewModel> listData = khachHangService.getAll(1, count, trangThai);
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Export excel");
        jfc.setPreferredSize(Helper.dimensionJFileChooser);
        FileNameExtensionFilter excelFilter = new FileNameExtensionFilter("Microsoft Excel (*.xlsx)",
                "xlsx");
        jfc.setFileFilter(excelFilter);
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
        jfc.setSelectedFile(new File(("DanhSachKhachHang" + sdf.format(new java.util.Date()) + ".xlsx")));
        int choose = jfc.showSaveDialog(this);
        if (choose == JFileChooser.APPROVE_OPTION) {
            File excelFilePath = jfc.getSelectedFile();
            String filePath = excelFilePath.getPath();
            try {
                WriteExcel.writeExcel(tblKhachHang, listData, filePath);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            Helper.alert(this, "Xuất file thành công");
        }
    }//GEN-LAST:event_btnXuatExcelActionPerformed

    private void btnLichSuMuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichSuMuaHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLichSuMuaHangActionPerformed

    private void btnKhoiPhucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoiPhucActionPerformed
        int selectedRowCount = tblKhachHang.getSelectedRowCount();
        if (selectedRowCount == 0) {
            Helper.alert(this, "Vui lòng chọn thông tin nhân viên muốn khôi phục!");
            return;
        }
        if (selectedRowCount == 1) {
            index = tblKhachHang.getSelectedRow();
            if (Helper.comfirm(this, "Xác nhận khôi phục? ")) {
                Integer id = ListKH.get(index).getId();
                khachHangService.updateStatus(0, id);
                initPagination(khachHangService.getAll(page, pageSize, trangThai));
            }
            System.out.println("Update 1");
        } else {
            List<Integer> listID = new ArrayList<>();
            int count = tblKhachHang.getSelectedRows().length;
            for (int i = 0; i < count; i++) {
                listID.add(ListKH.get(i).getId());
            }
            if (Helper.comfirm(this, "Xác nhận khôi phục? ")) {
                khachHangService.updatesSatus(0, listID);
                initPagination(khachHangService.getAll(page, pageSize, trangThai));
                chkChonTat.setSelected(false);
            }
            System.out.println("Update nhiều");
        }
    }//GEN-LAST:event_btnKhoiPhucActionPerformed

    private void chkChonTatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkChonTatItemStateChanged
        if (chkChonTat.isSelected()) {
            int rowCount = tblKhachHang.getRowCount();
            tblKhachHang.setRowSelectionInterval(0, rowCount - 1);
        } else {
            tblKhachHang.clearSelection();
        }
    }//GEN-LAST:event_chkChonTatItemStateChanged

    private void txtTimKiemKhachHangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKhachHangKeyReleased
        String name = txtTimKiemKhachHang.getText();
        if (!name.trim().isEmpty()) {
            cboSoBanGhi.setEnabled(false);
            btnFirst.setEnabled(false);
            btnPrev.setEnabled(false);
            btnNext.setEnabled(false);
            btnLast.setEnabled(false);
            lblPageOfTotalPage.setEnabled(false);
            lblTongSoBanGhi.setEnabled(false);
            initPagination(khachHangService.findByNameOrMaOrSDT(1, 50, trangThai, name));
        } else {
            cboSoBanGhi.setEnabled(true);
            btnFirst.setEnabled(true);
            btnPrev.setEnabled(true);
            btnNext.setEnabled(true);
            btnLast.setEnabled(true);
            lblPageOfTotalPage.setEnabled(true);
            lblTongSoBanGhi.setEnabled(true);
            initPagination(khachHangService.getAll(page, pageSize, trangThai));
        }
    }//GEN-LAST:event_txtTimKiemKhachHangKeyReleased

    private void cboSoBanGhiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSoBanGhiItemStateChanged
        initPagination(khachHangService.getAll(page, pageSize, trangThai));
    }//GEN-LAST:event_cboSoBanGhiItemStateChanged

    public void initPagination(List<KhachHangViewModel> list) {
        trangThai = cboTrangThai.getSelectedIndex();
        totalRowData = khachHangService.getCountRecordByTrangThai(trangThai);
        pageSize = Integer.valueOf(cboSoBanGhi.getSelectedItem().toString());
        totalPage = (int) Math.ceil(totalRowData.doubleValue() / pageSize.doubleValue());
        if (page > totalPage) {
            page = 1;
        }
        ListKH = list;
        loadDataToTable(ListKH);
        lblPageOfTotalPage.setText(page + "/" + totalPage);
        lblTongSoBanGhi.setText("Tổng số: " + totalRowData);
    }

    private void loadDataToTable(List<KhachHangViewModel> list) {
        dtmKhachHang = (DefaultTableModel) tblKhachHang.getModel();
        dtmKhachHang.setRowCount(0);

        for (KhachHangViewModel x : list) {
            dtmKhachHang.addRow(x.toDataRow());
        }
    }

    private void showData() {
        KhachHangViewModel kh = ListKH.get(index);
        formThemVaSuaKhachHangJFrame.txtMaKhachHang.setText(kh.getMaKhachHang());
        formThemVaSuaKhachHangJFrame.txtDiaChi.setText(kh.getDiaChi());
        formThemVaSuaKhachHangJFrame.txtEmail.setText(kh.getEmail());
        formThemVaSuaKhachHangJFrame.txtGhiChu.setText(kh.getGhiChu());
        formThemVaSuaKhachHangJFrame.txtHoTen.setText(kh.getHoTen());
        try {
            formThemVaSuaKhachHangJFrame.txtNgaySinh.setDate(
                    kh.getNgaySinh() == null ? null : Helper.sdfNgayThangNam.parse(kh.getNgaySinh()));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        formThemVaSuaKhachHangJFrame.txtSoDienThoai.setText(kh.getSoDienThoai());
        Helper.showHinhAnh("images//images-nguoi",
                formThemVaSuaKhachHangJFrame.lblHinhAnh, kh.getHinhAnh());
        if (kh.getGioiTinh().equals("Nam")) {
            formThemVaSuaKhachHangJFrame.rdoNam.setSelected(true);
        } else {
            formThemVaSuaKhachHangJFrame.rdoNu.setSelected(true);
        }
        formThemVaSuaKhachHangJFrame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDieuChinh;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnKhoiPhuc;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnLichSuMuaHang;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNhapTuExcel;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.JComboBox<String> cboSoBanGhi;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JCheckBox chkChonTat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblPageOfTotalPage;
    private javax.swing.JLabel lblTongSoBanGhi;
    public javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtTimKiemKhachHang;
    // End of variables declaration//GEN-END:variables
}
