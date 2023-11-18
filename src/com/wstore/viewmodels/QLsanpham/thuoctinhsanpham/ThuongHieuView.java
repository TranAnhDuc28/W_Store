/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.QLsanpham.thuoctinhsanpham;

/**
 *
 * @author ducan
 */
public class ThuongHieuView {

    private Integer maThuongHieu;
    private String tenThuongHieu;
    private String logo;
    private Boolean hienThi;

    public ThuongHieuView() {
    }

    public ThuongHieuView(Integer maThuongHieu, String tenThuongHieu, String logo, Boolean hienThi) {
        this.maThuongHieu = maThuongHieu;
        this.tenThuongHieu = tenThuongHieu;
        this.logo = logo;
        this.hienThi = hienThi;
    }

    public Integer getMaThuongHieu() {
        return maThuongHieu;
    }

    public void setMaThuongHieu(Integer maThuongHieu) {
        this.maThuongHieu = maThuongHieu;
    }

    public String getTenThuongHieu() {
        return tenThuongHieu;
    }

    public void setTenThuongHieu(String tenThuongHieu) {
        this.tenThuongHieu = tenThuongHieu;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Boolean getHienThi() {
        return hienThi;
    }

    public void setHienThi(Boolean hienThi) {
        this.hienThi = hienThi;
    }
    
    public Object[] toDataRow() {
        return new Object[] {maThuongHieu, tenThuongHieu, logo, hienThi};
    }
}
