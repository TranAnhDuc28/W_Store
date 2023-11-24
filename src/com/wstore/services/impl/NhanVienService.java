/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl;

import com.wstore.domainmodels.NhanVien;
import com.wstore.repositories.INhanVienRepository;
import com.wstore.repositories.impl.NhanVienRepository;
import com.wstore.services.INhanVienService;
import com.wstore.viewmodels.QLsanpham.NhanVienViewModel;
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
                    nv.getGioiTinh(),
                    nv.getNgaySinh(),
                    nv.getCanCuocCongDan(),
                    nv.getDiaChi(),
                    nv.getSoDienThoai(),
                    nv.getEmail(),
                    nv.getVaiTro(),
                    nv.getNgayTao(),
                    nv.getHinhAnh(),
                    nv.getGhiChu(),
                    nv.getTrangThai());
            listNVView.add(nvView);
        }
        return listNVView;
    }

    @Override
    public boolean insert(NhanVien obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(NhanVien obj, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateStatus(int trangThai, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhanVien findByMa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<NhanVien> findByNameOrMa(int page, int pageSize, int trangThai, String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getCountRecord(int trangThai) {
        return nhanVienRepository.getCountRecord(trangThai);
    }

    @Override
    public boolean updatePassword(String newPassword, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
