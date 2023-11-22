/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl.thuoctinhsanpham;

import com.wstore.domainmodels.thuoctinhsanpham.XuatXu;
import java.util.List;
import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.XuatXuViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ducan
 */
public class XuatXuRepository implements IThuocTinhSanPhamRepository<XuatXuViewModel> {

    @Override
    public List<XuatXuViewModel> getAll() {
        List<XuatXuViewModel> list = new ArrayList<>();
        String sql = "select id, noi_xuat_xu, trang_thai from XuatXu";
        try {
            Connection cn = DBConnect.getConnection();
            PreparedStatement ptms = cn.prepareStatement(sql);
            ResultSet rs = ptms.executeQuery();
            while (rs.next()) {
                XuatXuViewModel xx = new XuatXuViewModel();
                xx.setHienThi(rs.getBoolean("trang_thai"));
                xx.setMaXuatXu(rs.getInt("id"));
                xx.setNoiXuatXu(rs.getString("noi_xuat_xu"));
                list.add(xx);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insert(XuatXuViewModel xx) {
        int checkInsert = 0;
        String sql = "insert into XuatXu(noi_xuat_xu, trang_thai) values (? ,default);";
        try {
            Connection cn = DBConnect.getConnection();
            PreparedStatement ptms = cn.prepareStatement(sql);
            ptms.setString(1, xx.getNoiXuatXu());
            checkInsert = ptms.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return checkInsert > 0;
    }

    @Override
    public boolean update(XuatXuViewModel xx, int id) {
        int checkUpdate = 0;
        String sql = "update XuatXu\n"
                + "set noi_xuat_xu=?\n"
                + "where id=?";
        try {
            Connection cn = DBConnect.getConnection();
            PreparedStatement ptms = cn.prepareStatement(sql);
            ptms.setString(1, xx.getNoiXuatXu());
            ptms.setInt(2, id);
            checkUpdate = ptms.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return checkUpdate > 0;
    }

    @Override
    public boolean updateHienThi(XuatXuViewModel obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
