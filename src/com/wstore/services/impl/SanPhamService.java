/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl;

import com.wstore.domainmodels.SanPham;
import com.wstore.repositories.ISanPhamRepository;
import com.wstore.repositories.ITinhNangSanPhamRepository;
import com.wstore.repositories.impl.SanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.TinhNangSanPhamRepository;
import com.wstore.utilities.Helper;
import com.wstore.viewmodels.QLsanpham.SanPhamViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuDayViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuKinhViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuVoViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.DongMayViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.MauViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ThuongHieuViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.TinhNangViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.XuatXuViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import com.wstore.viewmodels.banhang.SanPhamBanHangViewModel;
import com.wstore.services.ISanPhamService;
import java.util.Map;

/**
 *
 * @author ducan
 */
public class SanPhamService implements ISanPhamService {

    private final ISanPhamRepository sanPhamRepository
            = new SanPhamRepository();
    private final ITinhNangSanPhamRepository tinhNangRepository
            = new TinhNangSanPhamRepository();

    @Override
    public List<SanPhamViewModel> getAll(int page, int pageSize, int trangThai) {
        List<SanPham> listSanPham = sanPhamRepository.getAllByTrangThai(page, pageSize, trangThai);

        List<SanPhamViewModel> listSanPhamView = new ArrayList<>();
        for (SanPham sanPham : listSanPham) {
            int idSanPham = sanPham.getId();
            Set<TinhNangViewModel> listTNSP = tinhNangRepository.getAllByIdSanPham(sanPham.getId());

            SanPhamViewModel sanPhamView = new SanPhamViewModel(
                    idSanPham,
                    sanPham.getMaSanPham(),
                    new ThuongHieuViewModel(
                            sanPham.getThuongHieu().getId(),
                            sanPham.getThuongHieu().getTenThuongHieu()),
                    sanPham.getMaHangHoa(),
                    sanPham.getGiaNhap(),
                    sanPham.getDonGia(),
                    sanPham.getSoLuongTon(),
                    sanPham.getHinhAnh(),
                    sanPham.getDoiTuongSuDung(),
                    sanPham.getDongSanPham(),
                    sanPham.getKhangNuoc(),
                    sanPham.getKhoangTruCot(),
                    sanPham.getSizeMat(),
                    sanPham.getHinhDang(),
                    sanPham.getDoDay(),
                    new DongMayViewModel(
                            sanPham.getDongMay().getId(),
                            sanPham.getDongMay().getTenDongMay()),
                    new ChatLieuDayViewModel(
                            sanPham.getChatLieuDay().getId(),
                            sanPham.getChatLieuDay().getTenChatLieuDay()),
                    new ChatLieuKinhViewModel(
                            sanPham.getChatLieuKinh().getId(),
                            sanPham.getChatLieuKinh().getTenChatLieuKinh()),
                    new XuatXuViewModel(
                            sanPham.getXuatXu().getId(),
                            sanPham.getXuatXu().getNoiXuatXu()),
                    new ChatLieuVoViewModel(
                            sanPham.getChatLieuVo().getId(),
                            sanPham.getChatLieuVo().getTenChatLieuVo()),
                    new MauViewModel(
                            sanPham.getMauVo().getId(),
                            sanPham.getMauVo().getTenMau()),
                    Helper.removeDauNgoacVuong(listTNSP.toString()),
                    new MauViewModel(
                            sanPham.getMauMat().getId(),
                            sanPham.getMauMat().getTenMau()),
                    sanPham.getGhiChu(),
                    sanPham.getTrangThai());
            listSanPhamView.add(sanPhamView);
        }
        return listSanPhamView;
    }

    @Override
    public boolean insert(SanPham sp) {
        return sanPhamRepository.insert(sp);
    }

    @Override
    public boolean update(SanPham sp, int idSanPham) {
        return sanPhamRepository.update(sp, idSanPham);
    }
    
    @Override
    public void updateSoLuong(Map<SanPhamBanHangViewModel, Integer> sanPham) {
        sanPham.forEach((sp, sl) -> {
            sanPhamRepository.updateSoLuong(sp.getId(), sl);
        });
    }

