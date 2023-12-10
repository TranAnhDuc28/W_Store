/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.repositories;

import com.wstore.domainmodels.KhachHang;
import java.util.List;

/**
 *
 * @author ducan
 */
public interface IKhachHangRepository {

    List<KhachHang> getAll(int page, int pageSize, int trangThai);

    boolean insert(KhachHang kh);

    boolean update(KhachHang kh, int id);

    boolean updateStatus(int trangThai, int id);

    void updatesStatus(int trangThai, List<Integer> listID);

    List<KhachHang> findByNameOrMaOrSDT(int page, int pageSize, int trangThai, String name);

    int getCountRecordByTrangThai(int trangThai);
    
    int getCountRecord();
}
