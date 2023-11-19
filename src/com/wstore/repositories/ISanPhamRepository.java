/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.repositories;

import com.wstore.domainmodels.SanPham;
import java.util.List;

/**
 *
 * @author ducan
 */
public interface ISanPhamRepository {
    
    List<SanPham> getAll(int page, int pageSize);
    
    boolean insert(SanPham sp);
    
    boolean update(SanPham sp, int idSanPham);
    
    boolean updateStatus(int trangThai, int idSanPham);
    
    int getRecordCount(int trangThai);
    
    List<SanPham> findByNameOrMa(int page, int pageSize, int trangThai, String name);
}
