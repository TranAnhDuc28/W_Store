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
public class SanPhamRepository implements ISanPhamRepository {

    @Override
    public List<SanPham> getAllByTrangThai(int page, int pageSize, int trangThai) {
        List<SanPham> list = new ArrayList<>();

        String sql = "select sp.id, sp.ma_san_pham, id_thuong_hieu, th.ten_thuong_hieu, sp.ma_hang_hoa\n"
                + ", sp.gia_nhap, sp.don_gia, sp.so_luong_ton, sp.hinh_anh, sp.doi_tuong_su_dung\n"
                + ", sp.dong_san_pham, sp.khang_nuoc, sp.khoang_tru_cot, sp.size_mat\n"
                + ", sp.hinh_dang, sp.do_day, sp.id_dong_may, dm.ten_dong_may, sp.id_chat_lieu_day\n"
                + ", cld.ten_chat_lieu_day, sp.id_chat_lieu_kinh, clk.ten_chat_lieu_kinh\n"
                + ", sp.id_xuat_xu, xx.noi_xuat_xu, sp.id_chat_lieu_vo, clv.ten_chat_lieu_vo\n"
                + ", sp.id_mau_vo, mv.ten_mau as mau_vo, sp.id_mau_mat, mm.ten_mau as mau_mat, sp.ghi_chu, sp.trang_thai\n"
                + "     from SanPham sp \n"
                + "left join ThuongHieu th on sp.id_thuong_hieu = th.id\n"
                + "left join DongMay dm on sp.id_dong_may = dm.id\n"
                + "left join ChatLieuDay cld on sp.id_chat_lieu_day = cld.id\n"
                + "left join ChatLieuKinh clk on sp.id_chat_lieu_kinh = clk.id\n"
                + "left join ChatLieuVo clv on sp.id_chat_lieu_vo = clv.id\n"
                + "left join XuatXu xx on sp.id_xuat_xu = xx.id\n"
                + "left join Mau mv on sp.id_mau_vo = mv.id\n"
                + "left join Mau mm on sp.id_mau_mat = mm.id\n"
                + "where sp.trang_thai = ?\n"
                + "order by sp.id\n"
                + "offset ? rows\n"
                + "fetch next ? rows only;";

        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, trangThai);
            pstm.setInt(2, (page - 1) * pageSize);
            pstm.setInt(3, pageSize);
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
                                rs.getString("mau_vo")),
                        new Mau(rs.getInt("id_mau_mat"),
                                rs.getString("mau_mat")),
                        rs.getString("ghi_chu"),
                        rs.getInt("trang_thai"));
                list.add(sp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insert(SanPham sp) {
        int checkInsert = 0;
        String sql = "insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, "
                + "gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, "
                + "dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, "
                + "do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, "
                + "id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, ghi_chu, trang_thai) \n"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,default);";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, sp.getMaSanPham());
            pstm.setObject(2, sp.getThuongHieu().getId());
            pstm.setString(3, sp.getMaHangHoa());
            pstm.setBigDecimal(4, sp.getGiaNhap());
            pstm.setBigDecimal(5, sp.getDonGia());
            pstm.setInt(6, sp.getSoLuongTon());
            pstm.setString(7, sp.getHinhAnh());
            pstm.setString(8, sp.getDoiTuongSuDung());
            pstm.setString(9, sp.getDongSanPham());
            pstm.setInt(10, sp.getKhangNuoc());
            pstm.setInt(11, sp.getKhoangTruCot());
            pstm.setFloat(12, sp.getSizeMat());
            pstm.setString(13, sp.getHinhDang());
            pstm.setFloat(14, sp.getDoDay());
            pstm.setObject(15, sp.getDongMay() == null ? null : sp.getDongMay().getId());
            pstm.setObject(16, sp.getChatLieuDay() == null ? null : sp.getChatLieuDay().getId());
            pstm.setObject(17, sp.getChatLieuKinh() == null ? null : sp.getChatLieuKinh().getId());
            pstm.setObject(18, sp.getXuatXu() == null ? null : sp.getXuatXu().getId());
            pstm.setObject(19, sp.getChatLieuVo() == null ? null : sp.getChatLieuVo().getId());
            pstm.setObject(20, sp.getMauVo() == null ? null : sp.getMauVo().getId());
            pstm.setObject(21, sp.getMauMat() == null ? null : sp.getMauMat().getId());
            pstm.setString(22, sp.getGhiChu());
            checkInsert = pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return checkInsert > 0;
    }

    @Override
    public boolean update(SanPham sp, int idSanPham) {
        int checkUpdate = 0;
        String sql = "update SanPham\n"
                + "set ma_san_pham = ?, id_thuong_hieu = ?, ma_hang_hoa = ?, gia_nhap = ?, don_gia = ?, so_luong_ton = ?, hinh_anh = ?, doi_tuong_su_dung = ?\n"
                + "	, dong_san_pham = ?, khang_nuoc = ?, khoang_tru_cot = ?, size_mat = ?, hinh_dang = ?, do_day = ?, id_dong_may = ?\n"
                + "	, id_chat_lieu_day = ?, id_chat_lieu_kinh = ?, id_xuat_xu = ?, id_chat_lieu_vo = ?, id_mau_vo = ?, id_mau_mat = ?, ghi_chu = ?\n"
                + "where id = ?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, sp.getMaSanPham());
            pstm.setObject(2, sp.getThuongHieu().getId());
            pstm.setString(3, sp.getMaHangHoa());
            pstm.setBigDecimal(4, sp.getGiaNhap());
            pstm.setBigDecimal(5, sp.getDonGia());
            pstm.setInt(6, sp.getSoLuongTon());
            pstm.setString(7, sp.getHinhAnh());
            pstm.setString(8, sp.getDoiTuongSuDung());
            pstm.setString(9, sp.getDongSanPham());
            pstm.setInt(10, sp.getKhangNuoc());
            pstm.setInt(11, sp.getKhoangTruCot());
            pstm.setFloat(12, sp.getSizeMat());
            pstm.setString(13, sp.getHinhDang());
            pstm.setFloat(14, sp.getDoDay());
            pstm.setObject(15, (sp.getDongMay() == null || sp.getDongMay().getId() == 0) ? null : sp.getDongMay().getId());
            pstm.setObject(16, (sp.getChatLieuDay() == null || sp.getChatLieuDay().getId() == 0) ? null : sp.getChatLieuDay().getId());
            pstm.setObject(17, (sp.getChatLieuKinh() == null || sp.getChatLieuKinh().getId() == 0) ? null : sp.getChatLieuKinh().getId());
            pstm.setObject(18, (sp.getXuatXu() == null || sp.getXuatXu().getId() == 0) ? null : sp.getXuatXu().getId());
            pstm.setObject(19, (sp.getChatLieuVo() == null || sp.getChatLieuVo().getId() == 0) ? null : sp.getChatLieuVo().getId());
            pstm.setObject(20, (sp.getMauVo() == null || sp.getMauVo().getId() == 0) ? null : sp.getMauVo().getId());
            pstm.setObject(21, (sp.getMauMat() == null || sp.getMauMat().getId() == 0) ? null : sp.getMauMat().getId());
            pstm.setString(22, sp.getGhiChu());
            pstm.setInt(23, idSanPham);
            checkUpdate = pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return checkUpdate > 0;
    }

    @Override
    public boolean updateSoLuong(Integer id, int soLuong) {
        int checkUpdate = 0;
        String query = "update SanPham set so_luong_ton = ? where id = ?;";
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, soLuong);
            ps.setObject(2, id);
            checkUpdate = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return checkUpdate > 0;
    }

    @Override
    public boolean updateAStatus(int trangThai, int idSanPham) {
        int checkUpdate = 0;
        String sql = "update SanPham set trang_thai = ? where id = ?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, trangThai);
            pstm.setInt(2, idSanPham);
            checkUpdate = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return checkUpdate > 0;
    }

    @Override
    public void updateStatuses(int trangThai, List<Integer> listID) {
        int results[];
        String sql = "update SanPham set trang_thai = ? where id = ?;";
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
    public int getRecordCount() {
        int count = 0;
        String sql = "select COUNT(*) from SanPham";
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
    public List<SanPham> findByNameOrMa(int page, int pageSize, String name, int trangThai) {
        List<SanPham> list = new ArrayList<>();

        String sql = "select sp.id, sp.ma_san_pham, id_thuong_hieu, th.ten_thuong_hieu, sp.ma_hang_hoa\n"
                + "     , sp.gia_nhap, sp.don_gia, sp.so_luong_ton, sp.hinh_anh, sp.doi_tuong_su_dung\n"
                + "     , sp.dong_san_pham, sp.khang_nuoc, sp.khoang_tru_cot, sp.size_mat\n"
                + "     , sp.hinh_dang, sp.do_day, sp.id_dong_may, dm.ten_dong_may, sp.id_chat_lieu_day\n"
                + "     , cld.ten_chat_lieu_day, sp.id_chat_lieu_kinh, clk.ten_chat_lieu_kinh\n"
                + "     , sp.id_xuat_xu, xx.noi_xuat_xu, sp.id_chat_lieu_vo, clv.ten_chat_lieu_vo\n"
                + "     , sp.id_mau_vo, mv.ten_mau as mau_vo, sp.id_mau_mat, mm.ten_mau as mau_mat, sp.ghi_chu, sp.trang_thai\n"
                + "from SanPham sp \n"
                + "     left join ThuongHieu th on sp.id_thuong_hieu = th.id\n"
                + "     left join DongMay dm on sp.id_dong_may = dm.id\n"
                + "     left join ChatLieuDay cld on sp.id_chat_lieu_day = cld.id\n"
                + "     left join ChatLieuKinh clk on sp.id_chat_lieu_kinh = clk.id\n"
                + "     left join ChatLieuVo clv on sp.id_chat_lieu_vo = clv.id\n"
                + "     left join XuatXu xx on sp.id_xuat_xu = xx.id\n"
                + "     left join Mau mv on sp.id_mau_vo = mv.id\n"
                + "     left join Mau mm on sp.id_mau_mat = mm.id\n"
                + "where sp.ma_san_pham like '%" + name + "%' or sp.ma_hang_hoa like '%" + name + "%' or th.ten_thuong_hieu like '%" + name + "%' and sp.trang_thai = ?\n"
                + "order by sp.id\n"
                + "offset ? rows\n"
                + "fetch next ? rows only;";

        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, trangThai);
            pstm.setInt(2, (page - 1) * pageSize);
            pstm.setInt(3, pageSize);
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
                                rs.getString("mau_vo")),
                        new Mau(rs.getInt("id_mau_mat"),
                                rs.getString("mau_mat")),
                        rs.getString("ghi_chu"),
                        rs.getInt("trang_thai"));
                list.add(sp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public SanPham findByMa(String ma) {
        SanPham sp = null;
        String sql = "select id from SanPham where ma_san_pham = ?";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, ma);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                sp = new SanPham();
                sp.setId(rs.getInt("id"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return sp;
    }

    @Override
    public List<SanPham> filter(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getRecordCountByTrangThai(int trangThai) {
        int count = 0;
        String sql = "select COUNT(*) from SanPham where trang_thai = ?";
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
    public List<SanPhamBanHangViewModel> getAllSanPhamBanHang(int page, int pageSize, int trangThai) {
        List<SanPhamBanHangViewModel> list = new ArrayList<>();
        String sql = "select sp.id, sp.hinh_anh, sp.ma_san_pham, th.ten_thuong_hieu, sp.ma_hang_hoa, sp.don_gia, sp.so_luong_ton,\n"
                + "	case\n"
                + "        when ctkm.hinh_thuc_giam_gia = N'Phần trăm' then (sp.don_gia * (1 -  CAST(ctkm.gia_tri_giam AS decimal(10, 0))/100))\n"
                + "        when ctkm.hinh_thuc_giam_gia = N'Tiền mặt' then sp.don_gia - ctkm.gia_tri_giam\n"
                + "        else sp.don_gia\n"
                + "    end as gia_khuyen_mai\n"
                + "from SanPham sp\n"
                + "	left join ThuongHieu th on sp.id_thuong_hieu = th.id\n"
                + "	left join SanPhamKhuyenMai spkm on sp.id = spkm.id_san_pham\n"
                + "	left join ChuongTrinhKhuyenMai ctkm on spkm.id_chuong_trinh_khuyen_mai = ctkm.id\n"
                + "where sp.trang_thai = ?\n"
                + "order by sp.id\n"
                + "offset ? rows\n"
                + "fetch next ? rows only;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, trangThai);
            pstm.setInt(2, (page - 1) * pageSize);
            pstm.setInt(3, pageSize);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                SanPhamBanHangViewModel sanPhamBanHang = new SanPhamBanHangViewModel();
                sanPhamBanHang.setId(rs.getInt("id"));
                sanPhamBanHang.setMaSanPham(rs.getString("ma_san_pham"));
                sanPhamBanHang.setTenSanPham(rs.getString("ten_thuong_hieu") + " " + rs.getString("ma_hang_hoa"));
                sanPhamBanHang.setSoLuong(rs.getInt("so_luong_ton"));
                sanPhamBanHang.setDonGia(rs.getBigDecimal("don_gia"));
                sanPhamBanHang.setGiaKhuyenMai(rs.getBigDecimal("gia_khuyen_mai"));
                sanPhamBanHang.setHinhAnh(rs.getString("hinh_anh"));
                list.add(sanPhamBanHang);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<SanPhamBanHangViewModel> findByNameOrMaSanPhamBanHang(int page, int pageSize, String name, int trangThai) {
        List<SanPhamBanHangViewModel> list = new ArrayList<>();
        String sql = "select sp.id, sp.hinh_anh, sp.ma_san_pham, th.ten_thuong_hieu, sp.ma_hang_hoa, sp.don_gia, sp.so_luong_ton,\n"
                + "	case\n"
                + "        when ctkm.hinh_thuc_giam_gia = N'Phần trăm' then (sp.don_gia * (1 -  CAST(ctkm.gia_tri_giam AS decimal(10, 0))/100))\n"
                + "        when ctkm.hinh_thuc_giam_gia = N'Tiền mặt' then sp.don_gia - ctkm.gia_tri_giam\n"
                + "        else sp.don_gia\n"
                + "    end as gia_khuyen_mai\n"
                + "from SanPham sp\n"
                + "	left join ThuongHieu th on sp.id_thuong_hieu = th.id\n"
                + "	left join SanPhamKhuyenMai spkm on sp.id = spkm.id_san_pham\n"
                + "	left join ChuongTrinhKhuyenMai ctkm on spkm.id_chuong_trinh_khuyen_mai = ctkm.id\n"
                + "where sp.ma_san_pham like '%" + name + "%' or sp.ma_hang_hoa like '%" + name + "%' or th.ten_thuong_hieu like '%" + name + "%' and sp.trang_thai = ?\n"
                + "order by sp.id\n"
                + "offset ? rows\n"
                + "fetch next ? rows only;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, trangThai);
            pstm.setInt(2, (page - 1) * pageSize);
            pstm.setInt(3, pageSize);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                SanPhamBanHangViewModel sanPhamBanHang = new SanPhamBanHangViewModel();
                sanPhamBanHang.setId(rs.getInt("id"));
                sanPhamBanHang.setMaSanPham(rs.getString("ma_san_pham"));
                sanPhamBanHang.setTenSanPham(rs.getString("ten_thuong_hieu") + " " + rs.getString("ma_hang_hoa"));
                sanPhamBanHang.setSoLuong(rs.getInt("so_luong_ton"));
                sanPhamBanHang.setDonGia(rs.getBigDecimal("don_gia"));
                sanPhamBanHang.setGiaKhuyenMai(rs.getBigDecimal("gia_khuyen_mai"));
                sanPhamBanHang.setHinhAnh(rs.getString("hinh_anh"));
                list.add(sanPhamBanHang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public SanPhamBanHangViewModel getOne(int id) {
        SanPhamBanHangViewModel sanPhamBanHang = null;

        String sql = "select sp.id, sp.hinh_anh, sp.ma_san_pham, th.ten_thuong_hieu, sp.ma_hang_hoa, sp.don_gia, sp.so_luong_ton,\n"
                + "	case\n"
                + "        when ctkm.hinh_thuc_giam_gia = N'Phần trăm' then (sp.don_gia * (1 -  CAST(ctkm.gia_tri_giam AS decimal(10, 0))/100))\n"
                + "        when ctkm.hinh_thuc_giam_gia = N'Tiền mặt' then sp.don_gia - ctkm.gia_tri_giam\n"
                + "        else sp.don_gia\n"
                + "    end as gia_khuyen_mai\n"
                + "from SanPham sp\n"
                + "	left join ThuongHieu th on sp.id_thuong_hieu = th.id\n"
                + "	left join SanPhamKhuyenMai spkm on sp.id = spkm.id_san_pham\n"
                + "	left join ChuongTrinhKhuyenMai ctkm on spkm.id_chuong_trinh_khuyen_mai = ctkm.id\n"
                + "where sp.id = ?";

        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                sanPhamBanHang = new SanPhamBanHangViewModel();
                sanPhamBanHang.setId(rs.getInt("id"));
                sanPhamBanHang.setMaSanPham(rs.getString("ma_san_pham"));
                sanPhamBanHang.setTenSanPham(rs.getString("ten_thuong_hieu") + " " + rs.getString("ma_hang_hoa"));
                sanPhamBanHang.setSoLuong(rs.getInt("so_luong_ton"));
                sanPhamBanHang.setDonGia(rs.getBigDecimal("don_gia"));
                sanPhamBanHang.setGiaKhuyenMai(rs.getBigDecimal("gia_khuyen_mai"));
                sanPhamBanHang.setHinhAnh(rs.getString("hinh_anh"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sanPhamBanHang;
    }

    @Override
    public SanPhamBanHangViewModel findByMaHangHoa(String maHangHoa) {
        SanPhamBanHangViewModel sanPhamBanHang = null;

        String sql = "select sp.id, sp.hinh_anh, sp.ma_san_pham, th.ten_thuong_hieu, sp.ma_hang_hoa, sp.don_gia, sp.so_luong_ton,\n"
                + "	case\n"
                + "        when ctkm.hinh_thuc_giam_gia = N'Phần trăm' then (sp.don_gia * (1 -  CAST(ctkm.gia_tri_giam AS decimal(10, 0))/100))\n"
                + "        when ctkm.hinh_thuc_giam_gia = N'Tiền mặt' then sp.don_gia - ctkm.gia_tri_giam\n"
                + "        else sp.don_gia\n"
                + "    end as gia_khuyen_mai\n"
                + "from SanPham sp\n"
                + "	left join ThuongHieu th on sp.id_thuong_hieu = th.id\n"
                + "	left join SanPhamKhuyenMai spkm on sp.id = spkm.id_san_pham\n"
                + "	left join ChuongTrinhKhuyenMai ctkm on spkm.id_chuong_trinh_khuyen_mai = ctkm.id\n"
                + "where sp.ma_hang_hoa = ?";

        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, maHangHoa);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                sanPhamBanHang = new SanPhamBanHangViewModel();
                sanPhamBanHang.setId(rs.getInt("id"));
                sanPhamBanHang.setMaSanPham(rs.getString("ma_san_pham"));
                sanPhamBanHang.setTenSanPham(rs.getString("ten_thuong_hieu") + " " + rs.getString("ma_hang_hoa"));
                sanPhamBanHang.setSoLuong(rs.getInt("so_luong_ton"));
                sanPhamBanHang.setDonGia(rs.getBigDecimal("don_gia"));
                sanPhamBanHang.setGiaKhuyenMai(rs.getBigDecimal("gia_khuyen_mai"));
                sanPhamBanHang.setHinhAnh(rs.getString("hinh_anh"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sanPhamBanHang;
    }

}
