/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl;

import com.wstore.domainmodels.KhachHang;
import com.wstore.repositories.IKhachHangRepository;
import com.wstore.utilities.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ducan
 */
public class KhachHangRepository implements IKhachHangRepository {

    @Override
    public List<KhachHang> getAll(int page, int pageSize, int trangThai) {
        List<KhachHang> list = new ArrayList<>();
        String sql = "select id ,ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, "
                + "dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai from KhachHang\n"
                + "where trang_thai = ?\n"
                + "order by id\n"
                + "offset ? rows\n"
                + "fetch next ? rows only";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement ptms = cn.prepareStatement(sql);) {
            ptms.setInt(1, trangThai);
            ptms.setInt(2, (page - 1) * pageSize);
            ptms.setInt(3, pageSize);
            ResultSet rs = ptms.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setId(rs.getInt("id"));
                kh.setMaKhachHang(rs.getString("ma_khach_hang"));
                kh.setHoTen(rs.getString("ho_ten"));
                kh.setGioiTinh(rs.getBoolean("gioi_tinh"));
                kh.setNgaySinh(rs.getDate("ngay_sinh"));
                kh.setSoDienThoai(rs.getString("so_dien_thoai"));
                kh.setEmail(rs.getString("email"));
                kh.setDiaChi(rs.getString("dia_chi"));
                kh.setHinhAnh(rs.getString("hinh_anh"));
                kh.setNgayTao(rs.getTimestamp("ngay_tao"));
                kh.setGhiChu(rs.getString("ghi_chu"));
                kh.setTrangThai(rs.getInt("trang_thai"));
                list.add(kh);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insert(KhachHang kh) {
        int checkInsert = 0;
        String sql = "insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, "
                + "email, dia_chi , hinh_anh, ngay_tao, ghi_chu, trang_thai)\n"
                + "values (?,?,?,?,?,?,?,?,?,?,default)";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, kh.getMaKhachHang());
            pstm.setString(2, kh.getHoTen());
            pstm.setBoolean(3, kh.getGioiTinh());
            pstm.setDate(4, kh.getNgaySinh());
            pstm.setString(5, kh.getSoDienThoai());
            pstm.setString(6, kh.getEmail());
            pstm.setString(7, kh.getDiaChi());
            pstm.setString(8, kh.getHinhAnh());
            pstm.setTimestamp(9, kh.getNgayTao());
            pstm.setString(10, kh.getGhiChu());
            checkInsert = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return checkInsert > 0;
    }

    @Override
    public boolean update(KhachHang kh, int id) {
        int checkupdate = 0;
        String sql = "update KhachHang\n"
                + "set ma_khach_hang =? , ho_ten = ?, gioi_tinh=?, ngay_sinh=?, so_dien_thoai=?,\n"
                + "email=?, dia_chi=?, hinh_anh=?, ghi_chu=?\n"
                + "where id = ?";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, kh.getMaKhachHang());
            pstm.setString(2, kh.getHoTen());
            pstm.setBoolean(3, kh.getGioiTinh());
            pstm.setDate(4, kh.getNgaySinh());
            pstm.setString(5, kh.getSoDienThoai());
            pstm.setString(6, kh.getEmail());
            pstm.setString(7, kh.getDiaChi());
            pstm.setString(8, kh.getHinhAnh());
            pstm.setString(9, kh.getGhiChu());
            pstm.setInt(10, id);
            checkupdate = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return checkupdate > 0;
    }

    @Override
    public boolean updateStatus(int trangThai, int id) {
        int checkUpdate = 0;
        String sql = "update KhachHang set trang_thai = ? where id = ?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, trangThai);
            pstm.setInt(2, id);
            checkUpdate = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return checkUpdate > 0;
    }

    @Override
    public void updatesStatus(int trangThai, List<Integer> listID) {
        int results[];
        String sql = "update KhachHang set trang_thai = ? where id = ?;";
        try (Connection cn = DBConnect.getConnection();) {
            cn.setAutoCommit(false);
            try (PreparedStatement pstm = cn.prepareStatement(sql);) {
                int sizeList = listID.size();
                for (int i = 0; i < sizeList; i++) {
                    pstm.setInt(1, trangThai);
                    pstm.setInt(2, listID.get(i));
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

    @Override
    public List<KhachHang> findByNameOrMaOrSDT(int page, int pageSize, int trangThai, String name) {
        List<KhachHang> list = new ArrayList<>();
        String sql = "select id, ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai,\n"
                + "email, dia_chi , hinh_anh, ngay_tao, ghi_chu, trang_thai\n"
                + "from KhachHang\n"
                + "where ho_ten like N'%" + name + "%' or ma_khach_hang like N'%" + name + "%' or so_dien_thoai like N'%" + name + "%' and trang_thai = ?\n"
                + "order by id\n"
                + "offset ? rows\n"
                + "fetch next ? rows only;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, trangThai);
            pstm.setInt(2, (page - 1) * pageSize);
            pstm.setInt(3, pageSize);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setId(rs.getInt("id"));
                kh.setMaKhachHang(rs.getString("ma_khach_hang"));
                kh.setHoTen(rs.getString("ho_ten"));
                kh.setGioiTinh(rs.getBoolean("gioi_tinh"));
                kh.setNgaySinh(rs.getDate("ngay_sinh"));
                kh.setSoDienThoai(rs.getString("so_dien_thoai"));
                kh.setEmail(rs.getString("email"));
                kh.setDiaChi(rs.getString("dia_chi"));
                kh.setHinhAnh(rs.getString("hinh_anh"));
                kh.setNgayTao(rs.getTimestamp("ngay_tao"));
                kh.setGhiChu(rs.getString("ghi_chu"));
                kh.setTrangThai(rs.getInt("trang_thai"));
                list.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int getCountRecordByTrangThai(int trangThai) {
        int count = 0;
        String sql = "select count(*) from KhachHang where trang_thai = ?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, trangThai);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return count;
    }

    @Override
    public int getCountRecord() {
        int count = 0;
        String sql = "select count(*) from KhachHang";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return count;
    }

}
