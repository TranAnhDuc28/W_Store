/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.repositories;

import com.wstore.domainmodels.HoaDon;
import com.wstore.viewmodels.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author ducan
 */
public interface IHoaDonRepository {

    List<HoaDonViewModel> getAll(int page, int pageSize);

    List<HoaDonViewModel> getAllByTrangThai(int page, int pageSize, int trangThai);

    boolean insert(HoaDon hoaDon);

    boolean update(HoaDon hoaDon, int id);
    
    HoaDonViewModel getOne(String maHD);

    int getCountRecord();

    int getCountRecordByTrangThai(int trangThai);
    
    List<HoaDonViewModel> findByMa(int page, int pageSize, String maHD);
    
    List<HoaDonViewModel> filterHoaDonByNgayTao(int page, int pageSize, String tuNgay, String denNgay);
    
    int getSoHoaDonTrongNgay(String ngay);
}
