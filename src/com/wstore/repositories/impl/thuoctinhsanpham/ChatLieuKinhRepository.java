package com.wstore.repositories.impl.thuoctinhsanpham;

import java.util.List;
import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuKinhViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChatLieuKinhRepository implements IThuocTinhSanPhamRepository<ChatLieuKinhViewModel> {

    @Override
    public List<ChatLieuKinhViewModel> getAll() {
        List<ChatLieuKinhViewModel> list = new ArrayList<>();
        String sql = "select id, ten_chat_lieu_kinh, trang_thai from ChatLieuKinh";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ChatLieuKinhViewModel clk = new ChatLieuKinhViewModel(
                        rs.getInt("id"),
                        rs.getString("ten_chat_lieu_kinh"),
                        rs.getBoolean("trang_thai"));
                list.add(clk);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return list;
    }

    @Override
    public List<ChatLieuKinhViewModel> getAllByTrangThai(boolean trangThai) {
        List<ChatLieuKinhViewModel> list = new ArrayList<>();
        String sql = "select id, ten_chat_lieu_kinh, trang_thai from ChatLieuKinh where trang_thai = ?";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setBoolean(1, trangThai);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ChatLieuKinhViewModel clk = new ChatLieuKinhViewModel(
                        rs.getInt("id"),
                        rs.getString("ten_chat_lieu_kinh"),
                        rs.getBoolean("trang_thai"));
                list.add(clk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insert(ChatLieuKinhViewModel clk) {
        int checkInsert = 0;
        String sql = "insert into ChatLieuKinh(ten_chat_lieu_kinh, trang_thai) values (?, default);";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, clk.getTenChatLieuKinh());
            checkInsert = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return checkInsert > 0;
    }

    @Override
    public boolean update(ChatLieuKinhViewModel clk, int id) {
        int checkUpdate = 0;
        String sql = "update ChatLieuKinh set ten_chat_lieu_kinh = ? where id = ?";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, clk.getTenChatLieuKinh());
            pstm.setInt(2, id);
            checkUpdate = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return checkUpdate > 0;
    }

    @Override
    public void updatesHienThi(List<ChatLieuKinhViewModel> list) {
        int results[];
        String sql = "update ChatLieuKinh set trang_thai = ? where id = ?;";
        try (Connection cn = DBConnect.getConnection();) {
            cn.setAutoCommit(false);
            try (PreparedStatement pstm = cn.prepareStatement(sql);) {
                for (ChatLieuKinhViewModel clk : list) {
                    pstm.setBoolean(1, clk.getHienThi());
                    pstm.setInt(2, clk.getMaChatLieuKinh());
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
