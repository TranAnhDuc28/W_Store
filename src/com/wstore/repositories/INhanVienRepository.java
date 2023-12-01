/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.repositories;

import com.wstore.domainmodels.NhanVien;
import java.util.List;

/**
 *
 * @author ducan
 */
public interface INhanVienRepository {

    List<NhanVien> getAll(int page, int pageSize, int trangThai);

    boolean insert(NhanVien nv);

    boolean update(NhanVien nv, int id);

    boolean updateStatus(int trangThai, int id);

    void updatesSatus(int trangThai, List<Integer> listID);

    NhanVien findByMa(String ma);

    List<NhanVien> findByNameOrMa(int page, int pageSize, int trangThai, String name);

    int getCountRecord(int trangThai);

    boolean updatePassword(String newPassword, int id);
}
