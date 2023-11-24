/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl;

import com.wstore.domainmodels.NhanVien;
import com.wstore.repositories.INhanVienRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.NhanVienViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ducan
 */
public class NhanVienRepository implements INhanVienRepository {

    @Override
    public List<NhanVien> getAll(int page, int pageSize, int trangThai) {
        List<NhanVien> list = new ArrayList<>();
        String sql = "select id, ma_nhan_vien , mat_khau, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai\n"
                + ", can_cuoc_cong_dan, email ,dia_chi, vai_tro, ngay_tao, hinh_anh, ghi_chu, trang_thai\n"
                + "from NhanVien\n"
                + "where trang_thai = ?\n"
                + "order by id\n"
                + "offset ? rows\n"
                + "fetch next ? rows only;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, trangThai);
            pstm.setInt(2, (page - 1) * pageSize);
            pstm.setInt(3, pageSize);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(
                        rs.getInt("id"),
                        rs.getString("ma_nhan_vien"),
                        rs.getString("mat_khau"),
                        rs.getString("ho_ten"),
                        rs.getBoolean("gioi_tinh"),
                        rs.getDate("ngay_sinh"),
                        rs.getString("can_cuoc_cong_dan"),
                        rs.getString("dia_chi"),
                        rs.getString("so_dien_thoai"),
                        rs.getString("email"),
                        rs.getInt("vai_tro"),
                        rs.getTimestamp("ngay_tao"),
                        rs.getString("hinh_anh"),
                        rs.getString("ghi_chu"),
                        rs.getInt("trang_thai"));
                list.add(nv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insert(NhanVien obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(NhanVien obj, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateStatus(int trangThai, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhanVien findByMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<NhanVien> findByNameOrMa(int page, int pageSize, int trangThai, String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getCountRecord(int trangThai) {
        int count = 0;
        String sql = "select count(*) from NhanVien where trang_thai = ?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, trangThai);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return count;
    }

    @Override
    public boolean updatePassword(String newPassword, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
