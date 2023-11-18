/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl.thuoctinhsanpham;

import com.wstore.domainmodels.thuoctinhsanpham.TinhNang;
import java.util.List;
import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.TinhNangView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ducan
 */
public class TinhNangRepository implements IThuocTinhSanPhamRepository<TinhNangView> {

    @Override
    public List<TinhNangView> getAll() {
        List<TinhNangView> list = new ArrayList<>();
        String sql = "select id, ten_tinh_nang, trang_thai from TinhNang";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ptms = cn.prepareStatement(sql);) {
            ResultSet rs = ptms.executeQuery();
            while (rs.next()) {
                TinhNangView tn = new TinhNangView();
                tn.setMaTinhNang(rs.getInt("id"));
                tn.setTenTinhNang(rs.getString("ten_tinh_nang"));
                tn.setHienThi(rs.getBoolean("trang_thai"));
                list.add(tn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insert(TinhNangView obj) {
        int checkinsert = 0;
        String sql = "insert into TinhNang(ten_tinh_nang, trang_thai) values (?, default);";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ptms = cn.prepareStatement(sql);) {
            ptms.setString(1, obj.getTenTinhNang());
            checkinsert = ptms.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return checkinsert > 0;
    }

    @Override
    public boolean update(TinhNangView obj, int id) {
        int checkUpdate = 0;
        String sql = "update TinhNang\n"
                + "set ten_tinh_nang=?\n"
                + "where id=?";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ptms = cn.prepareStatement(sql);) {
            ptms.setString(1, obj.getTenTinhNang());
            ptms.setInt(2, id);
            checkUpdate = ptms.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return checkUpdate > 0;
    }

    @Override
    public boolean updateHienThi(TinhNangView obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
