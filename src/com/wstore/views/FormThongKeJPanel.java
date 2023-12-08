/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.wstore.views;

import com.wstore.services.IThongKeService;
import com.wstore.services.impl.ThongKeService;
import com.wstore.swing.chart.Chart;
import com.wstore.viewmodels.thongke.ThongKeTungNgayTrongThangViewModel;
import com.wstore.views.thongke.TabDoanhThuJPanel;
import com.wstore.views.thongke.TabThongKeTongQuanJPanel;
import java.util.List;

/**
 *
 * @author ducan
 */
public class FormThongKeJPanel extends javax.swing.JPanel {

    private IThongKeService thongKeService = new ThongKeService();
    private TabThongKeTongQuanJPanel tabThongKeTongQuanJPanel;
    private TabDoanhThuJPanel tabDoanhThuJPanel;
    private Chart chart;

    public FormThongKeJPanel() {
        initComponents();
        tabThongKeTongQuanJPanel = new TabThongKeTongQuanJPanel();
        tabDoanhThuJPanel = new TabDoanhThuJPanel();
        tabbedThongKe.addTab("Tổng quan", tabThongKeTongQuanJPanel);
        tabbedThongKe.addTab("Doanh thu", tabDoanhThuJPanel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedThongKe = new javax.swing.JTabbedPane();

        setLayout(new java.awt.BorderLayout());

        tabbedThongKe.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedThongKeStateChanged(evt);
            }
        });
        add(tabbedThongKe, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tabbedThongKeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedThongKeStateChanged
        int tabSelected = tabbedThongKe.getSelectedIndex();
        if (tabSelected == 0) {
            tabThongKeTongQuanJPanel.pnlChart.remove(tabThongKeTongQuanJPanel.chartThongKeTongQuan);
            chart = new Chart();
            tabThongKeTongQuanJPanel.pnlChart.add(chart);
            tabThongKeTongQuanJPanel.pnlChart.repaint();
            tabThongKeTongQuanJPanel.pnlChart.validate();
            List<ThongKeTungNgayTrongThangViewModel> list = thongKeService.getThongKe7NgayGanNhat();
            tabThongKeTongQuanJPanel.loadDataToTable(list);
            tabThongKeTongQuanJPanel.loadDataToChar(list, chart);
        } else if (tabSelected == 1) {

        }
    }//GEN-LAST:event_tabbedThongKeStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane tabbedThongKe;
    // End of variables declaration//GEN-END:variables
}
