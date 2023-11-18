package com.wstore.domainmodels.thuoctinhsanpham;

public class PhongCachSanPham {

    private Integer idSanPham;
    private Integer idPhongCach;

    public PhongCachSanPham() {
    }

    public PhongCachSanPham(Integer idSanPham, Integer idPhongCach) {
        this.idSanPham = idSanPham;
        this.idPhongCach = idPhongCach;
    }

    public Integer getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(Integer idSanPham) {
        this.idSanPham = idSanPham;
    }

    public Integer getIdPhongCach() {
        return idPhongCach;
    }

    public void setIdPhongCach(Integer idPhongCach) {
        this.idPhongCach = idPhongCach;
    }
    
    
}
