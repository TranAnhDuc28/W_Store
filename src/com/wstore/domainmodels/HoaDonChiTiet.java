/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels;

import com.wstore.viewmodels.banhang.SanPhamBanHangViewModel;
import java.math.BigDecimal;

/**
 *
 * @author ducan
 */
public class HoaDonChiTiet {

    private Long id;
    private SanPhamBanHangViewModel sanPham;
    private HoaDon idHoaDon;
    private Integer soLuong;
    private BigDecimal donGia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(Long id, SanPhamBanHangViewModel idSanPham, HoaDon idHoaDon, Integer soLuong, BigDecimal donGia) {
        this.id = id;
        this.sanPham = idSanPham;
        this.idHoaDon = idHoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SanPhamBanHangViewModel getIdSanPham() {
        return sanPham;
    }

    public void setIdSanPham(SanPhamBanHangViewModel idSanPham) {
        this.sanPham = idSanPham;
    }

    public HoaDon getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(HoaDon idHoaDon) {
        this.idHoaDon = idHoaDon;
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
        return donGia.multiply(new BigDecimal(soLuong));
    }

    public Object[] toDataRow() {
        return new Object[]{
            sanPham.getMaSanPham(),
            sanPham.getTenSanPham(),
            soLuong, donGia, getThanhTien()};
    }
}
