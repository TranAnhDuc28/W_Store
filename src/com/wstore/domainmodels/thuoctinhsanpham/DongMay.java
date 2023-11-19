/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels.thuoctinhsanpham;

/**
 *
 * @author ducan
 */
public class DongMay {

    private Integer id;
    private String tenDongMay;
    private Boolean trangThai;

    public DongMay() {
    }

    public DongMay(Integer id) {
        this.id = id;
    }

    public DongMay(Integer id, String tenDongMay) {
        this.id = id;
        this.tenDongMay = tenDongMay;
    }

    public DongMay(Integer id, String tenDongMay, Boolean trangThai) {
        this.id = id;
        this.tenDongMay = tenDongMay;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenDongMay() {
        return tenDongMay;
    }

    public void setTenDongMay(String tenDongMay) {
        this.tenDongMay = tenDongMay;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return tenDongMay;
    }
    
    
}
