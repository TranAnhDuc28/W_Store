/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.domainmodels.thuoctinhsanpham;

/**
 *
 * @author ducan
 */
public class XuatXu {

    private Integer id;
    private String noiXuatXu;
    private Boolean trangThai;

    public XuatXu() {
    }

    public XuatXu(Integer id) {
        this.id = id;
    }

    public XuatXu(Integer id, String noiXuatXu) {
        this.id = id;
        this.noiXuatXu = noiXuatXu;
    }

    public XuatXu(Integer id, String noiXuatXu, Boolean trangThai) {
        this.id = id;
        this.noiXuatXu = noiXuatXu;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoiXuatXu() {
        return noiXuatXu;
    }

    public void setNoiXuatXu(String noiXuatXu) {
        this.noiXuatXu = noiXuatXu;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return noiXuatXu;
    }
    
    

}
