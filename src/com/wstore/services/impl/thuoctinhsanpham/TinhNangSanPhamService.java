/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.domainmodels.thuoctinhsanpham.TinhNangSanPham;
import com.wstore.repositories.ITinhNangSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.TinhNangSanPhamRepository;
import com.wstore.services.ITinhNangSanPhamService;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.TinhNangViewModel;
import java.util.Set;

/**
 *
 * @author ducan
 */
public class TinhNangSanPhamService implements ITinhNangSanPhamService{
    
    private ITinhNangSanPhamRepository tinhNangSanPhamRepository 
            = new TinhNangSanPhamRepository();
    
    @Override
    public Set<TinhNangViewModel> getAllByIdSanPham(int idSanPham) {
        return tinhNangSanPhamRepository.getAllByIdSanPham(idSanPham);
    }

    @Override
    public boolean insert(TinhNangSanPham tnsp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int idSanPham) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
