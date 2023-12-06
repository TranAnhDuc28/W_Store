/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels;

/**
 *
 * @author ducan
 */
public class SanPhamKhuyenMai {
    private Integer idSanPham;
    private Integer idChuongTrinh;

    public SanPhamKhuyenMai() {
    }

    public SanPhamKhuyenMai(Integer idSanPham, Integer idChuongTrinh) {
        this.idSanPham = idSanPham;
        this.idChuongTrinh = idChuongTrinh;
    }

    public Integer getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(Integer idSanPham) {
        this.idSanPham = idSanPham;
    }

    public Integer getIdChuongTrinh() {
        return idChuongTrinh;
    }

    public void setIdChuongTrinh(Integer idChuongTrinh) {
        this.idChuongTrinh = idChuongTrinh;
    }
    
    
}
