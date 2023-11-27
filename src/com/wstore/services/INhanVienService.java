/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.services;

import com.wstore.domainmodels.NhanVien;
import com.wstore.viewmodels.NhanVienViewModel;
import java.util.List;

/**
 *
 * @author ducan
 */
public interface INhanVienService {
    
    List<NhanVienViewModel> getAll(int page, int pageSize, int trangThai);

    boolean insert(NhanVien nv);

    boolean update(NhanVien nv, int id);

    boolean updateStatusOfAnStaff(int trangThai, int id);
    
    void updateSatusOfStaffs(int trangThai, List<Integer> listID); 

    NhanVien findByMa(String ma);

    List<NhanVienViewModel> findByNameOrMa(int page, int pageSize, int trangThai, String name);

    int getCountRecord(int trangThai);

    boolean updatePassword(String newPassword, int id);
}
