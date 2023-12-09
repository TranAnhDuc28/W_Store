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
                + "		, sum(hdct.so_luong * hdct.don_gia_khuyen_mai) as tong_tien, hd.ghi_chu, hd.trang_thai\n"
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
                + "		, sum(hdct.so_luong * hdct.don_gia_khuyen_mai) as tong_tien, hd.ghi_chu, hd.trang_thai\n"
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
    public boolean insert(HoaDon hoaDon) {
        int checkInsert = 0;
        String query = "insert into HoaDon (ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, trang_thai, id_nhan_vien)\n"
                + "values (?, ?, ?, ?, ?, ?, ?);";
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setString(1, hoaDon.getMaHoaDon());
            ps.setTimestamp(2, hoaDon.getNgayTao());
            ps.setString(3, hoaDon.getTenKhachHang());
            ps.setString(4, hoaDon.getSoDienThoai());
            ps.setString(5, hoaDon.getDiaChi());
            ps.setInt(6, hoaDon.getTrangThai());
            ps.setInt(7, hoaDon.getIdNhanVien());
            checkInsert = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return checkInsert > 0;
    }

    @Override
    public boolean update(HoaDon hoaDon, int id) {
        int checkUpdate = 0;
        String query = "update HoaDon\n"
                + "set ten_khach_hang = ?, dia_chi = ?, so_dien_thoai = ?, ngay_thanh_toan = ?, ngay_giao_hang = ?\n"
                + "	, tien_ship = ?, tien_coc = ?, ngay_nhan_hang = ?, ghi_chu = ?, trang_thai = ?, id_khach_hang = ?\n"
                + "where id = ?;";
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setString(1, hoaDon.getTenKhachHang());
            ps.setString(2, hoaDon.getDiaChi());
            ps.setString(3, hoaDon.getSoDienThoai());
            ps.setTimestamp(4, hoaDon.getNgayThanhToan());
            ps.setTimestamp(5, hoaDon.getNgayGiaoHang());
            ps.setBigDecimal(6, hoaDon.getTienShip());
            ps.setBigDecimal(7, hoaDon.getTienCoc());
            ps.setTimestamp(8, hoaDon.getNgayNhanHang());
            ps.setString(9, hoaDon.getGhiChu());
            ps.setInt(10, hoaDon.getTrangThai());
            ps.setObject(11, hoaDon.getIdKhachHang());
            ps.setObject(12, id);
            checkUpdate = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return checkUpdate > 0;
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

    @Override
    public HoaDonViewModel getOne(String maHD) {
        HoaDonViewModel hd = null;
        String sql = "select hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang, hd.so_dien_thoai, hd.dia_chi\n"
                + "		, ngay_thanh_toan, ngay_giao_hang, tien_ship, tien_coc, ngay_nhan_hang\n"
                + "		, httt.loai_hinh_thanh_toan, hd.ghi_chu, hd.trang_thai\n"
                + "		, id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, id_khach_hang\n"
                + "from HoaDon hd left join NhanVien nv on hd.id_nhan_vien = nv.id\n"
                + "	left join KhachHang kh on hd.id_khach_hang = kh.id\n"
                + "	left join HoaDonChiTiet hdct on hd.id = hdct.id_hoa_don\n"
                + "	left join HinhThucThanhToan httt on hd.id = httt.id_hoa_don\n"
                + "where hd.ma_hoa_don = ?	";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setObject(1, maHD);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                hd = new HoaDonViewModel();
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
                hd.setGhiChu(rs.getString("ghi_chu"));
                hd.setIdKhachHang(new KhachHang(rs.getInt("id_khach_hang")));
                hd.setTrangThai(rs.getInt("trang_thai"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return hd;
    }

    @Override
    public List<HoaDonViewModel> findByMa(int page, int pageSize, String maHD) {
        List<HoaDonViewModel> list = new ArrayList<>();
        String sql = "select hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang, hd.so_dien_thoai, hd.dia_chi\n"
                + "		, ngay_thanh_toan, ngay_giao_hang, tien_ship, tien_coc, ngay_nhan_hang, httt.loai_hinh_thanh_toan\n"
                + "		, sum(hdct.so_luong * hdct.don_gia_khuyen_mai) as tong_tien, hd.ghi_chu, hd.trang_thai\n"
                + "		, id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, id_khach_hang\n"
                + "from HoaDon hd left join NhanVien nv on hd.id_nhan_vien = nv.id\n"
                + "		left join KhachHang kh on hd.id_khach_hang = kh.id\n"
                + "		left join HoaDonChiTiet hdct on hd.id = hdct.id_hoa_don\n"
                + "		left join HinhThucThanhToan httt on hd.id = httt.id_hoa_don\n"
                + "group by hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang, hd.so_dien_thoai, hd.dia_chi\n"
                + "		, ngay_thanh_toan, ngay_giao_hang, tien_ship, tien_coc, ngay_nhan_hang, httt.loai_hinh_thanh_toan\n"
                + "		, hd.ghi_chu, hd.trang_thai, id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, id_khach_hang\n"
                + "having ma_hoa_don like '%" + maHD + "%'\n"
                + "order by hd.id\n"
                + "offset ? rows\n"
                + "fetch next ? rows only";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
//            pstm.setInt(1, trangThai);
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
    public List<HoaDonViewModel> filterHoaDonByNgayTao(int page, int pageSize, String tuNgay, String denNgay) {
        List<HoaDonViewModel> list = new ArrayList<>();
        String sql = "select hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang, hd.so_dien_thoai, hd.dia_chi\n"
                + "		, ngay_thanh_toan, ngay_giao_hang, tien_ship, tien_coc, ngay_nhan_hang, httt.loai_hinh_thanh_toan\n"
                + "		, sum(hdct.so_luong * hdct.don_gia_khuyen_mai) as tong_tien, hd.ghi_chu, hd.trang_thai\n"
                + "		, id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, id_khach_hang\n"
                + "from HoaDon hd left join NhanVien nv on hd.id_nhan_vien = nv.id\n"
                + "		left join KhachHang kh on hd.id_khach_hang = kh.id\n"
                + "		left join HoaDonChiTiet hdct on hd.id = hdct.id_hoa_don\n"
                + "		left join HinhThucThanhToan httt on hd.id = httt.id_hoa_don\n"
                + "group by  hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang, hd.so_dien_thoai, hd.dia_chi\n"
                + "		, ngay_thanh_toan, ngay_giao_hang, tien_ship, tien_coc, ngay_nhan_hang, httt.loai_hinh_thanh_toan\n"
                + "		, hd.ghi_chu, hd.trang_thai, id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, id_khach_hang\n"
                + "having hd.ngay_tao between '" + tuNgay + "' and '" + denNgay + "'\n"
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
    public int getSoHoaDonTrongNgay(String ngay) {
         int count = 0;
        String sql = "select count(*) from HoaDon where CONVERT(DATE, ngay_tao) = ?";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, ngay);
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
