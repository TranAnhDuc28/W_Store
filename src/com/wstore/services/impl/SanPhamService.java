/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl;

import com.wstore.domainmodels.SanPham;
import com.wstore.domainmodels.thuoctinhsanpham.ChatLieuDay;
import com.wstore.domainmodels.thuoctinhsanpham.ChatLieuKinh;
import com.wstore.domainmodels.thuoctinhsanpham.ChatLieuVo;
import com.wstore.domainmodels.thuoctinhsanpham.DongMay;
import com.wstore.domainmodels.thuoctinhsanpham.Mau;
import com.wstore.domainmodels.thuoctinhsanpham.ThuongHieu;
import com.wstore.domainmodels.thuoctinhsanpham.XuatXu;
import com.wstore.repositories.ISanPhamRepository;
import com.wstore.repositories.impl.SanPhamRepository;
import com.wstore.services.ISanPhamService;
import com.wstore.viewmodels.QLsanpham.SanPhamView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ducan
 */
public class SanPhamService implements ISanPhamService {

    private ISanPhamRepository sanPhamRepository = new SanPhamRepository();

    @Override
    public List<SanPhamView> getAll(int page, int pageSize) {
        List<SanPham> listSanPham = sanPhamRepository.getAll(1, 1);

        List<SanPhamView> listSanPhamView = new ArrayList<>();
        for (SanPham sanPham : listSanPham) {
            SanPhamView sanPhamView = new SanPhamView(
                    sanPham.getId(),
                    sanPham.getMaSanPham(),
                    new ThuongHieu(sanPham.getThuongHieu().getId(), sanPham.getThuongHieu().getTenThuongHieu()),
                    sanPham.getMaHangHoa(),
                    sanPham.getGiaNhap(),
                    sanPham.getDonGia(),
                    sanPham.getSoLuongTon(),
                    sanPham.getHinhAnh(),
                    sanPham.getDoiTuongSuDung(),
                    sanPham.getDongSanPham(),
                    sanPham.getKhangNuoc(),
                    sanPham.getKhangNuoc(),
                    sanPham.getSizeMat(),
                    sanPham.getHinhDang(),
                    sanPham.getDoDay(),
                    new DongMay(sanPham.getDongMay().getId(), sanPham.getDongMay().getTenDongMay()),
                    new ChatLieuDay(sanPham.getChatLieuDay().getId(), sanPham.getChatLieuDay().getTenChatLieuDay()),
                    new ChatLieuKinh(sanPham.getChatLieuKinh().getId(), sanPham.getChatLieuKinh().getTenChatLieuKinh()),
                    new XuatXu(sanPham.getXuatXu().getId(), sanPham.getXuatXu().getNoiXuatXu()),
                    new ChatLieuVo(sanPham.getChatLieuVo().getId(), sanPham.getChatLieuVo().getTenChatLieuVo()),
                    new Mau(sanPham.getMauVo().getId(), sanPham.getMauVo().getTenMau()),
                    new Mau(sanPham.getMauMat().getId(), sanPham.getMauMat().getTenMau()),
                    sanPham.getTrangThai());
            listSanPhamView.add(sanPhamView);
        }
        return listSanPhamView;
    }

    @Override
    public String insert(SanPham sp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String update(SanPham sp, int idSanPham) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<SanPham> findByNameOrMa(int page, int pageSize, int trangThai, String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getRecordCount(int trangThai) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
