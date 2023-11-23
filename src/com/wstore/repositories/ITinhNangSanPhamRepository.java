/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.repositories;

import com.wstore.domainmodels.thuoctinhsanpham.TinhNangSanPham;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.TinhNangViewModel;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ducan
 */
public interface ITinhNangSanPhamRepository {

    Set<TinhNangViewModel> getAllByIdSanPham(int idSanPham);

    void insert(List<TinhNangSanPham> list);

    boolean delete(int idSanPham);
}
