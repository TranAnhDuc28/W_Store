/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.services;

import com.wstore.domainmodels.thuoctinhsanpham.PhongCachSanPham;
import java.util.Set;

/**
 *
 * @author ducan
 */
public interface IPhongCachSanPhamService {

    Set<PhongCachSanPham> getAllByIdSanPham(int idSanPham);

    boolean insert(PhongCachSanPham pcsp);

    boolean delete(int idSanPham);
}
