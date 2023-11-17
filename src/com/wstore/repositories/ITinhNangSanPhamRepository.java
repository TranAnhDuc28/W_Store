/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.repositories;

import com.wstore.domainmodels.thuoctinhsanpham.TinhNangSanPham;

/**
 *
 * @author ducan
 */
public interface ITinhNangSanPhamRepository {

    boolean insert(TinhNangSanPham tnsp);

    boolean delete(int idSanPham);
}
