/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.QLsanpham.thuoctinhsanpham;

import java.util.Objects;

/**
 *
 * @author admin
 */
public class ChatLieuVoViewModel {

    private Integer idChatLieuVo;
    private String tenChatLieuVo;
    private Boolean hienThi;

    public ChatLieuVoViewModel() {
    }

    public ChatLieuVoViewModel(Integer idChatLieuVo, String tenChatLieuVo) {
        this.idChatLieuVo = idChatLieuVo;
        this.tenChatLieuVo = tenChatLieuVo;
    }
    
    public ChatLieuVoViewModel(Integer idChatLieuVo, String tenChatLieuVo, Boolean hienThi) {
        this.idChatLieuVo = idChatLieuVo;
        this.tenChatLieuVo = tenChatLieuVo;
        this.hienThi = hienThi;
    }

    public Integer getIdChatLieuVo() {
        return idChatLieuVo;
    }

    public void setIdChatLieuVo(Integer idChatLieuVo) {
        this.idChatLieuVo = idChatLieuVo;
    }

    public String getTenChatLieuVo() {
        return tenChatLieuVo;
    }

    public void setTenChatLieuVo(String tenChatLieuVo) {
        this.tenChatLieuVo = tenChatLieuVo;
    }

    public Boolean getHienThi() {
        return hienThi;
    }

    public void setHienThi(Boolean hienThi) {
        this.hienThi = hienThi;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.idChatLieuVo);
        hash = 71 * hash + Objects.hashCode(this.tenChatLieuVo);
        hash = 71 * hash + Objects.hashCode(this.hienThi);
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
        final ChatLieuVoViewModel other = (ChatLieuVoViewModel) obj;
        if (!Objects.equals(this.tenChatLieuVo, other.tenChatLieuVo)) {
            return false;
        }
        return Objects.equals(this.idChatLieuVo, other.idChatLieuVo);
    }
    
    
    
    @Override
    public String toString() {
        return tenChatLieuVo;
    }

    public Object[] toDataRow() {
        return new Object[]{idChatLieuVo, tenChatLieuVo, hienThi};
    }
}
