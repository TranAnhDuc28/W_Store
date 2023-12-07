/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl;

import com.wstore.repositories.IThongKeRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.thongke.ThongKeTungNgayTrongThangViewModel;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ducan
 */
public class ThongKeRepository implements IThongKeRepository {

    @Override
    public List<ThongKeTungNgayTrongThangViewModel> getThongKe7NgayGanNhat() {
        List<ThongKeTungNgayTrongThangViewModel> listResult = new ArrayList<>();

        String sql = "WITH dates AS (\n"
                + "    SELECT DATEADD(DAY, -7, GETDATE()) AS ngay_thang_nam\n"
                + "    UNION ALL\n"
                + "    SELECT DATEADD(DAY, 1, ngay_thang_nam)\n"
                + "    FROM dates\n"
                + "    WHERE ngay_thang_nam < GETDATE()\n"
                + ")\n"
                + "SELECT \n"
                + "	dates.ngay_thang_nam AS ngay,\n"
                + "	ISNULL(SUM(sp.gia_nhap), 0) as von,\n"
                + "	ISNULL(SUM(hdct.don_gia_khuyen_mai), 0) as doanh_thu\n"
                + "FROM dates\n"
                + "LEFT JOIN HoaDon hd on CONVERT(DATE, hd.ngay_tao) =  CONVERT(DATE, dates.ngay_thang_nam)\n"
                + "LEFT JOIN HoaDonChiTiet hdct on hd.id = hdct.id_hoa_don\n"
                + "LEFT JOIN SanPham sp on hdct.id_san_pham = sp.id\n"
                + "GROUP BY dates.ngay_thang_nam";
        
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ptms = cn.prepareStatement(sql);) {
            ResultSet rs = ptms.executeQuery();
            while (rs.next()) {
                Date ngay = rs.getDate("ngay");
                BigDecimal von = rs.getBigDecimal("von");
                BigDecimal doanhThu = rs.getBigDecimal("doanh_thu");
                BigDecimal loiNhuan = doanhThu.subtract(von);
                ThongKeTungNgayTrongThangViewModel thongKe = new ThongKeTungNgayTrongThangViewModel(ngay, von, doanhThu, loiNhuan);
                listResult.add(thongKe);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listResult;
    }
}
