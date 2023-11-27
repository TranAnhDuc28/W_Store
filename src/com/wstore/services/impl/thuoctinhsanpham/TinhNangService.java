/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.TinhNangRepository;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.TinhNangViewModel;
import java.util.List;
import com.wstore.services.IQLThuocTinhSanPhamService;

/**
 *
 * @author ducan
 */
public class TinhNangService implements IQLThuocTinhSanPhamService<TinhNangViewModel> {

    private final IThuocTinhSanPhamRepository tinhSanPhamRepository 
            = new TinhNangRepository();

    @Override
    public List<TinhNangViewModel> getAll() {
        return tinhSanPhamRepository.getAll();
    }

    @Override
    public boolean insert(TinhNangViewModel tn) {
        return tinhSanPhamRepository.insert(tn);
    }

    @Override
    public boolean updateHienThi(TinhNangViewModel tn) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(TinhNangViewModel tn, int id) {
        return tinhSanPhamRepository.update(tn, id);
    }

}
