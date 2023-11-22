package com.wstore.repositories;

import com.wstore.domainmodels.thuoctinhsanpham.PhongCachSanPham;
import java.util.Set;

public interface IPhongCachSanPhamRepository {
    
    Set<PhongCachSanPham> getAllByIdSanPham(int idSanPham);
    
    boolean insert(PhongCachSanPham pcsp);
    
    boolean delete(int idSanPham);
}
