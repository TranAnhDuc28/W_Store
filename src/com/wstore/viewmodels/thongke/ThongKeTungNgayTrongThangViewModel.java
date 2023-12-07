/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.thongke;

import com.wstore.utilities.Helper;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author ducan
 */
public class ThongKeTungNgayTrongThangViewModel {

    private Date ngay;
    private BigDecimal von;
    private BigDecimal doanhThu;
    private BigDecimal loiNhuan;

    public ThongKeTungNgayTrongThangViewModel() {
    }

    public ThongKeTungNgayTrongThangViewModel(Date ngayThangNam, BigDecimal von, BigDecimal doanhThu, BigDecimal loiNhuan) {
        this.ngay = ngayThangNam;
        this.von = von;
        this.doanhThu = doanhThu;
        this.loiNhuan = loiNhuan;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public BigDecimal getVon() {
        return von;
    }

    public void setVon(BigDecimal von) {
        this.von = von;
    }

    public BigDecimal getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(BigDecimal doanhThu) {
        this.doanhThu = doanhThu;
    }

    public BigDecimal getLoiNhuan() {
        return loiNhuan;
    }

    public void setLoiNhuan(BigDecimal loiNhuan) {
        this.loiNhuan = loiNhuan;
    }

    public Object[] toDaTaRow() {
        return new Object[]{
            ngay,
            Helper.dfTien.format(von),
            Helper.dfTien.format(doanhThu),
            Helper.dfTien.format(loiNhuan)
        };
    }
}
