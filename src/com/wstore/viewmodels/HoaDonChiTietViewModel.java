/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels;

import com.wstore.domainmodels.HoaDon;
import com.wstore.domainmodels.SanPham;
import java.math.BigDecimal;

/**
 *
 * @author ducan
 */
public class HoaDonChiTietViewModel {
    private Long id;
    private SanPham sanPham;
    private HoaDon hoaDon;
    private Integer soLuong;
    private BigDecimal donGia;

    public HoaDonChiTietViewModel() {
    }

    public HoaDonChiTietViewModel(Long id, SanPham idSanPham, HoaDon idHoaDon, Integer soLuong, BigDecimal donGia) {
        this.id = id;
        this.sanPham = idSanPham;
        this.hoaDon = idHoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SanPham getIdSanPham() {
        return sanPham;
    }

    public void setIdSanPham(SanPham idSanPham) {
        this.sanPham = idSanPham;
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
        return donGia.multiply(new BigDecimal(soLuong));
    }
    
    public Object[] toDataRow() {
        return new Object[] {
            sanPham.getMaSanPham(),
        sanPham.getThuongHieu().getTenThuongHieu() + sanPham.get};
    }
}
