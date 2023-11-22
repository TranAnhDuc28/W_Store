/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.XuatXuRepository;
import com.wstore.services.IThuocTinhSanPhamService;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.XuatXuViewModel;
import java.util.List;

/**
 *
 * @author ducan
 */
public class XuatXuService implements IThuocTinhSanPhamService<XuatXuViewModel>{
    
    private final IThuocTinhSanPhamRepository xuatXuService 
            = new XuatXuRepository();
    
    @Override
    public List<XuatXuViewModel> getAll() {
        return xuatXuService.getAll();
    }

    @Override
    public boolean insert(XuatXuViewModel xx) {
        return xuatXuService.insert(xx);
    }

    @Override
    public boolean update(XuatXuViewModel xx, int id) {
        return xuatXuService.update(xx, id);
    }

    @Override
    public boolean updateHienThi(XuatXuViewModel obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
