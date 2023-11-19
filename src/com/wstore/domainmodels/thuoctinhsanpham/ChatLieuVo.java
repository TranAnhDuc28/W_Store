/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels.thuoctinhsanpham;

/**
 *
 * @author ducan
 */
public class ChatLieuVo {

    private Integer id;
    private String tenChatLieuVo;
    private Boolean trangThai;

    public ChatLieuVo() {
    }

    public ChatLieuVo(Integer id) {
        this.id = id;
    }

    public ChatLieuVo(Integer id, String tenChatLieuVo) {
        this.id = id;
        this.tenChatLieuVo = tenChatLieuVo;
    }

    public ChatLieuVo(Integer id, String tenChatLieuVo, Boolean trangThai) {
        this.id = id;
        this.tenChatLieuVo = tenChatLieuVo;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenChatLieuVo() {
        return tenChatLieuVo;
    }

    public void setTenChatLieuVo(String tenChatLieuVo) {
        this.tenChatLieuVo = tenChatLieuVo;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return tenChatLieuVo;
    }  
}
