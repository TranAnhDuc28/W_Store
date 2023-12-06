/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.repositories;

import com.wstore.domainmodels.ChuongTrinhKhuyenMai;
import java.util.List;

/**
 *
 * @author ducan
 */
public interface IChuongTrinhKhuyenMaiRepository {

    List<ChuongTrinhKhuyenMai> getAllByTrangThai(int trangThai);

    boolean insert(ChuongTrinhKhuyenMai ctkm);

    boolean update(ChuongTrinhKhuyenMai ctkm, int id);

}
