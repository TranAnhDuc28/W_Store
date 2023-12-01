/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl.thuoctinhsanpham;

import java.util.List;
import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.PhongCachViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ducan
 */
public class PhongCachRepository implements IThuocTinhSanPhamRepository<PhongCachViewModel> {

    @Override
    public List<PhongCachViewModel> getAll() {
        List<PhongCachViewModel> list = new ArrayList<>();
        String sql = "select id, ten_phong_cach, trang_thai from PhongCach";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ptms = cn.prepareStatement(sql);) {
            ResultSet rs = ptms.executeQuery();
            while (rs.next()) {
                PhongCachViewModel pc = new PhongCachViewModel();
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
    public List<PhongCachViewModel> getAllByTrangThai(boolean trangThai) {
        List<PhongCachViewModel> list = new ArrayList<>();
        String sql = "select id, ten_phong_cach, trang_thai from PhongCach where trang_thai = ?";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setBoolean(1, trangThai);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                PhongCachViewModel pc = new PhongCachViewModel();
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
    public boolean insert(PhongCachViewModel obj) {
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
    public boolean update(PhongCachViewModel obj, int id) {
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
    public void updatesHienThi(List<PhongCachViewModel> list) {
        int results[];
        String sql = "update PhongCach set trang_thai = ? where id = ?;";
        try (Connection cn = DBConnect.getConnection();) {
            cn.setAutoCommit(false);
            try (PreparedStatement pstm = cn.prepareStatement(sql);) {
                for (PhongCachViewModel pc : list) {
                    pstm.setBoolean(1, pc.getHienThi());
                    pstm.setInt(2, pc.getMaPhongCach());
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
