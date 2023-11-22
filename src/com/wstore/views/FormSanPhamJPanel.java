/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.wstore.views;

import com.formdev.flatlaf.FlatClientProperties;
import com.wstore.services.ISanPhamService;
import com.wstore.services.impl.SanPhamService;
import com.wstore.swing.table.TableTextAlignmentCellRender;
import com.wstore.viewmodels.QLsanpham.SanPhamViewModel;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ducan
 */
public class FormSanPhamJPanel extends javax.swing.JPanel {

    private final ISanPhamService sanPhamService = new SanPhamService();
    private DefaultTableModel dtmTblSanPham;
    private List<SanPhamViewModel> listSP;
    private Integer trangThai = 0;
    private int index = -1;
    private Integer page = 1;
    private Integer tongSoBanGhi = 0;
    private Integer totalPage = 1;
    private Integer pageSize = 10;

    public FormSanPhamJPanel() {
        initComponents();
        init();
        initPagination(sanPhamService.getAll(page, pageSize));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbebQLSanPham = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnThem = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtTimKiemSanPham = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
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
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton10 = new javax.swing.JButton();

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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/chinh-sua32x32.png"))); // NOI18N
        jButton2.setText("Điều chỉnh");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.setIconTextGap(5);
        jButton2.setMargin(new java.awt.Insets(5, 14, 5, 14));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/xoa32x32.png"))); // NOI18N
        jButton3.setText("Ngừng kinh doanh");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.setIconTextGap(5);
        jButton3.setMargin(new java.awt.Insets(5, 14, 5, 14));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/import-excel32x32.png"))); // NOI18N
        jButton4.setText("Nhập từ excel");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.setIconTextGap(5);
        jButton4.setMargin(new java.awt.Insets(5, 14, 5, 14));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/export-excel32x32.png"))); // NOI18N
        jButton5.setText("Xuất excel");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton5.setIconTextGap(5);
        jButton5.setMargin(new java.awt.Insets(5, 14, 5, 14));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel8.setOpaque(false);

        jPanel4.setBackground(new java.awt.Color(243, 243, 243));
        jPanel4.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtTimKiemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(243, 243, 243));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));

        jLabel7.setText("Thương hiệu");
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel5.add(jLabel7);

        jLabel8.setText("Dòng sản phẩm");
        jLabel8.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel5.add(jLabel8);

        jLabel9.setText("Đối tượng sử dụng");
        jLabel9.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel5.add(jLabel9);

        jLabel10.setText("Trạng thái");
        jLabel10.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel5.add(jLabel10);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox4.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel5.add(jComboBox4);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox5.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel5.add(jComboBox5);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox6.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel5.add(jComboBox6);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox7.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel5.add(jComboBox7);

        jPanel7.setBackground(new java.awt.Color(243, 243, 243));
        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.BorderLayout());

        tblDSSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Thương hiệu", "Mã hàng hóa", "Giá nhập", "Giá bán", "Đối tượng sử dụng", "Dòng sản phẩm", "Dòng máy", "Chất liệu dây", "Chất liệu kính", "Kháng nước", "Khoảng trữ cót", "Size mặt", "Xuất xứ", "Chất liệu vỏ", "Hình dạng mặt", "Màu vỏ", "Phong cách", "Tính năng", "Độ dầy", "Màu mặt", "Hình ảnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSSanPham.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblDSSanPham.setRowHeight(30);
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
            tblDSSanPham.getColumnModel().getColumn(5).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(6).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(7).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(8).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(9).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(10).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(11).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(12).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(13).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(14).setPreferredWidth(170);
            tblDSSanPham.getColumnModel().getColumn(15).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(16).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(17).setPreferredWidth(200);
            tblDSSanPham.getColumnModel().getColumn(18).setPreferredWidth(400);
            tblDSSanPham.getColumnModel().getColumn(19).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(20).setPreferredWidth(150);
            tblDSSanPham.getColumnModel().getColumn(21).setPreferredWidth(150);
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

        jCheckBox1.setText("All");

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/restore.png"))); // NOI18N
        jButton10.setText("Khôi phục");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox1)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
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

    private void cboSoBanGhiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSoBanGhiItemStateChanged
        initPagination(sanPhamService.getAll(page, pageSize));
    }//GEN-LAST:event_cboSoBanGhiItemStateChanged

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        page = 1;
        initPagination(sanPhamService.getAll(page, pageSize));
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if (page > 1) {
            page--;
            initPagination(sanPhamService.getAll(page, pageSize));
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (page < totalPage) {
            page++;
            initPagination(sanPhamService.getAll(page, pageSize));
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        page = totalPage;
        initPagination(sanPhamService.getAll(page, pageSize));
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        new FormThemVaSuaSanPhamJFrame().setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void init() {
        txtTimKiemSanPham.putClientProperty(
                FlatClientProperties.PLACEHOLDER_TEXT,
                "Nhập nội dung tìm kiếm...");
        txtTimKiemSanPham.putClientProperty(
                FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON,
                true);
        tabbebQLSanPham.putClientProperty(FlatClientProperties.TABBED_PANE_SHOW_TAB_SEPARATORS, true);
        tabbebQLSanPham.addTab("THUỘC TÍNH SẢN PHẨM", new FormTabThuocTinhSanPham());
//                TableTextAlignmentCellRender textCenter = new TableTextAlignmentCellRender();
//        int countColumntblSP = tblDSSanPham.getColumnCount();
//        for (int i = 0; i < countColumntblSP; i++) {
//            tblDSSanPham.getColumnModel().getColumn(i).setCellRenderer(textCenter);
//        }
    }

    private void initPagination(List<SanPhamViewModel> list) {
        tongSoBanGhi = sanPhamService.getRecordCount();
        pageSize = Integer.valueOf(cboSoBanGhi.getSelectedItem().toString());
        totalPage = (int) Math.ceil(tongSoBanGhi.doubleValue() / pageSize.doubleValue());
        if (page > totalPage) {
            page = 1;
        }
        listSP = list;
        loadDataToTable(listSP);
        lblPageOfTotalPage.setText(page + "/" + totalPage);
        lblTongSoBanGhi.setText("Tổng số: " + tongSoBanGhi);
    }

    private void loadDataToTable(List<SanPhamViewModel> list) {
        dtmTblSanPham = (DefaultTableModel) tblDSSanPham.getModel();
        dtmTblSanPham.setRowCount(0);
        for (SanPhamViewModel sp : list) {
            dtmTblSanPham.addRow(sp.toDataRow());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cboSoBanGhi;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
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
    private javax.swing.JTabbedPane tabbebQLSanPham;
    private javax.swing.JTable tblDSSanPham;
    private javax.swing.JTextField txtTimKiemSanPham;
    // End of variables declaration//GEN-END:variables
}