    @Override
    public List<SanPhamViewModel> findSPByNameOrMa(int page, int pageSize, String name, int trangThai) {
        List<SanPham> listSanPham = sanPhamRepository.findByNameOrMa(page, pageSize, name, trangThai);

        List<SanPhamViewModel> listSanPhamView = new ArrayList<>();
        for (SanPham sanPham : listSanPham) {
            int idSanPham = sanPham.getId();
            Set<TinhNangViewModel> listTNSP = tinhNangRepository.getAllByIdSanPham(sanPham.getId());

            SanPhamViewModel sanPhamView = new SanPhamViewModel(
                    idSanPham,
                    sanPham.getMaSanPham(),
                    new ThuongHieuViewModel(
                            sanPham.getThuongHieu().getId(),
                            sanPham.getThuongHieu().getTenThuongHieu()),
                    sanPham.getMaHangHoa(),
                    sanPham.getGiaNhap(),
                    sanPham.getDonGia(),
                    sanPham.getSoLuongTon(),
                    sanPham.getHinhAnh(),
                    sanPham.getDoiTuongSuDung(),
                    sanPham.getDongSanPham(),
                    sanPham.getKhangNuoc(),
                    sanPham.getKhoangTruCot(),
                    sanPham.getSizeMat(),
                    sanPham.getHinhDang(),
                    sanPham.getDoDay(),
                    new DongMayViewModel(
                            sanPham.getDongMay().getId(),
                            sanPham.getDongMay().getTenDongMay()),
                    new ChatLieuDayViewModel(
                            sanPham.getChatLieuDay().getId(),
                            sanPham.getChatLieuDay().getTenChatLieuDay()),
                    new ChatLieuKinhViewModel(
                            sanPham.getChatLieuKinh().getId(),
                            sanPham.getChatLieuKinh().getTenChatLieuKinh()),
                    new XuatXuViewModel(
                            sanPham.getXuatXu().getId(),
                            sanPham.getXuatXu().getNoiXuatXu()),
                    new ChatLieuVoViewModel(
                            sanPham.getChatLieuVo().getId(),
                            sanPham.getChatLieuVo().getTenChatLieuVo()),
                    new MauViewModel(
                            sanPham.getMauVo().getId(),
                            sanPham.getMauVo().getTenMau()),
                    Helper.removeDauNgoacVuong(listTNSP.toString()),
                    new MauViewModel(
                            sanPham.getMauMat().getId(),
                            sanPham.getMauMat().getTenMau()),
                    sanPham.getGhiChu(),
                    sanPham.getTrangThai());
            listSanPhamView.add(sanPhamView);
        }
        return listSanPhamView;
    }

    @Override
    public int getRecordCount() {
        return sanPhamRepository.getRecordCount();
    }

    @Override
    public String getMaSanPhamTuDongSinh() {
        int count = sanPhamRepository.getRecordCount();
        String maSanPham = String.format(
                "SP%06d", count + 1);
        return maSanPham;
    }

    @Override
    public SanPham findByMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateAStatus(int trangThai, int idSanPham) {
        return sanPhamRepository.updateAStatus(trangThai, idSanPham);
    }

    @Override
    public void updateStatuses(int trangThai, List<Integer> listID) {
        sanPhamRepository.updateStatuses(trangThai, listID);
    }

    @Override
    public int getRecordCountByTrangThai(int trangThai) {
        return sanPhamRepository.getRecordCountByTrangThai(trangThai);
    }

    @Override
    public List<SanPhamBanHangViewModel> getAllSanPhamBanHang(int page, int pageSize, int trangThai) {
        return sanPhamRepository.getAllSanPhamBanHang(page, pageSize, trangThai);
    }

    @Override
    public List<SanPhamBanHangViewModel> findSPBanHangByNameOrMa(int page, int pageSize, String name, int trangThai) {
        return sanPhamRepository.findByNameOrMaSanPhamBanHang(page, pageSize, name, trangThai);
    }

    @Override
    public SanPhamBanHangViewModel getOne(int id) {
        return sanPhamRepository.getOne(id);
    }

    @Override
    public SanPhamBanHangViewModel findByMaHangHoa(String maHangHoa) {
        return sanPhamRepository.findByMaHangHoa(maHangHoa);
    }
    
}
