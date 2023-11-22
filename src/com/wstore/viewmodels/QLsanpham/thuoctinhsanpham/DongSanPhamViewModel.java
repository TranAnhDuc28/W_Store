/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.QLsanpham.thuoctinhsanpham;

import java.util.Objects;

/**
 *
 * @author admin
 */
public class DongSanPhamViewModel {

    private Integer maDongSanPham;
    private String tenDongSanPham;
    private Boolean hienThi;

    public DongSanPhamViewModel() {
    }

    public DongSanPhamViewModel(Integer maDongSanPham, String tenDongSanPham) {
        this.maDongSanPham = maDongSanPham;
        this.tenDongSanPham = tenDongSanPham;
    }

    public DongSanPhamViewModel(Integer maDongSanPham, String tenDongSanPham, Boolean hienThi) {
        this.maDongSanPham = maDongSanPham;
        this.tenDongSanPham = tenDongSanPham;
        this.hienThi = hienThi;
    }

    public Integer getMaDongSanPham() {
        return maDongSanPham;
    }

    public void setMaDongSanPham(Integer maDongSanPham) {
        this.maDongSanPham = maDongSanPham;
    }

    public String getTenDongSanPham() {
        return tenDongSanPham;
    }

    public void setTenDongSanPham(String tenDongSanPham) {
        this.tenDongSanPham = tenDongSanPham;
    }

    public Boolean getHienThi() {
        return hienThi;
    }

    public void setHienThi(Boolean hienThi) {
        this.hienThi = hienThi;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.maDongSanPham);
        hash = 97 * hash + Objects.hashCode(this.tenDongSanPham);
        hash = 97 * hash + Objects.hashCode(this.hienThi);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DongSanPhamViewModel other = (DongSanPhamViewModel) obj;
        if (!Objects.equals(this.tenDongSanPham, other.tenDongSanPham)) {
            return false;
        }
        return Objects.equals(this.maDongSanPham, other.maDongSanPham);
    }

    @Override
    public String toString() {
        return tenDongSanPham;
    }

    public Object[] toDataRow() {
        return new Object[]{maDongSanPham, tenDongSanPham, hienThi};
    }
}
