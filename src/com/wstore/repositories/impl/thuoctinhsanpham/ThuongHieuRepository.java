/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl.thuoctinhsanpham;

import java.util.List;
import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ThuongHieuViewModel;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ducan
 */
public class ThuongHieuRepository implements IThuocTinhSanPhamRepository<ThuongHieuViewModel> {

    @Override
    public List<ThuongHieuViewModel> getAll() {
        List<ThuongHieuViewModel> list = new ArrayList<>();
        String sql = "select id, ten_thuong_hieu, lo_go, trang_thai from ThuongHieu";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ThuongHieuViewModel th = new ThuongHieuViewModel(
                        rs.getInt("id"),
                        rs.getString("ten_thuong_hieu"),
                        rs.getString("lo_go"),
                        rs.getBoolean("trang_thai"));
                list.add(th);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return list;
    }

    @Override
    public List<ThuongHieuViewModel> getAllByTrangThai(boolean trangThai) {
        List<ThuongHieuViewModel> list = new ArrayList<>();
        String sql = "select id, ten_thuong_hieu, lo_go, trang_thai from ThuongHieu where trang_thai = ?";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setBoolean(1, trangThai);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ThuongHieuViewModel th = new ThuongHieuViewModel(
                        rs.getInt("id"),
                        rs.getString("ten_thuong_hieu"),
                        rs.getString("lo_go"),
                        rs.getBoolean("trang_thai"));
                list.add(th);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insert(ThuongHieuViewModel th) {
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
    public boolean update(ThuongHieuViewModel th, int id) {
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
    public void updatesHienThi(List<ThuongHieuViewModel> list) {
        int results[];
        String sql = "update ThuongHieu set trang_thai = ? where id = ?;";
        try (Connection cn = DBConnect.getConnection();) {
            cn.setAutoCommit(false);
            try (PreparedStatement pstm = cn.prepareStatement(sql);) {
                for (ThuongHieuViewModel tt : list) {
                    pstm.setBoolean(1, tt.getHienThi());
                    pstm.setInt(2, tt.getMaThuongHieu());
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
