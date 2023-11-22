/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.domainmodels.thuoctinhsanpham.PhongCachSanPham;
import com.wstore.repositories.IPhongCachSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.PhongCachSanPhamReporitory;
import com.wstore.services.IPhongCachSanPhamService;
import java.util.Set;

/**
 *
 * @author ducan
 */
public class PhongCachSanPhamService implements IPhongCachSanPhamService{
    
    private IPhongCachSanPhamRepository phongCachSanPhamService
            = new PhongCachSanPhamReporitory();
    
    @Override
    public Set<PhongCachSanPham> getAllByIdSanPham(int idSanPham) {
        return phongCachSanPhamService.getAllByIdSanPham(idSanPham);
    }

    @Override
    public boolean insert(PhongCachSanPham pcsp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int idSanPham) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
