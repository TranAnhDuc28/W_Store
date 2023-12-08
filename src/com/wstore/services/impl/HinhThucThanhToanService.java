/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl;

import com.wstore.domainmodels.HinhThucThanhToan;
import com.wstore.repositories.IHinhThucThanhToanRepository;
import com.wstore.repositories.impl.HinhThucThanhToanRepository;
import com.wstore.services.IHinhThucThanhToanService;

/**
 *
 * @author ducan
 */
public class HinhThucThanhToanService implements IHinhThucThanhToanService{
    
    private IHinhThucThanhToanRepository hinhThucThanhToanRepository 
            = new HinhThucThanhToanRepository();
    
    @Override
    public boolean insert(HinhThucThanhToan httt) {
        return hinhThucThanhToanRepository.insert(httt);
    }
    
}
