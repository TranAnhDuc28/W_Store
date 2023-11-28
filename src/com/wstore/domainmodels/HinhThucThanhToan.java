/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels;

/**
 *
 * @author ducan
 */
public class HinhThucThanhToan {
    private Integer id;
    private String loaiHinhThanhToan;
    private Integer trangThai;
    private HoaDon idHoaDon;

    public HinhThucThanhToan() {
    }

    public HinhThucThanhToan(Integer id, String loaiHinhThanhToan, Integer trangThai, HoaDon idHoaDon) {
        this.id = id;
        this.loaiHinhThanhToan = loaiHinhThanhToan;
        this.trangThai = trangThai;
        this.idHoaDon = idHoaDon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoaiHinhThanhToan() {
        return loaiHinhThanhToan;
    }

    public void setLoaiHinhThanhToan(String loaiHinhThanhToan) {
        this.loaiHinhThanhToan = loaiHinhThanhToan;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public HoaDon getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(HoaDon idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

   
    
    
}
