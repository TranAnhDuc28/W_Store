/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.services;

import com.wstore.viewmodels.HoaDonChiTietViewModel;
import java.util.List;

/**
 *
 * @author ducan
 */
public interface IHoaDonChiTietService {
    
    List<HoaDonChiTietViewModel> getAllByHoaDonID(int id);

    void addListOrder(int idHoaDon, List<HoaDonChiTietViewModel> lists);
}
