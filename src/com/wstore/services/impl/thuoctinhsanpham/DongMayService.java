/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.DongMayRepository;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.DongMayViewModel;
import java.util.List;
import com.wstore.services.IThuocTinhSanPhamService;

/**
 *
 * @author ducan
 */
public class DongMayService implements IThuocTinhSanPhamService<DongMayViewModel> {

    private final IThuocTinhSanPhamRepository dongMayRepository 
            = new DongMayRepository();

    @Override
    public List<DongMayViewModel> getAll() {
        return dongMayRepository.getAll();
    }

    @Override
    public boolean insert(DongMayViewModel dm) {
        return dongMayRepository.insert(dm);
    }

    @Override
    public boolean update(DongMayViewModel dm, int id) {
        return dongMayRepository.update(dm, id);
    }

    @Override
    public List<DongMayViewModel> getAllByTrangThai(boolean trangThai) {
        return dongMayRepository.getAllByTrangThai(trangThai);
    }

    @Override
    public void updatesHienThi(List<DongMayViewModel> list) {
        dongMayRepository.updatesHienThi(list);
    }
}
