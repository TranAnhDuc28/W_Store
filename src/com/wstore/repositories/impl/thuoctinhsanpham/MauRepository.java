/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl.thuoctinhsanpham;

import java.util.List;
import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.MauViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ducan
 */
public class MauRepository implements IThuocTinhSanPhamRepository<MauViewModel> {

    @Override
    public List<MauViewModel> getAll() {
        List<MauViewModel> list = new ArrayList<>();
        String sql = "select id, ten_mau, trang_thai from Mau";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ptms = cn.prepareStatement(sql);) {
            ResultSet rs = ptms.executeQuery();
            while (rs.next()) {
                MauViewModel mau = new MauViewModel();
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
    public List<MauViewModel> getAllByTrangThai(boolean trangThai) {
        List<MauViewModel> list = new ArrayList<>();
        String sql = "select id, ten_mau, trang_thai from Mau where trang_thai = ?";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setBoolean(1, trangThai);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                MauViewModel mau = new MauViewModel();
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
    public boolean insert(MauViewModel obj) {
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
    public boolean update(MauViewModel obj, int id) {
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
    public void updatesHienThi(List<MauViewModel> list) {
        int results[];
        String sql = "update Mau set trang_thai = ? where id = ?;";
        try (Connection cn = DBConnect.getConnection();) {
            cn.setAutoCommit(false);
            try (PreparedStatement pstm = cn.prepareStatement(sql);) {
                for (MauViewModel m : list) {
                    pstm.setBoolean(1, m.getHienThi());
                    pstm.setInt(2, m.getMaMau());
                    pstm.addBatch();
                }
                // chạy batch và lấy kết quả
                results = pstm.executeBatch();
                // check lỗi
                for (int i = 0; i < results.length; i++) {
                    if (results[i] == PreparedStatement.EXECUTE_FAILED) {
                        System.out.println("Error in statement at index " + i);
                    }
                }
                cn.commit();
            } catch (SQLException e) {
                e.printStackTrace();
                cn.rollback();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
