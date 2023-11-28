/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.PhongCachRepository;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.PhongCachViewModel;
import java.util.List;
import com.wstore.services.IThuocTinhSanPhamService;

/**
 *
 * @author ducan
 */
public class PhongCachService implements IThuocTinhSanPhamService<PhongCachViewModel> {

    private final IThuocTinhSanPhamRepository phongcahRepository 
            = new PhongCachRepository();

    @Override
    public List<PhongCachViewModel> getAll() {
        return phongcahRepository.getAll();
    }

    @Override
    public boolean insert(PhongCachViewModel pc) {
        return phongcahRepository.insert(pc);
    }

    @Override
    public boolean update(PhongCachViewModel pc, int id) {
        return phongcahRepository.update(pc, id);
    }

    @Override
    public boolean updateHienThi(PhongCachViewModel pc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
