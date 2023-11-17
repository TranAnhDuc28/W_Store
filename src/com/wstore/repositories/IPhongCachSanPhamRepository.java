package com.wstore.repositories;

import com.wstore.domainmodels.thuoctinhsanpham.PhongCachSanPham;

public interface IPhongCachSanPhamRepository {
    
    boolean insert(PhongCachSanPham pcsp);
    
    boolean delete(int idSanPham);
}
