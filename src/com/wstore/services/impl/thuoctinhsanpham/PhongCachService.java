/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.PhongCachRepository;
import com.wstore.services.IThuocTinhSanPhamService;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.PhongCachView;
import java.util.List;

/**
 *
 * @author ducan
 */
public class PhongCachService implements IThuocTinhSanPhamService<PhongCachView> {

    private final IThuocTinhSanPhamRepository phongcahRepository 
            = new PhongCachRepository();

    @Override
    public List<PhongCachView> getAll() {
        return phongcahRepository.getAll();
    }

    @Override
    public boolean insert(PhongCachView pc) {
        return phongcahRepository.insert(pc);
    }

    @Override
    public boolean update(PhongCachView pc, int id) {
        return phongcahRepository.update(pc, id);
    }

    @Override
    public boolean updateHienThi(PhongCachView pc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
