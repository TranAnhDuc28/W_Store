/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels;

import com.wstore.domainmodels.HoaDon;
import com.wstore.viewmodels.banhang.SanPhamBanHangViewModel;
import java.math.BigDecimal;

/**
 *
 * @author ducan
 */
public class HoaDonChiTietViewModel {

    private Long id;
    private SanPhamBanHangViewModel sanPham;
    private HoaDon hoaDon;
    private Integer soLuong;
    private BigDecimal donGia;
    private BigDecimal donGiaKhuyenMai;

    public HoaDonChiTietViewModel() {
    }

    public HoaDonChiTietViewModel(Long id, SanPhamBanHangViewModel sanPham, HoaDon hoaDon, Integer soLuong, BigDecimal donGia, BigDecimal donGiaKhuyenMai) {
        this.id = id;
        this.sanPham = sanPham;
        this.hoaDon = hoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.donGiaKhuyenMai = donGiaKhuyenMai;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SanPhamBanHangViewModel getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPhamBanHangViewModel sanPham) {
        this.sanPham = sanPham;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public HoaDon getIdHoaDon() {
        return hoaDon;
    }

    public void setIdHoaDon(HoaDon idHoaDon) {
        this.hoaDon = idHoaDon;
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

    public BigDecimal getThanhTien() {
        return donGiaKhuyenMai.multiply(new BigDecimal(soLuong));
    }

    public BigDecimal getDonGiaKhuyenMai() {
        return donGiaKhuyenMai;
    }

    public void setDonGiaKhuyenMai(BigDecimal donGiaKhuyenMai) {
        this.donGiaKhuyenMai = donGiaKhuyenMai;
    }

    @Override
    public String toString() {
        return "HoaDonChiTietViewModel{" + "id=" + id + ", sanPham=" + sanPham + ", hoaDon=" + hoaDon + ", soLuong=" + soLuong + ", donGia=" + donGia + ", donGiaKhuyenMai=" + donGiaKhuyenMai + '}';
    }

    public Object[] toDataRow() {
        return new Object[]{
            sanPham.getMaSanPham(),
            sanPham.getTenSanPham(),
            soLuong,
            donGia,
            donGia.subtract(donGiaKhuyenMai).intValue(),
            donGiaKhuyenMai.intValue(),
            getThanhTien().intValue()};
    }
}
