/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.QLsanpham.thuoctinhsanpham;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class MauViewModel {

    private Integer maMau;
    private String tenMau;
    private Boolean hienThi;

    public MauViewModel() {
    }

    public MauViewModel(Integer maMau, String tenMau) {
        this.maMau = maMau;
        this.tenMau = tenMau;
    }

    public MauViewModel(Integer maMau, String tenMau, Boolean hienThi) {
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.maMau);
        hash = 67 * hash + Objects.hashCode(this.tenMau);
        hash = 67 * hash + Objects.hashCode(this.hienThi);
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
        final MauViewModel other = (MauViewModel) obj;
        if (!Objects.equals(this.tenMau, other.tenMau)) {
            return false;
        }
        return Objects.equals(this.maMau, other.maMau);
    }

    @Override
    public String toString() {
        return tenMau;
    }

    public Object[] toDataRow() {
        return new Object[]{maMau, tenMau, hienThi};

    }

}
