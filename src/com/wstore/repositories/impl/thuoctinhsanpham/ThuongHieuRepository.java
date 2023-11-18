/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl.thuoctinhsanpham;

import java.util.List;
import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ThuongHieuView;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ducan
 */
public class ThuongHieuRepository implements IThuocTinhSanPhamRepository<ThuongHieuView> {

    @Override
    public List<ThuongHieuView> getAll() {
        List<ThuongHieuView> list = new ArrayList<>();
        String sql = "select id, ten_thuong_hieu, lo_go, trang_thai from ThuongHieu";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ThuongHieuView th = new ThuongHieuView(
                        rs.getInt("id"),
                        rs.getString("ten_thuong_hieu"),
                        rs.getString("lo_go"),
                        rs.getBoolean("trang_thai"));
                list.add(th);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean insert(ThuongHieuView th) {
        int checkInsert = 0;
        String sql = "insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) "
                + "values (?, ?, default);";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, th.getTenThuongHieu());
            pstm.setString(2, th.getLogo());
            checkInsert = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return checkInsert > 0;
    }

    @Override
    public boolean update(ThuongHieuView th, int id) {
        int checkUpdate = 0;
        String sql = "update ThuongHieu\n"
                + "set ten_thuong_hieu = ? , lo_go = ?\n"
                + "where id = ?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, th.getTenThuongHieu());
            pstm.setString(2, th.getLogo());
            pstm.setInt(3, id);
            checkUpdate = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return checkUpdate > 0;
    }

    @Override
    public boolean updateHienThi(ThuongHieuView th) {
        String sql = "update ThuongHieu\n"
                + "set trang_thai = ?\n"
                + "where id = ?;";
        return true;
    }

}
