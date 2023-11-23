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
