/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl;

import com.wstore.domainmodels.SanPham;
import com.wstore.domainmodels.thuoctinhsanpham.ChatLieuDay;
import com.wstore.domainmodels.thuoctinhsanpham.ChatLieuKinh;
import com.wstore.domainmodels.thuoctinhsanpham.ChatLieuVo;
import com.wstore.domainmodels.thuoctinhsanpham.DongMay;
import com.wstore.domainmodels.thuoctinhsanpham.Mau;
import com.wstore.domainmodels.thuoctinhsanpham.ThuongHieu;
import com.wstore.domainmodels.thuoctinhsanpham.XuatXu;
import com.wstore.repositories.ISanPhamRepository;
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
public class SanPhamRepository implements ISanPhamRepository {

    @Override
    public List<SanPham> getAll(int page, int pageSize) {
        List<SanPham> list = new ArrayList<>();

        String sql = "select sp.id, sp.ma_san_pham, id_thuong_hieu, th.ten_thuong_hieu, sp.ma_hang_hoa\n"
                + ", sp.gia_nhap, sp.don_gia, sp.so_luong_ton, sp.hinh_anh, sp.doi_tuong_su_dung\n"
                + ", sp.dong_san_pham, sp.khang_nuoc, sp.khoang_tru_cot, sp.size_mat\n"
                + ", sp.hinh_dang, sp.do_day, sp.id_dong_may, dm.ten_dong_may, sp.id_chat_lieu_day\n"
                + ", cld.ten_chat_lieu_day, sp.id_chat_lieu_kinh, clk.ten_chat_lieu_kinh\n"
                + ", sp.id_xuat_xu, xx.noi_xuat_xu, sp.id_chat_lieu_vo, clv.ten_chat_lieu_vo\n"
                + ", sp.id_mau_vo, mv.ten_mau, sp.id_mau_mat, mm.ten_mau, sp.trang_thai\n"
                + "     from SanPham sp \n"
                + "left join ThuongHieu th on sp.id_thuong_hieu = th.id\n"
                + "left join DongMay dm on sp.id_dong_may = dm.id\n"
                + "left join ChatLieuDay cld on sp.id_chat_lieu_day = cld.id\n"
                + "left join ChatLieuKinh clk on sp.id_chat_lieu_kinh = clk.id\n"
                + "left join ChatLieuVo clv on sp.id_chat_lieu_vo = clv.id\n"
                + "left join XuatXu xx on sp.id_xuat_xu = xx.id\n"
                + "left join Mau mv on sp.id_mau_vo = mv.id\n"
                + "left join Mau mm on sp.id_mau_mat = mm.id";

        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
//            pstm.setInt(1, (page - 1) * pageSize);
//            pstm.setInt(2, pageSize);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham(
                        rs.getInt("id"),
                        rs.getString("ma_san_pham"),
                        new ThuongHieu(rs.getInt("id_thuong_hieu"),
                                rs.getString("ten_thuong_hieu")),
                        rs.getString("ma_hang_hoa"),
                        rs.getBigDecimal("gia_nhap"),
                        rs.getBigDecimal("don_gia"),
                        rs.getInt("so_luong_ton"),
                        rs.getString("hinh_anh"),
                        rs.getString("doi_tuong_su_dung"),
                        rs.getString("dong_san_pham"),
                        rs.getInt("khang_nuoc"),
                        rs.getInt("khoang_tru_cot"),
                        rs.getFloat("size_mat"),
                        rs.getString("hinh_dang"),
                        rs.getFloat("do_day"),
                        new DongMay(rs.getInt("id_dong_may"),
                                rs.getString("ten_dong_may")),
                        new ChatLieuDay(rs.getInt("id_chat_lieu_day"),
                                rs.getString("ten_chat_lieu_day")),
                        new ChatLieuKinh(rs.getInt("id_chat_lieu_kinh"),
                                rs.getString("ten_chat_lieu_kinh")),
                        new XuatXu(rs.getInt("id_xuat_xu"),
                                rs.getString("noi_xuat_xu")),
                        new ChatLieuVo(rs.getInt("id_chat_lieu_vo"),
                                rs.getString("ten_chat_lieu_vo")),
                        new Mau(rs.getInt("id_mau_vo"),
                                rs.getString("ten_mau")),
                        new Mau(rs.getInt("id_mau_mat"),
                                rs.getString("ten_mau")),
                        rs.getBoolean("trang_thai"));
                list.add(sp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insert(SanPham sp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(SanPham sp, int idSanPham) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateStatus(int trangThai, int idSanPham) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getRecordCount(int trangThai) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<SanPham> findByNameOrMa(int page, int pageSize, int trangThai, String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void main(String[] args) {
        System.out.println(new SanPhamRepository().getAll(1, 1).size());
    }
}
