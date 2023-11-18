/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.QLsanpham.thuoctinhsanpham;


public class ChatLieuKinhView {
    private Integer maChatLieuKinh;
    private String tenChatLieuKinh;
    private Boolean hienThi;

    public ChatLieuKinhView() {
    }

    public ChatLieuKinhView(Integer maChatLieuKinh, String tenChatLieuKinh, Boolean hienThi) {
        this.maChatLieuKinh = maChatLieuKinh;
        this.tenChatLieuKinh = tenChatLieuKinh;
        this.hienThi = hienThi;
    }

    public Integer getMaChatLieuKinh() {
        return maChatLieuKinh;
    }

    public void setMaChatLieuKinh(Integer maChatLieuKinh) {
        this.maChatLieuKinh = maChatLieuKinh;
    }

    public String getTenChatLieuKinh() {
        return tenChatLieuKinh;
    }

    public void setTenChatLieuKinh(String tenChatLieuKinh) {
        this.tenChatLieuKinh = tenChatLieuKinh;
    }

    public Boolean getHienThi() {
        return hienThi;
    }

    public void setHienThi(Boolean hienThi) {
        this.hienThi = hienThi;
    }
     public Object[] toDataRow() {
        return new Object[] {maChatLieuKinh, tenChatLieuKinh, hienThi};
    } 
}
