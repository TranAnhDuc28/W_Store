/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories;

import com.wstore.domainmodels.HoaDon;
import com.wstore.domainmodels.KhachHang;
import com.wstore.domainmodels.NhanVien;
import com.wstore.utilities.DBConnect;
import java.math.BigDecimal;
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
public class HoaDonRepository implements IHoaDonRepository {

    @Override
    public List<HoaDon> getAll(int page, int pageSize) {
        List<HoaDon> list = new ArrayList<>();
        String sql = "select hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang"
                + "         , hd.so_dien_thoai, hd.dia_chi, ngay_thanh_toan, ngay_giao_hang\n"
                + "         , tien_ship, tien_coc, ngay_nhan_hang, hd.ghi_chu, hd.trang_thai"
                + "         , id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, id_khach_hang\n"
                + "from HoaDon hd join NhanVien nv on hd.id_nhan_vien = nv.id\n"
                + "		join KhachHang kh on hd.id_khach_hang = kh.id";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, (page - 1) * pageSize);
            pstm.setInt(2, pageSize);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon(
                        rs.getInt("id"),
                        rs.getString("ma_hoa_don"),
                        rs.getTimestamp("ngay_tao"),
                        rs.getString("ten_khach_hang"),
                        rs.getString("dia_chi"),
                        rs.getString("so_dien_thoai"),
                        rs.getTimestamp("ngay_thanh_toan"),
                        rs.getTimestamp("ngay_giao_hang"),
                        rs.getBigDecimal("tien_ship"),
                        rs.getBigDecimal("tien_coc"),
                        rs.getTimestamp("ngay_nhan_hang"),
                        rs.getString("ghi_chu"),
                        rs.getInt("trang_thai"),
                        new NhanVien(
                                rs.getInt("id_nhan_vien"), 
                                rs.getString("ma_nhan_vien"), 
                                rs.getString("ho_ten")),
                        new KhachHang(rs.getInt("id_khach_hang")));
                list.add(hd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public List<HoaDon> getAllByTrangThai(int page, int pageSize, int trangThai) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HoaDon getOne(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean insert(HoaDon hoaDon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(HoaDon hoaDon, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
