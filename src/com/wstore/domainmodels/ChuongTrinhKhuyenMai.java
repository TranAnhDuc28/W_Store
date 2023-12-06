/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels;

import java.sql.Timestamp;

/**
 *
 * @author ducan
 */
public class ChuongTrinhKhuyenMai {

    private Integer id;
    private String maChuongTrinh;
    private String tenChuongTrinh;
    private Timestamp ngayBatDau;
    private Timestamp ngayKetThuc;
    private String hinhThucGiamGia;
    private Integer giaTriGiam;
    private Integer trangThai;

    public ChuongTrinhKhuyenMai() {
    }

    public ChuongTrinhKhuyenMai(Integer id, String maChuongTrinh, String tenChuongTrinh, Timestamp ngayBatDau, Timestamp ngayKetThuc, String hinhThucGiamGia, Integer giaTriGiam, Integer trangThai) {
        this.id = id;
        this.maChuongTrinh = maChuongTrinh;
        this.tenChuongTrinh = tenChuongTrinh;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.hinhThucGiamGia = hinhThucGiamGia;
        this.giaTriGiam = giaTriGiam;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaChuongTrinh() {
        return maChuongTrinh;
    }

    public void setMaChuongTrinh(String maChuongTrinh) {
        this.maChuongTrinh = maChuongTrinh;
    }

    public String getTenChuongTrinh() {
        return tenChuongTrinh;
    }

    public void setTenChuongTrinh(String tenChuongTrinh) {
        this.tenChuongTrinh = tenChuongTrinh;
    }

    public Timestamp getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Timestamp ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Timestamp getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Timestamp ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getHinhThucGiamGia() {
        return hinhThucGiamGia;
    }

    public void setHinhThucGiamGia(String hinhThucGiamGia) {
        this.hinhThucGiamGia = hinhThucGiamGia;
    }

    public Integer getGiaTriGiam() {
        return giaTriGiam;
    }

    public void setGiaTriGiam(Integer giaTriGiam) {
        this.giaTriGiam = giaTriGiam;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
