/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl;

import com.wstore.domainmodels.HoaDon;
import com.wstore.repositories.IHoaDonChiTietRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.HoaDonChiTietViewModel;
import com.wstore.viewmodels.banhang.SanPhamBanHangViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ducan
 */
public class HoaDonChiTietRepository implements IHoaDonChiTietRepository {

    @Override
    public List<HoaDonChiTietViewModel> getAllByHoaDonID(int id) {
        List<HoaDonChiTietViewModel> listHoaDonChiTiets = new ArrayList<>();
        String sql = "select hdct.id, hdct.id_san_pham, sp.ma_san_pham, tt.ten_thuong_hieu, sp.doi_tuong_su_dung,"
                + " sp.ma_hang_hoa, hdct.id_hoa_don, hdct.so_luong, hdct.don_gia\n"
                + "from HoaDonChitiet hdct join SanPham sp on hdct.id_san_pham = sp.id\n"
                + "			join ThuongHieu tt on sp.id_thuong_hieu = tt.id\n"
                + "			join HoaDon hd on hdct.id_hoa_don = hd.id\n"
                + "where hdct.id_hoa_don = ?";
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonChiTietViewModel hoaDonChiTietViewModel
                        = new HoaDonChiTietViewModel(
                                rs.getLong("id"),
                                new SanPhamBanHangViewModel(
                                        rs.getInt("id_san_pham"),
                                        rs.getString("ma_san_pham"),
                                        rs.getString("ten_thuong_hieu")
                                + " " + rs.getString("doi_tuong_su_dung")
                                + " " + rs.getString("ma_hang_hoa")),
                                new HoaDon(rs.getInt("id_hoa_don")),
                                rs.getInt("so_luong"),
                                rs.getBigDecimal("don_gia"));

                listHoaDonChiTiets.add(hoaDonChiTietViewModel);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return listHoaDonChiTiets;
    }

    @Override
    public boolean addListOrder(int idHoaDon, List<HoaDon> lists) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
