/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl;

import com.wstore.domainmodels.NhanVien;
import com.wstore.repositories.INhanVienRepository;
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
public class NhanVienRepository implements INhanVienRepository {

    @Override
    public List<NhanVien> getAll(int page, int pageSize, int trangThai) {
        List<NhanVien> list = new ArrayList<>();
        String sql = "select id, ma_nhan_vien , mat_khau, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai\n"
                + ", can_cuoc_cong_dan, email ,dia_chi, vai_tro, ngay_tao, hinh_anh, ghi_chu, trang_thai\n"
                + "from NhanVien\n"
                + "where trang_thai = ?\n"
                + "order by id\n"
                + "offset ? rows\n"
                + "fetch next ? rows only;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, trangThai);
            pstm.setInt(2, (page - 1) * pageSize);
            pstm.setInt(3, pageSize);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(
                        rs.getInt("id"),
                        rs.getString("ma_nhan_vien"),
                        rs.getString("mat_khau"),
                        rs.getString("ho_ten"),
                        rs.getBoolean("gioi_tinh"),
                        rs.getDate("ngay_sinh"),
                        rs.getString("can_cuoc_cong_dan"),
                        rs.getString("dia_chi"),
                        rs.getString("so_dien_thoai"),
                        rs.getString("email"),
                        rs.getInt("vai_tro"),
                        rs.getTimestamp("ngay_tao"),
                        rs.getString("hinh_anh"),
                        rs.getString("ghi_chu"),
                        rs.getInt("trang_thai"));
                list.add(nv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insert(NhanVien nv) {
        int checkInsert = 0;
        String sql = "insert into NhanVien(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh\n"
                + ", can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro\n"
                + ", hinh_anh, ghi_chu, trang_thai)\n"
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, default)";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, nv.getMaNhanVien());
            pstm.setString(2, nv.getMatKhau());
            pstm.setString(3, nv.getHoTen());
            pstm.setBoolean(4, nv.getGioiTinh());
            pstm.setDate(5, nv.getNgaySinh());
            pstm.setString(6, nv.getCanCuocCongDan());
            pstm.setString(7, nv.getDiaChi());
            pstm.setString(8, nv.getSoDienThoai());
            pstm.setString(9, nv.getEmail());
            pstm.setInt(10, nv.getVaiTro());
            pstm.setString(11, nv.getHinhAnh());
            pstm.setString(12, nv.getGhiChu());
            checkInsert = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return checkInsert > 0;
    }

    @Override
    public boolean update(NhanVien nv, int id) {
        int checkUpdate = 0;
        String sql = "update NhanVien\n"
                + "set ma_nhan_vien = ?, ho_ten = ?, gioi_tinh = ?, ngay_sinh = ?, can_cuoc_cong_dan = ?, \n"
                + "dia_chi = ?, so_dien_thoai = ?, email = ?, vai_tro = ?, hinh_anh = ?, ghi_chu = ?\n"
                + "where id = ?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, nv.getMaNhanVien());
            pstm.setString(2, nv.getHoTen());
            pstm.setBoolean(3, nv.getGioiTinh());
            pstm.setDate(4, nv.getNgaySinh());
            pstm.setString(5, nv.getCanCuocCongDan());
            pstm.setString(6, nv.getDiaChi());
            pstm.setString(7, nv.getSoDienThoai());
            pstm.setString(8, nv.getEmail());
            pstm.setInt(9, nv.getVaiTro());
            pstm.setString(10, nv.getHinhAnh());
            pstm.setString(11, nv.getGhiChu());
            pstm.setInt(12, id);
            checkUpdate = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return checkUpdate > 0;
    }

    @Override
    public NhanVien findByMa(String ma) {
        NhanVien nv = null;
        String sql = "select id, ma_nhan_vien , mat_khau, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai\n"
                + ", can_cuoc_cong_dan, email ,dia_chi, vai_tro, ngay_tao, hinh_anh, ghi_chu, trang_thai\n"
                + "from NhanVien\n"
                + "where trang_thai = 0 and ma_nhan_vien = ?";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, ma);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                nv = new NhanVien(
                        rs.getInt("id"),
                        rs.getString("ma_nhan_vien"),
                        rs.getString("mat_khau"),
                        rs.getString("ho_ten"),
                        rs.getBoolean("gioi_tinh"),
                        rs.getDate("ngay_sinh"),
                        rs.getString("can_cuoc_cong_dan"),
                        rs.getString("dia_chi"),
                        rs.getString("so_dien_thoai"),
                        rs.getString("email"),
                        rs.getInt("vai_tro"),
                        rs.getTimestamp("ngay_tao"),
                        rs.getString("hinh_anh"),
                        rs.getString("ghi_chu"),
                        rs.getInt("trang_thai"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return nv;
    }

    @Override
    public List<NhanVien> findByNameOrMa(int page, int pageSize, int trangThai, String name) {
        List<NhanVien> list = new ArrayList<>();
        String sql = "select id, ma_nhan_vien , mat_khau, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai\n"
                + ", can_cuoc_cong_dan, email ,dia_chi, vai_tro, ngay_tao, hinh_anh, ghi_chu, trang_thai\n"
                + "from NhanVien\n"
                + "where trang_thai = ? and ho_ten like N'%" + name + "%' or ma_nhan_vien like N'%" + name + "%'\n"
                + "order by id\n"
                + "offset ? rows\n"
                + "fetch next ? rows only;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, trangThai);
            pstm.setInt(2, (page - 1) * pageSize);
            pstm.setInt(3, pageSize);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(
                        rs.getInt("id"),
                        rs.getString("ma_nhan_vien"),
                        rs.getString("mat_khau"),
                        rs.getString("ho_ten"),
                        rs.getBoolean("gioi_tinh"),
                        rs.getDate("ngay_sinh"),
                        rs.getString("can_cuoc_cong_dan"),
                        rs.getString("dia_chi"),
                        rs.getString("so_dien_thoai"),
                        rs.getString("email"),
                        rs.getInt("vai_tro"),
                        rs.getTimestamp("ngay_tao"),
                        rs.getString("hinh_anh"),
                        rs.getString("ghi_chu"),
                        rs.getInt("trang_thai"));
                list.add(nv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public int getCountRecord(int trangThai) {
        int count = 0;
        String sql = "select count(*) from NhanVien where trang_thai = ?;";
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
    public boolean updatePassword(String newPassword, int id) {
        int checkUpdate = 0;
        String sql = "update NhanVien set mat_khau = ? where id = ?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, newPassword);
            pstm.setInt(2, id);
            checkUpdate = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return checkUpdate > 0;
    }

    @Override
    public boolean updateStatus(int trangThai, int id) {
        int checkUpdate = 0;
        String sql = "update NhanVien set trang_thai = ? where id = ?;";
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
    public void updatesSatus(int trangThai, List<Integer> listID) {
        int results[];
        String sql = "update NhanVien set trang_thai = ? where id = ?;";
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

}
