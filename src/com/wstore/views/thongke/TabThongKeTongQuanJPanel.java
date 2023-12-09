/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.wstore.views.thongke;

import com.wstore.services.IHoaDonService;
import com.wstore.services.INhanVienService;
import com.wstore.services.ISanPhamService;
import com.wstore.services.IThongKeService;
import com.wstore.services.impl.HoaDonService;
import com.wstore.services.impl.NhanVienService;
import com.wstore.services.impl.SanPhamService;
import com.wstore.services.impl.ThongKeService;
import com.wstore.swing.chart.Chart;
import com.wstore.swing.chart.ModelChart;
import com.wstore.swing.table.TableTextAlignmentCellRender;
import com.wstore.utilities.Helper;
import com.wstore.viewmodels.thongke.ThongKeTungNgayTrongThangViewModel;
import java.awt.Color;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ducan
 */
public class TabThongKeTongQuanJPanel extends javax.swing.JPanel {

    private IThongKeService thongKeService = new ThongKeService();
    private IHoaDonService hoaDonService = new HoaDonService();
    private ISanPhamService sanPhamService = new SanPhamService();
    private INhanVienService nhanVienService = new NhanVienService();
    DefaultTableModel dtmTongQuan;
    List<ThongKeTungNgayTrongThangViewModel> list;

    public TabThongKeTongQuanJPanel() {
        initComponents();
        init();
        lblSoHoaDon.setText(String.valueOf(hoaDonService.getSoHoaDonTrongNgay(Helper.sdfNgayThangNamSQL.format(new Date()))));
        lblSoSanPhamDangKinhDoanh.setText(sanPhamService.getRecordCountByTrangThai(0) + "");
        lblNhanVienDangLamViec.setText(nhanVienService.getCountRecord(0) + "");
        loadDataToTable(thongKeService.getThongKe7NgayGanNhat());
        loadDataToChar(thongKeService.getThongKe7NgayGanNhat(), chartThongKeTongQuan);
    }

    private void init() {
        TableTextAlignmentCellRender textCenter = new TableTextAlignmentCellRender();
        int countColumntblSP = tblTongQuan.getColumnCount();
        for (int i = 0; i < countColumntblSP; i++) {
            tblTongQuan.getColumnModel().getColumn(i).setCellRenderer(textCenter);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSoHoaDon = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSoSanPhamDangKinhDoanh = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblNhanVienDangLamViec = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTongQuan = new javax.swing.JTable();
        pnlChart = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        chartThongKeTongQuan = new com.wstore.swing.chart.Chart();

        setBackground(new java.awt.Color(241, 246, 251));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 18, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/invoice.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Hóa đơn trong ngày");

        lblSoHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblSoHoaDon.setText("1000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblSoHoaDon))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblSoHoaDon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/product-watch64x64.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Sản phẩm đang kinh doanh");

        lblSoSanPhamDangKinhDoanh.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblSoSanPhamDangKinhDoanh.setText("1000");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSoSanPhamDangKinhDoanh)
                    .addComponent(jLabel5))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblSoSanPhamDangKinhDoanh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/nhan-vien64x64.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Nhân viên đang hoạt động");

        lblNhanVienDangLamViec.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblNhanVienDangLamViec.setText("1000");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lblNhanVienDangLamViec))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblNhanVienDangLamViec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);

        tblTongQuan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ngày", "Vốn", "Doanh thu", "Lợi nhuận"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTongQuan.setRowHeight(30);
        tblTongQuan.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblTongQuan);

        pnlChart.setLayout(new java.awt.BorderLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Thống kê doanh thu 8 ngày gần nhất");
        jLabel10.setOpaque(true);
        pnlChart.add(jLabel10, java.awt.BorderLayout.PAGE_START);
        pnlChart.add(chartThongKeTongQuan, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        loadDataToTable(thongKeService.getThongKe7NgayGanNhat());
        loadDataToChar(thongKeService.getThongKe7NgayGanNhat(), chartThongKeTongQuan);
    }//GEN-LAST:event_formComponentAdded

    public void loadDataToTable(List<ThongKeTungNgayTrongThangViewModel> list) {
        dtmTongQuan = (DefaultTableModel) tblTongQuan.getModel();
        dtmTongQuan.setRowCount(0);
        for (ThongKeTungNgayTrongThangViewModel tk : list) {
            dtmTongQuan.addRow(tk.toDaTaRow());
        }
    }

    public void loadDataToChar(List<ThongKeTungNgayTrongThangViewModel> list, Chart chart) {
        chart.clear();
        chart.addLegend("Vốn", new Color(245, 189, 135));
        chart.addLegend("Doanh thu", new Color(135, 189, 245));
        chart.addLegend("Lợi nhuận", new Color(189, 135, 245));
        for (ThongKeTungNgayTrongThangViewModel tk : list) {
            chart.addData(new ModelChart(
                    tk.getNgay().toString(),
                    new double[]{
                        tk.getVon().doubleValue(),
                        tk.getDoanhThu().doubleValue(),
                        tk.getLoiNhuan().doubleValue()}));
        }
        chart.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.wstore.swing.chart.Chart chartThongKeTongQuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNhanVienDangLamViec;
    private javax.swing.JLabel lblSoHoaDon;
    private javax.swing.JLabel lblSoSanPhamDangKinhDoanh;
    public javax.swing.JPanel pnlChart;
    private javax.swing.JTable tblTongQuan;
    // End of variables declaration//GEN-END:variables
}
