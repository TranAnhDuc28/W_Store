/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.services;

import com.wstore.domainmodels.KhachHang;
import com.wstore.viewmodels.KhachHangViewModel;
import java.util.List;

/**
 *
 * @author ducan
 */
public interface IKhachHangService {
    List<KhachHangViewModel> getAll(int page, int pageSize, int trangThai);

    boolean insert(KhachHang nv);

    boolean update(KhachHang kh, int id);

    boolean updateStatus(int trangThai, int id);
    
    void updatesSatus(int trangThai, List<Integer> listID); 

    List<KhachHangViewModel> findByNameOrMaOrSDT(int page, int pageSize, int trangThai, String name);

    int getCountRecordByTrangThai(int trangThai);
    
    String getMaKhachHangTuDongSinh();
}
