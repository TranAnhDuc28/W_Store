/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.services;

import com.wstore.domainmodels.thuoctinhsanpham.TinhNangSanPham;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.TinhNangViewModel;
import java.util.Set;

/**
 *
 * @author ducan
 */
public interface ITinhNangSanPhamService {

    Set<TinhNangViewModel> getAllByIdSanPham(int idSanPham);

    boolean insert(TinhNangSanPham tnsp);

    boolean delete(int idSanPham);
}
