/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels.thuoctinhsanpham;

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

}
