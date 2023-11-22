/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.QLsanpham.thuoctinhsanpham;

import java.util.Objects;

public class ChatLieuKinhViewModel {

    private Integer maChatLieuKinh;
    private String tenChatLieuKinh;
    private Boolean hienThi;

    public ChatLieuKinhViewModel() {
    }

    public ChatLieuKinhViewModel(Integer maChatLieuKinh, String tenChatLieuKinh) {
        this.maChatLieuKinh = maChatLieuKinh;
        this.tenChatLieuKinh = tenChatLieuKinh;
    }

    public ChatLieuKinhViewModel(Integer maChatLieuKinh, String tenChatLieuKinh, Boolean hienThi) {
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.maChatLieuKinh);
        hash = 79 * hash + Objects.hashCode(this.tenChatLieuKinh);
        hash = 79 * hash + Objects.hashCode(this.hienThi);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChatLieuKinhViewModel other = (ChatLieuKinhViewModel) obj;
        if (!Objects.equals(this.tenChatLieuKinh, other.tenChatLieuKinh)) {
            return false;
        }
        return Objects.equals(this.maChatLieuKinh, other.maChatLieuKinh);
    }

    @Override
    public String toString() {
        return tenChatLieuKinh;
    }

    public Object[] toDataRow() {
        return new Object[]{maChatLieuKinh, tenChatLieuKinh, hienThi};
    }
}
