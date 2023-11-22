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
public class TinhNangViewModel {

    private Integer maTinhNang;
    private String tenTinhNang;
    private Boolean hienThi;

    public TinhNangViewModel() {
    }

    public TinhNangViewModel(Integer maTinhNang, String tenTinhNang) {
        this.maTinhNang = maTinhNang;
        this.tenTinhNang = tenTinhNang;
    }

    public TinhNangViewModel(Integer maTinhNang, String tenTinhNang, Boolean hienThi) {
        this.maTinhNang = maTinhNang;
        this.tenTinhNang = tenTinhNang;
        this.hienThi = hienThi;
    }

    public Integer getMaTinhNang() {
        return maTinhNang;
    }

    public void setMaTinhNang(Integer maTinhNang) {
        this.maTinhNang = maTinhNang;
    }

    public String getTenTinhNang() {
        return tenTinhNang;
    }

    public void setTenTinhNang(String tenTinhNang) {
        this.tenTinhNang = tenTinhNang;
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
        hash = 79 * hash + Objects.hashCode(this.maTinhNang);
        hash = 79 * hash + Objects.hashCode(this.tenTinhNang);
        hash = 79 * hash + Objects.hashCode(this.hienThi);
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
        final TinhNangViewModel other = (TinhNangViewModel) obj;
        if (!Objects.equals(this.tenTinhNang, other.tenTinhNang)) {
            return false;
        }
        return Objects.equals(this.maTinhNang, other.maTinhNang);
    }
    
    
    
    @Override
    public String toString() {
        return tenTinhNang;
    }

    public Object[] toDataRow() {
        return new Object[]{maTinhNang, tenTinhNang, hienThi};

    }
}
