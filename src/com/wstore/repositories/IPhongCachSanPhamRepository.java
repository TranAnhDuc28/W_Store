package com.wstore.repositories;

import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.PhongCachViewModel;
import java.util.Set;

public interface IPhongCachSanPhamRepository {
    
    Set<PhongCachViewModel> getAllByIdSanPham(int idSanPham);
    
    boolean insert(PhongCachViewModel pcsp);
    
    boolean delete(int idSanPham);
}
