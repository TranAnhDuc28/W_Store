/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.QLsanpham.thuoctinhsanpham;

/**
 *
 * @author admin
 */
public class DongMayViewModel {

    private Integer idDongMay;
    private String tenDongMay;
    private Boolean hienThi;

    public DongMayViewModel() {
    }

    public DongMayViewModel(Integer idDongMay, String tenDongMay, Boolean hienThi) {
        this.idDongMay = idDongMay;
        this.tenDongMay = tenDongMay;
        this.hienThi = hienThi;
    }

    public Integer getIdDongMay() {
        return idDongMay;
    }

    public void setIdDongMay(Integer idDongMay) {
        this.idDongMay = idDongMay;
    }

    public String getTenDongMay() {
        return tenDongMay;
    }

    public void setTenDongMay(String tenDongMay) {
        this.tenDongMay = tenDongMay;
    }

    public Boolean getHienThi() {
        return hienThi;
    }

    public void setHienThi(Boolean hienThi) {
        this.hienThi = hienThi;
    }

    @Override
    public String toString() {
        return tenDongMay;
    }

    public Object[] toDataRow() {
        return new Object[]{idDongMay, tenDongMay, hienThi};
    }
}
