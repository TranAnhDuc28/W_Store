/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.viewmodels.QLsanpham.thuoctinhsanpham;

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
    public String toString() {
        return tenChatLieuVo;
    }

    public Object[] toDataRow() {
        return new Object[]{idChatLieuVo, tenChatLieuVo, hienThi};
    }
}
