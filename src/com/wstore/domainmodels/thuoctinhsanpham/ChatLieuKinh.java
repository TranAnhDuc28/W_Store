/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels.thuoctinhsanpham;

/**
 *
 * @author ducan
 */
public class ChatLieuKinh {

    private Integer id;
    private String tenChatLieuKinh;
    private Boolean trangThai;

    public ChatLieuKinh() {
    }

    public ChatLieuKinh(Integer id) {
        this.id = id;
    }

    public ChatLieuKinh(Integer id, String tenChatLieuKinh) {
        this.id = id;
        this.tenChatLieuKinh = tenChatLieuKinh;
    }
    
    public ChatLieuKinh(Integer id, String tenChatLieuKinh, Boolean trangThai) {
        this.id = id;
        this.tenChatLieuKinh = tenChatLieuKinh;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenChatLieuKinh() {
        return tenChatLieuKinh;
    }

    public void setTenChatLieuKinh(String tenChatLieuKinh) {
        this.tenChatLieuKinh = tenChatLieuKinh;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return tenChatLieuKinh;
    }
    
    
}
