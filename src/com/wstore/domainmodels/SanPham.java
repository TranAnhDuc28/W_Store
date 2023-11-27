/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels;

import com.wstore.domainmodels.thuoctinhsanpham.ChatLieuDay;
import com.wstore.domainmodels.thuoctinhsanpham.ChatLieuKinh;
import com.wstore.domainmodels.thuoctinhsanpham.ChatLieuVo;
import com.wstore.domainmodels.thuoctinhsanpham.DongMay;
import com.wstore.domainmodels.thuoctinhsanpham.Mau;
import com.wstore.domainmodels.thuoctinhsanpham.ThuongHieu;
import com.wstore.domainmodels.thuoctinhsanpham.XuatXu;
import java.math.BigDecimal;

/**
 *
 * @author ducan
 */
public class SanPham {

    private Integer id;
    private String maSanPham;
    private ThuongHieu thuongHieu;
    private String maHangHoa;
    private BigDecimal giaNhap;
    private BigDecimal donGia;
    private Integer soLuongTon;
    private String hinhAnh;
    private String doiTuongSuDung;
    private String dongSanPham;
    private Integer khangNuoc;
    private Integer khoangTruCot;
    private Float sizeMat;
    private String hinhDang;
    private Float doDay;
    private DongMay dongMay;
    private ChatLieuDay chatLieuDay;
    private ChatLieuKinh chatLieuKinh;
    private XuatXu xuatXu;
    private ChatLieuVo chatLieuVo;
    private Mau mauVo;
    private Mau mauMat;
    private String ghiChu;
    private Integer trangThai;

    public SanPham() {
    }

    public SanPham(Integer id) {
        this.id = id;
    }

    public SanPham(Integer id, String maSanPham, ThuongHieu thuongHieu, String maHangHoa, BigDecimal giaNhap, BigDecimal donGia, Integer soLuongTon, String hinhAnh, String doiTuongSuDung, String dongSanPham, Integer khangNuoc, Integer khoangTruCot, Float sizeMat, String hinhDang, Float doDay, DongMay dongMay, ChatLieuDay chatLieuDay, ChatLieuKinh chatLieuKinh, XuatXu xuatXu, ChatLieuVo chatLieuVo, Mau mauVo, Mau mauMat, String ghiChu, Integer trangThai) {
        this.id = id;
        this.maSanPham = maSanPham;
        this.thuongHieu = thuongHieu;
        this.maHangHoa = maHangHoa;
        this.giaNhap = giaNhap;
        this.donGia = donGia;
        this.soLuongTon = soLuongTon;
        this.hinhAnh = hinhAnh;
        this.doiTuongSuDung = doiTuongSuDung;
        this.dongSanPham = dongSanPham;
        this.khangNuoc = khangNuoc;
        this.khoangTruCot = khoangTruCot;
        this.sizeMat = sizeMat;
        this.hinhDang = hinhDang;
        this.doDay = doDay;
        this.dongMay = dongMay;
        this.chatLieuDay = chatLieuDay;
        this.chatLieuKinh = chatLieuKinh;
        this.xuatXu = xuatXu;
        this.chatLieuVo = chatLieuVo;
        this.mauVo = mauVo;
        this.mauMat = mauMat;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public ThuongHieu getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(ThuongHieu thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public String getMaHangHoa() {
        return maHangHoa;
    }

    public void setMaHangHoa(String maHangHoa) {
        this.maHangHoa = maHangHoa;
    }

    public BigDecimal getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getDoiTuongSuDung() {
        return doiTuongSuDung;
    }

    public void setDoiTuongSuDung(String doiTuongSuDung) {
        this.doiTuongSuDung = doiTuongSuDung;
    }

    public String getDongSanPham() {
        return dongSanPham;
    }

    public void setDongSanPham(String dongSanPham) {
        this.dongSanPham = dongSanPham;
    }

    public Integer getKhangNuoc() {
        return khangNuoc;
    }

    public void setKhangNuoc(Integer khangNuoc) {
        this.khangNuoc = khangNuoc;
    }

    public Integer getKhoangTruCot() {
        return khoangTruCot;
    }

    public void setKhoangTruCot(Integer khoangTruCot) {
        this.khoangTruCot = khoangTruCot;
    }

    public Float getSizeMat() {
        return sizeMat;
    }

    public void setSizeMat(Float sizeMat) {
        this.sizeMat = sizeMat;
    }

    public String getHinhDang() {
        return hinhDang;
    }

    public void setHinhDang(String hinhDang) {
        this.hinhDang = hinhDang;
    }

    public Float getDoDay() {
        return doDay;
    }

    public void setDoDay(Float doDay) {
        this.doDay = doDay;
    }

    public DongMay getDongMay() {
        return dongMay;
    }

    public void setDongMay(DongMay dongMay) {
        this.dongMay = dongMay;
    }

    public ChatLieuDay getChatLieuDay() {
        return chatLieuDay;
    }

    public void setChatLieuDay(ChatLieuDay chatLieuDay) {
        this.chatLieuDay = chatLieuDay;
    }

    public ChatLieuKinh getChatLieuKinh() {
        return chatLieuKinh;
    }

    public void setChatLieuKinh(ChatLieuKinh chatLieuKinh) {
        this.chatLieuKinh = chatLieuKinh;
    }

    public XuatXu getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(XuatXu xuatXu) {
        this.xuatXu = xuatXu;
    }

    public ChatLieuVo getChatLieuVo() {
        return chatLieuVo;
    }

    public void setChatLieuVo(ChatLieuVo chatLieuVo) {
        this.chatLieuVo = chatLieuVo;
    }

    public Mau getMauVo() {
        return mauVo;
    }

    public void setMauVo(Mau mauVo) {
        this.mauVo = mauVo;
    }

    public Mau getMauMat() {
        return mauMat;
    }

    public void setMauMat(Mau mauMat) {
        this.mauMat = mauMat;
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
        return "SanPham{" + "id=" + id + ", maSanPham=" + maSanPham
                + ", thuongHieu=" + thuongHieu + ", maHangHoa=" + maHangHoa
                + ", giaNhap=" + giaNhap + ", donGia=" + donGia
                + ", soLuongTon=" + soLuongTon + ", hinhAnh=" + hinhAnh
                + ", doiTuongSuDung=" + doiTuongSuDung + ", dongSanPham="
                + dongSanPham + ", khangNuoc=" + khangNuoc + ", khoangTruCot="
                + khoangTruCot + ", sizeMat=" + sizeMat + ", hinhDang="
                + hinhDang + ", doDay=" + doDay + ", dongMay=" + dongMay
                + ", chatLieuDay=" + chatLieuDay + ", chatLieuKinh=" + chatLieuKinh
                + ", xuatXu=" + xuatXu + ", chatLieuVo=" + chatLieuVo
                + ", mauVo=" + mauVo + ", mauMat=" + mauMat + ", ghiChu="
                + ghiChu + ", trangThai=" + trangThai + '}';
    }

}
