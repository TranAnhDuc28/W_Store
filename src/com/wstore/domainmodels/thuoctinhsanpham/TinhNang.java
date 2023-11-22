/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels.thuoctinhsanpham;

import java.util.Objects;

/**
 *
 * @author ducan
 */
public class TinhNang {

    private Integer id;
    private String tenTinhNang;
    private Boolean trangThai;

    public TinhNang() {
    }

    public TinhNang(Integer id) {
        this.id = id;
    }

    public TinhNang(Integer id, String tenTinhNang, Boolean trangThai) {
        this.id = id;
        this.tenTinhNang = tenTinhNang;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenTinhNang() {
        return tenTinhNang;
    }

    public void setTenTinhNang(String tenTinhNang) {
        this.tenTinhNang = tenTinhNang;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return tenTinhNang;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.tenTinhNang);
        hash = 29 * hash + Objects.hashCode(this.trangThai);
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
        final TinhNang other = (TinhNang) obj;
        if (!Objects.equals(this.tenTinhNang, other.tenTinhNang)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.trangThai, other.trangThai);
    }
    
    
}
