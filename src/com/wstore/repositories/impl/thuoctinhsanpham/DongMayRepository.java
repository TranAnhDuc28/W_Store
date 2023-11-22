/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl.thuoctinhsanpham;

import com.wstore.domainmodels.thuoctinhsanpham.DongMay;
import java.util.List;
import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.DongMayViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ducan
 */
public class DongMayRepository implements IThuocTinhSanPhamRepository<DongMayViewModel>{

     
    @Override
    public List<DongMayViewModel> getAll() {
         List<DongMayViewModel> list = new ArrayList<>();
        String sql = "select id, ten_dong_may, trang_thai from DongMay";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                DongMayViewModel dm = new DongMayViewModel(
                        rs.getInt("id"),
                        rs.getString("ten_dong_may"),                        
                        rs.getBoolean("trang_thai"));
                list.add(dm);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean insert(DongMayViewModel dm) {
        int checkInsert = 0;
        String sql = "insert into DongMay(ten_dong_may, trang_thai) values (?, default);";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, dm.getTenDongMay());
            checkInsert = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return checkInsert > 0;
    }

    @Override
    public boolean update(DongMayViewModel dm, int id) {
        int checkUpdate = 0;
        String sql = "update DongMay\n"
                + "set ten_dong_may = ?\n"
                + "where id = ?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, dm.getTenDongMay());
            pstm.setInt(2, id);
            checkUpdate = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return checkUpdate > 0;
    }

    @Override
    public boolean updateHienThi(DongMayViewModel dm) {
        int checkUpdate = 0;
        String sql = "update DongMay\n"
                + "set trang_thai = ?"
                + "where id = ?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setBoolean(1, dm.getHienThi());
            pstm.setInt(2, dm.getIdDongMay());
            checkUpdate = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return checkUpdate > 0;
    }
    
}
