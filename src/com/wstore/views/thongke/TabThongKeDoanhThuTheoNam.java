/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.wstore.views.thongke;

import com.wstore.swing.chart.ModelChart;
import com.wstore.swing.table.TableTextAlignmentCellRender;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ducan
 */
public class TabThongKeDoanhThuTheoNam extends javax.swing.JPanel {

    /**
     * Creates new form TabThongKeDoanhThuTheoNam
     */
    public TabThongKeDoanhThuTheoNam() {
        initComponents();
        init();
        chartThongKeDoanhThuTheoNam.addLegend("Vốn", new Color(245, 189, 135));
        chartThongKeDoanhThuTheoNam.addLegend("Doanh thu", new Color(135, 189, 245));
        chartThongKeDoanhThuTheoNam.addLegend("Lợi nhuận", new Color(189, 135, 245));
        chartThongKeDoanhThuTheoNam.addData(new ModelChart("Năm 2018", new double[]{5000000, 2000000, 8000000}));
        chartThongKeDoanhThuTheoNam.addData(new ModelChart("Năm 2019", new double[]{6000000, 7500000, 9000000}));
        chartThongKeDoanhThuTheoNam.addData(new ModelChart("Năm 2020", new double[]{2000000, 3500000, 460000}));
        chartThongKeDoanhThuTheoNam.addData(new ModelChart("Năm 2021", new double[]{4800000, 1500000, 7500000}));
        chartThongKeDoanhThuTheoNam.addData(new ModelChart("Năm 2022", new double[]{3500000, 5400000, 3000000}));
        chartThongKeDoanhThuTheoNam.addData(new ModelChart("Năm 2023", new double[]{1900000, 2800000, 5000000}));
        testData();
    }

    private void init() {
        TableTextAlignmentCellRender textCenter = new TableTextAlignmentCellRender();
        int countColumntblSP = tblThongKeDoanhThuTheoNam.getColumnCount();
        for (int i = 0; i < countColumntblSP; i++) {
            tblThongKeDoanhThuTheoNam.getColumnModel().getColumn(i).setCellRenderer(textCenter);
        }
    }

    private void testData() {
        DefaultTableModel dtmTongQuan = (DefaultTableModel) tblThongKeDoanhThuTheoNam.getModel();
        dtmTongQuan.setRowCount(0);
        dtmTongQuan.addRow(new Object[]{"Năm 2018", 5000000, 2000000, 8000000});
        dtmTongQuan.addRow(new Object[]{"Năm 2019", 6000000, 7500000, 9000000});
        dtmTongQuan.addRow(new Object[]{"Năm 2020", 2000000, 3500000, 460000});
        dtmTongQuan.addRow(new Object[]{"Năm 2021", 4800000, 1500000, 7500000});
        dtmTongQuan.addRow(new Object[]{"Năm 2021", 3500000, 5400000, 3000000});
        dtmTongQuan.addRow(new Object[]{"Năm 2023", 1900000, 2800000, 5000000});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnThongKe = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongKeDoanhThuTheoNam = new javax.swing.JTable();
        pnlChartThongKeDoanhThuTheoNam = new javax.swing.JPanel();
        chartThongKeDoanhThuTheoNam = new com.wstore.swing.chart.Chart();

        setBackground(new java.awt.Color(241, 246, 251));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        jLabel1.setText("Từ năm");
        jPanel1.add(jLabel1);

        jTextField1.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel1.add(jTextField1);

        jLabel2.setText("Đến năm");
        jPanel1.add(jLabel2);

        jTextField2.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel1.add(jTextField2);

        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/btn-thong-ke.png"))); // NOI18N
        btnThongKe.setText("Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        jPanel1.add(btnThongKe);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/refesh24x24.png"))); // NOI18N
        jButton2.setText("Làm mới");
        jPanel1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/xuat-excel24x24.png"))); // NOI18N
        jButton3.setText("Xuất excel");
        jPanel1.add(jButton3);

        tblThongKeDoanhThuTheoNam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Năm", "Chi phí", "Doanh thu", "Lợi nhuận"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblThongKeDoanhThuTheoNam);

        pnlChartThongKeDoanhThuTheoNam.setLayout(new java.awt.BorderLayout());
        pnlChartThongKeDoanhThuTheoNam.add(chartThongKeDoanhThuTheoNam, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(pnlChartThongKeDoanhThuTheoNam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlChartThongKeDoanhThuTheoNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        chartThongKeDoanhThuTheoNam.start();
    }//GEN-LAST:event_formComponentAdded

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        chartThongKeDoanhThuTheoNam.clear();
        chartThongKeDoanhThuTheoNam.addData(new ModelChart("Năm 2018", new double[]{5000000, 2000000, 8000000}));
        chartThongKeDoanhThuTheoNam.addData(new ModelChart("Năm 2019", new double[]{6000000, 7500000, 9000000}));
        chartThongKeDoanhThuTheoNam.addData(new ModelChart("Năm 2020", new double[]{2000000, 3500000, 460000}));
        chartThongKeDoanhThuTheoNam.addData(new ModelChart("Năm 2021", new double[]{4800000, 1500000, 7500000}));
        chartThongKeDoanhThuTheoNam.addData(new ModelChart("Năm 2022", new double[]{3500000, 5400000, 3000000}));
        chartThongKeDoanhThuTheoNam.addData(new ModelChart("Năm 2023", new double[]{1900000, 2800000, 5000000}));
        chartThongKeDoanhThuTheoNam.start();
    }//GEN-LAST:event_btnThongKeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThongKe;
    private com.wstore.swing.chart.Chart chartThongKeDoanhThuTheoNam;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel pnlChartThongKeDoanhThuTheoNam;
    private javax.swing.JTable tblThongKeDoanhThuTheoNam;
    // End of variables declaration//GEN-END:variables
}
