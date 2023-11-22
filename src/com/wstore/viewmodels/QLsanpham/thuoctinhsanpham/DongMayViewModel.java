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
public class DongMayViewModel {

    private Integer idDongMay;
    private String tenDongMay;
    private Boolean hienThi;

    public DongMayViewModel() {
    }

    public DongMayViewModel(Integer idDongMay, String tenDongMay) {
        this.idDongMay = idDongMay;
        this.tenDongMay = tenDongMay;
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
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.idDongMay);
        hash = 43 * hash + Objects.hashCode(this.tenDongMay);
        hash = 43 * hash + Objects.hashCode(this.hienThi);
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
        final DongMayViewModel other = (DongMayViewModel) obj;
        if (!Objects.equals(this.tenDongMay, other.tenDongMay)) {
            return false;
        }
        return Objects.equals(this.idDongMay, other.idDongMay);
    }

    @Override
    public String toString() {
        return tenDongMay;
    }

    public Object[] toDataRow() {
        return new Object[]{idDongMay, tenDongMay, hienThi};
    }
}
