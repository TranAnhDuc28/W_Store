/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.repositories;

import com.wstore.domainmodels.thuoctinhsanpham.TinhNangSanPham;
import java.util.Set;

/**
 *
 * @author ducan
 */
public interface ITinhNangSanPhamRepository {

    Set<TinhNangSanPham> getAllByIdSanPham(int idSanPham);

    boolean insert(TinhNangSanPham tnsp);

    boolean delete(int idSanPham);
}
