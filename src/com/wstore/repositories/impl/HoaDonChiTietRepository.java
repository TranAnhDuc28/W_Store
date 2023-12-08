/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl;

import com.wstore.domainmodels.HoaDon;
import com.wstore.repositories.IHoaDonChiTietRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.HoaDonChiTietViewModel;
import com.wstore.viewmodels.banhang.SanPhamBanHangViewModel;
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
public class HoaDonChiTietRepository implements IHoaDonChiTietRepository {

    @Override
    public List<HoaDonChiTietViewModel> getAllByIDHoaDon(int id) {
        List<HoaDonChiTietViewModel> listHoaDonChiTiets = new ArrayList<>();
        String sql = "select hdct.id, hdct.id_san_pham, sp.ma_san_pham, tt.ten_thuong_hieu, sp.doi_tuong_su_dung,"
                + " sp.ma_hang_hoa, hdct.id_hoa_don, hdct.so_luong, hdct.don_gia, hdct.don_gia_khuyen_mai\n"
                + "from HoaDonChitiet hdct join SanPham sp on hdct.id_san_pham = sp.id\n"
                + "			join ThuongHieu tt on sp.id_thuong_hieu = tt.id\n"
                + "			join HoaDon hd on hdct.id_hoa_don = hd.id\n"
                + "where hdct.id_hoa_don = ?";
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonChiTietViewModel hoaDonChiTietViewModel
                        = new HoaDonChiTietViewModel(
                                rs.getLong("id"),
                                new SanPhamBanHangViewModel(
                                        rs.getInt("id_san_pham"),
                                        rs.getString("ma_san_pham"),
                                        rs.getString("ten_thuong_hieu")
                                        + " " + rs.getString("doi_tuong_su_dung")
                                        + " " + rs.getString("ma_hang_hoa")),
                                new HoaDon(rs.getInt("id_hoa_don")),
                                rs.getInt("so_luong"),
                                rs.getBigDecimal("don_gia"),
                                rs.getBigDecimal("don_gia_khuyen_mai"));
                listHoaDonChiTiets.add(hoaDonChiTietViewModel);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return listHoaDonChiTiets;
    }

    @Override
    public void insertListOrderDetails(int idHoaDon, List<HoaDonChiTietViewModel> lists) {
        int results[];
        String sql = "insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai)\n"
                + "values(?, ?, ?, ?, ?);";
        try (Connection cn = DBConnect.getConnection();) {
            cn.setAutoCommit(false);
            try (PreparedStatement pstm = cn.prepareStatement(sql);) {
                for (HoaDonChiTietViewModel hdct : lists) {
                    pstm.setInt(1, hdct.getSanPham().getId());
                    pstm.setInt(2, idHoaDon);
                    pstm.setInt(3, hdct.getSoLuong());
                    pstm.setBigDecimal(4, hdct.getDonGia());
                    pstm.setBigDecimal(5, hdct.getDonGiaKhuyenMai());
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
    public void deleteListOrderDetails(List<Integer> listID) {
        int results[];
        String sql = "delete HoaDonChiTiet where id = ?;";
        try (Connection cn = DBConnect.getConnection();) {
            cn.setAutoCommit(false);
            try (PreparedStatement pstm = cn.prepareStatement(sql);) {
                for (int idHDCT : listID) {
                    pstm.setInt(1, idHDCT);
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
