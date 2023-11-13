/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.wstore.views.thongke;

/**
 *
 * @author ducan
 */
public class TabDoanhThuJPanel extends javax.swing.JPanel {

    private TabThongKeDoanhThuTheoNam tabThongKeDoanhThuTheoNam;
    private TabThongKeDoanhThuTungThangTrongNam tabThongKeDoanhThuTungThangTrongNam;
    private TabThongKeDoanhThuTungNgayTrongThang tabThongKeDoanhThuTungNgayTrongThang;
    private TabThongKeDoanhThuTuNgayDenNgay tabThongKeDoanhThuTuNgayDenNgay;

    public TabDoanhThuJPanel() {
        initComponents();
        tabThongKeDoanhThuTheoNam = new TabThongKeDoanhThuTheoNam();
        tabThongKeDoanhThuTungThangTrongNam = new TabThongKeDoanhThuTungThangTrongNam();
        tabThongKeDoanhThuTungNgayTrongThang = new TabThongKeDoanhThuTungNgayTrongThang();
        tabThongKeDoanhThuTuNgayDenNgay = new TabThongKeDoanhThuTuNgayDenNgay();
        tabbedDoanhThu.addTab("Thống kê theo năm", tabThongKeDoanhThuTheoNam);
        tabbedDoanhThu.addTab("Thống kê theo năm", tabThongKeDoanhThuTungThangTrongNam);
        tabbedDoanhThu.addTab("Thống kê theo năm", tabThongKeDoanhThuTungNgayTrongThang);
        tabbedDoanhThu.addTab("Thống kê theo năm", tabThongKeDoanhThuTuNgayDenNgay);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedDoanhThu = new javax.swing.JTabbedPane();

        setBackground(new java.awt.Color(241, 246, 251));

        tabbedDoanhThu.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane tabbedDoanhThu;
    // End of variables declaration//GEN-END:variables
}