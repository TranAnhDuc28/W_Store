/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.QLsanpham.thuoctinhsanpham;

/**
 *
 * @author Admin
 */
public class PhongCachViewModel {

    private Integer maPhongCach;
    private String tenPhongCach;
    private Boolean hienThi;

    public PhongCachViewModel() {
    }

    public PhongCachViewModel(Integer maPhongCach, String tenPhongCach, Boolean hienThi) {
        this.maPhongCach = maPhongCach;
        this.tenPhongCach = tenPhongCach;
        this.hienThi = hienThi;
    }

    public Integer getMaPhongCach() {
        return maPhongCach;
    }

    public void setMaPhongCach(Integer maPhongCach) {
        this.maPhongCach = maPhongCach;
    }

    public String getTenPhongCach() {
        return tenPhongCach;
    }

    public void setTenPhongCach(String tenPhongCach) {
        this.tenPhongCach = tenPhongCach;
    }

    public Boolean getHienThi() {
        return hienThi;
    }

    public void setHienThi(Boolean hienThi) {
        this.hienThi = hienThi;
    }

    @Override
    public String toString() {
        return tenPhongCach;
    }

    public Object[] toDataRow() {
        return new Object[]{maPhongCach, tenPhongCach, hienThi};

    }
}
