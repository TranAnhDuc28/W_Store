/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.wstore.views;

import com.wstore.swing.chart.Chart;
import com.wstore.swing.chart.ModelChart;
import com.wstore.views.thongke.TabDoanhThuJPanel;
import com.wstore.views.thongke.TabThongKeTongQuanJPanel;
import java.awt.Color;

/**
 *
 * @author ducan
 */
public class FormThongKeJPanel extends javax.swing.JPanel {

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
            tabThongKeTongQuanJPanel.pnlChart.remove(tabThongKeTongQuanJPanel.chart);
            chart = new Chart();
            chart.addLegend("Vốn", new Color(245, 189, 135));
            chart.addLegend("Doanh thu", new Color(135, 189, 245));
            chart.addLegend("Lợi nhuận", new Color(189, 135, 245));
            chart.addData(new ModelChart("Ngày 1", new double[]{5000000, 2000000, 8000000}));
            chart.addData(new ModelChart("Ngày 2", new double[]{6000000, 7500000, 9000000}));
            chart.addData(new ModelChart("Ngày 3", new double[]{2000000, 3500000, 4600000}));
            chart.addData(new ModelChart("Ngày 4", new double[]{4800000, 1500000, 7500000}));
            chart.addData(new ModelChart("Ngày 5", new double[]{3500000, 5400000, 3000000}));
            chart.addData(new ModelChart("Ngày 6", new double[]{1900000, 2800000, 5000000}));
            chart.addData(new ModelChart("Ngày 7", new double[]{4750000, 3000000, 5000000}));
            chart.addData(new ModelChart("Ngày 8", new double[]{1500000, 9100000, 2000000}));
            chart.repaint();
            chart.validate();
            tabThongKeTongQuanJPanel.pnlChart.add(chart);
            tabThongKeTongQuanJPanel.pnlChart.repaint();
            tabThongKeTongQuanJPanel.pnlChart.validate();
            chart.start();
        } else if (tabSelected == 1) {

        }
    }//GEN-LAST:event_tabbedThongKeStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane tabbedThongKe;
    // End of variables declaration//GEN-END:variables
}
