/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl.thuoctinhsanpham;

import com.wstore.domainmodels.thuoctinhsanpham.DongSanPham;
import com.wstore.domainmodels.thuoctinhsanpham.ThuongHieu;
import com.wstore.repositories.IDongSanPhamRepository;
import java.util.List;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.DongSanPhamViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ducan
 */
public class DongSanPhamRepository implements IDongSanPhamRepository {

    @Override
    public List<DongSanPham> getAllByIDThuongHieu(int idThuongHieu) {
        List<DongSanPham> list = new ArrayList<>();
        String sql = "select id, ten_dong_san_pham, id_thuong_hieu, trang_thai \n"
                + "from DongSanPham \n"
                + "where id_thuong_hieu = ?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, idThuongHieu);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                DongSanPham dsp = new DongSanPham(
                        rs.getInt("id"),
                        rs.getString("ten_dong_san_pham"),
                        new ThuongHieu(rs.getInt("id_thuong_hieu")),
                        rs.getBoolean("trang_thai"));
                list.add(dsp);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return list;
    }

    @Override
    public boolean insert(DongSanPham dsp) {
        int checkInsert = 0;
        String sql = "insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values (?, ?, default);";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, dsp.getTenDongSanPham());
            pstm.setInt(2, dsp.getThuongHieu().getId());
            checkInsert = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return checkInsert > 0;
    }

    @Override
    public boolean update(DongSanPham dsp, int id) {
        int checkUpdate = 0;
        String sql = "update DongSanPham\n"
                + "set ten_dong_san_pham = ?\n"
                + "where id = ? and id_thuong_hieu = ?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, dsp.getTenDongSanPham());
            pstm.setInt(2, id);
            pstm.setInt(3, dsp.getThuongHieu().getId());
            checkUpdate = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return checkUpdate > 0;
    }

    @Override
    public boolean updateHienThi(DongSanPham dsp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DongSanPham> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
