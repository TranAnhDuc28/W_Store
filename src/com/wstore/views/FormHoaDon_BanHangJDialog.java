/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.wstore.views;

import com.wstore.services.IHoaDonChiTietService;
import com.wstore.services.IHoaDonService;
import com.wstore.services.ISanPhamService;
import com.wstore.services.impl.HoaDonChiTietService;
import com.wstore.services.impl.HoaDonService;
import com.wstore.services.impl.SanPhamService;
import com.wstore.utilities.Helper;
import com.wstore.utilities.status.StatusHoaDon;
import com.wstore.viewmodels.HoaDonViewModel;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ducan
 */
public class FormHoaDon_BanHangJDialog extends javax.swing.JDialog {

    private final IHoaDonService hoaDonService = new HoaDonService();
    private final IHoaDonChiTietService hoaDonChiTietService = new HoaDonChiTietService();
    private ISanPhamService sanPhamService = new SanPhamService();
    private FormTabBanHangJPanel formTabBanHangJPanel;
    private DefaultTableModel dtmHoaDon;
    private final DefaultComboBoxModel dcbmTrangThai = new DefaultComboBoxModel();
    private List<HoaDonViewModel> listHD;
    private int rowSelected = -1;
    private int countRecord = 0;
    private int trangThai = 0;

    public FormHoaDon_BanHangJDialog(java.awt.Frame parent, boolean modal, JPanel jPanel) {
        super(parent, modal);
        formTabBanHangJPanel = (FormTabBanHangJPanel) jPanel;
        initComponents();
        cboTrangThai.setModel(dcbmTrangThai);
        loadCboTrangThai();
        loadDataToTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        btnXacNhan = new javax.swing.JButton();
        cboTrangThai = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Danh sách hóa đơn");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(241, 246, 251));

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Ngày tạo", "Tên khách hàng", "Nhân viên", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);

        btnXacNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/xac-nhan.png"))); // NOI18N
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chờ thanh toán", "Chờ giao hàng", "Đang giao hàng" }));
        cboTrangThai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTrangThaiItemStateChanged(evt);
            }
        });

        jLabel1.setText("Trạng thái");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXacNhan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXacNhan)
                .addContainerGap(7, Short.MAX_VALUE))
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

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        int row = tblHoaDon.getSelectedRow();
        if (row < 0) {
            return;
        }
        if (!formTabBanHangJPanel.listHoaDonChiTiet.isEmpty()) {
            if (!Helper.comfirm(this, "Đang có sản phẩm trong giỏ hàng bạn muốn tiếp tục?")) {
                return;
            }
        }
        if (Helper.comfirm(this, "Xác nhân tiếp tục thanh toán hóa đơn?")) {
            formTabBanHangJPanel.initPagination(sanPhamService.getAllSanPhamBanHang(
                    formTabBanHangJPanel.page,
                    formTabBanHangJPanel.pageSize,
                    formTabBanHangJPanel.trangThai));
            rowSelected = tblHoaDon.getSelectedRow();
            formTabBanHangJPanel.hoaDonViewModel = listHD.get(rowSelected);
            int idHoaDon = formTabBanHangJPanel.hoaDonViewModel.getId();
            formTabBanHangJPanel.loadDataToTblGioHang(hoaDonChiTietService.getAllByIDHoaDon(idHoaDon));
            formTabBanHangJPanel.showHoaDonDuocChon(formTabBanHangJPanel.hoaDonViewModel);
            formTabBanHangJPanel.showDataHoaDonTaiQuay(listHD.get(rowSelected));
            formTabBanHangJPanel.btnTaoHoaDon.setEnabled(false);
            formTabBanHangJPanel.btnHoaDon.setEnabled(false);
            this.dispose();
        }
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void cboTrangThaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTrangThaiItemStateChanged
        loadDataToTable();
    }//GEN-LAST:event_cboTrangThaiItemStateChanged

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked

    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void loadDataToTable() {
        StatusHoaDon sHD = (StatusHoaDon) cboTrangThai.getSelectedItem();
        trangThai = sHD.getValue();
        countRecord = hoaDonService.getCountRecordByTrangThai(trangThai);
        if (countRecord == 0) {
            countRecord = 1;
        }
        listHD = hoaDonService.getAllByTrangThai(1, countRecord, trangThai);
        dtmHoaDon = (DefaultTableModel) tblHoaDon.getModel();
        dtmHoaDon.setRowCount(0);
        for (HoaDonViewModel hd : listHD) {
            dtmHoaDon.addRow(new Object[]{
                hd.getMaHoaDon(),
                Helper.sdfNgayThangThoiGian.format(hd.getNgayTao()),
                hd.getTenKhachHang(),
                hd.getNhanVien(),
                hd.getTrangThai() == 0 ? "Chờ thanh toán"
                : hd.getTrangThai() == 3 ? "Chờ giao hàng" : "Đang giao hàng"
            });
        }
    }

    private void loadCboTrangThai() {
        dcbmTrangThai.removeAllElements();
        dcbmTrangThai.addElement(StatusHoaDon.CHO_THANH_TOAN);
        dcbmTrangThai.addElement(StatusHoaDon.CHO_GIAO_HANG);
        dcbmTrangThai.addElement(StatusHoaDon.DANG_GIAO_HANG);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHoaDon;
    // End of variables declaration//GEN-END:variables
}
