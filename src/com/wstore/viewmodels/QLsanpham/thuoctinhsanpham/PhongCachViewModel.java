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
public class PhongCachViewModel {

    private Integer maPhongCach;
    private String tenPhongCach;
    private Boolean hienThi;

    public PhongCachViewModel() {
    }

    public PhongCachViewModel(Integer maPhongCach, String tenPhongCach) {
        this.maPhongCach = maPhongCach;
        this.tenPhongCach = tenPhongCach;
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
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.maPhongCach);
        hash = 83 * hash + Objects.hashCode(this.tenPhongCach);
        hash = 83 * hash + Objects.hashCode(this.hienThi);
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
        final PhongCachViewModel other = (PhongCachViewModel) obj;
        if (!Objects.equals(this.tenPhongCach, other.tenPhongCach)) {
            return false;
        }
        return Objects.equals(this.maPhongCach, other.maPhongCach);
    }

    @Override
    public String toString() {
        return tenPhongCach;
    }

    public Object[] toDataRow() {
        return new Object[]{maPhongCach, tenPhongCach, hienThi};

    }
}
