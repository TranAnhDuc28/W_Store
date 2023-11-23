/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels.thuoctinhsanpham;

/**
 *
 * @author ducan
 */
public class TinhNangSanPham {

    private Integer idSanPham;
    private Integer idTinhNang;

    public TinhNangSanPham() {
    }

    public TinhNangSanPham(Integer idSanPham, Integer idTinhNang) {
        this.idSanPham = idSanPham;
        this.idTinhNang = idTinhNang;
    }

    public Integer getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(Integer idSanPham) {
        this.idSanPham = idSanPham;
    }

    public Integer getIdTinhNang() {
        return idTinhNang;
    }

    public void setIdTinhNang(Integer idTinhNang) {
        this.idTinhNang = idTinhNang;
    }

    

}
