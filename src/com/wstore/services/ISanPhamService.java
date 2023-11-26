/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.services;

import com.wstore.domainmodels.SanPham;
import com.wstore.viewmodels.QLsanpham.SanPhamViewModel;
import java.util.List;

/**
 *
 * @author ducan
 */
public interface ISanPhamService {

    List<SanPhamViewModel> getAll(int page, int pageSize);

    SanPham findByMa(String ma);

    boolean insert(SanPham sp);

    boolean update(SanPham sp, int idSanPham);

    boolean updateAStatus(int trangThai, int idSanPham);

    void updateStatuses(int trangThai, List<Integer> listID);

    List<SanPhamViewModel> findByNameOrMa(int page, int pageSize, String name);

    int getRecordCount();

    String getMaSanPhamTuDongSinh();
}
