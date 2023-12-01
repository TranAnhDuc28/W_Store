/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.repositories;

import com.wstore.domainmodels.thuoctinhsanpham.DongSanPham;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.DongSanPhamViewModel;
import java.util.List;

/**
 *
 * @author ducan
 */
public interface IDongSanPhamRepository extends IThuocTinhSanPhamRepository<DongSanPham> {

    List<DongSanPham> getAllByIDThuongHieu(int idThuongHieu);

    List<DongSanPham> getAllByIDThuongHieuAndTrangThai(int idThuongHieu, boolean trangThai);

}
