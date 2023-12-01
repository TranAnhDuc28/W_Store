/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.services;

import com.wstore.domainmodels.thuoctinhsanpham.DongSanPham;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.DongSanPhamViewModel;
import java.util.List;

/**
 *
 * @author ducan
 */
public interface IDongSanPhamService extends IThuocTinhSanPhamService<DongSanPham> {

    List<DongSanPhamViewModel> getAllByIDThuongHieu(int idThuongHieu);

    List<DongSanPhamViewModel> getAllByIDThuongHieuAndTrangThai(int idThuongHieu, boolean trangThai);

}
