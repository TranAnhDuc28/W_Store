/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl.thuoctinhsanpham;

import com.wstore.domainmodels.thuoctinhsanpham.ChatLieuDay;
import java.util.List;
import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuDayView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ducan
 */
public class ChatLieuDayRepository implements IThuocTinhSanPhamRepository<ChatLieuDayView> {

    @Override
    public List<ChatLieuDayView> getAll() {
        List<ChatLieuDayView> list = new ArrayList<>();
        String sql = "select id, ten_chat_lieu_day, trang_thai from ChatLieuDay;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ChatLieuDayView cld = new ChatLieuDayView(
                        rs.getInt("id"),
                        rs.getString("ten_chat_lieu_day"),
                        rs.getBoolean("trang_thai"));
                list.add(cld);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean insert(ChatLieuDayView cld) {
        int checkInsert = 0;
        String sql = "insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (?, default);";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, cld.getTenChatLieuDay());
            checkInsert = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return checkInsert > 0;
    }

    @Override
    public boolean update(ChatLieuDayView cld, int id) {
        int checkUpdate = 0;
        String sql = "update ChatLieuDay\n"
                + "set ten_chat_lieu_day= ?\n"
                + "where id=?";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, cld.getTenChatLieuDay());
            pstm.setInt(2, id);
            checkUpdate = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return checkUpdate > 0;
    }

    @Override
    public boolean updateHienThi(ChatLieuDayView cld) {
        String sql = "update ChatLieuDay set trang_thai =? where id = ?";
        return true;
    }

}
