/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.TinhNangRepository;
import com.wstore.services.IThuocTinhSanPhamService;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.TinhNangView;
import java.util.List;

/**
 *
 * @author ducan
 */
public class TinhNangService implements IThuocTinhSanPhamService<TinhNangView> {

    private final IThuocTinhSanPhamRepository tinhSanPhamRepository 
            = new TinhNangRepository();

    @Override
    public List<TinhNangView> getAll() {
        return tinhSanPhamRepository.getAll();
    }

    @Override
    public boolean insert(TinhNangView tn) {
        return tinhSanPhamRepository.insert(tn);
    }

    @Override
    public boolean updateHienThi(TinhNangView tn) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(TinhNangView tn, int id) {
        return tinhSanPhamRepository.update(tn, id);
    }

}
