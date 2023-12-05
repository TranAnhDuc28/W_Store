/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.QLsanpham;

import com.wstore.utilities.Helper;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuDayViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuKinhViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuVoViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.DongMayViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.MauViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ThuongHieuViewModel;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.XuatXuViewModel;
import java.math.BigDecimal;

/**
 *
 * @author ducan
 */
public class SanPhamViewModel {

    private Integer id;
    private String maSanPham;
    private ThuongHieuViewModel thuongHieu;
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
    private DongMayViewModel dongMay;
    private ChatLieuDayViewModel chatLieuDay;
    private ChatLieuKinhViewModel chatLieuKinh;
    private XuatXuViewModel xuatXu;
    private ChatLieuVoViewModel chatLieuVo;
    private MauViewModel mauVo;
    private String tinhNang;
    private MauViewModel mauMat;
    private String ghiChu;
    private Integer trangThai;

    public SanPhamViewModel() {
    }

    public SanPhamViewModel(Integer id, String maSanPham, ThuongHieuViewModel thuongHieu, 
            String maHangHoa, BigDecimal giaNhap, BigDecimal donGia, Integer soLuongTon,
            String hinhAnh, String doiTuongSuDung, String dongSanPham, Integer khangNuoc,
            Integer khoangTruCot, Float sizeMat, String hinhDang, Float doDay, 
            DongMayViewModel dongMay, ChatLieuDayViewModel chatLieuDay, 
            ChatLieuKinhViewModel chatLieuKinh, XuatXuViewModel xuatXu, 
            ChatLieuVoViewModel chatLieuVo, MauViewModel mauVo,
            String tinhNang, MauViewModel mauMat, String ghiChu, Integer trangThai) {
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
        this.tinhNang = tinhNang;
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

    public ThuongHieuViewModel getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(ThuongHieuViewModel thuongHieu) {
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

    public DongMayViewModel getDongMay() {
        return dongMay;
    }

    public void setDongMay(DongMayViewModel dongMay) {
        this.dongMay = dongMay;
    }

    public ChatLieuDayViewModel getChatLieuDay() {
        return chatLieuDay;
    }

    public void setChatLieuDay(ChatLieuDayViewModel chatLieuDay) {
        this.chatLieuDay = chatLieuDay;
    }

    public ChatLieuKinhViewModel getChatLieuKinh() {
        return chatLieuKinh;
    }

    public void setChatLieuKinh(ChatLieuKinhViewModel chatLieuKinh) {
        this.chatLieuKinh = chatLieuKinh;
    }

    public XuatXuViewModel getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(XuatXuViewModel xuatXu) {
        this.xuatXu = xuatXu;
    }

    public ChatLieuVoViewModel getChatLieuVo() {
        return chatLieuVo;
    }

    public void setChatLieuVo(ChatLieuVoViewModel chatLieuVo) {
        this.chatLieuVo = chatLieuVo;
    }

    public MauViewModel getMauVo() {
        return mauVo;
    }

    public void setMauVo(MauViewModel mauVo) {
        this.mauVo = mauVo;
    }

    public String getTinhNang() {
        return tinhNang;
    }

    public void setTinhNang(String tinhNang) {
        this.tinhNang = tinhNang;
    }

    public MauViewModel getMauMat() {
        return mauMat;
    }

    public void setMauMat(MauViewModel mauMat) {
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


    public Object[] toDataRow() {
        return new Object[]{maSanPham, thuongHieu, maHangHoa,
            Helper.dfTien.format(giaNhap), Helper.dfTien.format(donGia), soLuongTon,
            doiTuongSuDung, dongSanPham, dongMay, chatLieuDay, chatLieuKinh,
            khangNuoc, khoangTruCot, sizeMat, xuatXu, chatLieuVo,
            hinhDang, mauVo, tinhNang, doDay, mauMat, hinhAnh,
            trangThai == 0 ? "Đang kinh doanh" : "Ngừng kinh doanh"};
    }
}
