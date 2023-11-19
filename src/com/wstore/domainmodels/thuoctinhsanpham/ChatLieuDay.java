/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels.thuoctinhsanpham;

/**
 *
 * @author ducan
 */
public class ChatLieuDay {

    private Integer id;
    private String tenChatLieuDay;
    private Boolean trangThai;

    public ChatLieuDay() {
    }

    public ChatLieuDay(Integer id) {
        this.id = id;
    }

    public ChatLieuDay(Integer id, String tenChatLieuDay) {
        this.id = id;
        this.tenChatLieuDay = tenChatLieuDay;
    }

    public ChatLieuDay(Integer id, String tenChatLieuDay, Boolean trangThai) {
        this.id = id;
        this.tenChatLieuDay = tenChatLieuDay;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenChatLieuDay() {
        return tenChatLieuDay;
    }

    public void setTenChatLieuDay(String tenChatLieuDay) {
        this.tenChatLieuDay = tenChatLieuDay;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return tenChatLieuDay;
    }

}
