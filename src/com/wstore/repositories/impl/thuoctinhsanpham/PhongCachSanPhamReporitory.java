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
    public Set<PhongCachSanPham> getAllByIdSanPham(int idSanPham) {
        Set<PhongCachSanPham> list = new HashSet<>();
        String sql = "select pcsp.id_san_pham, pcsp.id_phong_cach, pc.ten_phong_cach, pc.trang_thai \n"
                + "from PhongCachSanPham pcsp join PhongCach pc on pcsp.id_phong_cach = pc.id\n"
                + "where id_san_pham = ?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, idSanPham);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                PhongCachSanPham pcsp = new PhongCachSanPham();
                pcsp.setSanPham(new SanPham(idSanPham));
                pcsp.setPhongCach(new PhongCach(
                        rs.getInt("id_phong_cach"),
                        rs.getString("ten_phong_cach"),
                        rs.getBoolean("trang_thai")));
                list.add(pcsp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insert(PhongCachSanPham pcsp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int idSanPham) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
