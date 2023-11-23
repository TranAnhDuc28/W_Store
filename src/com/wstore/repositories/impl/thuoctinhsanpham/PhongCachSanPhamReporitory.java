/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl.thuoctinhsanpham;

import com.wstore.domainmodels.SanPham;
import com.wstore.domainmodels.thuoctinhsanpham.PhongCach;
import com.wstore.domainmodels.thuoctinhsanpham.PhongCachSanPham;
import com.wstore.domainmodels.thuoctinhsanpham.TinhNangSanPham;
import com.wstore.repositories.IPhongCachSanPhamRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.PhongCachViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ducan
 */
public class PhongCachSanPhamReporitory implements IPhongCachSanPhamRepository {

    @Override
    public Set<PhongCachViewModel> getAllByIdSanPham(int idSanPham) {
        Set<PhongCachViewModel> list = new HashSet<>();
        String sql = "select pc.id, pc.ten_phong_cach, pc.trang_thai\n"
                + "from PhongCach pc join PhongCachSanPham pcsp on pcsp.id_phong_cach = pc.id\n"
                + "where id_san_pham = ?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, idSanPham);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                PhongCachViewModel pcsp = new PhongCachViewModel();
                pcsp.setMaPhongCach(rs.getInt("id"));
                pcsp.setTenPhongCach(rs.getString("ten_phong_cach"));
                pcsp.setHienThi(rs.getBoolean("trang_thai"));
                list.add(pcsp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insert(PhongCachViewModel pcsp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int idSanPham) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
