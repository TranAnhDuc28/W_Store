/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl.thuoctinhsanpham;

import com.wstore.domainmodels.thuoctinhsanpham.PhongCach;
import java.util.List;
import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.PhongCachView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ducan
 */
public class PhongCachRepository implements IThuocTinhSanPhamRepository<PhongCachView> {

    @Override
    public List<PhongCachView> getAll() {
        List<PhongCachView> list = new ArrayList<>();
        String sql = "select id, ten_phong_cach, trang_thai from PhongCach";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ptms = cn.prepareStatement(sql);) {
            ResultSet rs = ptms.executeQuery();
            while (rs.next()) {
                PhongCachView pc = new PhongCachView();
                pc.setMaPhongCach(rs.getInt("id"));
                pc.setTenPhongCach(rs.getString("ten_phong_cach"));
                pc.setHienThi(rs.getBoolean("trang_thai"));
                list.add(pc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insert(PhongCachView obj) {
        int checkinsert = 0;
        String sql = "insert into PhongCach(ten_phong_cach, trang_thai) values (? ,default);";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ptms = cn.prepareStatement(sql);) {
            ptms.setString(1, obj.getTenPhongCach());
            checkinsert = ptms.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return checkinsert > 0;
    }

    @Override
    public boolean update(PhongCachView obj, int id) {
        int checkUpdate = 0;
        String sql = "update PhongCach\n"
                + "set ten_phong_cach=?\n"
                + "where id=?";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ptms = cn.prepareStatement(sql);) {
            ptms.setString(1, obj.getTenPhongCach());
            ptms.setInt(2, id);
            checkUpdate = ptms.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return checkUpdate > 0;
    }

    @Override
    public boolean updateHienThi(PhongCachView obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
