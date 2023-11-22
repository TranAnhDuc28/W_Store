package com.wstore.domainmodels.thuoctinhsanpham;

import com.wstore.domainmodels.SanPham;

public class PhongCachSanPham {

    private SanPham sanPham;
    private PhongCach phongCach;

    public PhongCachSanPham() {
    }

    public PhongCachSanPham(SanPham sanPham, PhongCach phongCach) {
        this.sanPham = sanPham;
        this.phongCach = phongCach;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public PhongCach getPhongCach() {
        return phongCach;
    }

    public void setPhongCach(PhongCach phongCach) {
        this.phongCach = phongCach;
    }

    @Override
    public String toString() {
        return phongCach.getTenPhongCach();
    }
    
    

}
