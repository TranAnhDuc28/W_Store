/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.QLsanpham.thuoctinhsanpham;

/**
 *
 * @author Admin
 */
public class MauView {

    private Integer maMau;
    private String tenMau;
    private Boolean hienThi;

    public MauView() {
    }

    public MauView(Integer maMau, String tenMau, Boolean hienThi) {
        this.maMau = maMau;
        this.tenMau = tenMau;
        this.hienThi = hienThi;
    }

    public Integer getMaMau() {
        return maMau;
    }

    public void setMaMau(Integer maMau) {
        this.maMau = maMau;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

    public Boolean getHienThi() {
        return hienThi;
    }

    public void setHienThi(Boolean hienThi) {
        this.hienThi = hienThi;
    }

    public Object[] toDataRow() {
        return new Object[]{maMau, tenMau, hienThi};

    }

}
