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

    private final IThuocTinhSanPhamRepository phongcachRepository
            = new PhongCachRepository();

    @Override
    public List<PhongCachViewModel> getAll() {
        return phongcachRepository.getAll();
    }

    @Override
    public boolean insert(PhongCachViewModel pc) {
        return phongcachRepository.insert(pc);
    }

    @Override
    public boolean update(PhongCachViewModel pc, int id) {
        return phongcachRepository.update(pc, id);
    }


    @Override
    public List<PhongCachViewModel> getAllByTrangThai(boolean trangThai) {
        return phongcachRepository.getAllByTrangThai(trangThai);
    }

    @Override
    public void updatesHienThi(List<PhongCachViewModel> list) {
        phongcachRepository.updatesHienThi(list);
    }

}
