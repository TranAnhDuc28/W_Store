/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *
 * @author ducan
 */
public class HoaDon {
    private Integer id;
    private String maHoaDon;
    private Timestamp ngayTao;
    private String tenKhachHang;
    private String diaChi;
    private String soDienThoai;
    private Timestamp ngayThanhToan;
    private Timestamp ngayGiaoHang;
    private Timestamp ngayShip;
    private BigDecimal tienShip;
    private BigDecimal tienCoc;
    private Timestamp ngayNhanHang;
    private String ghiChu;
    private Integer trangThai;
    private NhanVien idNhanVien;
    private KhachHang idKhachHang;

    public HoaDon() {
    }

    public HoaDon(Integer id, String maHoaDon, Timestamp ngayTao, String tenKhachHang, String diaChi, String soDienThoai, Timestamp ngayThanhToan, Timestamp ngayGiaoHang, Timestamp ngayShip, BigDecimal tienShip, BigDecimal tienCoc, Timestamp ngayNhanHang, String ghiChu, Integer trangThai, NhanVien idNhanVien, KhachHang idKhachHang) {
        this.id = id;
        this.maHoaDon = maHoaDon;
        this.ngayTao = ngayTao;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayGiaoHang = ngayGiaoHang;
        this.ngayShip = ngayShip;
        this.tienShip = tienShip;
        this.tienCoc = tienCoc;
        this.ngayNhanHang = ngayNhanHang;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
        this.idNhanVien = idNhanVien;
        this.idKhachHang = idKhachHang;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public Timestamp getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Timestamp ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public Timestamp getNgayGiaoHang() {
        return ngayGiaoHang;
    }

    public void setNgayGiaoHang(Timestamp ngayGiaoHang) {
        this.ngayGiaoHang = ngayGiaoHang;
    }

    public Timestamp getNgayShip() {
        return ngayShip;
    }

    public void setNgayShip(Timestamp ngayShip) {
        this.ngayShip = ngayShip;
    }

    public BigDecimal getTienShip() {
        return tienShip;
    }

    public void setTienShip(BigDecimal tienShip) {
        this.tienShip = tienShip;
    }

    public BigDecimal getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(BigDecimal tienCoc) {
        this.tienCoc = tienCoc;
    }

    public Timestamp getNgayNhanHang() {
        return ngayNhanHang;
    }

    public void setNgayNhanHang(Timestamp ngayNhanHang) {
        this.ngayNhanHang = ngayNhanHang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public NhanVien getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(NhanVien idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public KhachHang getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(KhachHang idKhachHang) {
        this.idKhachHang = idKhachHang;
    }
    
    
}
