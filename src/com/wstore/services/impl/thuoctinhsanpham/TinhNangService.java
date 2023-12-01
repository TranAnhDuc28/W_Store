/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.TinhNangRepository;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.TinhNangViewModel;
import java.util.List;
import com.wstore.services.IThuocTinhSanPhamService;

/**
 *
 * @author ducan
 */
public class TinhNangService implements IThuocTinhSanPhamService<TinhNangViewModel> {

    private final IThuocTinhSanPhamRepository tinhNangRepository
            = new TinhNangRepository();

    @Override
    public List<TinhNangViewModel> getAll() {
        return tinhNangRepository.getAll();
    }

    @Override
    public boolean insert(TinhNangViewModel tn) {
        return tinhNangRepository.insert(tn);
    }

    @Override
    public boolean update(TinhNangViewModel tn, int id) {
        return tinhNangRepository.update(tn, id);
    }

    @Override
    public List<TinhNangViewModel> getAllByTrangThai(boolean trangThai) {
        return tinhNangRepository.getAllByTrangThai(trangThai);
    }

    @Override
    public void updatesHienThi(List<TinhNangViewModel> list) {
        tinhNangRepository.updatesHienThi(list);
    }

}
