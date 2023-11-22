/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels.thuoctinhsanpham;

import com.wstore.domainmodels.SanPham;

/**
 *
 * @author ducan
 */
public class TinhNangSanPham {

    private SanPham sanPham;
    private TinhNang tinhNang;

    public TinhNangSanPham() {
    }

    public TinhNangSanPham(SanPham sanPham, TinhNang tinhNang) {
        this.sanPham = sanPham;
        this.tinhNang = tinhNang;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public TinhNang getTinhNang() {
        return tinhNang;
    }

    public void setTinhNang(TinhNang tinhNang) {
        this.tinhNang = tinhNang;
    }

    @Override
    public String toString() {
        return tinhNang.getTenTinhNang();
    }  
}
