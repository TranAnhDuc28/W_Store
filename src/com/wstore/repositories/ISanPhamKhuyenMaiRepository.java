/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.repositories;

import com.wstore.domainmodels.SanPhamKhuyenMai;

/**
 *
 * @author ducan
 */
public interface ISanPhamKhuyenMaiRepository {
    
    void insert(SanPhamKhuyenMai spkm);
    
    void delete(SanPhamKhuyenMai spkm);
}
