/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl;

import com.wstore.domainmodels.KhachHang;
import com.wstore.repositories.IKhachHangRepository;
import com.wstore.repositories.impl.KhachHangRepository;
import com.wstore.services.IKhachHangService;
import com.wstore.utilities.Helper;
import com.wstore.viewmodels.KhachHangViewModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ducan
 */
public class KhachHangService implements IKhachHangService {

    private IKhachHangRepository khachHangReposiory = new KhachHangRepository();

    @Override
    public List<KhachHangViewModel> getAll(int page, int pageSize, int trangThai) {
        List<KhachHang> listKH = khachHangReposiory.getAll(page, pageSize, trangThai);

        List<KhachHangViewModel> listKHView = new ArrayList<>();
        for (KhachHang kh : listKH) {
            KhachHangViewModel KhView = new KhachHangViewModel();
            KhView.setId(kh.getId());
            KhView.setMaKhachHang(kh.getMaKhachHang());
            KhView.setHoTen(kh.getHoTen());
            KhView.setGioiTinh(kh.getGioiTinh());
            KhView.setNgaySinh(kh.getNgaySinh() == null ? null : Helper.sdfNgayThangNam.format(kh.getNgaySinh()));
            KhView.setSoDienThoai(kh.getSoDienThoai());
            KhView.setEmail(kh.getEmail());
            KhView.setDiaChi(kh.getDiaChi());
            KhView.setHinhAnh(kh.getHinhAnh());
            KhView.setNgayTao(kh.getNgayTao() == null ? null : Helper.sdfNgayThangThoiGian.format(kh.getNgayTao()));
            KhView.setGhiChu(kh.getGhiChu());
            KhView.setTrangThai(kh.getTrangThai());
            listKHView.add(KhView);
        }
        return listKHView;
    }

    @Override
    public boolean insert(KhachHang nv) {
        return khachHangReposiory.insert(nv);
    }

    @Override
    public boolean update(KhachHang kh, int id) {
        return khachHangReposiory.update(kh, id);
    }

    @Override
    public boolean updateStatus(int trangThai, int id) {
        return khachHangReposiory.updateStatus(trangThai, id);
    }

    @Override
    public void updatesSatus(int trangThai, List<Integer> listID) {
        khachHangReposiory.updatesStatus(trangThai, listID);
    }

    @Override
    public List<KhachHangViewModel> findByNameOrMaOrSDT(int page, int pageSize, int trangThai, String name) {
        List<KhachHang> listKH = khachHangReposiory.findByNameOrMaOrSDT(page, pageSize, trangThai, name);

        List<KhachHangViewModel> listKHView = new ArrayList<>();
        for (KhachHang kh : listKH) {
            KhachHangViewModel KhView = new KhachHangViewModel();
            KhView.setId(kh.getId());
            KhView.setMaKhachHang(kh.getMaKhachHang());
            KhView.setHoTen(kh.getHoTen());
            KhView.setGioiTinh(kh.getGioiTinh());
            KhView.setNgaySinh(kh.getNgaySinh() == null ? null : Helper.sdfNgayThangNam.format(kh.getNgaySinh()));
            KhView.setSoDienThoai(kh.getSoDienThoai());
            KhView.setEmail(kh.getEmail());
            KhView.setDiaChi(kh.getDiaChi());
            KhView.setHinhAnh(kh.getHinhAnh());
            KhView.setNgayTao(kh.getNgayTao() == null ? null : Helper.sdfNgayThangThoiGian.format(kh.getNgayTao()));
            KhView.setGhiChu(kh.getGhiChu());
            KhView.setTrangThai(kh.getTrangThai());
            listKHView.add(KhView);
        }
        return listKHView;
    }

    @Override
    public int getCountRecordByTrangThai(int trangThai) {
        return khachHangReposiory.getCountRecordByTrangThai(trangThai);
    }

    @Override
    public String getMaKhachHangTuDongSinh() {
        int count = khachHangReposiory.getCountRecord();
        String maSanPham = String.format(
                "KH%06d", count + 1);
        return maSanPham;
    }

}
