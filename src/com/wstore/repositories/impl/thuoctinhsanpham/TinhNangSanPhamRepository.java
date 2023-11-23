/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl.thuoctinhsanpham;

import com.wstore.domainmodels.thuoctinhsanpham.TinhNangSanPham;
import com.wstore.repositories.ITinhNangSanPhamRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.TinhNangViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ducan
 */
public class TinhNangSanPhamRepository implements ITinhNangSanPhamRepository {

    @Override
    public Set<TinhNangViewModel> getAllByIdSanPham(int idSanPham) {
        Set<TinhNangViewModel> list = new HashSet<>();
        String sql = "select tn.id, tn.ten_tinh_nang, tn.trang_thai \n"
                + "from  TinhNang tn join TinhNangSanPham tnsp on tnsp.id_tinh_nang = tn.id\n"
                + "where id_san_pham = ?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, idSanPham);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                TinhNangViewModel tnsp = new TinhNangViewModel();
                tnsp.setMaTinhNang(rs.getInt("id"));
                tnsp.setTenTinhNang(rs.getString("ten_tinh_nang"));
                tnsp.setHienThi(rs.getBoolean("trang_thai"));
                list.add(tnsp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void insert(List<TinhNangSanPham> list) {
//       int checkInsert = 0;
//        String sql = "insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (?, ?);";
//        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
//            pstm.setInt(1, tnsp.getIdSanPham());
//            checkInsert = pstm.executeUpdate();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
    }

    @Override
    public boolean delete(int idSanPham) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
