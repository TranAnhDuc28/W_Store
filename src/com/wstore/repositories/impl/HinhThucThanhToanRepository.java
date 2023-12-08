/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl;

import com.wstore.domainmodels.HinhThucThanhToan;
import com.wstore.utilities.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.wstore.repositories.IHinhThucThanhToanRepository;

/**
 *
 * @author ducan
 */
public class HinhThucThanhToanRepository implements IHinhThucThanhToanRepository{

    @Override
    public boolean insert(HinhThucThanhToan httt) {
        int checkInsert = 0;
        String sql = "insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don) values (?, ?);";
        
        try(Connection con = DBConnect.getConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, httt.getLoaiHinhThanhToan());
            pstm.setInt(2, httt.getIdHoaDon().getId());
            checkInsert = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return checkInsert > 0;
    }
    
}
