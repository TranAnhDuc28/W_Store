/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl;

import com.wstore.repositories.IThongKeRepository;
import com.wstore.repositories.impl.ThongKeRepository;
import com.wstore.services.IThongKeService;
import com.wstore.viewmodels.thongke.ThongKeTungNgayTrongThangViewModel;
import java.util.List;

/**
 *
 * @author ducan
 */
public class ThongKeService implements IThongKeService{
    
    private IThongKeRepository thongKeRepository = new ThongKeRepository();
    
    @Override
    public List<ThongKeTungNgayTrongThangViewModel> getThongKe7NgayGanNhat() {
        return thongKeRepository.getThongKe7NgayGanNhat();
    }
    
}
