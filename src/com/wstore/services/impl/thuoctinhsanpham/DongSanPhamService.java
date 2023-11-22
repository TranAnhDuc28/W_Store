/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.domainmodels.thuoctinhsanpham.DongSanPham;
import com.wstore.repositories.IDongSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.DongSanPhamRepository;
import com.wstore.services.IDongSanPhamService;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.DongSanPhamViewModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ducan
 */
public class DongSanPhamService implements IDongSanPhamService {

    private final IDongSanPhamRepository dongSanPhamRepository 
            = new DongSanPhamRepository();

    @Override
    public List<DongSanPhamViewModel> getAllByIDThuongHieu(int idThuongHieu) {
        List<DongSanPham> listDongSanPham = dongSanPhamRepository.getAllByIDThuongHieu(idThuongHieu);
        
        List<DongSanPhamViewModel> listDongSanPhamViewModel = new ArrayList<>();
        for (DongSanPham dsp : listDongSanPham) {
            DongSanPhamViewModel dongSanPhamViewModel = new DongSanPhamViewModel(
                    dsp.getId(), 
                    dsp.getTenDongSanPham(), 
                    dsp.getTrangThai());
            listDongSanPhamViewModel.add(dongSanPhamViewModel);
        }
        return listDongSanPhamViewModel;
    }

    @Override
    public List<DongSanPham> getAll() {
        return dongSanPhamRepository.getAll();
    }

    @Override
    public boolean insert(DongSanPham dsp) {
        return dongSanPhamRepository.insert(dsp);
    }

    @Override
    public boolean update(DongSanPham dsp, int id) {
        return dongSanPhamRepository.update(dsp, id);
    }

    @Override
    public boolean updateHienThi(DongSanPham dsp) {
        return dongSanPhamRepository.updateHienThi(dsp);
    }

}
