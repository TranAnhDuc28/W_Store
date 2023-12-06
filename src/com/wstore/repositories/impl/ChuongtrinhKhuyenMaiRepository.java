/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl;

import com.wstore.domainmodels.ChuongTrinhKhuyenMai;
import java.util.List;
import com.wstore.repositories.IChuongTrinhKhuyenMaiRepository;
import com.wstore.utilities.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ducan
 */
public class ChuongtrinhKhuyenMaiRepository implements IChuongTrinhKhuyenMaiRepository {

    @Override
    public List<ChuongTrinhKhuyenMai> getAllByTrangThai(int trangThai) {
        List<ChuongTrinhKhuyenMai> list = new ArrayList<>();
        String sql = "select id, ma_chuong_trinh, ten_chuong_trinh, ngay_bat_dau, ngay_ket_thuc,"
                + " hinh_thuc_giam_gia, gia_tri_giam, trang_thai from ChuongTrinhKhuyenMai";
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setObject(1, trangThai);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChuongTrinhKhuyenMai ctkm = new ChuongTrinhKhuyenMai(
                        rs.getInt("id"), 
                        rs.getString("ma_chuong_trinh"), 
                        rs.getString("ten_chuong_trinh"),
                        rs.getTimestamp("ngay_bat_dau"), 
                        rs.getTimestamp("ngay_ket_thuc"), 
                        rs.getString("hinh_thuc_giam_gia"), 
                        rs.getInt("gia_tri_giam"), 
                        rs.getInt("trang_thai"));
                list.add(ctkm);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return list;
    }

    @Override
    public boolean insert(ChuongTrinhKhuyenMai ctkm) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(ChuongTrinhKhuyenMai ctkm, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
