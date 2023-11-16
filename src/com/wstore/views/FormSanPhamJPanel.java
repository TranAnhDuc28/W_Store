/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.wstore.views;

import com.formdev.flatlaf.FlatClientProperties;
import com.wstore.swing.table.TableTextAlignmentCellRender;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ducan
 */
public class FormSanPhamJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SanPhamJPanel
     */
    public FormSanPhamJPanel() {
        initComponents();
        init();
        testData();
    }

    private void init() {
        txtTimKiemSanPham.putClientProperty(
                FlatClientProperties.PLACEHOLDER_TEXT,
                "Nhập nội dung tìm kiếm...");
        txtTimKiemSanPham.putClientProperty(
                FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON,
                true);
        tabbebQLSanPham.putClientProperty(FlatClientProperties.TABBED_PANE_SHOW_TAB_SEPARATORS, true);
        tabbebQLSanPham.addTab("THUỘC TÍNH SẢN PHẨM", new FormTabThuocTinhSanPham());
                TableTextAlignmentCellRender textCenter = new TableTextAlignmentCellRender();
        int countColumntblSP = tblDSSanPham.getColumnCount();
        for (int i = 0; i < countColumntblSP; i++) {
            tblDSSanPham.getColumnModel().getColumn(i).setCellRenderer(textCenter);
        }
    }

    private void testData() {
        DefaultTableModel dtmDSSanPham = (DefaultTableModel) tblDSSanPham.getModel();
        dtmDSSanPham.setRowCount(0);
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});
        dtmDSSanPham.addRow(new Object[]{"SP00001", "Casio", "LA-20WH-4A1DF", 459000, 510000, "Nữ", "", "Điện tử", "Dây Nhựa", "Kính Nhựa", "3atm", "", "30.4mm", "Đồng hồ Nhật", "Vỏ nhựa", "Mặt vuông", "Hồng", "Hàng mới về", "Chronograph, Lịch ngày, Lịch thứ, Giờ, phút, giây", "8.6mm", "Màu xám ghi", "Trẻ trung, cá tính", "casio-la-20wh-4a1df-la-20wh-4a1df-4134"});

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbebQLSanPham = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
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
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton10 = new javax.swing.JButton();

        setBackground(new java.awt.Color(241, 246, 251));
        setPreferredSize(new java.awt.Dimension(1140, 800));

        tabbebQLSanPham.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(241, 246, 251));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);
        jToolBar1.setEnabled(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/add32x32.png"))); // NOI18N
        jButton1.setText("Thêm sản phẩm");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setIconTextGap(5);
        jButton1.setMargin(new java.awt.Insets(5, 14, 5, 14));
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/chinh-sua32x32.png"))); // NOI18N
        jButton2.setText("Điều chỉnh");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.setIconTextGap(5);
        jButton2.setMargin(new java.awt.Insets(5, 14, 5, 14));
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/xoa32x32.png"))); // NOI18N
        jButton3.setText("Ngừng kinh doanh");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.setIconTextGap(5);
        jButton3.setMargin(new java.awt.Insets(5, 14, 5, 14));
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/import-excel32x32.png"))); // NOI18N
        jButton4.setText("Nhập từ excel");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.setIconTextGap(5);
        jButton4.setMargin(new java.awt.Insets(5, 14, 5, 14));
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/export-excel32x32.png"))); // NOI18N
        jButton5.setText("Xuất excel");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton5.setIconTextGap(5);
        jButton5.setMargin(new java.awt.Insets(5, 14, 5, 14));
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
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Thương hiệu", "Mã hàng hóa", "Giá nhập", "Giá bán", "Đối tượng sử dụng", "Dòng sản phẩm", "Dòng máy", "Chất liệu dây", "Chất liệu kính", "Kháng nước", "Khoảng trữ cót", "Size mặt", "Xuất xứ", "Chất liệu vỏ", "Hình dạng mặt", "Màu vỏ", "Tình trạng", "Tính năng", "Độ dầy", "Màu mặt", "Phong cách", "Hình ảnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSSanPham.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblDSSanPham.setRowHeight(30);
        tblDSSanPham.setShowGrid(false);
        tblDSSanPham.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(tblDSSanPham);

        jPanel7.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DANH SÁCH SẢN PHẨM");
        jPanel7.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(243, 243, 243));
        jPanel6.setOpaque(false);

        jLabel2.setText("Số bản ghi:");
        jPanel6.add(jLabel2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15", "20", "30", "50", "100" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(70, 25));
        jPanel6.add(jComboBox1);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/first16x16.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/prev16x16.png"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(jButton7);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("1/50");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setPreferredSize(new java.awt.Dimension(70, 22));
        jPanel6.add(jLabel3);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/next16x16.png"))); // NOI18N
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(jButton8);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wstore/icons/last16x16.png"))); // NOI18N
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(jButton9);

        jLabel4.setText("Tổng số: ");
        jLabel4.setPreferredSize(new java.awt.Dimension(125, 16));
        jPanel6.add(jLabel4);

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
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTabbedPane tabbebQLSanPham;
    private javax.swing.JTable tblDSSanPham;
    private javax.swing.JTextField txtTimKiemSanPham;
    // End of variables declaration//GEN-END:variables
}
