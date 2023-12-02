/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.banhang;

import com.wstore.utilities.Helper;
import java.math.BigDecimal;
import javax.swing.ImageIcon;

/**
 *
 * @author ducan
 */
public class SanPhamBanHangViewModel {

    private Integer id;
    private String hinhAnh;
    private String maSanPham;
    private String tenSanPham;
    private Integer soLuong;
    private BigDecimal donGia;
    private BigDecimal giaKhuyenMai;

    public SanPhamBanHangViewModel() {
    }

    public SanPhamBanHangViewModel(Integer id, String maSanPham, String tenSanPham) {
        this.id = id;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
    }

    public SanPhamBanHangViewModel(Integer id, String hinhAnh, String maSanPham, String tenSanPham, Integer soLuong, BigDecimal donGia, BigDecimal giaKhuyenMai) {
        this.id = id;
        this.hinhAnh = hinhAnh;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.giaKhuyenMai = giaKhuyenMai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public BigDecimal getGiaKhuyenMai() {
        return giaKhuyenMai;
    }

    public void setGiaKhuyenMai(BigDecimal giaKhuyenMai) {
        this.giaKhuyenMai = giaKhuyenMai;
    }
    

    public Object[] toDataRow() {
        return new Object[]{
            Helper.scaledImage(
            new ImageIcon("images/images-san-pham/" + hinhAnh), 70, 70),
             maSanPham, tenSanPham, soLuong, Helper.dfTien.format(donGia),
            Helper.dfTien.format(giaKhuyenMai)};
    }
}
