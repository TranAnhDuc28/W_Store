/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.repositories.impl.thuoctinhsanpham;

import java.util.List;
import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuDayViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ducan
 */
public class ChatLieuDayRepository implements IThuocTinhSanPhamRepository<ChatLieuDayViewModel> {

    @Override
    public List<ChatLieuDayViewModel> getAll() {
        List<ChatLieuDayViewModel> list = new ArrayList<>();
        String sql = "select id, ten_chat_lieu_day, trang_thai from ChatLieuDay;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ChatLieuDayViewModel cld = new ChatLieuDayViewModel(
                        rs.getInt("id"),
                        rs.getString("ten_chat_lieu_day"),
                        rs.getBoolean("trang_thai"));
                list.add(cld);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return list;
    }

    @Override
    public List<ChatLieuDayViewModel> getAllByTrangThai(boolean trangThai) {
        List<ChatLieuDayViewModel> list = new ArrayList<>();
        String sql = "select id, ten_chat_lieu_day, trang_thai from ChatLieuDay where trang_thai = ?";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setBoolean(1, trangThai);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ChatLieuDayViewModel cld = new ChatLieuDayViewModel(
                        rs.getInt("id"),
                        rs.getString("ten_chat_lieu_day"),
                        rs.getBoolean("trang_thai"));
                list.add(cld);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insert(ChatLieuDayViewModel cld) {
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
    public boolean update(ChatLieuDayViewModel cld, int id) {
        int checkUpdate = 0;
        String sql = "update ChatLieuDay set ten_chat_lieu_day = ? where id = ?";
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
    public void updatesHienThi(List<ChatLieuDayViewModel> list) {
        int results[];
        String sql = "update ChatLieuDay set trang_thai = ? where id = ?;";
        try (Connection cn = DBConnect.getConnection();) {
            cn.setAutoCommit(false);
            try (PreparedStatement pstm = cn.prepareStatement(sql);) {
                for (ChatLieuDayViewModel cld : list) {
                    pstm.setBoolean(1, cld.getHienThi());
                    pstm.setInt(2, cld.getMaChatLieuDay());
                    pstm.addBatch();
                }
                // chạy batch và lấy kết quả
                results = pstm.executeBatch();
                // check lỗi
                for (int i = 0; i < results.length; i++) {
                    if (results[i] == PreparedStatement.EXECUTE_FAILED) {
                        System.out.println("Error in statement at index " + i);
                    }
                }
                cn.commit();
            } catch (SQLException e) {
                e.printStackTrace();
                cn.rollback();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
