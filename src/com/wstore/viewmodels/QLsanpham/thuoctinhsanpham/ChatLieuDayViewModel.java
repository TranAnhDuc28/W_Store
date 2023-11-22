/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.QLsanpham.thuoctinhsanpham;

import java.util.Objects;

public class ChatLieuDayViewModel {

    private Integer maChatLieuDay;
    private String tenChatLieuDay;
    private Boolean hienThi;

    public ChatLieuDayViewModel() {
    }

    public ChatLieuDayViewModel(Integer maChatLieuDay, String tenChatLieuDay) {
        this.maChatLieuDay = maChatLieuDay;
        this.tenChatLieuDay = tenChatLieuDay;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.maChatLieuDay);
        hash = 11 * hash + Objects.hashCode(this.tenChatLieuDay);
        hash = 11 * hash + Objects.hashCode(this.hienThi);
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
        final ChatLieuDayViewModel other = (ChatLieuDayViewModel) obj;
        if (!Objects.equals(this.tenChatLieuDay, other.tenChatLieuDay)) {
            return false;
        }
        return Objects.equals(this.maChatLieuDay, other.maChatLieuDay);
    }
    
    
    
    public Object[] toDataRow() {
        return new Object[]{maChatLieuDay, tenChatLieuDay, hienThi};
    }
}
