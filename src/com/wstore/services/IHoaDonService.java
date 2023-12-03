/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.services;

import com.wstore.domainmodels.HoaDon;
import com.wstore.viewmodels.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author ducan
 */
public interface IHoaDonService {

    List<HoaDonViewModel> getAll(int page, int pageSize);

    List<HoaDonViewModel> getAllByTrangThai(int page, int pageSize, int trangThai);

    boolean insert(HoaDon hd);

    boolean update(HoaDon hd, int id);

    int getCountRecord();

    int getCountRecordByTrangThai(int trangThai);

    HoaDonViewModel findByMa(String maHD);
}
