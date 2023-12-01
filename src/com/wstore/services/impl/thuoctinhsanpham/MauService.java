/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.MauRepository;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.MauViewModel;
import java.util.List;
import com.wstore.services.IThuocTinhSanPhamService;

/**
 *
 * @author ducan
 */
public class MauService implements IThuocTinhSanPhamService<MauViewModel> {

    private final IThuocTinhSanPhamRepository mauRepository
            = new MauRepository();

    @Override
    public List<MauViewModel> getAll() {
        return mauRepository.getAll();
    }

    @Override
    public boolean insert(MauViewModel m) {
        return mauRepository.insert(m);
    }

    @Override
    public boolean update(MauViewModel m, int id) {
        return mauRepository.update(m, id);
    }


    @Override
    public List<MauViewModel> getAllByTrangThai(boolean trangThai) {
        return mauRepository.getAllByTrangThai(trangThai);
    }

    @Override
    public void updatesHienThi(List<MauViewModel> list) {
        mauRepository.updatesHienThi(list);
    }

}
