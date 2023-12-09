/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl;

import com.wstore.domainmodels.HoaDon;
import com.wstore.repositories.IHoaDonRepository;
import com.wstore.repositories.impl.HoaDonRepository;
import com.wstore.services.IHoaDonService;
import com.wstore.viewmodels.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author ducan
 */
public class HoaDonService implements IHoaDonService {

    private final IHoaDonRepository hoaDonRepository = new HoaDonRepository();

    @Override
    public List<HoaDonViewModel> getAll(int page, int pageSize) {
        return hoaDonRepository.getAll(page, pageSize);
    }

    @Override
    public List<HoaDonViewModel> getAllByTrangThai(int page, int pageSize, int trangThai) {
        return hoaDonRepository.getAllByTrangThai(page, pageSize, trangThai);
    }

    @Override
    public int getCountRecord() {
        return hoaDonRepository.getCountRecord();
    }

    @Override
    public int getCountRecordByTrangThai(int trangThai) {
        return hoaDonRepository.getCountRecordByTrangThai(trangThai);
    }

    @Override
    public boolean insert(HoaDon hd) {
        return hoaDonRepository.insert(hd);
    }

    @Override
    public boolean update(HoaDon hd, int id) {
        return hoaDonRepository.update(hd, id);
    }

    @Override
    public HoaDonViewModel getOne(String maHD) {
        return hoaDonRepository.getOne(maHD);
    }

    @Override
    public List<HoaDonViewModel> findByMaHD(int page, int pageSize, String maHD) {
        return hoaDonRepository.findByMa(page, pageSize, maHD);
    }

    @Override
    public List<HoaDonViewModel> filterHoaDonByNgayTao(int page, int pageSize, String tuNgay, String denNgay) {
        return hoaDonRepository.filterHoaDonByNgayTao(page, pageSize, tuNgay, denNgay);
    }

    @Override
    public int getSoHoaDonTrongNgay(String ngay) {
        return hoaDonRepository.getSoHoaDonTrongNgay(ngay);
    }

}
