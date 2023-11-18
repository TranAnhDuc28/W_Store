/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.QLsanpham.thuoctinhsanpham;

/**
 *
 * @author Admin
 */
public class PhongCachView {
    private Integer maPhongCach;
    private String tenPhongCach;
    private Boolean hienThi;

    public PhongCachView() {
    }

    public PhongCachView(Integer maPhongCach, String tenPhongCach, Boolean hienThi) {
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
    
     public Object[] toDataRow() {
        return new Object[]{maPhongCach, tenPhongCach, hienThi};

    }
}
