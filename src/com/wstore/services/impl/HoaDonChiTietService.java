/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl;

import com.wstore.domainmodels.HoaDon;
import com.wstore.repositories.IHoaDonChiTietRepository;
import com.wstore.repositories.impl.HoaDonChiTietRepository;
import com.wstore.services.IHoaDonChiTietService;
import com.wstore.viewmodels.HoaDonChiTietViewModel;
import java.util.List;

/**
 *
 * @author ducan
 */
public class HoaDonChiTietService implements IHoaDonChiTietService{
    
    private final IHoaDonChiTietRepository hoaDonChiTietRepository = 
            new HoaDonChiTietRepository();

    @Override
    public List<HoaDonChiTietViewModel> getAllByIDHoaDon(int id) {
        return hoaDonChiTietRepository.getAllByIDHoaDon(id);
    }

    @Override
    public void addListOrderDetails(int idHoaDon, List<HoaDonChiTietViewModel> lists) {
        hoaDonChiTietRepository.insertListOrderDetails(idHoaDon, lists);
    }

    @Override
    public void deleteListOrderDetails(List<Integer> listID) {
        hoaDonChiTietRepository.deleteListOrderDetails(listID);
    }
    
}
