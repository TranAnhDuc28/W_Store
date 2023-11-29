/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.repositories;

import com.wstore.domainmodels.HoaDon;
import com.wstore.viewmodels.HoaDonChiTietViewModel;
import java.util.List;

/**
 *
 * @author ducan
 */
public interface IHoaDonChiTietRepository {
    
    List<HoaDonChiTietViewModel> getAllByHoaDonID(String id);

    boolean addListOrder(String hoaDonID, List<HoaDon> lists);
    
}
