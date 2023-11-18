/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl.thuoctinhsanpham;

import com.wstore.domainmodels.thuoctinhsanpham.Mau;
import java.util.List;
import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.MauView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ducan
 */
public class MauRepository implements IThuocTinhSanPhamRepository<MauView> {

    @Override
    public List<MauView> getAll() {
        List<MauView> list = new ArrayList<>();
        String sql = "select id, ten_mau, trang_thai from Mau";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ptms = cn.prepareStatement(sql);) {
            ResultSet rs = ptms.executeQuery();
            while (rs.next()) {
                MauView mau = new MauView();
                mau.setMaMau(rs.getInt("id"));
                mau.setTenMau(rs.getString("ten_mau"));
                mau.setHienThi(rs.getBoolean("trang_thai"));
                list.add(mau);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }

    @Override
    public boolean insert(MauView obj) {
        int checkInsert = 0;
        String sql = "insert into Mau(ten_mau, trang_thai) values (?, default);";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ptms = cn.prepareStatement(sql);) {
            ptms.setString(1, obj.getTenMau());
            checkInsert = ptms.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return checkInsert > 0;
    }

    @Override
    public boolean update(MauView obj, int id) {
        int checkUpdate = 0;
        String sql = "update Mau\n"
                + "set ten_mau= ?\n"
                + "where id=?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ptms = cn.prepareStatement(sql);) {
            ptms.setString(1, obj.getTenMau());
            ptms.setInt(2, id);
            checkUpdate = ptms.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return checkUpdate > 0;
    }

    @Override
    public boolean updateHienThi(MauView obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
