/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels.thuoctinhsanpham;

/**
 *
 * @author ducan
 */
public class DongSanPham {

    private Integer id;
    private String tenDongSanPham;
    private ThuongHieu thuongHieu;
    private Boolean trangThai;

    public DongSanPham() {
    }

    public DongSanPham(Integer id) {
        this.id = id;
    }
    
    public DongSanPham(Integer id, String tenDongSanPham, ThuongHieu thuongHieu, Boolean trangThai) {
        this.id = id;
        this.tenDongSanPham = tenDongSanPham;
        this.thuongHieu = thuongHieu;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenDongSanPham() {
        return tenDongSanPham;
    }

    public void setTenDongSanPham(String tenDongSanPham) {
        this.tenDongSanPham = tenDongSanPham;
    }

    public ThuongHieu getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(ThuongHieu thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return tenDongSanPham;
    }
}
