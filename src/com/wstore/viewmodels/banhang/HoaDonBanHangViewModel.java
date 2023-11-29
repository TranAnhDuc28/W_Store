/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.banhang;

import com.wstore.domainmodels.NhanVien;
import java.sql.Timestamp;

/**
 *
 * @author ducan
 */
public class HoaDonBanHangViewModel {

    private Integer id;
    private String maHoaDon;
    private Timestamp ngayTao;
    private String tenKhachHang;
    private NhanVien nhanVien;
    private Integer trangThai;

    public HoaDonBanHangViewModel() {
    }

    public HoaDonBanHangViewModel(Integer id, String maHoaDon, Timestamp ngayTao, String tenKhachHang, NhanVien nhanVien, Integer trangThai) {
        this.id = id;
        this.maHoaDon = maHoaDon;
        this.ngayTao = ngayTao;
        this.tenKhachHang = tenKhachHang;
        this.nhanVien = nhanVien;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Timestamp getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public Object[] toDataRow() {
        return new Object[]{maHoaDon, ngayTao, tenKhachHang, nhanVien,
             trangThai == 0 ? "Chờ thanh toán"
            : trangThai == 3 ? "Chờ giao hàng"
            : "Đang giao hàng"};
    }
}
