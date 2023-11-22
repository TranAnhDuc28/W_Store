/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.QLsanpham.thuoctinhsanpham;

import com.wstore.domainmodels.thuoctinhsanpham.ThuongHieu;

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
    public String toString() {
        return tenDongSanPham;
    }

    public Object[] toDataRow() {
        return new Object[]{maDongSanPham, tenDongSanPham, hienThi};
    }
}
