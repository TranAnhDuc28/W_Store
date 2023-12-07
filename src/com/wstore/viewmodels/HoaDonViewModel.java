/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels;

import com.wstore.domainmodels.KhachHang;
import com.wstore.domainmodels.NhanVien;
import com.wstore.utilities.Helper;
import com.wstore.utilities.status.StatusHoaDon;
import com.wstore.viewmodels.banhang.HoaDonBanHangViewModel;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *
 * @author ducan
 */
public class HoaDonViewModel extends HoaDonBanHangViewModel {

    private String soDienThoai;
    private String diaChi;
    private Timestamp ngayThanhToan;
    private Timestamp ngayGiaoHang;
    private BigDecimal tienShip;
    private BigDecimal tienCoc;
    private Timestamp ngayNhanHang;
    private String hinhThucThanhToan;
    private BigDecimal tongTien;
    private KhachHang idKhachHang;
    private String ghiChu;

    public HoaDonViewModel() {
    }

    public HoaDonViewModel(String soDienThoai, String diaChi, Timestamp ngayThanhToan, Timestamp ngayGiaoHang, BigDecimal tienShip, BigDecimal tienCoc, Timestamp ngayNhanHang, String hinhThucThanhToan, BigDecimal tongTien, KhachHang idKhachHang, String ghiChu, Integer id, String maHoaDon, Timestamp ngayTao, String tenKhachHang, NhanVien nhanVien, Integer trangThai) {
        super(id, maHoaDon, ngayTao, tenKhachHang, nhanVien, trangThai);
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayGiaoHang = ngayGiaoHang;
        this.tienShip = tienShip;
        this.tienCoc = tienCoc;
        this.ngayNhanHang = ngayNhanHang;
        this.hinhThucThanhToan = hinhThucThanhToan;
        this.tongTien = tongTien;
        this.idKhachHang = idKhachHang;
        this.ghiChu = ghiChu;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
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

    public String getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public BigDecimal getTongTien() {
        return tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }

    public KhachHang getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(KhachHang idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return "HoaDonViewModel{" + "soDienThoai=" + soDienThoai + ", diaChi=" + diaChi + ", ngayThanhToan=" + ngayThanhToan + ", ngayGiaoHang=" + ngayGiaoHang + ", tienShip=" + tienShip + ", tienCoc=" + tienCoc + ", ngayNhanHang=" + ngayNhanHang + ", hinhThucThanhToan=" + hinhThucThanhToan + ", tongTien=" + tongTien + ", idKhachHang=" + idKhachHang + ", ghiChu=" + ghiChu + '}';
    }

    @Override
    public Object[] toDataRow() {
        return new Object[]{super.getMaHoaDon(), Helper.sdfNgayThangThoiGian.format(super.getNgayTao()),
             super.getTenKhachHang(), soDienThoai, diaChi, super.getNhanVien(),
            ngayThanhToan == null ? null : Helper.sdfNgayThangThoiGian.format(ngayThanhToan),
            hinhThucThanhToan, tongTien == null ? tongTien : Helper.dfTien.format(tongTien.longValue()),
            StatusHoaDon.getNameByValue(super.getTrangThai()), ghiChu};
    }
}
