/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.wstore.views;

import java.awt.Color;
import java.awt.Panel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author ducan
 */
public class FormBanHangJFrame extends javax.swing.JFrame {

    int tab;

    public FormBanHangJFrame() {
        initComponents();
        init();
    }

    private void init() {
        getContentPane().setBackground(new Color(243, 243, 243));
        setIconImage(new ImageIcon("src/com/wstore/icons/logo.png").getImage());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        jTabbedPane1.addTab("HÓA ĐƠN BÁN HÀNG (1)", new FormTabBanHangJPanel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnTaoTab = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnDongTab = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bán hàng");
        setExtendedState(6);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        btnTaoTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add24x24.png"))); // NOI18N
        btnTaoTab.setText("Tạo");
        btnTaoTab.setFocusable(false);
        btnTaoTab.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnTaoTab.setIconTextGap(5);
        btnTaoTab.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnTaoTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoTabActionPerformed(evt);
            }
        });
        jToolBar1.add(btnTaoTab);
        jToolBar1.add(jSeparator1);

        btnDongTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/cancel24x24.png"))); // NOI18N
        btnDongTab.setText("Đóng");
        btnDongTab.setIconTextGap(5);
        btnDongTab.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnDongTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongTabActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDongTab);

        jTabbedPane1.setBackground(new java.awt.Color(243, 243, 243));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1377, 760));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaoTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoTabActionPerformed
        int count = jTabbedPane1.getTabCount();
        jTabbedPane1.addTab("HÓA ĐƠN BÁN HÀNG (" + (count + 1) + ")", new FormTabBanHangJPanel());
    }//GEN-LAST:event_btnTaoTabActionPerformed

    private void btnDongTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongTabActionPerformed
        jTabbedPane1.removeTabAt(tab);
    }//GEN-LAST:event_btnDongTabActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        tab = jTabbedPane1.getSelectedIndex();
        System.out.println(tab);
    }//GEN-LAST:event_jTabbedPane1StateChanged

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormBanHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBanHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBanHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBanHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBanHangJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDongTab;
    private javax.swing.JButton btnTaoTab;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
