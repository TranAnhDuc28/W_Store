/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.repositories;

import com.wstore.domainmodels.HoaDon;
import java.util.List;

/**
 *
 * @author ducan
 */
public interface IHoaDonRepository {

    List<HoaDon> getAll(int page, int pageSize);

    List<HoaDon> getAllByTrangThai(int page, int pageSize, int trangThai);

    HoaDon getOne(String id);

    boolean insert(HoaDon hoaDon);

    boolean update(HoaDon hoaDon, int id);
}
