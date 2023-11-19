/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels.thuoctinhsanpham;

/**
 *
 * @author ducan
 */
public class Mau {

    private Integer id;
    private String tenMau;
    private Boolean trangThai;

    public Mau() {
    }

    public Mau(Integer id) {
        this.id = id;
    }

    public Mau(Integer id, String tenMau) {
        this.id = id;
        this.tenMau = tenMau;
    }
    
    public Mau(Integer id, String tenMau, Boolean trangThai) {
        this.id = id;
        this.tenMau = tenMau;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return tenMau;
    }
    
    
}
