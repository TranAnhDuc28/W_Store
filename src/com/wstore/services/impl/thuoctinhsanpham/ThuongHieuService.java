/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.ThuongHieuRepository;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ThuongHieuViewModel;
import java.util.List;
import com.wstore.services.IThuocTinhSanPhamService;

/**
 *
 * @author ducan
 */
public class ThuongHieuService implements IThuocTinhSanPhamService<ThuongHieuViewModel> {

    private final IThuocTinhSanPhamRepository thuongHieuRepository
            = new ThuongHieuRepository();

    @Override
    public List<ThuongHieuViewModel> getAll() {
        return thuongHieuRepository.getAll();
    }

    @Override
    public boolean insert(ThuongHieuViewModel th) {
        return thuongHieuRepository.insert(th);
    }

    @Override
    public boolean update(ThuongHieuViewModel th, int id) {
        return thuongHieuRepository.update(th, id);
    }

    @Override
    public List<ThuongHieuViewModel> getAllByTrangThai(boolean trangThai) {
        return thuongHieuRepository.getAllByTrangThai(trangThai);
    }

    @Override
    public void updatesHienThi(List<ThuongHieuViewModel> list) {
        thuongHieuRepository.updatesHienThi(list);
    }

}
