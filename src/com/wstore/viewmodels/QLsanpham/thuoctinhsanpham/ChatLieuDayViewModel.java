/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.QLsanpham.thuoctinhsanpham;

public class ChatLieuDayViewModel {

    private Integer maChatLieuDay;
    private String tenChatLieuDay;
    private Boolean hienThi;

    public ChatLieuDayViewModel() {
    }

    public ChatLieuDayViewModel(Integer maChatLieuDay, String tenChatLieuDay, Boolean hienThi) {
        this.maChatLieuDay = maChatLieuDay;
        this.tenChatLieuDay = tenChatLieuDay;
        this.hienThi = hienThi;
    }

    public Integer getMaChatLieuDay() {
        return maChatLieuDay;
    }

    public void setMaChatLieuDay(Integer maChatLieuDay) {
        this.maChatLieuDay = maChatLieuDay;
    }

    public String getTenChatLieuDay() {
        return tenChatLieuDay;
    }

    public void setTenChatLieuDay(String tenChatLieuDay) {
        this.tenChatLieuDay = tenChatLieuDay;
    }

    public Boolean getHienThi() {
        return hienThi;
    }

    public void setHienThi(Boolean hienThi) {
        this.hienThi = hienThi;
    }

    @Override
    public String toString() {
        return tenChatLieuDay;
    }

    public Object[] toDataRow() {
        return new Object[]{maChatLieuDay, tenChatLieuDay, hienThi};
    }
}
