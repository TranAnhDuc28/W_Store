/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.wstore.views.thuoctinhsanpham;

import com.wstore.services.impl.thuoctinhsanpham.ChatLieuVoService;
import com.wstore.utilities.Helper;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuVoViewModel;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import com.wstore.services.IThuocTinhSanPhamService;
import java.util.ArrayList;

/**
 *
 * @author ducan
 */
public class FormChatLieuVoJDialog extends javax.swing.JDialog {

    private final IThuocTinhSanPhamService chatLieuVoService = new ChatLieuVoService();
    private DefaultTableModel dtmChatLieuVo;
    private List<ChatLieuVoViewModel> listChatLieuVo;
    private int index = -1;

    public FormChatLieuVoJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadDataToTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtTenChatLieuVo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChatLieuVo = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnCapNhatHienThi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(144, 182, 168));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chất liệu vỏ");
        jLabel1.setOpaque(true);

        jLabel2.setText("Tên chất liệu vỏ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenChatLieuVo))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenChatLieuVo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)))
        );

        tblChatLieuVo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã chất liệu vỏ", "Chất liệu vỏ", "Hiển thị"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChatLieuVo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblChatLieuVo.setRowHeight(30);
        tblChatLieuVo.setSelectionBackground(new java.awt.Color(137, 187, 201));
        tblChatLieuVo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChatLieuVoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblChatLieuVo);
        if (tblChatLieuVo.getColumnModel().getColumnCount() > 0) {
            tblChatLieuVo.getColumnModel().getColumn(0).setMinWidth(150);
            tblChatLieuVo.getColumnModel().getColumn(0).setPreferredWidth(150);
            tblChatLieuVo.getColumnModel().getColumn(0).setMaxWidth(150);
            tblChatLieuVo.getColumnModel().getColumn(2).setMinWidth(70);
            tblChatLieuVo.getColumnModel().getColumn(2).setPreferredWidth(70);
            tblChatLieuVo.getColumnModel().getColumn(2).setMaxWidth(70);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tblChatLieuVoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChatLieuVoMouseClicked
        index = tblChatLieuVo.getSelectedRow();
        if (index >= 0) {
            btnThem.setEnabled(false);
        }
        showData();
    }//GEN-LAST:event_tblChatLieuVoMouseClicked

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (!validateForm()) {
            if (chatLieuVoService.insert(getDataToForm())) {
                Helper.alert(this, "Thêm thành công!");
                loadDataToTable();
                clearForm();
            } else {
                Helper.alert(this, "Thêm thất bại!");
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        index = tblChatLieuVo.getSelectedRow();
        if (index < 0) {
            Helper.alert(this, "Vui lòng chọn thông tin cần sửa!");
            return;
        }
        if (!validateForm()) {
            if (Helper.comfirm(this, "Xác nhận sửa!")) {
                int id = (int) tblChatLieuVo.getValueAt(index, 0);
                if (chatLieuVoService.update(getDataToForm(), id)) {
                    Helper.alert(this, "Sửa thành công!");
                    loadDataToTable();
                    tblChatLieuVo.setRowSelectionInterval(index, index);
                } else {
                    Helper.alert(this, "Sửa thất bại!");
                }
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnCapNhatHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatHienThiActionPerformed
       int rowCount = tblChatLieuVo.getRowCount();
        if (Helper.comfirm(this, "Xác nhận cập nhật hiển thị giá trị?")) {
            List<ChatLieuVoViewModel> list = new ArrayList<>();
            for (int i = 0; i < rowCount; i++) {
                ChatLieuVoViewModel clv = new ChatLieuVoViewModel();
                clv.setIdChatLieuVo(Integer.valueOf(tblChatLieuVo.getValueAt(i, 0).toString()));
                clv.setHienThi(Boolean.valueOf(tblChatLieuVo.getValueAt(i, 2).toString()));
                list.add(clv);
            }
            chatLieuVoService.updatesHienThi(list);
            clearForm();
            loadDataToTable();
        }
    }//GEN-LAST:event_btnCapNhatHienThiActionPerformed

    private void clearForm() {
        txtTenChatLieuVo.setText("");
        tblChatLieuVo.clearSelection();
        index = -1;
        btnThem.setEnabled(true);
    }

    private boolean validateForm() {
        if (Helper.checkRongTextField(this, txtTenChatLieuVo,
                "Vui lòng nhập tên thương hiệu!")) {
            return true;
        }
        return false;
    }

    private void showData() {
        ChatLieuVoViewModel clv = listChatLieuVo.get(index);
        txtTenChatLieuVo.setText(clv.getTenChatLieuVo());
    }

    private void loadDataToTable() {
        listChatLieuVo = chatLieuVoService.getAll();
        dtmChatLieuVo = (DefaultTableModel) tblChatLieuVo.getModel();
        dtmChatLieuVo.setRowCount(0);
        for (ChatLieuVoViewModel th : listChatLieuVo) {
            dtmChatLieuVo.addRow(th.toDataRow());
        }
    }

    private ChatLieuVoViewModel getDataToForm() {
        ChatLieuVoViewModel clv = new ChatLieuVoViewModel();
        clv.setTenChatLieuVo(txtTenChatLieuVo.getText());
        return clv;
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
//            java.util.logging.Logger.getLogger(FormChatLieuVoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormChatLieuVoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormChatLieuVoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormChatLieuVoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                FormChatLieuVoJDialog dialog = new FormChatLieuVoJDialog(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatHienThi;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblChatLieuVo;
    private javax.swing.JTextField txtTenChatLieuVo;
    // End of variables declaration//GEN-END:variables
}
