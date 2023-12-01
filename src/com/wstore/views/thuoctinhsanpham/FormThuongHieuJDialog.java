/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.wstore.views.thuoctinhsanpham;

import com.wstore.services.impl.thuoctinhsanpham.ThuongHieuService;
import com.wstore.swing.table.TableTextAlignmentCellRender;
import com.wstore.utilities.Helper;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ThuongHieuViewModel;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import com.wstore.services.IThuocTinhSanPhamService;
import java.util.ArrayList;

/**
 *
 * @author ducan
 */
public class FormThuongHieuJDialog extends javax.swing.JDialog {

    private final IThuocTinhSanPhamService thuongHieuService = new ThuongHieuService();
    private DefaultTableModel dtmThuongHieu;
    private List<ThuongHieuViewModel> listThuongHieu;
    private String imageName = null;
    private int index = -1;

    public FormThuongHieuJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
//        init();
        loadDataToTable();
    }

    private void init() {
        TableTextAlignmentCellRender textCenter = new TableTextAlignmentCellRender();
        tblThuongHieu.getColumnModel().getColumn(0).setCellRenderer(textCenter);
        tblThuongHieu.getColumnModel().getColumn(1).setCellRenderer(textCenter);
        tblThuongHieu.getColumnModel().getColumn(2).setCellRenderer(textCenter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTenThuongHieu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThuongHieu = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnCapNhatHienThi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnChonAnh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(144, 182, 168));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thương hiệu");
        jLabel1.setOpaque(true);

        jLabel2.setText("Tên thương hiệu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 243, Short.MAX_VALUE))
            .addComponent(txtTenThuongHieu)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tblThuongHieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã thương hiệu", "Tên thương hiệu", "Logo", "Hiển thị"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblThuongHieu.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblThuongHieu.setRowHeight(30);
        tblThuongHieu.setSelectionBackground(new java.awt.Color(137, 187, 201));
        tblThuongHieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThuongHieuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblThuongHieu);
        if (tblThuongHieu.getColumnModel().getColumnCount() > 0) {
            tblThuongHieu.getColumnModel().getColumn(0).setMinWidth(150);
            tblThuongHieu.getColumnModel().getColumn(0).setPreferredWidth(150);
            tblThuongHieu.getColumnModel().getColumn(0).setMaxWidth(150);
            tblThuongHieu.getColumnModel().getColumn(3).setMinWidth(70);
            tblThuongHieu.getColumnModel().getColumn(3).setPreferredWidth(70);
            tblThuongHieu.getColumnModel().getColumn(3).setMaxWidth(70);
        }

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/new-document24x24.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        jPanel3.add(btnMoi);

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add24x24.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel3.add(btnThem);

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/chinh-sua24x24.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel3.add(btnSua);

        btnCapNhatHienThi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/updated.png"))); // NOI18N
        btnCapNhatHienThi.setText("Cập nhật hiển thị");
        btnCapNhatHienThi.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnCapNhatHienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatHienThiActionPerformed(evt);
            }
        });
        jPanel3.add(btnCapNhatHienThi);

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(136, 141, 148), 1, true));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setText("No image");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnChonAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/upload-image24x24.png"))); // NOI18N
        btnChonAnh.setText("Chọn ảnh");
        btnChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonAnhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnChonAnh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChonAnh)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void tblThuongHieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThuongHieuMouseClicked
        index = tblThuongHieu.getSelectedRow();
        if (index >= 0) {
            btnThem.setEnabled(false);
        }
        showData();
    }//GEN-LAST:event_tblThuongHieuMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (!validateForm()) {
            if (thuongHieuService.insert(getDataToForm())) {
                Helper.alert(this, "Thêm thành công!");
                loadDataToTable();
                clearForm();
            } else {
                Helper.alert(this, "Thêm thất bại!");
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        index = tblThuongHieu.getSelectedRow();
        if (index < 0) {
            Helper.alert(this, "Vui lòng chọn thông tin cần sửa!");
            return;
        }
        if (!validateForm()) {
            if (Helper.comfirm(this, "Xác nhận sửa!")) {
                int id = Integer.parseInt(tblThuongHieu.getValueAt(index, 0).toString());
                if (thuongHieuService.update(getDataToForm(), id)) {
                    Helper.alert(this, "Sửa thành công!");
                    loadDataToTable();
                    tblThuongHieu.setRowSelectionInterval(index, index);
                } else {
                    Helper.alert(this, "Sửa thất bại!");
                }
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnCapNhatHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatHienThiActionPerformed
        int rowCount = tblThuongHieu.getRowCount();
        if (Helper.comfirm(this, "Xác nhận cập nhật hiển thị giá trị?")) {
            List<ThuongHieuViewModel> list = new ArrayList<>();
            for (int i = 0; i < rowCount; i++) {
                ThuongHieuViewModel tt = new ThuongHieuViewModel();
                tt.setMaThuongHieu(Integer.valueOf(tblThuongHieu.getValueAt(i, 0).toString()));
                tt.setHienThi(Boolean.valueOf(tblThuongHieu.getValueAt(i, 3).toString()));
                list.add(tt);
            }
            thuongHieuService.updatesHienThi(list);
            clearForm();
            loadDataToTable();
        }
    }//GEN-LAST:event_btnCapNhatHienThiActionPerformed

    private void btnChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonAnhActionPerformed
        imageName = Helper.chonAnh("images/", lblLogo);
    }//GEN-LAST:event_btnChonAnhActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void loadDataToTable() {
        listThuongHieu = thuongHieuService.getAll();
        dtmThuongHieu = (DefaultTableModel) tblThuongHieu.getModel();
        dtmThuongHieu.setRowCount(0);
        for (ThuongHieuViewModel th : listThuongHieu) {
            dtmThuongHieu.addRow(th.toDataRow());
        }
    }

    private ThuongHieuViewModel getDataToForm() {
        ThuongHieuViewModel th = new ThuongHieuViewModel();
        th.setTenThuongHieu(txtTenThuongHieu.getText());
        String logo = null;
        if (imageName != null) {
            logo = imageName;
        } else {
            if (index >= 0 && tblThuongHieu.getValueAt(index, 2) != null
                    && !(tblThuongHieu.getValueAt(index, 2).equals("No image"))) {
                logo = tblThuongHieu.getValueAt(index, 2).toString();
                if (lblLogo.getIcon() == null) {
                    logo = "No image";
                }
            } else {
                logo = "No image";
            }
        }
        th.setLogo(logo);
        return th;
    }

    private void showData() {
        ThuongHieuViewModel th = listThuongHieu.get(index);
        txtTenThuongHieu.setText(th.getTenThuongHieu());
        Helper.showHinhAnh("images/lo-go-thuong-hieu", lblLogo, th.getLogo());
    }

    private void clearForm() {
        txtTenThuongHieu.setText("");
        lblLogo.setIcon(null);
        lblLogo.setText("No image");
        index = -1;
        tblThuongHieu.clearSelection();
        btnThem.setEnabled(true);
    }

    private boolean validateForm() {
        if (Helper.checkRongTextField(this, txtTenThuongHieu,
                "Vui lòng nhập tên thương hiệu!")) {
            return true;
        }
        return false;
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
            java.util.logging.Logger.getLogger(FormThuongHieuJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormThuongHieuJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormThuongHieuJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormThuongHieuJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormThuongHieuJDialog dialog = new FormThuongHieuJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCapNhatHienThi;
    private javax.swing.JButton btnChonAnh;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTable tblThuongHieu;
    private javax.swing.JTextField txtTenThuongHieu;
    // End of variables declaration//GEN-END:variables
}
