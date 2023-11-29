/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl;

import com.wstore.domainmodels.HoaDon;
import com.wstore.domainmodels.KhachHang;
import com.wstore.domainmodels.NhanVien;
import com.wstore.repositories.IHoaDonRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.HoaDonViewModel;
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
public class HoaDonRepository implements IHoaDonRepository {

    @Override
    public List<HoaDonViewModel> getAll(int page, int pageSize) {
        List<HoaDonViewModel> list = new ArrayList<>();
        String sql = "select hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang, hd.so_dien_thoai, hd.dia_chi\n"
                + "		, ngay_thanh_toan, ngay_giao_hang, tien_ship, tien_coc, ngay_nhan_hang, httt.loai_hinh_thanh_toan\n"
                + "		, sum(hdct.gia_ban_sau_khuyen_mai) as tong_tien, hd.ghi_chu, hd.trang_thai\n"
                + "		, id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, id_khach_hang\n"
                + "from HoaDon hd left join NhanVien nv on hd.id_nhan_vien = nv.id\n"
                + "		left join KhachHang kh on hd.id_khach_hang = kh.id\n"
                + "		left join HoaDonChiTiet hdct on hd.id = hdct.id_hoa_don\n"
                + "		left join HinhThucThanhToan httt on hd.id = httt.id_hoa_don\n"
                + "group by  hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang, hd.so_dien_thoai, hd.dia_chi\n"
                + "		, ngay_thanh_toan, ngay_giao_hang, tien_ship, tien_coc, ngay_nhan_hang, httt.loai_hinh_thanh_toan\n"
                + "		, hd.ghi_chu, hd.trang_thai, id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, id_khach_hang\n"
                + "order by hd.id\n"
                + "offset ? rows\n"
                + "fetch next ? rows only";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, (page - 1) * pageSize);
            pstm.setInt(2, pageSize);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                HoaDonViewModel hd = new HoaDonViewModel();
                hd.setId(rs.getInt("id"));
                hd.setMaHoaDon(rs.getString("ma_hoa_don"));
                hd.setNgayTao(rs.getTimestamp("ngay_tao"));
                hd.setTenKhachHang(rs.getString("ten_khach_hang"));
                hd.setSoDienThoai(rs.getString("so_dien_thoai"));
                hd.setDiaChi(rs.getString("dia_chi"));
                hd.setNhanVien(new NhanVien(
                        rs.getInt("id_nhan_vien"),
                        rs.getString("ma_nhan_vien"),
                        rs.getString("ho_ten")));
                hd.setNgayThanhToan(rs.getTimestamp("ngay_thanh_toan"));
                hd.setNgayGiaoHang(rs.getTimestamp("ngay_giao_hang"));
                hd.setTienShip(rs.getBigDecimal("tien_ship"));
                hd.setTienCoc(rs.getBigDecimal("tien_coc"));
                hd.setNgayNhanHang(rs.getTimestamp("ngay_nhan_hang"));
                hd.setHinhThucThanhToan(rs.getString("loai_hinh_thanh_toan"));
                hd.setTongTien(rs.getBigDecimal("tong_tien"));
                hd.setGhiChu(rs.getString("ghi_chu"));
                hd.setIdKhachHang(new KhachHang(rs.getInt("id_khach_hang")));
                hd.setTrangThai(rs.getInt("trang_thai"));
                list.add(hd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public List<HoaDonViewModel> getAllByTrangThai(int page, int pageSize, int trangThai) {
        List<HoaDonViewModel> list = new ArrayList<>();
        String sql = "select hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang, hd.so_dien_thoai, hd.dia_chi\n"
                + "		, ngay_thanh_toan, ngay_giao_hang, tien_ship, tien_coc, ngay_nhan_hang, httt.loai_hinh_thanh_toan\n"
                + "		, sum(hdct.gia_ban_sau_khuyen_mai) as tong_tien, hd.ghi_chu, hd.trang_thai\n"
                + "		, id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, id_khach_hang\n"
                + "from HoaDon hd left join NhanVien nv on hd.id_nhan_vien = nv.id\n"
                + "		left join KhachHang kh on hd.id_khach_hang = kh.id\n"
                + "		left join HoaDonChiTiet hdct on hd.id = hdct.id_hoa_don\n"
                + "		left join HinhThucThanhToan httt on hd.id = httt.id_hoa_don\n"
                + "group by  hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang, hd.so_dien_thoai, hd.dia_chi\n"
                + "		, ngay_thanh_toan, ngay_giao_hang, tien_ship, tien_coc, ngay_nhan_hang, httt.loai_hinh_thanh_toan\n"
                + "		, hd.ghi_chu, hd.trang_thai, id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, id_khach_hang\n"
                + "having hd.trang_thai = ?\n"
                + "order by hd.id\n"
                + "offset ? rows\n"
                + "fetch next ? rows only";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, trangThai);
            pstm.setInt(2, (page - 1) * pageSize);
            pstm.setInt(3, pageSize);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                HoaDonViewModel hd = new HoaDonViewModel();
                hd.setId(rs.getInt("id"));
                hd.setMaHoaDon(rs.getString("ma_hoa_don"));
                hd.setNgayTao(rs.getTimestamp("ngay_tao"));
                hd.setTenKhachHang(rs.getString("ten_khach_hang"));
                hd.setSoDienThoai(rs.getString("so_dien_thoai"));
                hd.setDiaChi(rs.getString("dia_chi"));
                hd.setNhanVien(new NhanVien(
                        rs.getInt("id_nhan_vien"),
                        rs.getString("ma_nhan_vien"),
                        rs.getString("ho_ten")));
                hd.setNgayThanhToan(rs.getTimestamp("ngay_thanh_toan"));
                hd.setNgayGiaoHang(rs.getTimestamp("ngay_giao_hang"));
                hd.setTienShip(rs.getBigDecimal("tien_ship"));
                hd.setTienCoc(rs.getBigDecimal("tien_coc"));
                hd.setNgayNhanHang(rs.getTimestamp("ngay_nhan_hang"));
                hd.setHinhThucThanhToan(rs.getString("loai_hinh_thanh_toan"));
                hd.setTongTien(rs.getBigDecimal("tong_tien"));
                hd.setGhiChu(rs.getString("ghi_chu"));
                hd.setIdKhachHang(new KhachHang(rs.getInt("id_khach_hang")));
                hd.setTrangThai(rs.getInt("trang_thai"));
                list.add(hd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public HoaDon getOne(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean insert(HoaDon hoaDon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(HoaDon hoaDon, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getCountRecord() {
        int count = 0;
        String sql = "select count(*) from HoaDon";
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

    @Override
    public int getCountRecordByTrangThai(int trangThai) {
        int count = 0;
        String sql = "select count(*) from HoaDon where trang_thai = ?";
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

}