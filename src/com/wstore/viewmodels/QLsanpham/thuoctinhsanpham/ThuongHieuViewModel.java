/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.QLsanpham.thuoctinhsanpham;

import java.util.Objects;

/**
 *
 * @author ducan
 */
    public class ThuongHieuViewModel {

    private Integer maThuongHieu;
    private String tenThuongHieu;
    private String logo;
    private Boolean hienThi;

    public ThuongHieuViewModel() {
    }

    public ThuongHieuViewModel(Integer maThuongHieu, String tenThuongHieu) {
        this.maThuongHieu = maThuongHieu;
        this.tenThuongHieu = tenThuongHieu;
    }
    
    public ThuongHieuViewModel(Integer maThuongHieu, String tenThuongHieu, String logo, Boolean hienThi) {
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

    @Override
    public String toString() {
        return tenThuongHieu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.maThuongHieu);
        hash = 61 * hash + Objects.hashCode(this.tenThuongHieu);
        hash = 61 * hash + Objects.hashCode(this.logo);
        hash = 61 * hash + Objects.hashCode(this.hienThi);
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
        final ThuongHieuViewModel other = (ThuongHieuViewModel) obj;
        if (!Objects.equals(this.tenThuongHieu, other.tenThuongHieu)) {
            return false;
        }
        return Objects.equals(this.maThuongHieu, other.maThuongHieu);
    }

    public Object[] toDataRow() {
        return new Object[]{maThuongHieu, tenThuongHieu, logo, hienThi};
    }
}
