/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl.thuoctinhsanpham;

import com.wstore.domainmodels.SanPham;
import com.wstore.domainmodels.thuoctinhsanpham.TinhNang;
import com.wstore.domainmodels.thuoctinhsanpham.TinhNangSanPham;
import com.wstore.repositories.ITinhNangSanPhamRepository;
import com.wstore.utilities.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ducan
 */
public class TinhNangSanPhamRepository implements ITinhNangSanPhamRepository {

    @Override
    public Set<TinhNangSanPham> getAllByIdSanPham(int idSanPham) {
        Set<TinhNangSanPham> list = new HashSet<>();
        String sql = "select tnsp.id_san_pham, tnsp.id_tinh_nang, tn.ten_tinh_nang, tn.trang_thai \n"
                + "from TinhNangSanPham tnsp join TinhNang tn on tnsp.id_tinh_nang = tn.id\n"
                + "where id_san_pham = ?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, idSanPham);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                TinhNangSanPham tnsp = new TinhNangSanPham();
                tnsp.setSanPham(new SanPham(idSanPham));
                tnsp.setTinhNang(new TinhNang(
                        rs.getInt("id_tinh_nang"),
                        rs.getString("ten_tinh_nang"),
                        rs.getBoolean("trang_thai")));
                list.add(tnsp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insert(TinhNangSanPham tnsp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int idSanPham) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
