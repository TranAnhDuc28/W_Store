/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author ducan
 */
public class NhanVien {
    private Integer id;
    private String maNhanVien;
    private String matKhau;
    private String hoTen;
    private Boolean gioiTinh;
    private Date ngaySinh;
    private String canCuocCongDan;
    private String diaChi;
    private String soDienThoai;
    private String email;
    private Integer vaiTro;
    private Timestamp ngayTao;
    private String hinhAnh;
    private String ghiChu;
    private Integer trangThai;

    public NhanVien() {
    }

    public NhanVien(Integer id) {
        this.id = id;
    }

    public NhanVien(Integer id, String maNhanVien, String hoTen) {
        this.id = id;
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
    }
    

    public NhanVien(Integer id, String maNhanVien, String matKhau, String hoTen, Boolean gioiTinh, Date ngaySinh, String canCuocCongDan, String diaChi, String soDienThoai, String email, Integer vaiTro, Timestamp ngayTao, String hinhAnh, String ghiChu, Integer trangThai) {
        this.id = id;
        this.maNhanVien = maNhanVien;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.canCuocCongDan = canCuocCongDan;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.vaiTro = vaiTro;
        this.ngayTao = ngayTao;
        this.hinhAnh = hinhAnh;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCanCuocCongDan() {
        return canCuocCongDan;
    }

    public void setCanCuocCongDan(String canCuocCongDan) {
        this.canCuocCongDan = canCuocCongDan;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(Integer vaiTro) {
        this.vaiTro = vaiTro;
    }

    public Timestamp getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
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

        @Override
    public String toString() {
        return maNhanVien + " - " + hoTen;
    }
    
    
}
