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

    String insert(SanPham sp);

    String update(SanPham sp, int idSanPham);
    
    List<SanPham> findByNameOrMa(int page, int pageSize, int trangThai, String name);
    
    int getRecordCount();
}
