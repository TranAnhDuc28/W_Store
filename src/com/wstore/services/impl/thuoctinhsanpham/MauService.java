/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.MauRepository;
import com.wstore.services.IThuocTinhSanPhamService;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.MauView;
import java.util.List;

/**
 *
 * @author ducan
 */
public class MauService implements IThuocTinhSanPhamService<MauView> {

    private final IThuocTinhSanPhamRepository mauRepository 
            = new MauRepository();

    @Override
    public List<MauView> getAll() {
        return mauRepository.getAll();
    }

    @Override
    public boolean insert(MauView m) {
        return mauRepository.insert(m);
    }

    @Override
    public boolean update(MauView m, int id) {
        return mauRepository.update(m, id);
    }

    @Override
    public boolean updateHienThi(MauView m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
