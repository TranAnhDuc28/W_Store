/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.ThuongHieuRepository;
import com.wstore.services.IThuocTinhSanPhamService;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ThuongHieuView;
import java.util.List;

/**
 *
 * @author ducan
 */
public class ThuongHieuService implements IThuocTinhSanPhamService<ThuongHieuView> {

    private final IThuocTinhSanPhamRepository thuongHieuRepository
            = new ThuongHieuRepository();

    @Override
    public List<ThuongHieuView> getAll() {
        return thuongHieuRepository.getAll();
    }

    @Override
    public boolean insert(ThuongHieuView th) {
        return thuongHieuRepository.insert(th);
    }

    @Override
    public boolean update(ThuongHieuView th, int id) {
        return thuongHieuRepository.update(th, id);
    }

    @Override
    public boolean updateHienThi(ThuongHieuView obj) {
        return thuongHieuRepository.updateHienThi(obj);
    }
}
