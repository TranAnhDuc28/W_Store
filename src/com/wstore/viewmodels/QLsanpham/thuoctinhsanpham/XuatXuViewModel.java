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
public class XuatXuViewModel {

    private Integer maXuatXu;
    private String noiXuatXu;
    private Boolean hienThi;

    public XuatXuViewModel() {
    }

    public XuatXuViewModel(Integer maXuatXu, String noiXuatXu) {
        this.maXuatXu = maXuatXu;
        this.noiXuatXu = noiXuatXu;
    }
    
    public XuatXuViewModel(Integer maXuatXu, String noiXuatXu, Boolean hienThi) {
        this.maXuatXu = maXuatXu;
        this.noiXuatXu = noiXuatXu;
        this.hienThi = hienThi;
    }

    public Integer getMaXuatXu() {
        return maXuatXu;
    }

    public void setMaXuatXu(Integer maXuatXu) {
        this.maXuatXu = maXuatXu;
    }

    public String getNoiXuatXu() {
        return noiXuatXu;
    }

    public void setNoiXuatXu(String noiXuatXu) {
        this.noiXuatXu = noiXuatXu;
    }

    public Boolean getHienThi() {
        return hienThi;
    }

    public void setHienThi(Boolean hienThi) {
        this.hienThi = hienThi;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.maXuatXu);
        hash = 71 * hash + Objects.hashCode(this.noiXuatXu);
        hash = 71 * hash + Objects.hashCode(this.hienThi);
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
        final XuatXuViewModel other = (XuatXuViewModel) obj;
        if (!Objects.equals(this.noiXuatXu, other.noiXuatXu)) {
            return false;
        }
        return Objects.equals(this.maXuatXu, other.maXuatXu);
    }
    
    

    @Override
    public String toString() {
        return noiXuatXu;
    }
    
    public Object[] toDataRow() {
        return new Object[]{maXuatXu, noiXuatXu, hienThi};

    }
}
