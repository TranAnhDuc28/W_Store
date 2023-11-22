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
public class ThuongHieu {

    private Integer id;
    private String tenThuongHieu;
    private String logo;
    private Boolean trangThai;

    public ThuongHieu() {
    }

    public ThuongHieu(Integer id) {
        this.id = id;
    }

    public ThuongHieu(Integer id, String tenThuongHieu) {
        this.id = id;
        this.tenThuongHieu = tenThuongHieu;
    }

    public ThuongHieu(Integer id, String tenThuongHieu, String loGo, Boolean trangThai) {
        this.id = id;
        this.tenThuongHieu = tenThuongHieu;
        this.logo = loGo;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenThuongHieu() {
        return tenThuongHieu;
    }

    public void setTenThuongHieu(String tenThuongHieu) {
        this.tenThuongHieu = tenThuongHieu;
    }

    public String getLoGo() {
        return logo;
    }

    public void setLoGo(String loGo) {
        this.logo = loGo;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return tenThuongHieu;
    }  

}
