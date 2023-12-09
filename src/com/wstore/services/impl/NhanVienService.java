/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl;

import com.wstore.domainmodels.NhanVien;
import com.wstore.repositories.INhanVienRepository;
import com.wstore.repositories.impl.NhanVienRepository;
import com.wstore.services.INhanVienService;
import com.wstore.utilities.Helper;
import com.wstore.viewmodels.NhanVienViewModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ducan
 */
public class NhanVienService implements INhanVienService {

    private INhanVienRepository nhanVienRepository = new NhanVienRepository();

    @Override
    public List<NhanVienViewModel> getAll(int page, int pageSize, int trangThai) {
        List<NhanVien> listNV = nhanVienRepository.getAll(page, pageSize, trangThai);

        List<NhanVienViewModel> listNVView = new ArrayList<>();
        for (NhanVien nv : listNV) {
            NhanVienViewModel nvView = new NhanVienViewModel(
                    nv.getId(),
                    nv.getMaNhanVien(),
                    nv.getMatKhau(),
                    nv.getHoTen(),
                    nv.getGioiTinh() ? "Nam" : "Nữ",
                    Helper.sdfNgayThangNam.format(nv.getNgaySinh()),
                    nv.getCanCuocCongDan(),
                    nv.getDiaChi(),
                    nv.getSoDienThoai(),
                    nv.getEmail(),
                    nv.getVaiTro() == 0 ? "Nhân viên" : "Quản lý",
                    Helper.sdfNgayThangThoiGian.format(nv.getNgayTao()),
                    nv.getHinhAnh(),
                    nv.getGhiChu(),
                    nv.getTrangThai() == 0 ? "Đang làm việc" : "Đã nghỉ việc");
            listNVView.add(nvView);
        }
        return listNVView;
    }

    @Override
    public boolean insert(NhanVien nv) {
        return nhanVienRepository.insert(nv);
    }

    @Override
    public boolean update(NhanVien nv, int id) {
        return nhanVienRepository.update(nv, id);
    }

    @Override
    public NhanVien findByMa(String ma) {
        return nhanVienRepository.findByMa(ma);
    }

    @Override
    public List<NhanVienViewModel> findByNameOrMa(int page, int pageSize, int trangThai, String name) {
        List<NhanVien> listNV = nhanVienRepository.findByNameOrMa(page, pageSize, trangThai, name);

        List<NhanVienViewModel> listNVView = new ArrayList<>();
        for (NhanVien nv : listNV) {
            NhanVienViewModel nvView = new NhanVienViewModel(
                    nv.getId(),
                    nv.getMaNhanVien(),
                    nv.getMatKhau(),
                    nv.getHoTen(),
                    nv.getGioiTinh() ? "Nam" : "Nữ",
                    Helper.sdfNgayThangNam.format(nv.getNgaySinh()),
                    nv.getCanCuocCongDan(),
                    nv.getDiaChi(),
                    nv.getSoDienThoai(),
                    nv.getEmail(),
                    nv.getVaiTro() == 0 ? "Nhân viên" : "Quản lý",
                    Helper.sdfNgayThangThoiGian.format(nv.getNgayTao()),
                    nv.getHinhAnh(),
                    nv.getGhiChu(),
                    nv.getTrangThai() == 0 ? "Đang làm việc" : "Đã nghỉ việc");
            listNVView.add(nvView);
        }
        return listNVView;
    }

    @Override
    public int getCountRecord(int trangThai) {
        return nhanVienRepository.getCountRecord(trangThai);
    }

    @Override
    public boolean updatePassword(String newPassword, int id) {
        return nhanVienRepository.updatePassword(newPassword, id);
    }

    @Override
    public boolean updateStatusOfAnStaff(int trangThai, int id) {
        return nhanVienRepository.updateStatus(trangThai, id);
    }

    @Override
    public void updateSatusOfStaffs(int trangThai, List<Integer> listID) {
        nhanVienRepository.updatesSatus(trangThai, listID);
    }

}
